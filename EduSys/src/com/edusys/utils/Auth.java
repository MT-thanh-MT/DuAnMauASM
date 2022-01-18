/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edusys.utils;

import com.edusys.entity.NhanVien;

/**
 *
 * @author XUÂN THÀNH
 */
public class Auth {
    public static NhanVien nguoiDungHienTai = null;
    public static void clear(){
        Auth.nguoiDungHienTai = null;
    }
    
    public static boolean isLogin(){
        return Auth.nguoiDungHienTai != null;
    }
    
    public static boolean isManager(){
        return Auth.isLogin()&& nguoiDungHienTai.isVaiTro();
    }
}
