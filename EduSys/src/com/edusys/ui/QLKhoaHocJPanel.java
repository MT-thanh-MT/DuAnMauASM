/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edusys.ui;

/**
 *
 * @author XUÂN THÀNH
 */
public class QLKhoaHocJPanel extends javax.swing.JPanel {

    /**
     * Creates new form QLKhoaHocJPanel
     */
    public QLKhoaHocJPanel() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlCardQLKhoaHoc = new javax.swing.JPanel();
        pnlQLKHTop = new javax.swing.JPanel();
        lblQLKhoaHocTitle = new javax.swing.JLabel();
        pnlChuyenDe = new javax.swing.JPanel();
        cbbChuyenDe = new javax.swing.JComboBox<>();
        pnlQLKH = new javax.swing.JPanel();
        pnlQLKH2 = new javax.swing.JPanel();
        pnlQLKHInput = new javax.swing.JPanel();
        jPanel16 = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        txtTenCD = new javax.swing.JTextField();
        lblTenCD = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        lblHocPhi = new javax.swing.JLabel();
        txtHocPhi = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        txtTenNguoiTao = new javax.swing.JTextField();
        lblTenNguoiTao = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        txtNgayKG = new javax.swing.JTextField();
        lblNgayKG = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        txtThoiLuong = new javax.swing.JTextField();
        lblThoiLuong = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        txtNgayTao = new javax.swing.JTextField();
        lblNgayTao = new javax.swing.JLabel();
        pnlButton = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        btnThem = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnMoi = new javax.swing.JButton();
        jPanel11 = new javax.swing.JPanel();
        btnFirst = new javax.swing.JButton();
        btnPre = new javax.swing.JButton();
        btnNext = new javax.swing.JButton();
        btnLast = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblKhoaHoc = new javax.swing.JTable();
        pnlGhiChu = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtGhiChu = new javax.swing.JTextArea();

        pnlCardQLKhoaHoc.setBackground(new java.awt.Color(34, 40, 44));
        pnlCardQLKhoaHoc.setLayout(new java.awt.BorderLayout());

        pnlQLKHTop.setBackground(new java.awt.Color(34, 40, 44));
        pnlQLKHTop.setPreferredSize(new java.awt.Dimension(891, 100));
        pnlQLKHTop.setLayout(new java.awt.BorderLayout());

        lblQLKhoaHocTitle.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lblQLKhoaHocTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblQLKhoaHocTitle.setText("QUẢN LÝ KHÓA HỌC");
        lblQLKhoaHocTitle.setToolTipText("");
        lblQLKhoaHocTitle.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        lblQLKhoaHocTitle.setPreferredSize(new java.awt.Dimension(34, 40));
        pnlQLKHTop.add(lblQLKhoaHocTitle, java.awt.BorderLayout.NORTH);

