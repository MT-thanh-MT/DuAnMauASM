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
public class QLKHLanguage {
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnXoa;
    private javax.swing.JButton btnMoi;
    private javax.swing.JLabel lblHocPhi;
    private javax.swing.JLabel lblNgayKG;
    private javax.swing.JLabel lblNgayTao;
    private javax.swing.JLabel lblQLKhoaHocTitle;
    private javax.swing.JLabel lblTenCD;
    private javax.swing.JLabel lblTenNguoiTao;
    private javax.swing.JLabel lblThoiLuong;
    private javax.swing.JPanel pnlChuyenDe;
    private javax.swing.JPanel pnlGhiChu;
    private javax.swing.JTable tblKhoaHoc;

    public QLKHLanguage(JButton btnSua, JButton btnThem, JButton btnXoa, JButton btnMoi, JLabel lblHocPhi, JLabel lblNgayKG, JLabel lblNgayTao, JLabel lblQLKhoaHocTitle, JLabel lblTenCD, JLabel lblTenNguoiTao, JLabel lblThoiLuong, JPanel pnlChuyenDe, JPanel pnlGhiChu, JTable tblKhoaHoc) {
        this.btnSua = btnSua;
        this.btnThem = btnThem;
        this.btnXoa = btnXoa;
        this.btnMoi = btnMoi;
        this.lblHocPhi = lblHocPhi;
        this.lblNgayKG = lblNgayKG;
        this.lblNgayTao = lblNgayTao;
        this.lblQLKhoaHocTitle = lblQLKhoaHocTitle;
        this.lblTenCD = lblTenCD;
        this.lblTenNguoiTao = lblTenNguoiTao;
        this.lblThoiLuong = lblThoiLuong;
        this.pnlChuyenDe = pnlChuyenDe;
        this.pnlGhiChu = pnlGhiChu;
        this.tblKhoaHoc = tblKhoaHoc;
    }
    
     public void changeLanguage(int choice) {
        switch (choice) {
            case 0:
                this.btnMoi.setText("Mới");
                this.btnSua.setText("Sửa");
                this.btnThem.setText("Thêm");
                this.btnXoa.setText("Xóa");
                this.lblHocPhi.setText("Học phí");
                this.lblNgayKG.setText("Khai Giảng");
                this.lblTenCD.setText("Chuyên Đề");
                this.lblNgayTao.setText("Ngày Tạo");
                this.lblTenNguoiTao.setText("Người Tạo");
                this.lblThoiLuong.setText("Thời Lượng(giờ)");
                this.lblQLKhoaHocTitle.setText("QUẢN LÝ KHÓA HỌC");
                pnlGhiChu.setBorder(javax.swing.BorderFactory.createTitledBorder(null, 
                        "Ghi Chú", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, 
                        javax.swing.border.TitledBorder.BELOW_TOP, 
                        new java.awt.Font("Arial", 1, 11), new java.awt.Color(255, 255, 255)));
                pnlChuyenDe.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED),
                        "CHUYÊN ĐỀ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION,
                        new java.awt.Font("Times New Roman", 1, 14), new java.awt.Color(255, 102, 102)));
                this.tblKhoaHoc.getColumnModel().getColumn(0).setHeaderValue("MÃ KH");
                this.tblKhoaHoc.getColumnModel().getColumn(1).setHeaderValue("THỜI LƯỢNG");
                this.tblKhoaHoc.getColumnModel().getColumn(2).setHeaderValue("HỌC PHÍ");
                this.tblKhoaHoc.getColumnModel().getColumn(3).setHeaderValue("KHAI GIẢNG");
                this.tblKhoaHoc.getColumnModel().getColumn(4).setHeaderValue("TẠO BỞI");
                this.tblKhoaHoc.getColumnModel().getColumn(5).setHeaderValue("NGÀY TẠO");
                this.tblKhoaHoc.getTableHeader().repaint();
                break;
            case 1:
                this.btnMoi.setText("New");
                this.btnSua.setText("Udate");
                this.btnThem.setText("Save");
                this.btnXoa.setText("Delete");
                this.lblHocPhi.setText("Tuition");
                this.lblNgayKG.setText("Started");
                this.lblTenCD.setText("Special subject");
                this.lblThoiLuong.setText("Time (h)");
                this.lblNgayTao.setText("Date created");
                this.lblTenNguoiTao.setText("Creator");
                this.lblQLKhoaHocTitle.setText("COURSE MANAGEMENT");
                pnlGhiChu.setBorder(javax.swing.BorderFactory.createTitledBorder(null, 
                        "Note", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, 
                        javax.swing.border.TitledBorder.BELOW_TOP, 
                        new java.awt.Font("Arial", 1, 11), new java.awt.Color(255, 255, 255)));
                pnlChuyenDe.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED),
                        "Special Subject", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION,
                        new java.awt.Font("Times New Roman", 1, 14), new java.awt.Color(255, 102, 102)));
                this.tblKhoaHoc.getColumnModel().getColumn(0).setHeaderValue("ID");
                this.tblKhoaHoc.getColumnModel().getColumn(1).setHeaderValue("TIME");
                this.tblKhoaHoc.getColumnModel().getColumn(2).setHeaderValue("TUITION");
                this.tblKhoaHoc.getColumnModel().getColumn(3).setHeaderValue("STARTED");
                this.tblKhoaHoc.getColumnModel().getColumn(4).setHeaderValue("CREATOR");
                this.tblKhoaHoc.getColumnModel().getColumn(5).setHeaderValue("DATE CREATED");
                this.tblKhoaHoc.getTableHeader().repaint();
                break;
        }
    }
}
