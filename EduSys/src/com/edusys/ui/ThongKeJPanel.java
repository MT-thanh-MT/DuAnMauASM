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
public class ThongKeJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ThongKeJPanel
     */
    public ThongKeJPanel() {
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

        pnlCardThongKe = new javax.swing.JPanel();
        lblThongKe = new javax.swing.JLabel();
        pnlThongKeBottom = new javax.swing.JPanel();
        pnlTabs = new javax.swing.JTabbedPane();
        pnlBangDiem = new javax.swing.JPanel();
        pnlTimKiemKH = new javax.swing.JPanel();
        lblKhoaHoc = new javax.swing.JLabel();
        cbbKhoaHoc = new javax.swing.JComboBox<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblBangDiem = new javax.swing.JTable();
        pnlNguoiHoc = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblNguoiHoc = new javax.swing.JTable();
        pnlDiemCD = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblDiemChuyenDe = new javax.swing.JTable();
        pnlDoanhThu = new javax.swing.JPanel();
        pnlTimKiemNam = new javax.swing.JPanel();
        lblNam = new javax.swing.JLabel();
        cbbNam = new javax.swing.JComboBox<>();
        jScrollPane5 = new javax.swing.JScrollPane();
        tblDoanhThu = new javax.swing.JTable();

        pnlCardThongKe.setBackground(new java.awt.Color(34, 40, 44));
        pnlCardThongKe.setLayout(new java.awt.BorderLayout());

        lblThongKe.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lblThongKe.setForeground(new java.awt.Color(255, 255, 255));
        lblThongKe.setText("TỔNG HỢP THỐNG KÊ");
        lblThongKe.setToolTipText("");
        lblThongKe.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        lblThongKe.setPreferredSize(new java.awt.Dimension(34, 40));
        pnlCardThongKe.add(lblThongKe, java.awt.BorderLayout.NORTH);

        pnlThongKeBottom.setBackground(new java.awt.Color(34, 40, 44));
        pnlThongKeBottom.setLayout(new java.awt.BorderLayout());

        pnlTabs.setBackground(new java.awt.Color(34, 40, 44));
        pnlTabs.setTabLayoutPolicy(javax.swing.JTabbedPane.SCROLL_TAB_LAYOUT);

        pnlBangDiem.setBackground(new java.awt.Color(34, 40, 44));
        pnlBangDiem.setLayout(new java.awt.BorderLayout());

        pnlTimKiemKH.setBackground(new java.awt.Color(34, 40, 44));
        pnlTimKiemKH.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "TÌM KIẾM", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.BELOW_TOP, new java.awt.Font("Arial", 1, 11), new java.awt.Color(255, 255, 255))); // NOI18N
        pnlTimKiemKH.setPreferredSize(new java.awt.Dimension(898, 75));

        lblKhoaHoc.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblKhoaHoc.setForeground(new java.awt.Color(255, 255, 255));
        lblKhoaHoc.setText("KHÓA HỌC:");

        cbbKhoaHoc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout pnlTimKiemKHLayout = new javax.swing.GroupLayout(pnlTimKiemKH);
        pnlTimKiemKH.setLayout(pnlTimKiemKHLayout);
        pnlTimKiemKHLayout.setHorizontalGroup(
            pnlTimKiemKHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTimKiemKHLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblKhoaHoc, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(cbbKhoaHoc, 0, 661, Short.MAX_VALUE)
                .addGap(94, 94, 94))
        );
        pnlTimKiemKHLayout.setVerticalGroup(
            pnlTimKiemKHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTimKiemKHLayout.createSequentialGroup()
                .addGroup(pnlTimKiemKHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblKhoaHoc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cbbKhoaHoc, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE))
                .addContainerGap())
        );

        pnlBangDiem.add(pnlTimKiemKH, java.awt.BorderLayout.PAGE_START);

        tblBangDiem.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "MÃ NH", "HỌ VÀ TÊN", "ĐIỂM", "XẾP LOẠI"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tblBangDiem);

        pnlBangDiem.add(jScrollPane3, java.awt.BorderLayout.CENTER);

        pnlTabs.addTab("BẢNG ĐIỂM", pnlBangDiem);

        pnlNguoiHoc.setBackground(new java.awt.Color(34, 40, 44));
        pnlNguoiHoc.setLayout(new java.awt.BorderLayout());

        tblNguoiHoc.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NĂM", "SỐ NH", "ĐK SỚM NHẤT", "ĐK MUỘN NHẤT"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblNguoiHoc);

        pnlNguoiHoc.add(jScrollPane2, java.awt.BorderLayout.CENTER);

        pnlTabs.addTab("NGƯỜI HỌC", pnlNguoiHoc);

        pnlDiemCD.setLayout(new java.awt.BorderLayout());

        tblDiemChuyenDe.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CHUYÊN ĐỀ", "SL HV", "ĐIỂM TN", "ĐIỂM CN", "ĐIỂM TB"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(tblDiemChuyenDe);

        pnlDiemCD.add(jScrollPane4, java.awt.BorderLayout.CENTER);

        pnlTabs.addTab("ĐIỂM CHUYÊN ĐỀ", pnlDiemCD);

        pnlDoanhThu.setLayout(new java.awt.BorderLayout());

        pnlTimKiemNam.setBackground(new java.awt.Color(34, 40, 44));
        pnlTimKiemNam.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "TÌM KIẾM", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.BELOW_TOP, new java.awt.Font("Arial", 1, 11), new java.awt.Color(255, 255, 255))); // NOI18N
        pnlTimKiemNam.setPreferredSize(new java.awt.Dimension(898, 75));

        lblNam.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        lblNam.setForeground(new java.awt.Color(255, 255, 255));
        lblNam.setText("NĂM:");

        cbbNam.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout pnlTimKiemNamLayout = new javax.swing.GroupLayout(pnlTimKiemNam);
        pnlTimKiemNam.setLayout(pnlTimKiemNamLayout);
        pnlTimKiemNamLayout.setHorizontalGroup(
            pnlTimKiemNamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTimKiemNamLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblNam, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(cbbNam, 0, 713, Short.MAX_VALUE)
                .addGap(94, 94, 94))
        );
        pnlTimKiemNamLayout.setVerticalGroup(
            pnlTimKiemNamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTimKiemNamLayout.createSequentialGroup()
                .addGroup(pnlTimKiemNamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNam, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cbbNam, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE))
                .addContainerGap())
        );

        pnlDoanhThu.add(pnlTimKiemNam, java.awt.BorderLayout.PAGE_START);

        tblDoanhThu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "SỐ KH", "SỐ HV", "DOANH THU", "HP CAO NHẤT", "HP THẤP NHẤT", "HP TB"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane5.setViewportView(tblDoanhThu);

        pnlDoanhThu.add(jScrollPane5, java.awt.BorderLayout.CENTER);

        pnlTabs.addTab("DOANH THU", pnlDoanhThu);

        pnlThongKeBottom.add(pnlTabs, java.awt.BorderLayout.CENTER);

        pnlCardThongKe.add(pnlThongKeBottom, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 911, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, 0)
                    .addComponent(pnlCardThongKe, javax.swing.GroupLayout.DEFAULT_SIZE, 911, Short.MAX_VALUE)
                    .addGap(0, 0, 0)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 594, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, 0)
                    .addComponent(pnlCardThongKe, javax.swing.GroupLayout.DEFAULT_SIZE, 594, Short.MAX_VALUE)
                    .addGap(0, 0, 0)))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbbKhoaHoc;
    private javax.swing.JComboBox<String> cbbNam;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JLabel lblKhoaHoc;
    private javax.swing.JLabel lblNam;
    private javax.swing.JLabel lblThongKe;
    private javax.swing.JPanel pnlBangDiem;
    private javax.swing.JPanel pnlCardThongKe;
    private javax.swing.JPanel pnlDiemCD;
    private javax.swing.JPanel pnlDoanhThu;
    private javax.swing.JPanel pnlNguoiHoc;
    private javax.swing.JTabbedPane pnlTabs;
    private javax.swing.JPanel pnlThongKeBottom;
    private javax.swing.JPanel pnlTimKiemKH;
    private javax.swing.JPanel pnlTimKiemNam;
    private javax.swing.JTable tblBangDiem;
    private javax.swing.JTable tblDiemChuyenDe;
    private javax.swing.JTable tblDoanhThu;
    private javax.swing.JTable tblNguoiHoc;
    // End of variables declaration//GEN-END:variables

    public void showBangDiem(){
        this.pnlTabs.setSelectedComponent(this.pnlBangDiem);
    }
    public void showDiemChuyenDe(){
        this.pnlTabs.setSelectedComponent(this.pnlDiemCD);
    }
    public void showNguoiHoc(){
        this.pnlTabs.setSelectedComponent(this.pnlNguoiHoc);
    }
    public void showDoanhThu(){
        this.pnlTabs.setSelectedComponent(this.pnlDoanhThu);
    }
}
