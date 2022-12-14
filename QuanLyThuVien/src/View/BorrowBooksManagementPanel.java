/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.DAO;
import Controller.DAOBorrowBook;
import Controller.DataValidator;
import Controller.MessageDialogHelper;
import Model.BorrowBook;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author VietNguyen
 */
public class BorrowBooksManagementPanel extends javax.swing.JPanel {
    
    private formAdmin formAdmin;


    public BorrowBooksManagementPanel() {
        initComponents();
    }
    
    /**
     *
     */
   
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jB_muonSach = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        jb_MaSV = new javax.swing.JLabel();
        jB_MaS = new javax.swing.JLabel();
        txt_MaSV = new javax.swing.JTextField();
        txt_MaS = new javax.swing.JTextField();
        jB_NgayMuon = new javax.swing.JLabel();
        txt_NgayMuon = new javax.swing.JTextField();
        NgayTra = new javax.swing.JLabel();
        txt_NgayTra = new javax.swing.JTextField();
        jB_hanTra = new javax.swing.JLabel();
        txt_hanTra = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        btn_lamMoi = new javax.swing.JButton();
        btn_TaoPhieu = new javax.swing.JButton();
        btn_traSach = new javax.swing.JButton();
        btn_TimKiem = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        TableBorrowBook = new javax.swing.JTable();

        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        jB_muonSach.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jB_muonSach.setText("PHIẾU ĐĂNG KÝ MƯỢN SÁCH:");

        jb_MaSV.setText("Mã Sinh Viên:");

        jB_MaS.setText("Mã Sách:");

        jB_NgayMuon.setText("Ngày Mượn:");

        NgayTra.setText("Ngày Trả:");