        pnlChuyenDe.setBackground(new java.awt.Color(34, 40, 44));
        pnlChuyenDe.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED), "CHUYÊN ĐỀ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 14), new java.awt.Color(255, 102, 102))); // NOI18N

        cbbChuyenDe.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout pnlChuyenDeLayout = new javax.swing.GroupLayout(pnlChuyenDe);
        pnlChuyenDe.setLayout(pnlChuyenDeLayout);
        pnlChuyenDeLayout.setHorizontalGroup(
            pnlChuyenDeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlChuyenDeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cbbChuyenDe, 0, 881, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlChuyenDeLayout.setVerticalGroup(
            pnlChuyenDeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlChuyenDeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cbbChuyenDe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlQLKHTop.add(pnlChuyenDe, java.awt.BorderLayout.CENTER);

        pnlCardQLKhoaHoc.add(pnlQLKHTop, java.awt.BorderLayout.PAGE_START);

        pnlQLKH.setBackground(new java.awt.Color(34, 40, 44));

        pnlQLKH2.setBackground(new java.awt.Color(34, 40, 44));

        pnlQLKHInput.setBackground(new java.awt.Color(34, 40, 44));
        pnlQLKHInput.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 102)));
        pnlQLKHInput.setLayout(new java.awt.GridLayout(0, 2));

        jPanel16.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 102)));
        jPanel16.setLayout(new java.awt.GridLayout(3, 0));

        jPanel15.setBackground(new java.awt.Color(34, 40, 44));

        txtTenCD.setEditable(false);
        txtTenCD.setBackground(new java.awt.Color(34, 40, 44));
        txtTenCD.setForeground(new java.awt.Color(255, 0, 0));

        lblTenCD.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        lblTenCD.setForeground(new java.awt.Color(255, 255, 255));
        lblTenCD.setText("Chuyên Đề");

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtTenCD)
                    .addComponent(lblTenCD, javax.swing.GroupLayout.DEFAULT_SIZE, 428, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTenCD)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTenCD, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel16.add(jPanel15);

        jPanel3.setBackground(new java.awt.Color(34, 40, 44));

        lblHocPhi.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        lblHocPhi.setForeground(new java.awt.Color(255, 255, 255));
        lblHocPhi.setText("Học Phí");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblHocPhi, javax.swing.GroupLayout.DEFAULT_SIZE, 428, Short.MAX_VALUE)
                    .addComponent(txtHocPhi))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblHocPhi)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtHocPhi, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel16.add(jPanel3);

        jPanel4.setBackground(new java.awt.Color(34, 40, 44));

        lblTenNguoiTao.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        lblTenNguoiTao.setForeground(new java.awt.Color(255, 255, 255));
        lblTenNguoiTao.setText("Người Tạo");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtTenNguoiTao)
                    .addComponent(lblTenNguoiTao, javax.swing.GroupLayout.DEFAULT_SIZE, 428, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTenNguoiTao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtTenNguoiTao, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel16.add(jPanel4);

        pnlQLKHInput.add(jPanel16);

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 204, 102)));
        jPanel2.setLayout(new java.awt.GridLayout(3, 0));

        jPanel9.setBackground(new java.awt.Color(34, 40, 44));

        lblNgayKG.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        lblNgayKG.setForeground(new java.awt.Color(255, 255, 255));
        lblNgayKG.setText("Khai Giảng");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNgayKG, javax.swing.GroupLayout.DEFAULT_SIZE, 428, Short.MAX_VALUE)
                    .addComponent(txtNgayKG, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblNgayKG)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNgayKG, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44))
        );

        jPanel2.add(jPanel9);

        jPanel5.setBackground(new java.awt.Color(34, 40, 44));

        lblThoiLuong.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        lblThoiLuong.setForeground(new java.awt.Color(255, 255, 255));
        lblThoiLuong.setText("Thời Lượng(giờ)");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblThoiLuong, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 428, Short.MAX_VALUE)
                    .addComponent(txtThoiLuong))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblThoiLuong)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtThoiLuong, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44))
        );

        jPanel2.add(jPanel5);

        jPanel7.setBackground(new java.awt.Color(34, 40, 44));

        lblNgayTao.setFont(new java.awt.Font("Arial", 1, 11)); // NOI18N
        lblNgayTao.setForeground(new java.awt.Color(255, 255, 255));
        lblNgayTao.setText("Ngày Tạo");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNgayTao, javax.swing.GroupLayout.DEFAULT_SIZE, 428, Short.MAX_VALUE)
                    .addComponent(txtNgayTao))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblNgayTao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addComponent(txtNgayTao, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel2.add(jPanel7);

        pnlQLKHInput.add(jPanel2);

        pnlButton.setLayout(new java.awt.GridLayout(0, 2));

        jPanel12.setBackground(new java.awt.Color(34, 40, 44));

        btnThem.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnThem.setText("Thêm");
        btnThem.setPreferredSize(new java.awt.Dimension(65, 41));
        jPanel12.add(btnThem);

        btnSua.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnSua.setText("Sửa");
        btnSua.setPreferredSize(new java.awt.Dimension(65, 41));
        jPanel12.add(btnSua);

        btnXoa.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnXoa.setText("Xóa");
        btnXoa.setPreferredSize(new java.awt.Dimension(65, 41));
        jPanel12.add(btnXoa);

        btnMoi.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        btnMoi.setText("Mới");
        btnMoi.setPreferredSize(new java.awt.Dimension(65, 41));
        jPanel12.add(btnMoi);

        pnlButton.add(jPanel12);

        jPanel11.setBackground(new java.awt.Color(34, 40, 44));

        btnFirst.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/edusys/icons/rnd_br_first.png"))); // NOI18N
        jPanel11.add(btnFirst);

        btnPre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/edusys/icons/rnd_br_prev.png"))); // NOI18N
        jPanel11.add(btnPre);

        btnNext.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/edusys/icons/rnd_br_next.png"))); // NOI18N
        jPanel11.add(btnNext);

        btnLast.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/edusys/icons/rnd_br_last.png"))); // NOI18N
        jPanel11.add(btnLast);

        pnlButton.add(jPanel11);

        tblKhoaHoc.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "MÃ KH", "THỜI LƯỢNG", "HỌC PHÍ", "Khai Giảng", "TẠO BỞI", "NGÀY TẠO"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblKhoaHoc);

        pnlGhiChu.setBackground(new java.awt.Color(34, 40, 44));
        pnlGhiChu.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ghi Chú", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.BELOW_TOP, new java.awt.Font("Arial", 1, 11), new java.awt.Color(255, 255, 255))); // NOI18N

        txtGhiChu.setColumns(20);
        txtGhiChu.setRows(5);
        jScrollPane2.setViewportView(txtGhiChu);

        javax.swing.GroupLayout pnlGhiChuLayout = new javax.swing.GroupLayout(pnlGhiChu);
        pnlGhiChu.setLayout(pnlGhiChuLayout);
        pnlGhiChuLayout.setHorizontalGroup(
            pnlGhiChuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2)
        );
        pnlGhiChuLayout.setVerticalGroup(
            pnlGhiChuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlGhiChuLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout pnlQLKH2Layout = new javax.swing.GroupLayout(pnlQLKH2);
        pnlQLKH2.setLayout(pnlQLKH2Layout);
        pnlQLKH2Layout.setHorizontalGroup(
            pnlQLKH2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlQLKH2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlQLKH2Layout.createSequentialGroup()
                .addGroup(pnlQLKH2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(pnlGhiChu, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlQLKHInput, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 903, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        pnlQLKH2Layout.setVerticalGroup(
            pnlQLKH2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlQLKH2Layout.createSequentialGroup()
                .addComponent(pnlQLKHInput, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlGhiChu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout pnlQLKHLayout = new javax.swing.GroupLayout(pnlQLKH);
        pnlQLKH.setLayout(pnlQLKHLayout);
        pnlQLKHLayout.setHorizontalGroup(
            pnlQLKHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 913, Short.MAX_VALUE)
            .addGroup(pnlQLKHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlQLKHLayout.createSequentialGroup()
                    .addGap(0, 0, 0)
                    .addComponent(pnlQLKH2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(0, 0, 0)))
        );
        pnlQLKHLayout.setVerticalGroup(
            pnlQLKHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 584, Short.MAX_VALUE)
            .addGroup(pnlQLKHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlQLKHLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(pnlQLKH2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pnlCardQLKhoaHoc.add(pnlQLKH, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 913, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(pnlCardQLKhoaHoc, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 684, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(pnlCardQLKhoaHoc, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFirst;
    private javax.swing.JButton btnLast;
    private javax.swing.JButton btnMoi;
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnPre;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnXoa;
    private javax.swing.JComboBox<String> cbbChuyenDe;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblHocPhi;
    private javax.swing.JLabel lblNgayKG;
    private javax.swing.JLabel lblNgayTao;
    private javax.swing.JLabel lblQLKhoaHocTitle;
    private javax.swing.JLabel lblTenCD;
    private javax.swing.JLabel lblTenNguoiTao;
    private javax.swing.JLabel lblThoiLuong;
    private javax.swing.JPanel pnlButton;
    private javax.swing.JPanel pnlCardQLKhoaHoc;
    private javax.swing.JPanel pnlChuyenDe;
    private javax.swing.JPanel pnlGhiChu;
    private javax.swing.JPanel pnlQLKH;
    private javax.swing.JPanel pnlQLKH2;
    private javax.swing.JPanel pnlQLKHInput;
    private javax.swing.JPanel pnlQLKHTop;
    private javax.swing.JTable tblKhoaHoc;
    private javax.swing.JTextArea txtGhiChu;
    private javax.swing.JTextField txtHocPhi;
    private javax.swing.JTextField txtNgayKG;
    private javax.swing.JTextField txtNgayTao;
    private javax.swing.JTextField txtTenCD;
    private javax.swing.JTextField txtTenNguoiTao;
    private javax.swing.JTextField txtThoiLuong;
    // End of variables declaration//GEN-END:variables
}
