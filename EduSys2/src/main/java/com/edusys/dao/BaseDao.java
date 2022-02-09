/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edusys.dao;

import com.edusys.Interface.BaseDAOInterface;
import com.edusys.utils.JdbcHelper;
import java.util.ArrayList;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author XUÂN THÀNH
 */
public abstract class BaseDao<T, K> implements BaseDAOInterface<T, K> {

    public abstract String getQuery(String action);

    public abstract Object[] getParams(String action, T obj);

    public abstract T createEntity(final ResultSet rs) throws SQLException;

    @Override
    public boolean insert(T e) throws Exception {
        return JdbcHelper.update(this.getQuery("INSERT"), this.getParams("INSERT", e)) > 0;
    }

    @Override
    public boolean update(T e) throws Exception {
        return JdbcHelper.update(this.getQuery("UPDATE"), this.getParams("UPDATE", e)) > 0;
    }

    @Override
    public boolean delete(K key) throws Exception {
        return JdbcHelper.update(this.getQuery("DELETE"), key) > 0;
    }

    @Override
    public T selectByID(K key) throws Exception {
        try {
            ResultSet rs = JdbcHelper.query(this.getQuery("SELECTBYID"), key);
            if (rs.next()) {
                T e = createEntity(rs);
                return e;
            }
            rs.getStatement().getConnection().close();
            return null;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

    @Override
    public ArrayList<T> selectALL() throws Exception {
        ArrayList<T> list = new ArrayList<>();
        try {
            ResultSet rs = JdbcHelper.query(this.getQuery("SELECTALL"));
            while (rs.next()) {
                T e1 = createEntity(rs);
                list.add(e1);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public  ArrayList<T> selectByQuery(String query, Object... args) throws Exception{
        ArrayList<T> list = new ArrayList<>();
        try {
            ResultSet rs = JdbcHelper.query(this.getQuery(query), args);
            while (rs.next()) {
                T e1 = createEntity(rs);
                list.add(e1);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
    }
    
    
    
}
