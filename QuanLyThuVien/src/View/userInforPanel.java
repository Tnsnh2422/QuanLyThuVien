/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.DAO;
import Controller.DAOUser;
import Controller.DataValidator;
import Controller.MessageDialogHelper;
import Model.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class userInforPanel extends javax.swing.JPanel {
    
    private formUser formUser;
    String tk="";
    
    public userInforPanel() {
        initComponents();
    }
    public userInforPanel(String TK) {
        tk=TK;
        initComponents();
    }

    private void showData(){
        try {
            TableUsers.removeAll();
            String[] arr = {"Mã Sách", "Tên Sách", "Thể Loại", "Ngày Mượn", "Hạn Trả"};
            DefaultTableModel model = new DefaultTableModel(arr, 0);
            Connection connection = DAO.getConnection();
            String querry = "SELECT  tenDangNhap,matKhau,hoTen,users.maSV,gioiTinh,email,diaChi,muonSach.maSach, tenSach, theLoai, ngayMuon, hanTra" 
                    + " FROM muonSach, users, sach" 
                    + " WHERE muonSach.MaSV=users.MaSV AND muonSach.maSach=sach.maSach AND tenDangNhap = '"+ tk + "'";
              
            PreparedStatement ps = connection.prepareStatement(querry);
            ps.executeQuery();
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                Vector vector = new Vector();
                txt_password.setText(rs.getString("matKhau"));
                txt_name.setText(rs.getString("hoTen"));
                txt_MaSV.setText(rs.getString("maSV"));
                txt_email.setText(rs.getString("email"));
                txt_Address.setText(rs.getString("diaChi"));
                String sex=rs.getString("gioiTinh");
                if("Nam".equals(sex))
                    jRadio_Nam.doClick();
                else
                {
                    if("Nữ".equals(sex))
                        JRadio_Nu.doClick();
                    else
                        JRadio_khac.doClick();
                }
                vector.add(rs.getString("maSach"));
                vector.add(rs.getString("tenSach"));
                vector.add(rs.getString("theLoai"));
                vector.add(rs.getString("ngayMuon"));
                vector.add(rs.getString("hanTra"));
                model.addRow(vector);
            }
            TableUsers.setModel(model);
        } catch (SQLException ex) {
            Logger.getLogger(libraryPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGroup_Sex = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jB_password = new javax.swing.JLabel();
        jB_name = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jB_Sex = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txt_password = new javax.swing.JTextField();
        txt_name = new javax.swing.JTextField();
        txt_MaSV = new javax.swing.JTextField();
        jRadio_Nam = new javax.swing.JRadioButton();
        JRadio_Nu = new javax.swing.JRadioButton();
        JRadio_khac = new javax.swing.JRadioButton();
        txt_email = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt_Address = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        btn_edit = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jB_book = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TableUsers = new javax.swing.JTable();

        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        jB_password.setText("Mật Khẩu:");

        jB_name.setText("Họ Tên:");

        jLabel4.setText("Mã SV: ");

        jB_Sex.setText("Giới Tính:");

        jLabel6.setText("Email:");

        jLabel7.setText("Địa Chỉ:");

        btnGroup_Sex.add(jRadio_Nam);
        jRadio_Nam.setText("Nam");

        btnGroup_Sex.add(JRadio_Nu);
        JRadio_Nu.setText("Nữ");

        btnGroup_Sex.add(JRadio_khac);
        JRadio_khac.setText("Khác");

        txt_Address.setColumns(20);
        txt_Address.setRows(5);
        jScrollPane1.setViewportView(txt_Address);

        btn_edit.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btn_edit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hinhNen/Icon/Actions-document-edit-icon.png"))); // NOI18N
        btn_edit.setText("Sửa");
        btn_edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_edit, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(btn_edit)
                .addContainerGap(122, Short.MAX_VALUE))
        );

        jB_book.setText("Danh sách sách đang mượn");

        TableUsers.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Mã sách", "Tên sách", "Thể loại", "Ngày Mượn", "Hạn Trả"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(TableUsers);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jB_name)
                                    .addComponent(jLabel4))
                                .addGap(20, 20, 20)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_MaSV, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(2, 2, 2)
                                        .addComponent(txt_email)
                                        .addGap(85, 85, 85))
                                    .addComponent(jScrollPane1)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(txt_name)
                                        .addGap(59, 59, 59))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jB_Sex)
                                            .addComponent(jLabel6)
                                            .addComponent(jLabel7))
                                        .addGap(18, 18, 18)
                                        .addComponent(jRadio_Nam)
                                        .addGap(18, 18, 18)
                                        .addComponent(JRadio_Nu)
                                        .addGap(18, 18, 18)
                                        .addComponent(JRadio_khac))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jB_password)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txt_password, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(69, 69, 69)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator2)))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jB_book)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 477, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jB_password)
                    .addComponent(txt_password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jB_name))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txt_MaSV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jB_Sex)
                            .addComponent(jRadio_Nam)
                            .addComponent(JRadio_Nu)
                            .addComponent(JRadio_khac))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txt_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jB_book)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 118, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        showData();
    }//GEN-LAST:event_formComponentShown

    private void btn_editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editActionPerformed
        StringBuilder sb = new StringBuilder();
        DataValidator.validateEmpty(txt_password, sb, "Mật Khẩu không được để trống");
        DataValidator.validateEmpty(txt_name, sb, "Tên Sinh Viên không được để trống");
        if (sb.length()>0) {
            MessageDialogHelper.showErrorDialog(formUser, "Lỗi", sb.toString());
        }else if (MessageDialogHelper.showConfirmDialog(formUser, "Hỏi", "Bạn có muốn cập nhật thông tin ?") == JOptionPane.NO_OPTION) {
            return;
        }
        try {
            User user = new User();
            user.setTaiKhoan(tk);
            user.setMatKhau(txt_password.getText());
            user.setHoTen(txt_name.getText());
            user.setMaSV(txt_MaSV.getText());
            if (jRadio_Nam.isSelected()) {
                user.setGioiTinh("Nam");
            } else if (JRadio_Nu.isSelected()) {
                user.setGioiTinh("Nữ");
            }else{
                user.setGioiTinh("Khác");
            }
            user.setEmail(txt_email.getText());
            user.setDiaChi(txt_Address.getText());
            
            DAOUser dao = new DAOUser();
            if(dao.suaUser(user)){
                MessageDialogHelper.showMessageDialog(formUser, "Thông Báo", "Sửa thông tin người dùng thành công");
            }else{
                MessageDialogHelper.showConfirmDialog(formUser, "Cảnh Báo", "Sửa thông tin người dùng thất bại");
            }
        } catch (Exception e) {
            MessageDialogHelper.showErrorDialog(formUser,"Lỗi", e.getMessage());
        }
        showData();
    }//GEN-LAST:event_btn_editActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton JRadio_Nu;
    private javax.swing.JRadioButton JRadio_khac;
    private javax.swing.JTable TableUsers;
    private javax.swing.ButtonGroup btnGroup_Sex;
    private javax.swing.JButton btn_edit;
    private javax.swing.JLabel jB_Sex;
    private javax.swing.JLabel jB_book;
    private javax.swing.JLabel jB_name;
    private javax.swing.JLabel jB_password;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton jRadio_Nam;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextArea txt_Address;
    private javax.swing.JTextField txt_MaSV;
    private javax.swing.JTextField txt_email;
    private javax.swing.JTextField txt_name;
    private javax.swing.JTextField txt_password;
    // End of variables declaration//GEN-END:variables
}
