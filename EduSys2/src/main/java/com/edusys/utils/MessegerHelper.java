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

    public static void errorMesseger(StringBuilder loi, Component parent) {
        JOptionPane.showMessageDialog(parent, loi, "Lỗi", JOptionPane.ERROR_MESSAGE);
    }
    
    public static void alert(String messenge, Component parent) {
        JOptionPane.showMessageDialog(parent, messenge, "Hệ thống quản lý đào tạo", JOptionPane.INFORMATION_MESSAGE);
    }
    
    public static boolean confirm(Component parent, String messenge) {
        int result = JOptionPane.showConfirmDialog(parent, messenge,
                "Hệ thống quản lý đào tạo", JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE);
        return result == JOptionPane.YES_OPTION;
    }

    public static String prompt(Component parent, String messenge) {
        return JOptionPane.showInputDialog(parent, messenge,
                "Hệ thống quản lý đào tạo", JOptionPane.INFORMATION_MESSAGE);
    }
}
