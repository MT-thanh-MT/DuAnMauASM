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
public class QLNVLanguage {

    private javax.swing.JButton btnQLNVSua;
    private javax.swing.JButton btnQLNVThem;
    private javax.swing.JButton btnQLNVXoa;
    private javax.swing.JButton btnQLNVMoi;
    private javax.swing.JLabel lblQLNVHoTen;
    private javax.swing.JLabel lblQLNVMaNV;
    private javax.swing.JLabel lblQLNVMatKhau;
    private javax.swing.JLabel lblQLNVMatKhau2;
    private javax.swing.JLabel lblQLNVSDT;
    private javax.swing.JLabel lblQLNhanVienTitle;
    private javax.swing.JRadioButton rdoQLNVNhanVien;
    private javax.swing.JRadioButton rdoQLNVTruongPhong;
    private javax.swing.JRadioButton rdoKhoa;
    private javax.swing.JRadioButton rdoMoKhoa;
    private javax.swing.JTable tblQLNV;
    private javax.swing.JPanel pnlVaiTro;
    private javax.swing.JPanel pnlTrangThai;

    public QLNVLanguage(JButton btnQLNVSua, JButton btnQLNVThem, JButton btnQLNVXoa, JButton btnQLNVMoi, JLabel lblQLNVHoTen, JLabel lblQLNVMaNV, JLabel lblQLNVMatKhau, JLabel lblQLNVMatKhau2, JLabel lblQLNVSDT, JLabel lblQLNhanVienTitle, JRadioButton rdoQLNVNhanVien, JRadioButton rdoQLNVTruongPhong, JRadioButton rdoKhoa, JRadioButton rdoMoKhoa, JTable tblQLNV, JPanel pnlVaiTro, JPanel pnlTrangThai) {
        this.btnQLNVSua = btnQLNVSua;
        this.btnQLNVThem = btnQLNVThem;
        this.btnQLNVXoa = btnQLNVXoa;
        this.btnQLNVMoi = btnQLNVMoi;
        this.lblQLNVHoTen = lblQLNVHoTen;
        this.lblQLNVMaNV = lblQLNVMaNV;
        this.lblQLNVMatKhau = lblQLNVMatKhau;
        this.lblQLNVMatKhau2 = lblQLNVMatKhau2;
        this.lblQLNVSDT = lblQLNVSDT;
        this.lblQLNhanVienTitle = lblQLNhanVienTitle;
        this.rdoQLNVNhanVien = rdoQLNVNhanVien;
        this.rdoQLNVTruongPhong = rdoQLNVTruongPhong;
        this.rdoKhoa = rdoKhoa;
        this.rdoMoKhoa = rdoMoKhoa;
        this.tblQLNV = tblQLNV;
        this.pnlVaiTro = pnlVaiTro;
        this.pnlTrangThai = pnlTrangThai;
    }

