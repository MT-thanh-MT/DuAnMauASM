/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edusys.dao;

import com.edusys.entity.HocVien;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author XUÂN THÀNH
 */
public class HocVienDAO extends BaseDao<HocVien, Integer>{

    @Override
    public String getQuery(String action) {
        switch (action) {
            case "INSERT":
                return "INSERT INTO HOCVIEN (MaKH, MaNH, Diem) VALUES (?,?,?)";
            case "UPDATE":
                return "UPDATE HOCVIEN SET MaKH = ?, MaNH = ?, Diem =? WHERE  MaHV = ?";
            case "DELETE":
                return "DELETE FROM HOCVIEN WHERE  MaHV = ?";
            case "SELECTBYID":
                return "SELECT * FROM HOCVIEN WHERE MaHV = ?";
            case "SELECT_BY_KHOAHOC":
                return "SELECT * FROM HOCVIEN WHERE MaKH = ?";
            case "SELECTALL":
                return "SELECT * FROM HOCVIEN";
        }
        return "";
    }

    @Override
    public Object[] getParams(String action, HocVien hv) {
         switch (action) {
            case "INSERT":
                return new Object[]{
                    hv.getMaKH(),
                    hv.getMaNH(),
                    hv.getDiem()
                };
            case "UPDATE":
                return new Object[]{
                    hv.getMaKH(),
                    hv.getMaNH(),
                    hv.getDiem(),
                    hv.getMaHV()
                };

        }
        return null;
    }

    @Override
    public HocVien createEntity(ResultSet rs) throws SQLException {
        HocVien hv = new HocVien();
        hv.setDiem(rs.getFloat("Diem"));
        hv.setMaHV(rs.getInt("MaHV"));
        hv.setMaKH(rs.getInt("MaKH"));
        hv.setMaNH(rs.getString("MaNH"));
        return hv;
    }
    
}
