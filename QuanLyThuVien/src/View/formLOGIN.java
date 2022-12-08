/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;


import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseMotionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author Le Trong Nam
 */
public class formLOGIN extends JFrame{
    public JButton btnDangNhap ;
    public JTextField tfTaiKhoan ;
    public JPasswordField pwMatKhau ;
    public JLabel lbDoiMatKhau, lbDangKy ;
    public formLOGIN(){
        init();
           this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void  init(){
        this.setSize(1000,540);
        this.setLayout(null);
        this.setLocationRelativeTo(null);
        this.setTitle("form login");
        
        //--------------logo kmA
//        ImageIcon logoKMA = new ImageIcon("D:\\OOP\\QuanLySinhVien\\src\\hinhNen\\logo-mgi.png");
//        JLabel lbKMA = new JLabel();
//        lbKMA.setIcon(logoKMA);
//        lbKMA.setBounds(40,100,400, 400);
//        this.add(lbKMA);
        // lb hệ quản lý sinh viên: 
         JLabel lbQLSV = new JLabel("Hệ Quản Lý Sinh Viên");
        lbQLSV.setFont(new Font("TimesRoman", Font.PLAIN, 30));
        lbQLSV.setForeground(Color.RED);
        lbQLSV.setBounds(70,310, 500, 50);
        this.add(lbQLSV);
        //---------------------------------------------------------- label Ten dang nhap 
        JLabel lbTDN = new JLabel("Tên đăng nhập:");
        lbTDN.setFont(new Font("Serif", Font.PLAIN, 25));
        lbTDN.setForeground(Color.BLACK);
        lbTDN.setBounds(500,100, 200, 50);
        this.add(lbTDN);
        ////------------------------------------------------------------- tf ten dang nhap 
        tfTaiKhoan = new JTextField();
        tfTaiKhoan.setFont(new Font("Serif", Font.PLAIN, 30));
        tfTaiKhoan.setBounds(500,160, 300, 40);
        this.add(tfTaiKhoan);
        
        //-----------------------------------------------------------o----lb mật khẩu
          JLabel lbMK = new JLabel("Mật khẩu:");
        lbMK.setFont(new Font("Serif", Font.PLAIN, 25));
        lbMK.setForeground(Color.BLACK);
        lbMK.setBounds(500,210, 200, 50);
        this.add(lbMK);
        //-------- ---------------------------------------------------passwword nơi nhâp mật khẩu
        pwMatKhau = new JPasswordField();
        pwMatKhau.setFont(new Font("Serif", Font.PLAIN, 30));
        pwMatKhau.setBounds(500,270, 300, 40);
        this.add(pwMatKhau);
        //----------------------------------------------button đăng nhập
        btnDangNhap = new JButton("LOGIN");
        btnDangNhap.setFont(new Font("Serif", Font.PLAIN, 20));
        btnDangNhap.setBounds(700, 350, 100, 50);
        this.add(btnDangNhap);
        //------------------------------------------lb doi mat khau
        lbDoiMatKhau = new JLabel("Bạn đã quên mật khẩu? Đổi mật khẩu");
        lbDoiMatKhau.setFont(new Font("Serif", Font.PLAIN, 15));
        lbDoiMatKhau.setBackground(Color.BLACK);
        lbDoiMatKhau.setBounds(500, 400, 500, 40);
        this.add(lbDoiMatKhau);
        
          lbDangKy = new JLabel("Đăng ký tài khoản mới >>>>");
        lbDangKy.setFont(new Font("Serif", Font.PLAIN, 15));
        lbDangKy.setBackground(Color.BLACK);
        lbDangKy.setBounds(500, 440, 400, 40);
        this.add(lbDangKy);
      //-------------------------set background cho phần login 
//      ImageIcon iconLogin = new ImageIcon("D:\\OOP\\QuanLySinhVien\\src\\hinhNen\\bg_login (2).jpg");
//      JLabel bgLogin = new JLabel();
//      bgLogin.setIcon(iconLogin);
//      bgLogin.setBounds(450,70,450,400);
//      this.add(bgLogin);
      
      
        //-------------------------------------- set backgrounf cho cả jframe
        ImageIcon iconTong = new ImageIcon("D:\\OOP\\QuanLySinhVien\\src\\hinhNen\\hinhNenDangNhap.jpg");
        JLabel bgTong = new JLabel();
        bgTong.setIcon(iconTong);
        bgTong.setBounds(0, 0,1000, 540);
        this.add(bgTong);
        
        lbDoiMatKhau.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
              JOptionPane.showMessageDialog(null,"Tính năng này hiện chưa phát triển");
            }

            @Override
            public void mousePressed(MouseEvent e) {
            }

            @Override
            public void mouseReleased(MouseEvent e) {
             
            }

            @Override
            public void mouseEntered(MouseEvent e) {
               
            }

            @Override
            public void mouseExited(MouseEvent e) {
               
            }
        });
        
        
   
           
              
    }
    
    public void addLoginListener(ActionListener log){
        btnDangNhap.addActionListener(log);
    }
//    public void addDoiMatKhauClick(MouseListener log){
//        lbDoiMatKhau.addMouseListener(log);
//    }
    public void addDangKyClik(MouseListener log){
        lbDangKy.addMouseListener(log);
    }
    public void showMessage(String text){
        JOptionPane.showMessageDialog(rootPane, text);
    }
    public static void main(String[] args) {
        new formLOGIN().setVisible(true);
    }

}
