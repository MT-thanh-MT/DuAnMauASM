/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edusys.ui;

import com.edusys.utils.XImage;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JButton;
import javax.swing.Timer;
import javax.swing.plaf.basic.BasicButtonUI;

/**
 *
 * @author XUÂN THÀNH
 */
public class EduSysJframe extends javax.swing.JFrame {

    /**
     * Creates new form EduSysJframe
     */
    public EduSysJframe() {
        initComponents();
        init();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlRoot = new javax.swing.JPanel();
        pnlSide = new javax.swing.JPanel();
        pnlHome = new javax.swing.JPanel();
        btnHome = new javax.swing.JButton();
        btnQLNhanVien = new javax.swing.JButton();
        btnQLChuyenDe = new javax.swing.JButton();
        btnQLNguoiHoc = new javax.swing.JButton();
        btnQLKhoaHoc = new javax.swing.JButton();
        btnQLHocVien = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        pnlCenter = new javax.swing.JPanel();
        pnlBottom = new javax.swing.JPanel();
        lblTime = new javax.swing.JLabel();
        lblInfo = new javax.swing.JLabel();
        pnlCards = new javax.swing.JPanel();
        pnlCardHome = new javax.swing.JPanel();
        lblLogo = new javax.swing.JLabel();
        lblHomeTitle = new javax.swing.JLabel();
        pnlButton = new javax.swing.JPanel();
        btnDangXuat = new javax.swing.JButton();
        btnDoiMatKhau = new javax.swing.JButton();
        btnGioiThieu = new javax.swing.JButton();
        btnHuongDan = new javax.swing.JButton();
        pnlCardQLNhanVien = new javax.swing.JPanel();
        pnlCardQLChuyenDe = new javax.swing.JPanel();
        pnlCardQLNguoiHoc = new javax.swing.JPanel();
        pnlCardQLKhoaHoc = new javax.swing.JPanel();
        pnlCardQlHocVien = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("HÊ THỐNG QUẢN LÝ EDUSYS");

        pnlRoot.setLayout(new java.awt.BorderLayout());

        pnlSide.setBackground(new java.awt.Color(21, 25, 28));
        pnlSide.setPreferredSize(new java.awt.Dimension(140, 0));

        pnlHome.setBackground(new java.awt.Color(21, 25, 28));
        pnlHome.setPreferredSize(new java.awt.Dimension(140, 150));
        pnlHome.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.CENTER, 5, 40));

        btnHome.setBackground(new java.awt.Color(34, 40, 44));
        btnHome.setForeground(new java.awt.Color(255, 255, 255));
        btnHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/edusys/icons/home.png"))); // NOI18N
        btnHome.setPreferredSize(new java.awt.Dimension(120, 50));
        btnHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomeActionPerformed(evt);
            }
        });
        pnlHome.add(btnHome);

        pnlSide.add(pnlHome);

        btnQLNhanVien.setBackground(new java.awt.Color(34, 40, 44));
        btnQLNhanVien.setForeground(new java.awt.Color(255, 255, 255));
        btnQLNhanVien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/edusys/icons/Staff32.png"))); // NOI18N
        btnQLNhanVien.setPreferredSize(new java.awt.Dimension(120, 50));
        btnQLNhanVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQLNhanVienActionPerformed(evt);
            }
        });
        pnlSide.add(btnQLNhanVien);

        btnQLChuyenDe.setBackground(new java.awt.Color(34, 40, 44));
        btnQLChuyenDe.setForeground(new java.awt.Color(255, 255, 255));
        btnQLChuyenDe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/edusys/icons/doc_lines.png"))); // NOI18N
        btnQLChuyenDe.setPreferredSize(new java.awt.Dimension(120, 50));
        btnQLChuyenDe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQLChuyenDeActionPerformed(evt);
            }
        });
        pnlSide.add(btnQLChuyenDe);

        btnQLNguoiHoc.setBackground(new java.awt.Color(34, 40, 44));
        btnQLNguoiHoc.setForeground(new java.awt.Color(255, 255, 255));
        btnQLNguoiHoc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/edusys/icons/3people32.png"))); // NOI18N
        btnQLNguoiHoc.setPreferredSize(new java.awt.Dimension(120, 50));
        btnQLNguoiHoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQLNguoiHocActionPerformed(evt);
            }
        });
        pnlSide.add(btnQLNguoiHoc);

        btnQLKhoaHoc.setBackground(new java.awt.Color(34, 40, 44));
        btnQLKhoaHoc.setForeground(new java.awt.Color(255, 255, 255));
        btnQLKhoaHoc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/edusys/icons/QLKH32.png"))); // NOI18N
        btnQLKhoaHoc.setPreferredSize(new java.awt.Dimension(120, 50));
        btnQLKhoaHoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQLKhoaHocActionPerformed(evt);
            }
        });
        pnlSide.add(btnQLKhoaHoc);

        btnQLHocVien.setBackground(new java.awt.Color(34, 40, 44));
        btnQLHocVien.setForeground(new java.awt.Color(255, 255, 255));
        btnQLHocVien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/edusys/icons/3Student32.png"))); // NOI18N
        btnQLHocVien.setPreferredSize(new java.awt.Dimension(120, 50));
        btnQLHocVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQLHocVienActionPerformed(evt);
            }
        });
        pnlSide.add(btnQLHocVien);

        jButton7.setBackground(new java.awt.Color(34, 40, 44));
        jButton7.setForeground(new java.awt.Color(255, 255, 255));
        jButton7.setPreferredSize(new java.awt.Dimension(120, 50));
        pnlSide.add(jButton7);

        pnlRoot.add(pnlSide, java.awt.BorderLayout.LINE_START);

        pnlCenter.setBackground(new java.awt.Color(34, 40, 44));
        pnlCenter.setLayout(new java.awt.BorderLayout());

        pnlBottom.setBackground(new java.awt.Color(38, 46, 50));
        pnlBottom.setPreferredSize(new java.awt.Dimension(747, 30));

        lblTime.setForeground(new java.awt.Color(255, 255, 255));
        lblTime.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTime.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/edusys/icons/clock.png"))); // NOI18N
        lblTime.setText("00:00:00");

        lblInfo.setForeground(new java.awt.Color(255, 255, 255));
        lblInfo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/edusys/icons/info.png"))); // NOI18N
        lblInfo.setText("Hệ thống đào tạo");

        javax.swing.GroupLayout pnlBottomLayout = new javax.swing.GroupLayout(pnlBottom);
        pnlBottom.setLayout(pnlBottomLayout);
        pnlBottomLayout.setHorizontalGroup(
            pnlBottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBottomLayout.createSequentialGroup()
                .addComponent(lblInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 646, Short.MAX_VALUE)
                .addComponent(lblTime, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pnlBottomLayout.setVerticalGroup(
            pnlBottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBottomLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(lblTime, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(lblInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pnlCenter.add(pnlBottom, java.awt.BorderLayout.PAGE_END);

        pnlCards.setBackground(new java.awt.Color(34, 40, 44));
        pnlCards.setLayout(new java.awt.CardLayout());

        pnlCardHome.setBackground(new java.awt.Color(34, 40, 44));

        lblLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/edusys/icons/logo-small_1.png"))); // NOI18N

        lblHomeTitle.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lblHomeTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblHomeTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHomeTitle.setText("TRUNG TÂM ĐÀO TẠO TIN HỌC NGẮN HẠN");

        pnlButton.setBackground(new java.awt.Color(34, 40, 44));
        pnlButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(34, 40, 44), 80));
        pnlButton.setLayout(new java.awt.GridLayout(2, 2, 80, 30));

        btnDangXuat.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnDangXuat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/edusys/icons/doc_export.png"))); // NOI18N
        btnDangXuat.setText("Đăng Xuất");
        btnDangXuat.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnDangXuat.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnDangXuat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDangXuatActionPerformed(evt);
            }
        });
        pnlButton.add(btnDangXuat);

        btnDoiMatKhau.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnDoiMatKhau.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/edusys/icons/key.png"))); // NOI18N
        btnDoiMatKhau.setText("Đổi Mật Khẩu");
        btnDoiMatKhau.setHideActionText(true);
        btnDoiMatKhau.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnDoiMatKhau.setPreferredSize(new java.awt.Dimension(60, 60));
        btnDoiMatKhau.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnDoiMatKhau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDoiMatKhauActionPerformed(evt);
            }
        });
        pnlButton.add(btnDoiMatKhau);

        btnGioiThieu.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnGioiThieu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/edusys/icons/globe_2.png"))); // NOI18N
        btnGioiThieu.setText("Giới Thiệu");
        btnGioiThieu.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnGioiThieu.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        pnlButton.add(btnGioiThieu);

        btnHuongDan.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnHuongDan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/edusys/icons/spechbubble_sq_line.png"))); // NOI18N
        btnHuongDan.setText("Hướng Dẫn");
        btnHuongDan.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnHuongDan.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        pnlButton.add(btnHuongDan);

        javax.swing.GroupLayout pnlCardHomeLayout = new javax.swing.GroupLayout(pnlCardHome);
        pnlCardHome.setLayout(pnlCardHomeLayout);
        pnlCardHomeLayout.setHorizontalGroup(
            pnlCardHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblLogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnlButton, javax.swing.GroupLayout.DEFAULT_SIZE, 903, Short.MAX_VALUE)
            .addComponent(lblHomeTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnlCardHomeLayout.setVerticalGroup(
            pnlCardHomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCardHomeLayout.createSequentialGroup()
                .addComponent(lblLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblHomeTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlCards.add(pnlCardHome, "card2");

        pnlCardQLNhanVien.setBackground(new java.awt.Color(34, 40, 44));
        pnlCardQLNhanVien.setLayout(new java.awt.BorderLayout());
        pnlCards.add(pnlCardQLNhanVien, "QLNhanVien");

        pnlCardQLChuyenDe.setBackground(new java.awt.Color(34, 40, 44));
        pnlCardQLChuyenDe.setLayout(new java.awt.BorderLayout());
        pnlCards.add(pnlCardQLChuyenDe, "QLChuyenDe");

        pnlCardQLNguoiHoc.setBackground(new java.awt.Color(34, 40, 44));
        pnlCardQLNguoiHoc.setLayout(new java.awt.BorderLayout());
        pnlCards.add(pnlCardQLNguoiHoc, "QLNguoiHoc");

        pnlCardQLKhoaHoc.setBackground(new java.awt.Color(34, 40, 44));
        pnlCardQLKhoaHoc.setLayout(new java.awt.BorderLayout());
        pnlCards.add(pnlCardQLKhoaHoc, "QLKhoaHoc");

        pnlCardQlHocVien.setBackground(new java.awt.Color(34, 40, 44));
        pnlCardQlHocVien.setLayout(new java.awt.BorderLayout());
        pnlCards.add(pnlCardQlHocVien, "QLHocVien");

        pnlCenter.add(pnlCards, java.awt.BorderLayout.CENTER);

        pnlRoot.add(pnlCenter, java.awt.BorderLayout.CENTER);

        getContentPane().add(pnlRoot, java.awt.BorderLayout.CENTER);

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeActionPerformed
        CardLayout layout = (CardLayout) pnlCards.getLayout();

        layout.first(pnlCards);
    }//GEN-LAST:event_btnHomeActionPerformed

    private void btnQLNhanVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQLNhanVienActionPerformed
        CardLayout layout = (CardLayout) pnlCards.getLayout();

        layout.show(pnlCards, "QLNhanVien");
    }//GEN-LAST:event_btnQLNhanVienActionPerformed

    private void btnQLChuyenDeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQLChuyenDeActionPerformed
        CardLayout layout = (CardLayout) pnlCards.getLayout();

        layout.show(pnlCards, "QLChuyenDe");
    }//GEN-LAST:event_btnQLChuyenDeActionPerformed

    private void btnQLNguoiHocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQLNguoiHocActionPerformed
        CardLayout layout = (CardLayout) pnlCards.getLayout();

        layout.show(pnlCards, "QLNguoiHoc");
    }//GEN-LAST:event_btnQLNguoiHocActionPerformed

    private void btnQLKhoaHocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQLKhoaHocActionPerformed
        CardLayout layout = (CardLayout) pnlCards.getLayout();

        layout.show(pnlCards, "QLKhoaHoc");
    }//GEN-LAST:event_btnQLKhoaHocActionPerformed

    private void btnQLHocVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQLHocVienActionPerformed
        CardLayout layout = (CardLayout) pnlCards.getLayout();

        layout.show(pnlCards, "QLHocVien");
    }//GEN-LAST:event_btnQLHocVienActionPerformed

    private void btnDoiMatKhauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDoiMatKhauActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDoiMatKhauActionPerformed

    private void btnDangXuatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDangXuatActionPerformed
        openDangNhapJDialog();
    }//GEN-LAST:event_btnDangXuatActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(EduSysJframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EduSysJframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EduSysJframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EduSysJframe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EduSysJframe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
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
    private javax.swing.JButton jButton7;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JLabel lblHomeTitle;
    private javax.swing.JLabel lblInfo;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblTime;
    private javax.swing.JPanel pnlBottom;
    private javax.swing.JPanel pnlButton;
    private javax.swing.JPanel pnlCardHome;
    private javax.swing.JPanel pnlCardQLChuyenDe;
    private javax.swing.JPanel pnlCardQLKhoaHoc;
    private javax.swing.JPanel pnlCardQLNguoiHoc;
    private javax.swing.JPanel pnlCardQLNhanVien;
    private javax.swing.JPanel pnlCardQlHocVien;
    private javax.swing.JPanel pnlCards;
    private javax.swing.JPanel pnlCenter;
    private javax.swing.JPanel pnlHome;
    private javax.swing.JPanel pnlRoot;
    private javax.swing.JPanel pnlSide;
    // End of variables declaration//GEN-END:variables

    private void init() {
        //Đưa cửa sổ ra giữa màn hình
        this.setLocationRelativeTo(null);

        //set icon cho app
        this.setIconImage(XImage.getAppIcon());
        
        mouseHover();
        
        //mở cửa sổ chào
        new ChaoJDialog(this, true).setVisible(true);
        
        openDangNhapJDialog();
        
        //Hiển thị đồng hồ
        new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Date now = new Date();
                SimpleDateFormat fm = new SimpleDateFormat("hh:mm:ss a");
                String txt = fm.format(now);
                lblTime.setText(txt);
            }
        }).start();
        
        //add panel quản lý chuyên đề
        this.pnlCardQLChuyenDe.add(new QLChuyenDeJPanel()).repaint();
        //add panel quản lý nhân viên
        this.pnlCardQLNhanVien.add(new QLNhanVienJPanel()).repaint();
        //add panel quản lý khóa học
        this.pnlCardQLKhoaHoc.add(new QLKhoaHocJPanel()).repaint();
        //add panel quản lý người học
        this.pnlCardQLNguoiHoc.add(new QLNguoiHocJPanel()).repaint();
        //add panel quản lý học viên
        this.pnlCardQlHocVien.add(new QLHocVienJPanel()).repaint();
        
    }

    private void openDangNhapJDialog() {
        //mở cửa sổ đăng nhập
        new DangNhapJDialog(this, true).setVisible(true);
    }

    private void mouseHover() {
        //Hiệu ứng di chuột vào các button menu
        JButton[] btns = {btnHome, btnQLNhanVien, btnQLChuyenDe, btnQLNguoiHoc, btnQLKhoaHoc, btnQLHocVien, jButton7};
        for (JButton btn : btns) {
            btn.setBackground(new Color(21, 25, 28));
            btn.setUI(new BasicButtonUI());
            btn.addMouseListener(new MouseListener() {
                @Override
                public void mouseClicked(MouseEvent e) {
                }

                @Override
                public void mousePressed(MouseEvent e) {
                }

                @Override
                public void mouseReleased(MouseEvent e) {
                }

                @Override
                public void mouseEntered(MouseEvent e) {
                    btn.setBackground(new Color(54, 81, 207));
                    if (btn == btnHome) {
                        btn.setText("Home");
                    } else if (btn == btnQLChuyenDe) {
                        btn.setText("QL Chuyên Đề");
                    } else if (btn == btnQLHocVien) {
                        btn.setText("QL Học Viên");
                    } else if (btn == btnQLKhoaHoc) {
                        btn.setText("QL Khóa học");
                    } else if (btn == btnQLNguoiHoc) {
                        btn.setText("QL Người Học");
                    } else if (btn == btnQLNhanVien) {
                        btn.setText("QL Nhân Viên");
                    }
                }

                @Override
                public void mouseExited(MouseEvent e) {
                    btn.setBackground(new Color(21, 25, 28));
                    btn.setText("");
                }
            });
        }
    }
}
