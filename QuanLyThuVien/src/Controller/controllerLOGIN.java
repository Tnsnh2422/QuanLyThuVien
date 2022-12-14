/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import View.formAdmin;
import View.formLogin;
import View.formUser;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class controllerLOGIN {

    private formLogin formLogin;
    private DAOlogin DAOlogin;

    public controllerLOGIN(formLogin view) {
        this.formLogin = view;
        DAOlogin = new DAOlogin();
        formLogin.addLoginListener(new addLoginListener());
    }

    public void showFormLogin() {
        formLogin.setVisible(true);
    }

    class addLoginListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            String tk = formLogin.tfUsername.getText();
            String mk = formLogin.tfPassword.getText();
            try {
                switch (DAOlogin.checkTaiKhoan(tk, mk)) {
                    case 11:
                        formLogin.showMessage("Đăng nhâp thành công tài khoản Admin");
                        new formAdmin().setVisible(true);                       
                        formLogin.setVisible(false);
                        break;
                    case 1:
                        formLogin.showMessage("Đăng nhâp thành công");
                        new formUser(tk).setVisible(true);
                        formLogin.setVisible(false);
                        break;
                    default:
                        formLogin.showMessage("Đăng nhâp thất bại vui lòng kiểm tra lại tài khoản");
                        break;
                }
            } catch (SQLException ex) {
                Logger.getLogger(controllerLOGIN.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

}