        jB_hanTra.setText("Hạn Trả:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(NgayTra)
                        .addGap(35, 35, 35)
                        .addComponent(txt_NgayTra))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jb_MaSV)
                            .addComponent(jB_MaS)
                            .addComponent(jB_NgayMuon)
                            .addComponent(jB_hanTra))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_NgayMuon, javax.swing.GroupLayout.DEFAULT_SIZE, 292, Short.MAX_VALUE)
                            .addComponent(txt_MaS)
                            .addComponent(txt_MaSV)
                            .addComponent(txt_hanTra))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jb_MaSV)
                    .addComponent(txt_MaSV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jB_MaS)
                    .addComponent(txt_MaS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jB_NgayMuon)
                    .addComponent(txt_NgayMuon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jB_hanTra)
                    .addComponent(txt_hanTra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NgayTra)
                    .addComponent(txt_NgayTra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btn_lamMoi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hinhNen/Icon/return.png"))); // NOI18N
        btn_lamMoi.setText("Làm Mới");
        btn_lamMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_lamMoiActionPerformed(evt);
            }
        });

        btn_TaoPhieu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hinhNen/Icon/new-document.png"))); // NOI18N
        btn_TaoPhieu.setText("Tạo Phiếu");
        btn_TaoPhieu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_TaoPhieuActionPerformed(evt);
            }
        });

        btn_traSach.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hinhNen/Icon/return.png"))); // NOI18N
        btn_traSach.setText("Trả Sách");
        btn_traSach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_traSachActionPerformed(evt);
            }
        });

        btn_TimKiem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hinhNen/Icon/search-icon.png"))); // NOI18N
        btn_TimKiem.setText("Tìm Kiếm");
        btn_TimKiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_TimKiemActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(38, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_TaoPhieu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_lamMoi, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_traSach, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_TimKiem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(btn_lamMoi)
                .addGap(18, 18, 18)
                .addComponent(btn_TaoPhieu)
                .addGap(18, 18, 18)
                .addComponent(btn_traSach)
                .addGap(18, 18, 18)
                .addComponent(btn_TimKiem)
                .addGap(0, 13, Short.MAX_VALUE))
        );

        TableBorrowBook.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Mã Sách", "Mã Sinh Viên", "Ngày Mượn", "Hạn Trả"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TableBorrowBook.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TableBorrowBookMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TableBorrowBook);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addComponent(jSeparator2)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jB_muonSach)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 574, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jB_muonSach)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                .addGap(20, 20, 20))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void showData(){
        try {
            TableBorrowBook.removeAll();
            String[] arr = {"Mã Sách", "Mã Sinh Viên", "Ngày Mượn", "Hạn Trả"};
            DefaultTableModel model = new DefaultTableModel(arr, 0);
            Connection connection = DAO.getConnection();
            String querry = "SELECT * FROM [dbo].[muonSach]";
            PreparedStatement ps = connection.prepareStatement(querry);
            ps.executeQuery();
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                Vector vector = new Vector();
                vector.add(rs.getString("MaSach"));
                vector.add(rs.getString("MaSV"));
                vector.add(rs.getString("NgayMuon"));
                vector.add(rs.getString("HanTra"));
                model.addRow(vector);
            }
            TableBorrowBook.setModel(model);
        } catch (SQLException ex) {
            Logger.getLogger(BorrowBooksManagementPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private void btn_lamMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_lamMoiActionPerformed
        txt_MaSV.setText("");
        txt_MaS.setText("");
        txt_NgayMuon.setText("");
        txt_hanTra.setText("");
        showData();
    }//GEN-LAST:event_btn_lamMoiActionPerformed

    private void btn_TaoPhieuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_TaoPhieuActionPerformed
        StringBuilder sb = new StringBuilder();
        DataValidator.validateEmpty(txt_MaSV, sb, "Mã Sinh Viên không được để trống");
        DataValidator.validateEmpty(txt_MaS, sb, "Mã Sách không được để trống");
        if (sb.length()>0) {
            MessageDialogHelper.showErrorDialog(formAdmin, "Lỗi", sb.toString());
        }else if (JOptionPane.NO_OPTION == MessageDialogHelper.showConfirmDialog(formAdmin, "Hỏi", "Bạn có muốn tạo phiếu mượn ?")) {
            return;
        }
        try {
            BorrowBook muonSach = new BorrowBook();
            muonSach.setMaS(txt_MaS.getText());
            muonSach.setMaSV(txt_MaSV.getText());
            muonSach.setNgayMuon(txt_NgayMuon.getText());
            muonSach.setHanTra(txt_hanTra.getText());
            DAOBorrowBook dao = new DAOBorrowBook();
            if(dao.taoPhieuMuon(muonSach)){
                MessageDialogHelper.showMessageDialog(formAdmin, "Thông Báo", "Tạo phiếu mượn sách mới thành công");
            }else{
                MessageDialogHelper.showConfirmDialog(formAdmin, "Cảnh Báo", "Tạo phiếu mượn sách mới thất bại");
            }
        } catch (Exception e) {
            MessageDialogHelper.showErrorDialog(formAdmin,"Lỗi", e.getMessage());
        }
        showData();
        btn_lamMoiActionPerformed(evt);
    }//GEN-LAST:event_btn_TaoPhieuActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
       showData();
    }//GEN-LAST:event_formComponentShown

    private void btn_traSachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_traSachActionPerformed
        StringBuilder sb = new StringBuilder();
        DataValidator.validateEmpty(txt_MaSV, sb, "Mã Sinh Viên không được để trống");
        DataValidator.validateEmpty(txt_MaS, sb, "Mã Sách không được để trống");
        if (sb.length()>0) {
            MessageDialogHelper.showErrorDialog(formAdmin, "Lỗi", sb.toString());
        }else{
            try {
                BorrowBook muonSach = new BorrowBook();
                muonSach.setMaS(txt_MaS.getText());
                muonSach.setMaSV(txt_MaSV.getText()); 
                muonSach.setNgayMuon(txt_NgayMuon.getText());
                muonSach.setHanTra(txt_hanTra.getText());
                muonSach.setNgayTra(txt_NgayTra.getText());
                DAOBorrowBook dao = new DAOBorrowBook();
                if(dao.traSach(muonSach)){
                    MessageDialogHelper.showMessageDialog(formAdmin, "Thông Báo", "Trả sách thành công");
                }else{
                    MessageDialogHelper.showMessageDialog(formAdmin, "Cảnh Báo", "Mã Sinh Viên hoặc Mã Sách không đúng! \nVui Lòng xem lại");
                }
            } catch (Exception e) {
                MessageDialogHelper.showErrorDialog(formAdmin,"Lỗi", e.getMessage());
            }
            showData();
            btn_lamMoiActionPerformed(evt);
        }
    }//GEN-LAST:event_btn_traSachActionPerformed

    private void btn_TimKiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_TimKiemActionPerformed
        StringBuilder sb = new StringBuilder();
        DataValidator.validateEmpty(txt_MaSV, sb, "Mã Sinh Viên không được để trống");
        if (sb.length()>0) {
            MessageDialogHelper.showErrorDialog(formAdmin, "Lỗi", sb.toString());
        }else{
        try {
            String id = (String) txt_MaSV.getText();
            DAOBorrowBook dao = new DAOBorrowBook();
            BorrowBook timKiem = dao.timKiemphieuMuon(id);
        } catch (Exception e) {
            MessageDialogHelper.showErrorDialog(formAdmin,"Lỗi", e.getMessage());
        }}
    }//GEN-LAST:event_btn_TimKiemActionPerformed

    private void TableBorrowBookMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableBorrowBookMouseClicked
        try {
            int row = TableBorrowBook.getSelectedRow();
            if (row >= 0){
                String MaSV = (String) TableBorrowBook.getValueAt(row, 1);
                String MaS = (String) TableBorrowBook.getValueAt(row, 0);
                DAOBorrowBook dao = new DAOBorrowBook();
                BorrowBook muonSach = dao.timThongTin(MaSV, MaS);
                if(muonSach != null){
                    txt_MaS.setText(muonSach.getMaS());
                    txt_MaSV.setText(muonSach.getMaSV());
                    txt_NgayMuon.setText(muonSach.getNgayMuon());
                    txt_hanTra.setText(muonSach.getHanTra());
                }
            }
        } catch (Exception e) {
            MessageDialogHelper.showErrorDialog(formAdmin,"Lỗi", e.getMessage());
        }
    }//GEN-LAST:event_TableBorrowBookMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel NgayTra;
    public static javax.swing.JTable TableBorrowBook;
    private javax.swing.JButton btn_TaoPhieu;
    private javax.swing.JButton btn_TimKiem;
    private javax.swing.JButton btn_lamMoi;
    private javax.swing.JButton btn_traSach;
    private javax.swing.JLabel jB_MaS;
    private javax.swing.JLabel jB_NgayMuon;
    private javax.swing.JLabel jB_hanTra;
    private javax.swing.JLabel jB_muonSach;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel jb_MaSV;
    private javax.swing.JTextField txt_MaS;
    private javax.swing.JTextField txt_MaSV;
    private javax.swing.JTextField txt_NgayMuon;
    private javax.swing.JTextField txt_NgayTra;
    private javax.swing.JTextField txt_hanTra;
    // End of variables declaration//GEN-END:variables
}
