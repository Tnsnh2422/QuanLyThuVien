/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.BorrowBook;
import static View.BorrowBooksManagementPanel.TableBorrowBook;
import static View.HistoryPanel.table_History;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author VietNguyen
 */
public class DAOBorrowBook {
    //-----------------------Tạo Phiếu mượn
    public boolean taoPhieuMuon(BorrowBook muonSach)
        throws Exception{
            String sql = "INSERT INTO [dbo].[muonSach]([MaSach], [MaSV] ,[NgayMuon], [HanTra])" 
                    + " VALUES(?, ?, ?, ?)";
            try (
                Connection con = DAO.getConnection();
                PreparedStatement pstmt = con.prepareStatement(sql);
                    ){
                pstmt.setString(1, muonSach.getMaS());
                pstmt.setString(2, muonSach.getMaSV());
                pstmt.setString(3, muonSach.getNgayMuon());
                pstmt.setString(4, muonSach.getHanTra());
                return pstmt.executeUpdate() > 0;
        }
    }
    //--------------------Trả Sách
    public boolean traSach(BorrowBook muonSach)
        throws Exception{
            String sql = "DELETE [dbo].[muonSach]" + " WHERE MaSV = ? and MaSach = ?" 
                    + " \n INSERT INTO [dbo].[lichsu]([MaSach], [MaSV] ,[NgayMuon], [HanTra], [NgayTra])" 
                    + "VALUES(?, ?, ?, ?, ?)";

            try (
                Connection con = DAO.getConnection();
                PreparedStatement pstmt = con.prepareStatement(sql);
                    ){
                pstmt.setString(1, muonSach.getMaSV());
                pstmt.setString(2, muonSach.getMaS());
                pstmt.setString(3, muonSach.getMaS());
                pstmt.setString(4, muonSach.getMaSV());
                pstmt.setString(5, muonSach.getNgayMuon());
                pstmt.setString(6, muonSach.getHanTra());
                pstmt.setString(7, muonSach.getNgayTra());
                return pstmt.executeUpdate() > 0;
        }
    }
    //------------------------Tìm Kiếm thông Tin
    public BorrowBook timThongTin(String MaSV, String MaS)
            throws Exception{
                String sql = "SELECT * FROM dbo.muonSach" + " WHERE MaSV = ? and MaSach = ?";
                try (
                        Connection con = DAO.getConnection();
                        PreparedStatement pstmt = con.prepareStatement(sql);    
                    ){
                    pstmt.setString(1, MaSV);
                    pstmt.setString(2, MaS);
                    try(ResultSet rs = pstmt.executeQuery();){
                        if(rs.next()){
                            BorrowBook muonsach = new BorrowBook();
                            muonsach.setMaS(rs.getString("MaSach"));
                            muonsach.setMaSV(rs.getString("MaSV"));
                            muonsach.setNgayMuon(rs.getString("NgayMuon"));
                            muonsach.setHanTra(rs.getString("HanTra"));
                            return muonsach;
                        }
                    }
                    return null;        
            }
        }
    //------------------------Tìm kiếm phieu Muon
    public BorrowBook timKiemphieuMuon(String MaSV)
        throws Exception{
                String sql = "SELECT * FROM [dbo].[muonSach]" + " WHERE MaSV = ?";
                try (
                        Connection con = DAO.getConnection();
                        PreparedStatement pstmt = con.prepareStatement(sql);    
                    ){
                    pstmt.setString(1, MaSV); 
                    try(ResultSet rs = pstmt.executeQuery();){
                        TableBorrowBook.removeAll();
                        String[] arr = {"Mã Sách", "Mã Sinh Viên", "Ngày Mượn", "Hạn Trả"};
                        DefaultTableModel model = new DefaultTableModel(arr, 0);
                        while(rs.next()){
                            Vector vector = new Vector();
                            vector.add(rs.getString("MaSach"));
                            vector.add(rs.getString("MaSV"));
                            vector.add(rs.getString("NgayMuon"));
                            vector.add(rs.getString("HanTra"));
                            model.addRow(vector);
                        }
                        TableBorrowBook.setModel(model);
                    }
                    return null;        
            }
        }
    
    //-----------------------------Lịch Sử 
    public BorrowBook lichSu(String MaSV)
        throws Exception{
                String sql = "SELECT * FROM [dbo].[lichsu]" + " WHERE MaSV = ?";
                try (
                        Connection con = DAO.getConnection();
                        PreparedStatement pstmt = con.prepareStatement(sql);    
                    ){
                    pstmt.setString(1, MaSV); 
                    try(ResultSet rs = pstmt.executeQuery();){
                        table_History.removeAll();
                        String[] arr = {"Mã Sách", "Mã Sinh Viên", "Ngày Mượn", "Hạn Trả", "Ngày Trả"};
                        DefaultTableModel model = new DefaultTableModel(arr, 0);
                        while(rs.next()){
                            Vector vector = new Vector();
                            vector.add(rs.getString("MaSach"));
                            vector.add(rs.getString("MaSV"));
                            vector.add(rs.getString("NgayMuon"));
                            vector.add(rs.getString("HanTra"));
                            vector.add(rs.getString("NgayTra"));
                            model.addRow(vector);
                        }
                        table_History.setModel(model);
                    }
                    return null;        
            }
        }
}
