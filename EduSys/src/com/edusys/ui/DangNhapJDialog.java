/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edusys.ui;

import com.edusys.Interface.NhanVienDAOInterface;
import com.edusys.dao.NhanVienDao;
import com.edusys.entity.NhanVien;
import com.edusys.utils.Auth;
import com.edusys.utils.JdbcHelper;
import com.edusys.utils.MessegerHelper;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author XUÂN THÀNH
 */
public class DangNhapJDialog extends javax.swing.JDialog {
    
    private String rememberUser = "";
    private String rememberPass = "";
    private NhanVien rememberNV;
    private String path = "ListAccount.dat";
    private NhanVienDAOInterface dao;
    
    public DangNhapJDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
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

        pnlLeft = new javax.swing.JPanel();
        pnlHeader = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        pnlContainer = new javax.swing.JPanel();
        pnlTaiKhoan = new javax.swing.JPanel();
        txtTaiKhoan = new javax.swing.JTextField();
        lblTaiKhoan = new javax.swing.JLabel();
        pnlMatKhau = new javax.swing.JPanel();
        lblMatKhau = new javax.swing.JLabel();
        txtMatKhau = new javax.swing.JPasswordField();
        pnlOtherChoice = new javax.swing.JPanel();
        chkGhiNhoTK = new javax.swing.JCheckBox();
        lblQuenMK = new javax.swing.JLabel();
        pnlDangNhapButton = new javax.swing.JPanel();
        btnDangNhap = new javax.swing.JButton();
        pnlRight = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        lblExit = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 204));
        setUndecorated(true);

        pnlLeft.setBackground(new java.awt.Color(153, 153, 153));
        pnlLeft.setPreferredSize(new java.awt.Dimension(400, 405));

        pnlHeader.setBackground(new java.awt.Color(153, 153, 153));
        pnlHeader.setPreferredSize(new java.awt.Dimension(400, 100));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Welcome Back");

        javax.swing.GroupLayout pnlHeaderLayout = new javax.swing.GroupLayout(pnlHeader);
        pnlHeader.setLayout(pnlHeaderLayout);
        pnlHeaderLayout.setHorizontalGroup(
            pnlHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlHeaderLayout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(140, Short.MAX_VALUE))
        );
        pnlHeaderLayout.setVerticalGroup(
            pnlHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlHeaderLayout.createSequentialGroup()
                .addContainerGap(39, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(36, 36, 36))
        );

        pnlLeft.add(pnlHeader);

        pnlContainer.setBackground(new java.awt.Color(153, 153, 153));
        pnlContainer.setPreferredSize(new java.awt.Dimension(400, 150));

        pnlTaiKhoan.setBackground(new java.awt.Color(153, 153, 153));
        pnlTaiKhoan.setPreferredSize(new java.awt.Dimension(300, 50));
        pnlTaiKhoan.setLayout(new java.awt.BorderLayout(4, 4));

        txtTaiKhoan.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtTaiKhoanKeyPressed(evt);
            }
        });
        pnlTaiKhoan.add(txtTaiKhoan, java.awt.BorderLayout.CENTER);

        lblTaiKhoan.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblTaiKhoan.setText("Tài Khoản:");
        pnlTaiKhoan.add(lblTaiKhoan, java.awt.BorderLayout.PAGE_START);

        pnlContainer.add(pnlTaiKhoan);

        pnlMatKhau.setBackground(new java.awt.Color(153, 153, 153));
        pnlMatKhau.setPreferredSize(new java.awt.Dimension(300, 50));
        pnlMatKhau.setLayout(new java.awt.BorderLayout(4, 4));

        lblMatKhau.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblMatKhau.setText("Mật Khẩu:");
        pnlMatKhau.add(lblMatKhau, java.awt.BorderLayout.PAGE_START);

        txtMatKhau.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtMatKhauKeyPressed(evt);
            }
        });
        pnlMatKhau.add(txtMatKhau, java.awt.BorderLayout.CENTER);

        pnlContainer.add(pnlMatKhau);

        pnlOtherChoice.setBackground(new java.awt.Color(153, 153, 153));
        pnlOtherChoice.setPreferredSize(new java.awt.Dimension(300, 20));
        pnlOtherChoice.setLayout(new java.awt.BorderLayout());

        chkGhiNhoTK.setBackground(new java.awt.Color(153, 153, 153));
        chkGhiNhoTK.setForeground(new java.awt.Color(204, 0, 0));
        chkGhiNhoTK.setText("Ghi nhớ tài khoản?");
        chkGhiNhoTK.setPreferredSize(new java.awt.Dimension(120, 15));
        pnlOtherChoice.add(chkGhiNhoTK, java.awt.BorderLayout.WEST);

        lblQuenMK.setBackground(new java.awt.Color(153, 153, 153));
        lblQuenMK.setForeground(new java.awt.Color(204, 0, 0));
        lblQuenMK.setText("Quên mật khẩu?");
        lblQuenMK.setOpaque(true);
        pnlOtherChoice.add(lblQuenMK, java.awt.BorderLayout.LINE_END);

        pnlContainer.add(pnlOtherChoice);

        pnlLeft.add(pnlContainer);

        pnlDangNhapButton.setBackground(new java.awt.Color(153, 153, 153));
        pnlDangNhapButton.setPreferredSize(new java.awt.Dimension(400, 50));

        btnDangNhap.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnDangNhap.setText("Đăng Nhập");
        btnDangNhap.setPreferredSize(new java.awt.Dimension(300, 40));
        btnDangNhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDangNhapActionPerformed(evt);
            }
        });
        btnDangNhap.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnDangNhapKeyPressed(evt);
            }
        });
        pnlDangNhapButton.add(btnDangNhap);

        pnlLeft.add(pnlDangNhapButton);

        getContentPane().add(pnlLeft, java.awt.BorderLayout.LINE_START);

        pnlRight.setBackground(new java.awt.Color(51, 51, 51));
        pnlRight.setForeground(new java.awt.Color(51, 51, 51));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/edusys/icons/logo-small_1.png"))); // NOI18N

        lblExit.setBackground(new java.awt.Color(51, 51, 51));
        lblExit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/edusys/icons/on-off.png"))); // NOI18N
        lblExit.setOpaque(true);
        lblExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblExitMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pnlRightLayout = new javax.swing.GroupLayout(pnlRight);
        pnlRight.setLayout(pnlRightLayout);
        pnlRightLayout.setHorizontalGroup(
            pnlRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlRightLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(pnlRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblExit, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        pnlRightLayout.setVerticalGroup(
            pnlRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlRightLayout.createSequentialGroup()
                .addComponent(lblExit, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 98, Short.MAX_VALUE)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(105, 105, 105))
        );

        getContentPane().add(pnlRight, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lblExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblExitMouseClicked
        int c = JOptionPane.showConfirmDialog(this, "Bạn có chắc muốn thoát không?", "", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (c == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_lblExitMouseClicked

    private void btnDangNhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDangNhapActionPerformed
        StringBuilder loi = new StringBuilder();//tạo biến chứa lỗi
        String taiKhoan = txtTaiKhoan.getText();
        String matKhau = txtMatKhau.getText();
        //check rỗng 
        if (txtTaiKhoan.getText().isEmpty()){
            loi.append("Không để trống tài khoản\n");
        }
        
        if (txtMatKhau.getText().isEmpty()){
            loi.append("Không để trống mật khẩu");
        }
        
        if (loi.length()>0){
            MessegerHelper.errorMesseger(loi, this);
            return;
        }
        //check tài khoản
        try {
            Auth.nguoiDungHienTai = (NhanVien) dao.selectByID(taiKhoan);
            if (Auth.nguoiDungHienTai == null) {
                loi.append("Sai tài khoản");
                MessegerHelper.errorMesseger(loi, this);
                return;
            } else if (!matKhau.equals(Auth.nguoiDungHienTai.getMatKhau())) {
                loi.append("Sai mật khẩu");
                MessegerHelper.errorMesseger(loi, this);
                return;
            }
            this.dispose();
        } catch (Exception ex) {
            loi.append(ex.getMessage());
            MessegerHelper.errorMesseger(loi, this);
            return;
        }
        
         // lưu lại thông tin của người dùng nếu chọn "remember me?"
        if (chkGhiNhoTK.isSelected() == true) {
            this.rememberUser = taiKhoan;
            this.rememberPass = matKhau;
        } else {
            this.rememberPass = "";
            this.rememberUser = "";
        }
        this.rememberNV.setMaNV(rememberUser);
        this.rememberNV.setMatKhau(rememberPass);
        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(path));
            oos.writeObject(rememberNV);
            oos.flush();
            oos.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
        
    }//GEN-LAST:event_btnDangNhapActionPerformed

    private void txtTaiKhoanKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTaiKhoanKeyPressed
        EnterAcctions(evt);
    }//GEN-LAST:event_txtTaiKhoanKeyPressed

    private void txtMatKhauKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMatKhauKeyPressed
        EnterAcctions(evt);
    }//GEN-LAST:event_txtMatKhauKeyPressed

    private void btnDangNhapKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnDangNhapKeyPressed
        EnterAcctions(evt);
    }//GEN-LAST:event_btnDangNhapKeyPressed

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
            java.util.logging.Logger.getLogger(DangNhapJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DangNhapJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DangNhapJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DangNhapJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                DangNhapJDialog dialog = new DangNhapJDialog(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDangNhap;
    private javax.swing.JCheckBox chkGhiNhoTK;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel lblExit;
    private javax.swing.JLabel lblMatKhau;
    private javax.swing.JLabel lblQuenMK;
    private javax.swing.JLabel lblTaiKhoan;
    private javax.swing.JPanel pnlContainer;
    private javax.swing.JPanel pnlDangNhapButton;
    private javax.swing.JPanel pnlHeader;
    private javax.swing.JPanel pnlLeft;
    private javax.swing.JPanel pnlMatKhau;
    private javax.swing.JPanel pnlOtherChoice;
    private javax.swing.JPanel pnlRight;
    private javax.swing.JPanel pnlTaiKhoan;
    private javax.swing.JPasswordField txtMatKhau;
    private javax.swing.JTextField txtTaiKhoan;
    // End of variables declaration//GEN-END:variables

    private void init() {
        //Đưa màn hình ra giữa
        this.setLocationRelativeTo(null);
        
        //hiệu ứng di chuột vào label exit và quên mật khẩu
        JLabel[] lbls = {lblExit, lblQuenMK};
        for (JLabel lbl : lbls) {
            lbl.addMouseListener(new MouseListener() {
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
                    lbl.setBackground(new Color(25,75,204));
                }

                @Override
                public void mouseExited(MouseEvent e) {
                    if (lbl == lblQuenMK){
                        lbl.setBackground(new Color(153,153,153));
                    }else {
                        lbl.setBackground(new Color(51,51,51));
                    }
                    
                }
            });
        }
        
        this.dao = new NhanVienDao();
//        Auth.nguoiDungHienTai = new NhanVien();
        this.rememberNV = new NhanVien();
        //lấy ra tên tài khoản và mật khẩu đã được remember
        
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(path));
            this.rememberNV = (NhanVien) ois.readObject();
            this.rememberUser = this.rememberNV.getMaNV();
            this.rememberPass = this.rememberNV.getMatKhau();
            ois.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        //gán tài khoản mật khẩu cho trường txtTaiKhoan & txtMatKhau
        this.txtTaiKhoan.setText(this.rememberUser);
        this.txtMatKhau.setText(this.rememberPass);
        //tích chọn cho chkGhiNhoTK
        this.chkGhiNhoTK.setSelected(rememberUser.isEmpty() ? false : true);

    }
    
    private void EnterAcctions(KeyEvent evt) {
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            btnDangNhap.doClick();
        }
    }
}
