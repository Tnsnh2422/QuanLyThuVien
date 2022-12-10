/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.awt.Color;
import javax.swing.JTextField;

/**
 *
 * @author VietNguyen
 */
public class DataValidator {
    public static void validateEmpty(JTextField field, StringBuilder sb, String errorMessage){
        if (field.getText().equals("")) {
            sb.append(errorMessage).append("\n");
            field.setBackground(Color.red);
            field.requestFocus();
        }else{
            field.setBackground(Color.white);
        }
    }
}
