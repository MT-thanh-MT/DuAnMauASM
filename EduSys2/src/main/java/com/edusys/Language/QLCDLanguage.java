/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edusys.Language;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;

/**
 *
 * @author XUÂN THÀNH
 */
public class QLCDLanguage {

    private javax.swing.JButton btnMoi;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnTimKiem;
    private javax.swing.JButton btnXoa;
    private javax.swing.JLabel lblHocPhi;
    private javax.swing.JLabel lblMaCD;
    private javax.swing.JLabel lblQLChuyenDeTitle;
    private javax.swing.JLabel lblTenCD;
    private javax.swing.JLabel lblThoiLuong;
    private javax.swing.JPanel pnlHinh;
    private javax.swing.JPanel pnlMoTa;
    private javax.swing.JTable tblQLCD;

    public QLCDLanguage(JButton btnMoi, JButton btnSua, JButton btnThem, JButton btnTimKiem, JButton btnXoa, JLabel lblHocPhi, JLabel lblMaCD, JLabel lblQLChuyenDeTitle, JLabel lblTenCD, JLabel lblThoiLuong, JPanel pnlHinh, JPanel pnlMoTa, JTable tblQLCD) {
        this.btnMoi = btnMoi;
        this.btnSua = btnSua;
        this.btnThem = btnThem;
        this.btnTimKiem = btnTimKiem;
        this.btnXoa = btnXoa;
        this.lblHocPhi = lblHocPhi;
        this.lblMaCD = lblMaCD;
        this.lblQLChuyenDeTitle = lblQLChuyenDeTitle;
        this.lblTenCD = lblTenCD;
        this.lblThoiLuong = lblThoiLuong;
        this.pnlHinh = pnlHinh;
        this.pnlMoTa = pnlMoTa;
        this.tblQLCD = tblQLCD;
    }


    public void changeLanguage(int choice) {
        switch (choice) {
            case 0:
                this.btnMoi.setText("Mới");
                this.btnSua.setText("Sửa");
                this.btnThem.setText("Thêm");
                this.btnXoa.setText("Xóa");
                this.lblHocPhi.setText("Học phí");
                this.lblMaCD.setText("Mã chuyên đề");
                this.lblQLChuyenDeTitle.setText("QUẢN LÝ CHUYÊN ĐỀ");
                this.lblTenCD.setText("Tên chuyên đề");
                this.lblThoiLuong.setText("Thời lượng (Giờ)");
                pnlHinh.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 102)),
                        "Hình logo", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION,
                        javax.swing.border.TitledBorder.BELOW_TOP, new java.awt.Font("MS UI Gothic", 0, 11),
                        new java.awt.Color(255, 255, 255)));
                pnlMoTa.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Mô tả chuyên đề", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION,
                        javax.swing.border.TitledBorder.BELOW_TOP, new java.awt.Font("Arial", 1, 11),
                        new java.awt.Color(255, 255, 255)));
                this.tblQLCD.getColumnModel().getColumn(0).setHeaderValue("MÃ CD");
                this.tblQLCD.getColumnModel().getColumn(1).setHeaderValue("TÊN CD");
                this.tblQLCD.getColumnModel().getColumn(2).setHeaderValue("HỌC PHÍ");
                this.tblQLCD.getColumnModel().getColumn(3).setHeaderValue("THỜI LƯỢNG");
                this.tblQLCD.getColumnModel().getColumn(4).setHeaderValue("HÌNH");
                this.tblQLCD.getTableHeader().repaint();
                break;
            case 1:
                this.btnMoi.setText("New");
                this.btnSua.setText("Udate");
                this.btnThem.setText("Save");
                this.btnXoa.setText("Delete");
                this.lblHocPhi.setText("Tuition");
                this.lblMaCD.setText("ID");
                this.lblQLChuyenDeTitle.setText("SPECIAL SUBJECT");
                this.lblTenCD.setText("Special subject name");
                this.lblThoiLuong.setText("Time (h)");
                pnlHinh.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 102)),
                        "Image", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION,
                        javax.swing.border.TitledBorder.BELOW_TOP, new java.awt.Font("MS UI Gothic", 0, 11),
                        new java.awt.Color(255, 255, 255)));
                pnlMoTa.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Description", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION,
                        javax.swing.border.TitledBorder.BELOW_TOP, new java.awt.Font("Arial", 1, 11),
                        new java.awt.Color(255, 255, 255)));
                this.tblQLCD.getColumnModel().getColumn(0).setHeaderValue("ID");
                this.tblQLCD.getColumnModel().getColumn(1).setHeaderValue("SS NAME");
                this.tblQLCD.getColumnModel().getColumn(2).setHeaderValue("TUITION");
                this.tblQLCD.getColumnModel().getColumn(3).setHeaderValue("TIME");
                this.tblQLCD.getColumnModel().getColumn(4).setHeaderValue("IMAGE");
                this.tblQLCD.getTableHeader().repaint();
                break;
        }
    }
}
