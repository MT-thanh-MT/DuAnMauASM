/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edusys.Interface;

import java.util.ArrayList;

/**
 *
 * @author XUÂN THÀNH
 */
public interface NhanVienDAOInterface<E,T> {
    public boolean insert(E e)throws Exception;
    public boolean update(E e)throws Exception;
    public boolean delete(T maNV)throws Exception;
    public E selectByID(T maNV)throws Exception;
    public ArrayList<E> selectALL()throws Exception;
}