    public void changeLanguage(int choice) {
        switch (choice) {
            case 0:
                this.btnQLNVSua.setText("Sửa");
                this.btnQLNVThem.setText("Thêm");
                this.btnQLNVXoa.setText("Xóa");
                this.btnQLNVMoi.setText("Mới");
                this.lblQLNVHoTen.setText("Họ và tên");
                this.lblQLNVMaNV.setText("Mã nhân viên");
                this.lblQLNVMatKhau.setText("Mật khẩu");
                this.lblQLNVMatKhau2.setText("Xác nhận mật khẩu");
                this.lblQLNVSDT.setText("Email");
                this.lblQLNhanVienTitle.setText("QUẢN LÝ NHÂN VIÊN QUẢN TRỊ");
                this.rdoQLNVNhanVien.setText("Nhân viên");
                this.rdoQLNVTruongPhong.setText("Trưởng phòng");
                this.rdoKhoa.setText("Khóa");
                this.rdoMoKhoa.setText("Mở khóa");
                this.tblQLNV.getColumnModel().getColumn(0).setHeaderValue("MÃ NV");
                this.tblQLNV.getColumnModel().getColumn(1).setHeaderValue("MẬT KHẨU");
                this.tblQLNV.getColumnModel().getColumn(2).setHeaderValue("HỌ VÀ TÊN");
                this.tblQLNV.getColumnModel().getColumn(3).setHeaderValue("VAI TRÒ");
                this.tblQLNV.getColumnModel().getColumn(4).setHeaderValue("EMAIL");
                this.tblQLNV.getColumnModel().getColumn(5).setHeaderValue("TRẠNG THÁI");
                this.tblQLNV.getTableHeader().repaint();
                pnlVaiTro.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1),
                        "Vai trò", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION,
                        javax.swing.border.TitledBorder.BELOW_TOP,
                        new java.awt.Font("Arial", 1, 11),
                        new java.awt.Color(255, 255, 255)));
                this.pnlTrangThai.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1),
                        "Trạng thái", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION,
                        javax.swing.border.TitledBorder.BELOW_TOP, new java.awt.Font("Arial", 1, 11),
                        new java.awt.Color(255, 255, 255)));
                break;
            case 1:
                this.btnQLNVSua.setText("Udate");
                this.btnQLNVThem.setText("Save");
                this.btnQLNVXoa.setText("Delete");
                this.btnQLNVMoi.setText("New");
                this.lblQLNVHoTen.setText("Fullname");
                this.lblQLNVMaNV.setText("Staff ID");
                this.lblQLNVMatKhau.setText("Password");
                this.lblQLNVMatKhau2.setText("Re-Enter the password");
                this.lblQLNVSDT.setText("Email");
                this.lblQLNhanVienTitle.setText("STAFF MANAGEMENT");
                this.rdoQLNVNhanVien.setText("Staff");
                this.rdoQLNVTruongPhong.setText("Manager");
                this.rdoKhoa.setText("Lock");
                this.rdoMoKhoa.setText("Unlock");
                this.tblQLNV.getColumnModel().getColumn(0).setHeaderValue("Staff ID");
                this.tblQLNV.getColumnModel().getColumn(1).setHeaderValue("Password");
                this.tblQLNV.getColumnModel().getColumn(2).setHeaderValue("Fullname");
                this.tblQLNV.getColumnModel().getColumn(3).setHeaderValue("Role");
                this.tblQLNV.getColumnModel().getColumn(4).setHeaderValue("Email");
                this.tblQLNV.getColumnModel().getColumn(5).setHeaderValue("Status");
                this.tblQLNV.getTableHeader().repaint();
                pnlVaiTro.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1),
                        "Role", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION,
                        javax.swing.border.TitledBorder.BELOW_TOP,
                        new java.awt.Font("Arial", 1, 11),
                        new java.awt.Color(255, 255, 255)));
                this.pnlTrangThai.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1),
                        "Status", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION,
                        javax.swing.border.TitledBorder.BELOW_TOP, new java.awt.Font("Arial", 1, 11),
                        new java.awt.Color(255, 255, 255)));
                break;
        }
    }
    public void changeLanguageForTable(int choice){
        for (int i = 0; i < tblQLNV.getRowCount(); i++) {
            if (choice == 0) {
                if (tblQLNV.getValueAt(i, 3).equals("Quản Trị") || tblQLNV.getValueAt(i, 3).equals("Admin")) {
                    tblQLNV.setValueAt("Quản Trị", i, 3);
                } else {
                    tblQLNV.setValueAt("Nhân viên", i, 3);
                }
                
                if (tblQLNV.getValueAt(i, 5).equals("Mở khóa") || tblQLNV.getValueAt(i, 5).equals("Unlock")) {
                    tblQLNV.setValueAt("Mở khóa", i, 5);
                } else {
                    tblQLNV.setValueAt("Khóa", i, 5);
                }
                
            } else {
                if (tblQLNV.getValueAt(i, 3).equals("Quản Trị") || tblQLNV.getValueAt(i, 3).equals("Admin")) {
                    tblQLNV.setValueAt("Admin", i, 3);
                } else {
                    tblQLNV.setValueAt("Staff", i, 3);
                }
                
                if (tblQLNV.getValueAt(i, 5).equals("Mở khóa") || tblQLNV.getValueAt(i, 5).equals("Unlock")) {
                    tblQLNV.setValueAt("Unlock", i, 5);
                } else {
                    tblQLNV.setValueAt("Lock", i, 5);
                }
            }
        }
    }

}
