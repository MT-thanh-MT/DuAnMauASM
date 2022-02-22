/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edusys.dao;

import com.edusys.utils.DateHelper;
import com.edusys.utils.JdbcHelper;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author XUÂN THÀNH
 */
public class ThongKeDAO {

    public List<Integer> selectYears() {
        String sql = "SELECT DISTINCT year(NgayKG) FROM KhoaHoc ORDER BY Year(NgayKG) DESC";

        List<Integer> list = new ArrayList<>();
        try {
            ResultSet rs = JdbcHelper.query(sql);
            while (rs.next()) {
                list.add(rs.getInt(1));
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }

    public List<Object[]> getBangDiem(int makh) {
        List<Object[]> list = new ArrayList<>();
        String sql = "{CALL sp_BangDiem(?)}";
        try {
            ResultSet rs = JdbcHelper.query(sql, makh);
            while (rs.next()) {
                list.add(new Object[]{
                    rs.getObject(1),
                    rs.getObject(2),
                    rs.getObject(3)
                });
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }

    public List<Object[]> getDoanhThu(int nam) {
        List<Object[]> list = new ArrayList<>();
        String sql = "{CALL sp_ThongKeDoanhThu(?)}";
        try {
            ResultSet rs = JdbcHelper.query(sql, nam);
            while (rs.next()) {
                String dt = String.format("%.2f", rs.getObject(4)),
                        cn = String.format("%.2f", rs.getObject(5)),
                        tn = String.format("%.2f", rs.getObject(6)),
                        tb = String.format("%.2f", rs.getObject(7));

                list.add(new Object[]{
                    rs.getObject(1),
                    rs.getObject(2),
                    rs.getObject(3),
                    dt,
                    cn,
                    tn,
                    tb
                });
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }

    public List<Object[]> getLuongNguoiHoc() {
        List<Object[]> list = new ArrayList<>();
        String sql = "{CALL sp_ThongKeNguoiHoc()}";
        try {
            ResultSet rs = JdbcHelper.query(sql);
            while (rs.next()) {
                list.add(new Object[]{
                    rs.getObject(1),
                    rs.getObject(2),
                    DateHelper.toString(rs.getDate(3), "dd/MM/yyyy"),
                    DateHelper.toString(rs.getDate(4), "dd/MM/yyyy")
                });
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }

    public List<Object[]> getDiemChuyenDe() {
        List<Object[]> list = new ArrayList<>();
        String sql = "{CALL sp_ThongKeDiem()}";
        try {
            ResultSet rs = JdbcHelper.query(sql);
            while (rs.next()) {
                list.add(new Object[]{
                    rs.getObject(1),
                    rs.getObject(2),
                    rs.getObject(3),
                    rs.getObject(4),
                    rs.getObject(5)
                });
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
    }

}
