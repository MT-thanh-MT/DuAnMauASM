/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edusys.utils;


import com.edusys.ui.DangNhapJDialog;
import java.awt.Component;
import javax.swing.JOptionPane;

/**
 *
 * @author XUÂN THÀNH
 */
public class MessegerHelper {
    
    public static void errorMesseger(StringBuilder loi, Component p){
        JOptionPane.showMessageDialog(p, loi, "Lỗi", JOptionPane.ERROR_MESSAGE);
    }
}
