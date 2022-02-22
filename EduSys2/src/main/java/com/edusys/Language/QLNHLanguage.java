/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edusys.Language;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTable;

/**
 *
 * @author XUÂN THÀNH
 */
public class QLNHLanguage {

    private javax.swing.JButton btnMoi;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnXoa;
    private javax.swing.JButton btnTimKiemTatCa;
    private javax.swing.JButton btnTimKiemTheoMa;
    private javax.swing.JButton btnTimKiemTheoTen;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblHoTen;
    private javax.swing.JLabel lblMaNH;
    private javax.swing.JLabel lblNgaySinh;
    private javax.swing.JLabel lblSDT;
    private javax.swing.JLabel lblQLNguoiHocTitle;
    private javax.swing.JRadioButton rdoNam;
    private javax.swing.JRadioButton rdoNu;
    private javax.swing.JPanel pnlGhiChu;
    private javax.swing.JPanel pnlTimKiem;
    private javax.swing.JPanel pnlGioiTinh;
    private javax.swing.JTable tblNguoiHoc;

    public QLNHLanguage(JButton btnMoi, JButton btnSua, JButton btnThem, JButton btnXoa, JButton btnTimKiemTatCa, JButton btnTimKiemTheoMa, JButton btnTimKiemTheoTen, JLabel lblEmail, JLabel lblHoTen, JLabel lblMaNH, JLabel lblNgaySinh, JLabel lblSDT, JLabel lblQLNguoiHocTitle, JRadioButton rdoNam, JRadioButton rdoNu, JPanel pnlGhiChu, JPanel pnlTimKiem, JPanel pnlGioiTinh, JTable tblNguoiHoc) {
        this.btnMoi = btnMoi;
        this.btnSua = btnSua;
        this.btnThem = btnThem;
        this.btnXoa = btnXoa;
        this.btnTimKiemTatCa = btnTimKiemTatCa;
        this.btnTimKiemTheoMa = btnTimKiemTheoMa;
        this.btnTimKiemTheoTen = btnTimKiemTheoTen;
        this.lblEmail = lblEmail;
        this.lblHoTen = lblHoTen;
        this.lblMaNH = lblMaNH;
        this.lblNgaySinh = lblNgaySinh;
        this.lblSDT = lblSDT;
        this.lblQLNguoiHocTitle = lblQLNguoiHocTitle;
        this.rdoNam = rdoNam;
        this.rdoNu = rdoNu;
        this.pnlGhiChu = pnlGhiChu;
        this.pnlTimKiem = pnlTimKiem;
        this.pnlGioiTinh = pnlGioiTinh;
        this.tblNguoiHoc = tblNguoiHoc;
    }

