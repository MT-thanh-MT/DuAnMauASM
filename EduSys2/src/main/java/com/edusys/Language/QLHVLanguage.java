/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edusys.Language;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTable;

/**
 *
 * @author XUÂN THÀNH
 */
public class QLHVLanguage {

    private javax.swing.JButton btnSuaDiem;
    private javax.swing.JButton btnThemVaoKH;
    private javax.swing.JButton btnTimKiem;
    private javax.swing.JButton btnXoaHV;
    private javax.swing.JLabel lblQLHocVienTitle;
    private javax.swing.JTabbedPane pnlTabs;
    private javax.swing.JPanel pnlTimKiem;
    private javax.swing.JPanel pnlCD;
    private javax.swing.JPanel pnlKH;
    private javax.swing.JTable tblHocVien;
    private javax.swing.JTable tblNguoiHoc;

    public QLHVLanguage(JButton btnSuaDiem, JButton btnThemVaoKH, JButton btnTimKiem, JButton btnXoaHV, JLabel lblQLHocVienTitle, JTabbedPane pnlTabs, JPanel pnlTimKiem, JPanel pnlCD, JPanel pnlKH, JTable tblHocVien, JTable tblNguoiHoc) {
        this.btnSuaDiem = btnSuaDiem;
        this.btnThemVaoKH = btnThemVaoKH;
        this.btnTimKiem = btnTimKiem;
        this.btnXoaHV = btnXoaHV;
        this.lblQLHocVienTitle = lblQLHocVienTitle;
        this.pnlTabs = pnlTabs;
        this.pnlTimKiem = pnlTimKiem;
        this.pnlCD = pnlCD;
        this.pnlKH = pnlKH;
        this.tblHocVien = tblHocVien;
        this.tblNguoiHoc = tblNguoiHoc;
    }

    public void changeLanguage(int choice) {
        switch (choice) {
            case 0:
                this.btnSuaDiem.setText("Cập nhật điểm");
                this.btnThemVaoKH.setText("Thêm vào khóa học");
                this.btnTimKiem.setText("Tìm");
                this.btnXoaHV.setText("Xóa khỏi khóa học");
                this.lblQLHocVienTitle.setText("QUẢN LÝ HỌC VIÊN");
                
                pnlCD.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED),
                        "CHUYÊN ĐỀ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION,
                        new java.awt.Font("Times New Roman", 1, 14), new java.awt.Color(255, 102, 102)));
                pnlKH.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED),
                        "KHÓA HỌC", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION,
                        new java.awt.Font("Times New Roman", 1, 14), new java.awt.Color(255, 102, 102)));
                pnlTimKiem.setBorder(javax.swing.BorderFactory.createTitledBorder(null, 
                        "TÌM KIẾM", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION,
                        javax.swing.border.TitledBorder.BELOW_TOP, new java.awt.Font("Arial", 1, 11),
                        new java.awt.Color(255, 255, 255)));
                this.pnlTabs.setTitleAt(0, "HỌC VIÊN");
                this.pnlTabs.setTitleAt(1, "NGƯỜI HỌC");
                
                this.tblHocVien.getColumnModel().getColumn(0).setHeaderValue("TT");
                this.tblHocVien.getColumnModel().getColumn(1).setHeaderValue("MÃ HV");
                this.tblHocVien.getColumnModel().getColumn(2).setHeaderValue("MÃ NH");
                this.tblHocVien.getColumnModel().getColumn(3).setHeaderValue("HỌ TÊN");
                this.tblHocVien.getColumnModel().getColumn(4).setHeaderValue("ĐIỂM");
                this.tblHocVien.getTableHeader().repaint();

                this.tblNguoiHoc.getColumnModel().getColumn(0).setHeaderValue("MÃ NH");
                this.tblNguoiHoc.getColumnModel().getColumn(1).setHeaderValue("HỌ VÀ TÊN");
                this.tblNguoiHoc.getColumnModel().getColumn(2).setHeaderValue("GIỚI TÍNH");
                this.tblNguoiHoc.getColumnModel().getColumn(3).setHeaderValue("NGÀY SINH");
                this.tblNguoiHoc.getColumnModel().getColumn(4).setHeaderValue("ĐIỆN THOẠI");
                this.tblNguoiHoc.getColumnModel().getColumn(5).setHeaderValue("EMAIL");
                this.tblNguoiHoc.getTableHeader().repaint();
                break;
            case 1:
                this.btnSuaDiem.setText("Update scores");
                this.btnThemVaoKH.setText("Add to the course");
                this.btnTimKiem.setText("Find");
                this.btnXoaHV.setText("Delete from course");
                this.lblQLHocVienTitle.setText("STUDENT MANAGEMENT");
                
                pnlCD.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED),
                        "SPECIAL SUBJECT", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION,
                        new java.awt.Font("Times New Roman", 1, 14), new java.awt.Color(255, 102, 102)));
                pnlKH.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED),
                        "COURSE", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION,
                        new java.awt.Font("Times New Roman", 1, 14), new java.awt.Color(255, 102, 102)));
                pnlTimKiem.setBorder(javax.swing.BorderFactory.createTitledBorder(null, 
                        "FIND", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION,
                        javax.swing.border.TitledBorder.BELOW_TOP, new java.awt.Font("Arial", 1, 11),
                        new java.awt.Color(255, 255, 255)));
                this.pnlTabs.setTitleAt(0, "STUDENT");
                this.pnlTabs.setTitleAt(1, "LEARNER");
                
                this.tblHocVien.getColumnModel().getColumn(0).setHeaderValue("Th");
                this.tblHocVien.getColumnModel().getColumn(1).setHeaderValue("ID TRAINEE");
                this.tblHocVien.getColumnModel().getColumn(2).setHeaderValue("ID LEARNER");
                this.tblHocVien.getColumnModel().getColumn(3).setHeaderValue("NAME");
                this.tblHocVien.getColumnModel().getColumn(4).setHeaderValue("SCORES");
                this.tblHocVien.getTableHeader().repaint();

                this.tblNguoiHoc.getColumnModel().getColumn(0).setHeaderValue("ID LEARNER");
                this.tblNguoiHoc.getColumnModel().getColumn(1).setHeaderValue("FULLNAME");
                this.tblNguoiHoc.getColumnModel().getColumn(2).setHeaderValue("SEX");
                this.tblNguoiHoc.getColumnModel().getColumn(3).setHeaderValue("BIRTHDAY");
                this.tblNguoiHoc.getColumnModel().getColumn(4).setHeaderValue("PHONE NUMBER");
                this.tblNguoiHoc.getColumnModel().getColumn(5).setHeaderValue("EMAIL");
                this.tblNguoiHoc.getTableHeader().repaint();
                break;
        }
    }
}
