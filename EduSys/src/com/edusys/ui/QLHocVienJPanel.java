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
public class QLHocVienJPanel extends javax.swing.JPanel {

    /**
     * Creates new form QLHocVienJPanel
     */
    public QLHocVienJPanel() {
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

        pnlCardQlHocVien = new javax.swing.JPanel();
        pnlQLHVTop = new javax.swing.JPanel();
        lblQLHocVienTitle = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        pnlCD = new javax.swing.JPanel();
        cbbChuyenDe_QLHV = new javax.swing.JComboBox<>();
        pnlKH = new javax.swing.JPanel();
        cbbKhoaHoc = new javax.swing.JComboBox<>();
        pnlQLHVBottom = new javax.swing.JPanel();

        pnlCardQlHocVien.setBackground(new java.awt.Color(34, 40, 44));
        pnlCardQlHocVien.setLayout(new java.awt.BorderLayout());

        pnlQLHVTop.setBackground(new java.awt.Color(34, 40, 44));
        pnlQLHVTop.setPreferredSize(new java.awt.Dimension(891, 120));
        pnlQLHVTop.setLayout(new java.awt.BorderLayout());

        lblQLHocVienTitle.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lblQLHocVienTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblQLHocVienTitle.setText("QUẢN LÝ HỌC VIÊN");
        lblQLHocVienTitle.setToolTipText("");
        lblQLHocVienTitle.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        lblQLHocVienTitle.setPreferredSize(new java.awt.Dimension(34, 40));
        pnlQLHVTop.add(lblQLHocVienTitle, java.awt.BorderLayout.NORTH);

        jPanel6.setBackground(new java.awt.Color(34, 40, 44));
        jPanel6.setLayout(new java.awt.GridLayout());

        pnlCD.setBackground(new java.awt.Color(34, 40, 44));
        pnlCD.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED), "CHUYÊN ĐỀ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 14), new java.awt.Color(255, 102, 102))); // NOI18N

        cbbChuyenDe_QLHV.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout pnlCDLayout = new javax.swing.GroupLayout(pnlCD);
        pnlCD.setLayout(pnlCDLayout);
        pnlCDLayout.setHorizontalGroup(
            pnlCDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCDLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cbbChuyenDe_QLHV, 0, 419, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlCDLayout.setVerticalGroup(
            pnlCDLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCDLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cbbChuyenDe_QLHV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        jPanel6.add(pnlCD);

        pnlKH.setBackground(new java.awt.Color(34, 40, 44));
        pnlKH.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED), "KHÓA HỌC", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 14), new java.awt.Color(255, 102, 102))); // NOI18N

        cbbKhoaHoc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout pnlKHLayout = new javax.swing.GroupLayout(pnlKH);
        pnlKH.setLayout(pnlKHLayout);
        pnlKHLayout.setHorizontalGroup(
            pnlKHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlKHLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cbbKhoaHoc, 0, 419, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlKHLayout.setVerticalGroup(
            pnlKHLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlKHLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cbbKhoaHoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        jPanel6.add(pnlKH);

        pnlQLHVTop.add(jPanel6, java.awt.BorderLayout.CENTER);

        pnlCardQlHocVien.add(pnlQLHVTop, java.awt.BorderLayout.PAGE_START);

        pnlQLHVBottom.setBackground(new java.awt.Color(34, 40, 44));

        javax.swing.GroupLayout pnlQLHVBottomLayout = new javax.swing.GroupLayout(pnlQLHVBottom);
        pnlQLHVBottom.setLayout(pnlQLHVBottomLayout);
        pnlQLHVBottomLayout.setHorizontalGroup(
            pnlQLHVBottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 903, Short.MAX_VALUE)
        );
        pnlQLHVBottomLayout.setVerticalGroup(
            pnlQLHVBottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 474, Short.MAX_VALUE)
        );

        pnlCardQlHocVien.add(pnlQLHVBottom, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 903, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, 0)
                    .addComponent(pnlCardQlHocVien, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(0, 0, 0)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 594, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, 0)
                    .addComponent(pnlCardQlHocVien, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(0, 0, 0)))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbbChuyenDe_QLHV;
    private javax.swing.JComboBox<String> cbbKhoaHoc;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JLabel lblQLHocVienTitle;
    private javax.swing.JPanel pnlCD;
    private javax.swing.JPanel pnlCardQlHocVien;
    private javax.swing.JPanel pnlKH;
    private javax.swing.JPanel pnlQLHVBottom;
    private javax.swing.JPanel pnlQLHVTop;
    // End of variables declaration//GEN-END:variables
}