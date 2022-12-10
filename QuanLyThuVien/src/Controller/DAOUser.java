/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author VietNguyen
 */
public class DAOUser {
    //--------------Dao Thêm User
    public boolean themUser(User user)
            throws Exception{
                String sql = "INSERT INTO [dbo].[users]([tenDangNhap], [matKhau], [maSV], [hoTen], [email], [gioiTinh], [diaChi], [itAdmin])" 
                        + " VALUES(?, ?, ?, ?, ?, ?, ?, ?)";
                try (
                        Connection con = DAO.getConnection();
                        PreparedStatement pstmt = con.prepareStatement(sql);    
                    ){
                    pstmt.setString(1, user.getTaiKhoan());
                    pstmt.setString(2, user.getMatKhau());
                    pstmt.setString(3, user.getMaSV());
                    pstmt.setString(4, user.getHoTen());
                    pstmt.setString(5, user.getEmail());
                    pstmt.setString(6, user.getGioiTinh());
                    pstmt.setString(7, user.getDiaChi());
                    pstmt.setInt(8, 0);
                    return pstmt.executeUpdate()>0;
            }
        }
    //-----------------------------Sửa user
    public boolean suaUser(User user)
            throws Exception{
                String sql = "UPDATE [dbo].[users]" + " SET [tenDangNhap] = ? ,[matKhau] = ? ,[maSV] = ? ,[hoTen] = ? ,[email] = ? ,[gioiTinh] = ? ,[diaChi] = ?" 
                        + " WHERE maSV = ?";
                try (
                        Connection con = DAO.getConnection();
                        PreparedStatement pstmt = con.prepareStatement(sql);    
                    ){
                    pstmt.setString(8, user.getMaSV());
                    pstmt.setString(1, user.getTaiKhoan());
                    pstmt.setString(2, user.getMatKhau());
                    pstmt.setString(3, user.getMaSV());
                    pstmt.setString(4, user.getHoTen());
                    pstmt.setString(5, user.getEmail());
                    pstmt.setString(6, user.getGioiTinh());
                    pstmt.setString(7, user.getDiaChi());
                    return pstmt.executeUpdate()>0;
            }
        }
    //-------------------------Xóa User
    public boolean xoaUser(String MaSV)
            throws Exception{
                String sql = "DELETE FROM [dbo].[users]" + " WHERE maSV = ?";
                try (
                        Connection con = DAO.getConnection();
                        PreparedStatement pstmt = con.prepareStatement(sql);    
                    ){
                    pstmt.setString(1, MaSV);
                    return pstmt.executeUpdate()>0;
            }
        }
    
    //-------------------------Tìm kiếm user
    public User timUser(String MaSV)
            throws Exception{
                String sql = "SELECT [tenDangNhap], [matKhau], [maSV], [hoTen], [email] , [gioiTinh], [diaChi]"  
                        + "  FROM [dbo].[users]" + " WHERE MaSV = ?";
                try (
                        Connection con = DAO.getConnection();
                        PreparedStatement pstmt = con.prepareStatement(sql);    
                    ){
                    pstmt.setString(1, MaSV);
                    try(ResultSet rs = pstmt.executeQuery();){
                        if(rs.next()){
                            User user = new User();
                            user.setTaiKhoan(rs.getString("tenDangNhap"));
                            user.setMatKhau(rs.getString("matKhau"));
                            user.setMaSV(rs.getString("maSV"));
                            user.setHoTen(rs.getString("hoTen"));
                            user.setGioiTinh(rs.getString("gioiTinh"));
                            user.setEmail(rs.getString("email"));
                            user.setDiaChi(rs.getString("diaChi"));
                            return user;
                        }
                    }
                    return null;        
            }
        }
}
