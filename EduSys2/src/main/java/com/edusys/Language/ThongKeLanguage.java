/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edusys.Language;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTable;

/**
 *
 * @author XUÂN THÀNH
 */
public class ThongKeLanguage {

    private javax.swing.JLabel lblKhoaHoc;
    private javax.swing.JLabel lblNam;
    private javax.swing.JLabel lblThongKe;
    private javax.swing.JPanel pnlTimKiemKH;
    private javax.swing.JPanel pnlTimKiemNam;
    private javax.swing.JTable tblBangDiem;
    private javax.swing.JTable tblDiemChuyenDe;
    private javax.swing.JTable tblDoanhThu;
    private javax.swing.JTable tblNguoiHoc;
    private javax.swing.JTabbedPane pnlTabs;

    public ThongKeLanguage(JLabel lblKhoaHoc, JLabel lblNam, JLabel lblThongKe, JPanel pnlTimKiemKH, JPanel pnlTimKiemNam, JTable tblBangDiem, JTable tblDiemChuyenDe, JTable tblDoanhThu, JTable tblNguoiHoc, JTabbedPane pnlTabs) {
        this.lblKhoaHoc = lblKhoaHoc;
        this.lblNam = lblNam;
        this.lblThongKe = lblThongKe;
        this.pnlTimKiemKH = pnlTimKiemKH;
        this.pnlTimKiemNam = pnlTimKiemNam;
        this.tblBangDiem = tblBangDiem;
        this.tblDiemChuyenDe = tblDiemChuyenDe;
        this.tblDoanhThu = tblDoanhThu;
        this.tblNguoiHoc = tblNguoiHoc;
        this.pnlTabs = pnlTabs;
    }

