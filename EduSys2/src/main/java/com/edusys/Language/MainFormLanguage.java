/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edusys.Language;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

/**
 *
 * @author XUÂN THÀNH
 */
public class MainFormLanguage {

    private javax.swing.JButton btnDangXuat;
    private javax.swing.JButton btnDoiMatKhau;
    private javax.swing.JButton btnGioiThieu;
    private javax.swing.JButton btnHome;
    private javax.swing.JButton btnHuongDan;
    private javax.swing.JButton btnQLChuyenDe;
    private javax.swing.JButton btnQLHocVien;
    private javax.swing.JButton btnQLKhoaHoc;
    private javax.swing.JButton btnQLNguoiHoc;
    private javax.swing.JButton btnQLNhanVien;
    private javax.swing.JButton btnThongKe;
    private javax.swing.JLabel lblHomeTitle;
    private javax.swing.JLabel lblInfo;
    private javax.swing.JMenuItem mniBangDiem;
    private javax.swing.JMenuItem mniChuyenDe;
    private javax.swing.JMenuItem mniDangXuat;
    private javax.swing.JMenuItem mniDiemCD;
    private javax.swing.JMenuItem mniDoanhThu;
    private javax.swing.JMenuItem mniDoiMatKhau;
    private javax.swing.JMenuItem mniGioiThieu;
    private javax.swing.JMenuItem mniHocVien;
    private javax.swing.JMenuItem mniHuongDan;
    private javax.swing.JMenuItem mniKhoaHoc;
    private javax.swing.JMenuItem mniLuongNguoihoc;
    private javax.swing.JMenuItem mniNguoiHoc;
    private javax.swing.JMenuItem mniNhanVien;
    private javax.swing.JMenuItem mniThoat;
    private javax.swing.JMenu mnuHeThong;
    private javax.swing.JMenu mnuQuanLy;
    private javax.swing.JMenu mnuThongKe;
    private javax.swing.JMenu mnuTroGiup;
    private javax.swing.JMenuItem mniTiengViet;
    private javax.swing.JMenu mnuNgonNgu;
    private javax.swing.JMenuItem mniEnglish;

    public MainFormLanguage(JButton btnDangXuat, JButton btnDoiMatKhau, JButton btnGioiThieu, JButton btnHome, JButton btnHuongDan, JButton btnQLChuyenDe, JButton btnQLHocVien, JButton btnQLKhoaHoc, JButton btnQLNguoiHoc, JButton btnQLNhanVien, JButton btnThongKe, JLabel lblHomeTitle, JLabel lblInfo, JMenuItem mniBangDiem, JMenuItem mniChuyenDe, JMenuItem mniDangXuat, JMenuItem mniDiemCD, JMenuItem mniDoanhThu, JMenuItem mniDoiMatKhau, JMenuItem mniGioiThieu, JMenuItem mniHocVien, JMenuItem mniHuongDan, JMenuItem mniKhoaHoc, JMenuItem mniLuongNguoihoc, JMenuItem mniNguoiHoc, JMenuItem mniNhanVien, JMenuItem mniThoat, JMenu mnuHeThong, JMenu mnuQuanLy, JMenu mnuThongKe, JMenu mnuTroGiup, JMenuItem mniTiengViet, JMenu mnuNgonNgu, JMenuItem mniEnglish) {
        this.btnDangXuat = btnDangXuat;
        this.btnDoiMatKhau = btnDoiMatKhau;
        this.btnGioiThieu = btnGioiThieu;
        this.btnHome = btnHome;
        this.btnHuongDan = btnHuongDan;
        this.btnQLChuyenDe = btnQLChuyenDe;
        this.btnQLHocVien = btnQLHocVien;
        this.btnQLKhoaHoc = btnQLKhoaHoc;
        this.btnQLNguoiHoc = btnQLNguoiHoc;
        this.btnQLNhanVien = btnQLNhanVien;
        this.btnThongKe = btnThongKe;
        this.lblHomeTitle = lblHomeTitle;
        this.lblInfo = lblInfo;
        this.mniBangDiem = mniBangDiem;
        this.mniChuyenDe = mniChuyenDe;
        this.mniDangXuat = mniDangXuat;
        this.mniDiemCD = mniDiemCD;
        this.mniDoanhThu = mniDoanhThu;
        this.mniDoiMatKhau = mniDoiMatKhau;
        this.mniGioiThieu = mniGioiThieu;
        this.mniHocVien = mniHocVien;
        this.mniHuongDan = mniHuongDan;
        this.mniKhoaHoc = mniKhoaHoc;
        this.mniLuongNguoihoc = mniLuongNguoihoc;
        this.mniNguoiHoc = mniNguoiHoc;
        this.mniNhanVien = mniNhanVien;
        this.mniThoat = mniThoat;
        this.mnuHeThong = mnuHeThong;
        this.mnuQuanLy = mnuQuanLy;
        this.mnuThongKe = mnuThongKe;
        this.mnuTroGiup = mnuTroGiup;
        this.mniTiengViet = mniTiengViet;
        this.mnuNgonNgu = mnuNgonNgu;
        this.mniEnglish = mniEnglish;
    }