    public void changeLanguage(int choice) {
        switch (choice) {
            case 0:
                this.btnMoi.setText("Mới");
                this.btnSua.setText("Sửa");
                this.btnThem.setText("Thêm");
                this.btnXoa.setText("Xóa");
                this.btnTimKiemTatCa.setText("Tất cả");
                this.btnTimKiemTheoMa.setText("Tìm theo mã");
                this.btnTimKiemTheoTen.setText("Tìm theo tên");
                this.lblEmail.setText("Địa chỉ email");
                this.lblHoTen.setText("Họ và tên");
                this.lblMaNH.setText("Mã người học");
                this.lblNgaySinh.setText("Ngày sinh");
                this.lblSDT.setText("Số điện thoại");
                this.lblQLNguoiHocTitle.setText("QUẢN LÝ NGƯỜI HỌC");
                this.rdoNam.setText("Nam");
                this.rdoNu.setText("Nữ");
                pnlGioiTinh.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1),
                        "Giới tính", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.BELOW_TOP, 
                        new java.awt.Font("Arial", 1, 11), new java.awt.Color(255, 255, 255)));
                pnlGhiChu.setBorder(javax.swing.BorderFactory.createTitledBorder(null,
                        "Ghi Chú", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION,
                        javax.swing.border.TitledBorder.BELOW_TOP, new java.awt.Font("Arial", 1, 11),
                        new java.awt.Color(255, 255, 255)));
                pnlTimKiem.setBorder(javax.swing.BorderFactory.createTitledBorder(null,
                        "TÌM KIẾM", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION,
                        javax.swing.border.TitledBorder.BELOW_TOP, new java.awt.Font("Arial", 1, 11),
                        new java.awt.Color(255, 255, 255)));
                this.tblNguoiHoc.getColumnModel().getColumn(0).setHeaderValue("MÃ NH");
                this.tblNguoiHoc.getColumnModel().getColumn(1).setHeaderValue("HỌ VÀ TÊN");
                this.tblNguoiHoc.getColumnModel().getColumn(2).setHeaderValue("GIỚI TÍNH");
                this.tblNguoiHoc.getColumnModel().getColumn(3).setHeaderValue("NGÀY SINH");
                this.tblNguoiHoc.getColumnModel().getColumn(4).setHeaderValue("ĐIỆN THOẠI");
                this.tblNguoiHoc.getColumnModel().getColumn(5).setHeaderValue("EMAIL");
                this.tblNguoiHoc.getColumnModel().getColumn(5).setHeaderValue("MÃ NV");
                this.tblNguoiHoc.getColumnModel().getColumn(5).setHeaderValue("NGÀY ĐK");
                this.tblNguoiHoc.getTableHeader().repaint();
                break;
            case 1:
                this.btnMoi.setText("New");
                this.btnSua.setText("Udate");
                this.btnThem.setText("Save");
                this.btnXoa.setText("Delete");
                this.btnTimKiemTatCa.setText("ALL");
                this.btnTimKiemTheoMa.setText("Find by id");
                this.btnTimKiemTheoTen.setText("Find by name");
                this.lblEmail.setText("Email");
                this.lblHoTen.setText("Fullname");
                this.lblMaNH.setText("ID");
                this.lblNgaySinh.setText("Birthday");
                this.lblSDT.setText("Phone number");
                this.lblQLNguoiHocTitle.setText("LEARNER MANAGEMENT");
                this.rdoNam.setText("Male");
                this.rdoNu.setText("Female");
                pnlGioiTinh.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1),
                        "SEX", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.BELOW_TOP, 
                        new java.awt.Font("Arial", 1, 11), new java.awt.Color(255, 255, 255)));
                pnlGhiChu.setBorder(javax.swing.BorderFactory.createTitledBorder(null,
                        "Note", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION,
                        javax.swing.border.TitledBorder.BELOW_TOP, new java.awt.Font("Arial", 1, 11),
                        new java.awt.Color(255, 255, 255)));
                pnlTimKiem.setBorder(javax.swing.BorderFactory.createTitledBorder(null,
                        "Search", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION,
                        javax.swing.border.TitledBorder.BELOW_TOP, new java.awt.Font("Arial", 1, 11),
                        new java.awt.Color(255, 255, 255)));
                this.tblNguoiHoc.getColumnModel().getColumn(0).setHeaderValue("ID");
                this.tblNguoiHoc.getColumnModel().getColumn(1).setHeaderValue("FULLNAME");
                this.tblNguoiHoc.getColumnModel().getColumn(2).setHeaderValue("SEX");
                this.tblNguoiHoc.getColumnModel().getColumn(3).setHeaderValue("BIRTHDAY");
                this.tblNguoiHoc.getColumnModel().getColumn(4).setHeaderValue("PHONE NUMBER");
                this.tblNguoiHoc.getColumnModel().getColumn(5).setHeaderValue("EMAIL");
                this.tblNguoiHoc.getColumnModel().getColumn(5).setHeaderValue("STAFF ID");
                this.tblNguoiHoc.getColumnModel().getColumn(5).setHeaderValue("DATE OF REGISTRATION");
                this.tblNguoiHoc.getTableHeader().repaint();
                break;
        }
    }
}
