/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edusys.dao;

import com.edusys.entity.KhoaHoc;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author XUÂN THÀNH
 */
public class KhoaHocDAO extends BaseDao<KhoaHoc, String>{

    @Override
    public String getQuery(String action) {
        switch (action) {
            case "INSERT":
                return "INSERT INTO KHOAHOC (MaCD, HocPhi, ThoiLuong, NgayKG, GhiChu, MaNV, NgayTao) VALUES (?,?,?,?,?,?,?)";
            case "UPDATE":
                return "UPDATE KHOAHOC SET MaCD = ?, HocPhi = ?, ThoiLuong = ?, NgayKG = ?, GhiChu = ?, MaNV = ?, NgayTao = ? WHERE MaKH = ?";
            case "DELETE":
                return "DELETE FROM KHOAHOC WHERE MaKH = ?";
            case "SELECTBYID":
                return "SELECT * FROM KHOAHOC WHERE MaKH = ?";
            case "SELECTBYMACD":
                return "SELECT * FROM KHOAHOC WHERE  MaCD = ?";
            case "SELECTALL":
                return "SELECT * FROM KHOAHOC";
        }
        return "";
    }

    @Override
    public Object[] getParams(String action, KhoaHoc kh) {
        switch (action) {
            case "INSERT":
                return new Object[]{
                    kh.getMaCD(),
                    kh.getHocPhi(),
                    kh.getThoiLuong(),
                    kh.getNgayKG(),
                    kh.getGhiChu(),
                    kh.getMaNV(),
                    kh.getNgayTao()
                };
            case "UPDATE":
                return new Object[]{
                    kh.getMaCD(),
                    kh.getHocPhi(),
                    kh.getThoiLuong(),
                    kh.getNgayKG(),
                    kh.getGhiChu(),
                    kh.getMaNV(),
                    kh.getNgayTao(),
                    kh.getMaKH()
                };

        }
        return null;
    }

    @Override
    public KhoaHoc createEntity(ResultSet rs) throws SQLException {
        KhoaHoc kh = new KhoaHoc();
        kh.setMaKH(rs.getInt("MaKH"));
        kh.setMaCD(rs.getString("MaCD"));
        kh.setHocPhi(rs.getFloat("HocPhi"));
        kh.setThoiLuong(rs.getInt("ThoiLuong"));
        kh.setNgayKG(rs.getDate("NgayKG"));
        kh.setGhiChu(rs.getString("GhiChu"));
        kh.setMaNV(rs.getString("MaNV"));
        kh.setNgayTao(rs.getDate("NgayTao"));
        return kh;
    }
    
}