    public void changeLanguage(int choice) {
        switch (choice) {
            case 0:
                this.btnDangXuat.setText("Đăng Xuất");
                this.btnDoiMatKhau.setText("Đổi Mật Khẩu");
                this.btnGioiThieu.setText("Giới Thiệu");
                this.btnHome.setText("Trang Chủ");
                this.btnHuongDan.setText("Hướng Dẫn");
                this.btnQLChuyenDe.setText("Quản lý chuyên đề");
                this.btnQLHocVien.setText("Quản lý học viên");
                this.btnQLKhoaHoc.setText("Quản lý khóa học");
                this.btnQLNguoiHoc.setText("Quản lý người học");
                this.btnQLNhanVien.setText("Quản lý nhân viên");
                this.btnThongKe.setText("Thống Kê");
                this.lblHomeTitle.setText("TRUNG TÂM ĐÀO TẠO TIN HỌC NGẮN HẠN");
                this.lblInfo.setText("Hệ thống đào tạo");
                this.mniBangDiem.setText("Bảng điểm");
                this.mniChuyenDe.setText("Chuyên đề");
                this.mniDangXuat.setText("Đăng Xuất");
                this.mniDiemCD.setText("Điểm chuyên đề");
                this.mniDoanhThu.setText("Doanh thu");
                this.mniDoiMatKhau.setText("Đổi mật khẩu");
                this.mniGioiThieu.setText("Giới thiệu");
                this.mniHocVien.setText("Học viện");
                this.mniHuongDan.setText("Hướng dẫn");
                this.mniKhoaHoc.setText("Khóa học");
                this.mniLuongNguoihoc.setText("Lượng người học");
                this.mniNguoiHoc.setText("Người học");
                this.mniNhanVien.setText("Nhân Viên");
                this.mniThoat.setText("Thoát");
                this.mnuHeThong.setText("Hệ thống");
                this.mnuQuanLy.setText("Quản lý");
                this.mnuThongKe.setText("Thống kê");
                this.mnuTroGiup.setText("Trợ giúp");
                this.mniTiengViet.setText("Tiếng Việt");
                this.mnuNgonNgu.setText("Ngôn ngữ");
                this.mniEnglish.setText("English");
                break;
            case 1:
                this.btnDangXuat.setText("Logout");
                this.btnDoiMatKhau.setText("Change Password");
                this.btnGioiThieu.setText("About");
                this.btnHome.setText("Home");
                this.btnHuongDan.setText("Guidance");
                this.btnQLChuyenDe.setText("Special subject");
                this.btnQLHocVien.setText("Trainee management");
                this.btnQLKhoaHoc.setText("Course management");
                this.btnQLNguoiHoc.setText("Learner management");
                this.btnQLNhanVien.setText("Staff management");
                this.btnThongKe.setText("Statistical");
                this.lblHomeTitle.setText("SHORT-TERM INFORMATION TRAINING CENTER");
                this.lblInfo.setText("Educational system");
                this.mniBangDiem.setText("Score-board");
                this.mniChuyenDe.setText("Special subject");
                this.mniDangXuat.setText("Logout");
                this.mniDiemCD.setText("Special subject score");
                this.mniDoanhThu.setText("Turnover");
                this.mniDoiMatKhau.setText("Change Password");
                this.mniGioiThieu.setText("About");
                this.mniHocVien.setText("Trainee");
                this.mniHuongDan.setText("Guidance");
                this.mniKhoaHoc.setText("Course");
                this.mniLuongNguoihoc.setText("Learner amount");
                this.mniNguoiHoc.setText("Learner");
                this.mniNhanVien.setText("Staff");
                this.mniThoat.setText("Exit");
                this.mnuHeThong.setText("System");
                this.mnuQuanLy.setText("Management");
                this.mnuThongKe.setText("Statistical");
                this.mnuTroGiup.setText("Help");
                this.mniTiengViet.setText("Tiếng Việt");
                this.mnuNgonNgu.setText("Language");
                this.mniEnglish.setText("English");
                break;
        }
    }
}
