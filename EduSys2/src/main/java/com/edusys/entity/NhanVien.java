/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edusys.entity;

import java.io.Serializable;

/**
 *
 * @author XUÂN THÀNH
 */
public class NhanVien implements Serializable{
    private String maNV;
    private String matKhau;
    private String hoTen;
    private String Email;
    private int SLDangNhapSai;
    private boolean trangThai;
    private boolean vaiTro;

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public String getMatKhau() {
        return matKhau;
    }

    public void setMatKhau(String matKhau) {
        this.matKhau = matKhau;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public int getSLDangNhapSai() {
        return SLDangNhapSai;
    }

    public void setSLDangNhapSai(int SLDangNhapSai) {
        this.SLDangNhapSai = SLDangNhapSai;
    }

    public boolean isTrangThai() {
        return trangThai;
    }

    public void setTrangThai(boolean trangThai) {
        this.trangThai = trangThai;
    }

    public boolean isVaiTro() {
        return vaiTro;
    }

    public void setVaiTro(boolean vaiTro) {
        this.vaiTro = vaiTro;
    }

    public NhanVien(String maNV, String matKhau, String hoTen, String Email, int SLDangNhapSai, boolean trangThai, boolean vaiTro) {
        this.maNV = maNV;
        this.matKhau = matKhau;
        this.hoTen = hoTen;
        this.Email = Email;
        this.SLDangNhapSai = SLDangNhapSai;
        this.trangThai = trangThai;
        this.vaiTro = vaiTro;
    }

    public NhanVien() {
    }

    
    
	
}