    public void changeLanguage(int choice) {
        switch (choice) {
            case 0:
                this.lblKhoaHoc.setText("KHÓA HỌC:");
                this.lblNam.setText("NĂM:");
                this.lblThongKe.setText("TỔNG HỢP THỐNG KÊ");
                pnlTimKiemKH.setBorder(javax.swing.BorderFactory.createTitledBorder(null,
                        "TÌM KIẾM", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION,
                        javax.swing.border.TitledBorder.BELOW_TOP, new java.awt.Font("Arial", 1, 11),
                        new java.awt.Color(255, 255, 255)));
                pnlTimKiemNam.setBorder(javax.swing.BorderFactory.createTitledBorder(null,
                        "TÌM KIẾM", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION,
                        javax.swing.border.TitledBorder.BELOW_TOP, new java.awt.Font("Arial", 1, 11),
                        new java.awt.Color(255, 255, 255)));
                this.tblBangDiem.getColumnModel().getColumn(0).setHeaderValue("MÃ NH");
                this.tblBangDiem.getColumnModel().getColumn(1).setHeaderValue("HỌ VÀ TÊN");
                this.tblBangDiem.getColumnModel().getColumn(2).setHeaderValue("ĐIỂM");
                this.tblBangDiem.getColumnModel().getColumn(3).setHeaderValue("XẾP LOẠI");
                this.tblBangDiem.getTableHeader().repaint();

                this.tblDoanhThu.getColumnModel().getColumn(0).setHeaderValue("CHUYÊN ĐỀ");
                this.tblDoanhThu.getColumnModel().getColumn(1).setHeaderValue("SỐ KH");
                this.tblDoanhThu.getColumnModel().getColumn(2).setHeaderValue("SỐ HV");
                this.tblDoanhThu.getColumnModel().getColumn(3).setHeaderValue("DOANH THU");
                this.tblDoanhThu.getColumnModel().getColumn(4).setHeaderValue("HP CAO NHẤT");
                this.tblDoanhThu.getColumnModel().getColumn(5).setHeaderValue("HP THẤP NHẤT");
                this.tblDoanhThu.getColumnModel().getColumn(6).setHeaderValue("HP TB");
                this.tblDoanhThu.getTableHeader().repaint();

                this.tblDiemChuyenDe.getColumnModel().getColumn(0).setHeaderValue("CHUYÊN ĐỀ");
                this.tblDiemChuyenDe.getColumnModel().getColumn(1).setHeaderValue("SL HV");
                this.tblDiemChuyenDe.getColumnModel().getColumn(2).setHeaderValue("ĐIỂM TN");
                this.tblDiemChuyenDe.getColumnModel().getColumn(3).setHeaderValue("ĐIỂM CN");
                this.tblDiemChuyenDe.getColumnModel().getColumn(4).setHeaderValue("ĐIỂM TB");
                this.tblDiemChuyenDe.getTableHeader().repaint();

                this.tblNguoiHoc.getColumnModel().getColumn(0).setHeaderValue("NĂM");
                this.tblNguoiHoc.getColumnModel().getColumn(1).setHeaderValue("SỐ NH");
                this.tblNguoiHoc.getColumnModel().getColumn(2).setHeaderValue("ĐK SỚM NHẤT");
                this.tblNguoiHoc.getColumnModel().getColumn(3).setHeaderValue("ĐK MUỘN NHẤT");
                this.tblNguoiHoc.getTableHeader().repaint();
                this.pnlTabs.setTitleAt(0, "BẢNG ĐIỂM");
                this.pnlTabs.setTitleAt(1, "NGƯỜI HỌC");
                this.pnlTabs.setTitleAt(2, "ĐIỂM CHUYÊN ĐỀ");
                this.pnlTabs.setTitleAt(3, "DOANH THU");
                break;

            case 1:

                this.lblKhoaHoc.setText("COURSE:");
                this.lblNam.setText("YEAR:");
                this.lblThongKe.setText("SUMMARY STATISTICS");
                pnlTimKiemKH.setBorder(javax.swing.BorderFactory.createTitledBorder(null,
                        "SEARCH", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION,
                        javax.swing.border.TitledBorder.BELOW_TOP, new java.awt.Font("Arial", 1, 11),
                        new java.awt.Color(255, 255, 255)));
                pnlTimKiemNam.setBorder(javax.swing.BorderFactory.createTitledBorder(null,
                        "SEARCH", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION,
                        javax.swing.border.TitledBorder.BELOW_TOP, new java.awt.Font("Arial", 1, 11),
                        new java.awt.Color(255, 255, 255)));
                this.tblBangDiem.getColumnModel().getColumn(0).setHeaderValue("ID");
                this.tblBangDiem.getColumnModel().getColumn(1).setHeaderValue("FULLNAME");
                this.tblBangDiem.getColumnModel().getColumn(2).setHeaderValue("SCORES");
                this.tblBangDiem.getColumnModel().getColumn(3).setHeaderValue("CLASSIFICATION");
                this.tblBangDiem.getTableHeader().repaint();

                this.tblDoanhThu.getColumnModel().getColumn(0).setHeaderValue("SPECIAL SUBJECT");
                this.tblDoanhThu.getColumnModel().getColumn(1).setHeaderValue("COURSE NUMBER");
                this.tblDoanhThu.getColumnModel().getColumn(2).setHeaderValue("TRAINEE NUMBER");
                this.tblDoanhThu.getColumnModel().getColumn(3).setHeaderValue("REVENUE");
                this.tblDoanhThu.getColumnModel().getColumn(4).setHeaderValue("MAX FEE");
                this.tblDoanhThu.getColumnModel().getColumn(5).setHeaderValue("MIN FEE");
                this.tblDoanhThu.getColumnModel().getColumn(6).setHeaderValue("AVG FEE");
                this.tblDoanhThu.getTableHeader().repaint();

                this.tblDiemChuyenDe.getColumnModel().getColumn(0).setHeaderValue("SPECIAL SUBJECT");
                this.tblDiemChuyenDe.getColumnModel().getColumn(1).setHeaderValue("TRAINEE AMOUNT ");
                this.tblDiemChuyenDe.getColumnModel().getColumn(2).setHeaderValue("MIN SCORES");
                this.tblDiemChuyenDe.getColumnModel().getColumn(3).setHeaderValue("MAX SCORES");
                this.tblDiemChuyenDe.getColumnModel().getColumn(4).setHeaderValue("AVG SCORES");
                this.tblDiemChuyenDe.getTableHeader().repaint();

                this.tblNguoiHoc.getColumnModel().getColumn(0).setHeaderValue("YEAR");
                this.tblNguoiHoc.getColumnModel().getColumn(1).setHeaderValue("NUMBER OF STUDENTS");
                this.tblNguoiHoc.getColumnModel().getColumn(2).setHeaderValue("REGISTRATION EARLIEST");
                this.tblNguoiHoc.getColumnModel().getColumn(3).setHeaderValue("REGISTRATION LATEST");
                this.tblNguoiHoc.getTableHeader().repaint();
                this.pnlTabs.setTitleAt(0, "TRANSCRIPT");
                this.pnlTabs.setTitleAt(1, "LEARNER");
                this.pnlTabs.setTitleAt(2, "SPECIAL SUBJECT");
                this.pnlTabs.setTitleAt(3, "REVENUE");

                break;
        }
    }
}
