/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edusys.dao;

import com.edusys.entity.NhanVien;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author XUÂN THÀNH
 */
public class NhanVienDao extends BaseDao<NhanVien, String> {

    @Override
    public String getQuery(String action) {
        switch (action) {
            case "INSERT":
                return "INSERT INTO [dbo].[NHANVIEN]([MANV],[MATKHAU],[HoTen],[VaiTro],[SDT]) VALUES (?,?,?,?,?)";
            case "UPDATE":
                return "UPDATE NHANVIEN SET MATKHAU = ?, HoTen = ?, VaiTro = ?, SDT = ? WHERE  MANV = ?";
            case "DELETE":
                return "DELETE FROM NHANVIEN WHERE  MANV = ?";
            case "SELECTBYID":
                return "SELECT * FROM NhanVien WHERE  MANV = ?";
            case "SELECTALL":
                return "SELECT * FROM NhanVien";
        }
        return "";
    }

    @Override
    public Object[] getParams(String action, NhanVien nv) {
        switch (action) {
            case "INSERT":
                return new Object[]{
                    nv.getMaNV(),
                    nv.getMatKhau(),
                    nv.getHoTen(),
                    nv.isVaiTro(),
                    nv.getSdt()
                };
            case "UPDATE":
                return new Object[]{
                    nv.getMatKhau(),
                    nv.getHoTen(),
                    nv.isVaiTro(),
                    nv.getSdt(),
                    nv.getMaNV()
                };

        }
        return null;
    }

    @Override
    public NhanVien createEntity(ResultSet rs) throws SQLException {
        NhanVien nv = new NhanVien();
        nv.setMaNV(rs.getString("MANV"));
        nv.setMatKhau(rs.getString("MATKHAU"));
        nv.setHoTen(rs.getString("HoTen"));
        nv.setSdt(rs.getString("SDT"));
        nv.setVaiTro(rs.getBoolean("VaiTro"));
        return nv;
    }

}
