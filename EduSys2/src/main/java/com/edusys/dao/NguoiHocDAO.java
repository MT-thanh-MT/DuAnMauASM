/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edusys.dao;

import com.edusys.entity.NguoiHoc;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author XUÂN THÀNH
 */
public class NguoiHocDAO extends BaseDao<NguoiHoc, String> {

    @Override
    public String getQuery(String action) {
        switch (action) {
            case "INSERT":
                return "INSERT INTO NGUOIHOC (MaNH, HoTen, NgaySinh, GioiTinh, DienThoai, Email, GhiChu, MaNV, NgayDK) VALUES (?,?,?,?,?,?,?,?,?)";
            case "UPDATE":
                return "UPDATE NGUOIHOC SET HoTen = ?, NgaySinh = ?, GioiTinh = ?, DienThoai = ?, Email = ?, GhiChu = ?, MaNV = ?, NgayDK = ? WHERE MaNH = ?";
            case "DELETE":
                return "DELETE FROM NGUOIHOC WHERE MaNH = ?";
            case "SELECTBYID":
                return "SELECT * FROM NGUOIHOC WHERE MaNH = ?";
            case "SELECTBYNAME":
                return "SELECT * FROM NGUOIHOC WHERE  HoTen like ?";
            case "SELECTALL":
                return "SELECT * FROM NGUOIHOC";
        }
        return "";
    }

    @Override
    public Object[] getParams(String action, NguoiHoc nh) {
        switch (action) {
            case "INSERT":
                return new Object[]{
                    nh.getMaNH(),
                    nh.getHoTen(),
                    nh.getNgaySinh(),
                    nh.isGioiTinh(),
                    nh.getDienThoai(),
                    nh.getEmail(),
                    nh.getGhiChu(),
                    nh.getMaNV(),
                    nh.getNgayDK()
                };
            case "UPDATE":
                return new Object[]{
                    nh.getHoTen(),
                    nh.getNgaySinh(),
                    nh.isGioiTinh(),
                    nh.getDienThoai(),
                    nh.getEmail(),
                    nh.getGhiChu(),
                    nh.getMaNV(),
                    nh.getNgayDK(),
                    nh.getMaNH()
                };

        }
        return null;
    }

    @Override
    public NguoiHoc createEntity(ResultSet rs) throws SQLException {
        NguoiHoc nh = new NguoiHoc();
        nh.setMaNH(rs.getString("MaNH"));
        nh.setHoTen(rs.getString("HoTen"));
        nh.setNgaySinh(rs.getDate("NgaySinh"));
        nh.setGioiTinh(rs.getBoolean("GioiTinh"));
        nh.setDienThoai(rs.getString("DienThoai"));
        nh.setEmail(rs.getString("Email"));
        nh.setGhiChu(rs.getString("GhiChu"));
        nh.setMaNV(rs.getString("MaNV"));
        nh.setNgayDK(rs.getDate("NgayDK"));
        return nh;
    }

}
