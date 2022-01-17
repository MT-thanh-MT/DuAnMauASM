/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edusys.dao;

import com.edusys.Interface.NhanVienDAOInterface;
import com.edusys.entity.NhanVien;
import com.edusys.utils.JdbcHelper;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author XUÂN THÀNH
 */
public class NhanVienDao implements NhanVienDAOInterface<NhanVien, String> {

    @Override
    public boolean insert(NhanVien e) throws Exception {
        String sql = "INSERT INTO [dbo].[NHANVIEN]([MANV],[MATKHAU],[HoTen],[VaiTro],[SDT]) VALUES (?,?,?,?,?)";
        String maNV = e.getMaNV();
        String matKhau = e.getMatKhau();
        String hoTen = e.getHoTen();
        boolean vaiTro = e.isVaiTro();
        String sdt = e.getSdt();
        return JdbcHelper.update(sql, maNV, matKhau, hoTen, vaiTro, sdt) > 0;
    }

    @Override
    public boolean update(NhanVien e) throws Exception {
        String sql = "UPDATE NHANVIEN SET MATKHAU = ?, HoTen = ?, VaiTro = ?, SDT = ? WHERE  MANV = ?";
        String maNV = e.getMaNV();
        String matKhau = e.getMatKhau();
        String hoTen = e.getHoTen();
        boolean vaiTro = e.isVaiTro();
        String sdt = e.getSdt();
        return JdbcHelper.update(sql, matKhau, hoTen, vaiTro, sdt, maNV) > 0;
    }

    @Override
    public boolean delete(String maNV) throws Exception {
        String sql = "DELETE FROM NHANVIEN WHERE  MANV = ?";

        return JdbcHelper.update(sql, maNV) > 0;
    }

    @Override
    public NhanVien selectByID(String maNV) throws Exception {
        String sql = "SELECT * FROM NhanVien WHERE  MANV = ?";

        NhanVien nv = new NhanVien();
        try {
            ResultSet rs = JdbcHelper.query(sql, maNV);
            if (rs.next()) {
                nv.setMaNV(rs.getString("MANV"));
                nv.setMatKhau(rs.getString("MATKHAU"));
                nv.setHoTen(rs.getString("HoTen"));
                nv.setSdt(rs.getString("SDT"));
                nv.setVaiTro(rs.getBoolean("VaiTro"));
                return nv;
            }
            rs.getStatement().getConnection().close();
            return null;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public ArrayList<NhanVien> selectALL() throws Exception {
        String sql = "SELECT * FROM NhanVien";
        ArrayList<NhanVien> list = new ArrayList<>();
        try {
            ResultSet rs = JdbcHelper.query(sql);
            while (rs.next()) {
                NhanVien nv = new NhanVien();
                nv.setMaNV(rs.getString("MANV"));
                nv.setMatKhau(rs.getString("MATKHAU"));
                nv.setHoTen(rs.getString("HoTen"));
                nv.setSdt(rs.getString("SDT"));
                nv.setVaiTro(rs.getBoolean("VaiTro"));
                list.add(nv);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
