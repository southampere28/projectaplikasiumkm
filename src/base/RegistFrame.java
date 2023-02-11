/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package base;

import java.awt.Color;
import java.awt.Cursor;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.security.crypto.bcrypt.BCrypt;

/**
 *
 * @author Pramudya
 */
public class RegistFrame extends javax.swing.JFrame {

    /**
     * Creates new form RegistFrame
     */
    public RegistFrame() {
        initComponents();
        this.fieldNama.setBackground(new java.awt.Color(0,0,0,0));
        this.fieldNotelp.setBackground(new java.awt.Color(0,0,0,0));
        this.fieldUsername.setBackground(new java.awt.Color(0,0,0,0));
        this.btnDaftar.setBackground(new java.awt.Color(0,0,0,0));
        this.fieldPasswordd.setBackground(new java.awt.Color(0,0,0,0));
        this.jToggleButton1.setBackground(new java.awt.Color(0,0,0,0));
        this.btn_back.setBackground(new java.awt.Color(0,0,0,0));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        weakness = new javax.swing.JLabel();
        jToggleButton1 = new javax.swing.JToggleButton();
        btn_back = new javax.swing.JButton();
        fieldPasswordd = new javax.swing.JPasswordField();
        fieldUsername = new javax.swing.JTextField();
        fieldNotelp = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btnDaftar = new javax.swing.JButton();
        fieldNama = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        weakness.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        weakness.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(weakness, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 540, 150, 20));

        jToggleButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/close-eyeres.png"))); // NOI18N
        jToggleButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jToggleButton1MouseClicked(evt);
            }
        });
        getContentPane().add(jToggleButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(621, 533, 40, 40));

        btn_back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/arrow.png"))); // NOI18N
        btn_back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_backMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_backMouseExited(evt);
            }
        });
        btn_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_backActionPerformed(evt);
            }
        });
        getContentPane().add(btn_back, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 40, 40));

        fieldPasswordd.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        fieldPasswordd.setBorder(null);
        fieldPasswordd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                fieldPassworddMouseExited(evt);
            }
        });
        fieldPasswordd.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                fieldPassworddKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                fieldPassworddKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                fieldPassworddKeyTyped(evt);
            }
        });
        getContentPane().add(fieldPasswordd, new org.netbeans.lib.awtextra.AbsoluteConstraints(344, 534, 280, 40));

        fieldUsername.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        fieldUsername.setBorder(null);
        getContentPane().add(fieldUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(344, 440, 320, 40));

        fieldNotelp.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        fieldNotelp.setBorder(null);
        fieldNotelp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldNotelpActionPerformed(evt);
            }
        });
        fieldNotelp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                fieldNotelpKeyTyped(evt);
            }
        });
        getContentPane().add(fieldNotelp, new org.netbeans.lib.awtextra.AbsoluteConstraints(344, 349, 320, 40));

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("KEMBALI");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 110, 80, 20));

        btnDaftar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnDaftar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDaftarActionPerformed(evt);
            }
        });
        getContentPane().add(btnDaftar, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 600, 130, 40));

        fieldNama.setFont(new java.awt.Font("Arial", 0, 16)); // NOI18N
        fieldNama.setBorder(null);
        getContentPane().add(fieldNama, new org.netbeans.lib.awtextra.AbsoluteConstraints(344, 255, 320, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/RegisterMenu.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void fieldNotelpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldNotelpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldNotelpActionPerformed

    private void jToggleButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jToggleButton1MouseClicked
       if(jToggleButton1.isSelected()){
           fieldPasswordd.setEchoChar((char)0);
           this.jToggleButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/eyeres.png")));
       }else{
           fieldPasswordd.setEchoChar('*');
           this.jToggleButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/close-eyeres.png")));
       }
    }//GEN-LAST:event_jToggleButton1MouseClicked

    public void filterAngka(java.awt.event.KeyEvent a){
        if(Character.isAlphabetic(a.getKeyChar())){
            a.consume();
        }else{
            
        }
    }
    
    private void btnDaftarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDaftarActionPerformed
            if (this.fieldPasswordd.getText().length() < 8){
                JOptionPane.showMessageDialog(this, "password minimal harus 8 karakter");
                JOptionPane.showMessageDialog(this, "password minimal harus 8 karakter");
            }else if (this.fieldNotelp.getText().length() <= 2){
                        JOptionPane.showMessageDialog(this, "nomor telepon harus lebih dari 2 karakter");
                        
            }else if (this.fieldUsername.getText().length() < 6){
                JOptionPane.showMessageDialog(this, "username minimal harus 6 karakter");
            }else if (this.fieldNama.getText().length() < 2){
                JOptionPane.showMessageDialog(this, "nama minimal harus 2 karakter");
            }
            else if (this.fieldNama.getText().equals("administrator")){
                JOptionPane.showMessageDialog(this, "you are prohibited using this name :(");
            }
            else{
                
                    try {
                   String namaUser = this.fieldNama.getText(),
                          telpUser = this.fieldNotelp.getText(),
                          usernameUser = this.fieldUsername.getText(),
                          passUser = this.fieldPasswordd.getText(),
                          passEncrypt = BCrypt.hashpw(passUser, BCrypt.gensalt(10));
                  String sql = "SELECT * FROM akun WHERE username = '" + usernameUser + "' ";
                  Connection c = (Connection) koneksi.configDB();
                  Statement s = c.createStatement();
                  ResultSet r = s.executeQuery(sql);
                  if(r.next()){
                     String userAcount = r.getString("username");
                      if(usernameUser.equals(userAcount)){
                          JOptionPane.showMessageDialog(this, "username tidak tersedia");
                      }
                  }else{
                       String inpsql = "INSERT INTO akun(username, pass, nama, telepon, token) VALUES (?, ?, ?, ?, ?)";
                      PreparedStatement pst = c.prepareStatement(inpsql);

                     pst.setString(1, usernameUser);
                     pst.setString(2, passEncrypt);
                     pst.setString(3, namaUser);
                     pst.setString(4, telpUser);

                  // make token
                      String rand = "abcdefghijklmnopqrstuvwxyz".toUpperCase();
                      int range = (rand.length()) ;
                      String Result = "";
                      for (int i = 0; i < 6; i++) {
                          int getValue = (int)(Math.random() * range);
                          char CharPoss = rand.charAt(getValue);
                          Result += CharPoss;
                      }

                      pst.setString(5, Result);
                     pst.executeUpdate();

                     c.close();
                     this.fieldNama.setText("");
                     this.fieldNotelp.setText("");
                     this.fieldUsername.setText("");
                     this.fieldPasswordd.setText("");
                     JOptionPane.showMessageDialog(rootPane, "Daftar berhasil");
                     TimeUnit.SECONDS.sleep(2);
                     new LoginFrame().setVisible(true);
                       dispose();
                      }
              } catch (Exception e) {
                  JOptionPane.showMessageDialog(this, e.getMessage());
              }
         
            }
        
    }//GEN-LAST:event_btnDaftarActionPerformed

    private void btn_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_backActionPerformed
        new LoginFrame().setVisible(true);
        dispose();
    }//GEN-LAST:event_btn_backActionPerformed

    private void btn_backMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_backMouseEntered
        this.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_btn_backMouseEntered

    private void btn_backMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_backMouseExited
        this.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
    }//GEN-LAST:event_btn_backMouseExited

    private void fieldPassworddKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fieldPassworddKeyTyped
             
       
    }//GEN-LAST:event_fieldPassworddKeyTyped

    private void fieldPassworddKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fieldPassworddKeyPressed
       //todo
    }//GEN-LAST:event_fieldPassworddKeyPressed
    
    static String hasnumber;
    
    private void fieldPassworddKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fieldPassworddKeyReleased
        String fieldPass = this.fieldPasswordd.getText();
        char[] chars = fieldPass.toCharArray();
        hasnumber = "";
        for(char c : chars){
            if(Character.isDigit(c)){
                hasnumber = "yes";
            }
        }
        
        if(fieldPass.length() > 8 && !fieldPass.equals(fieldPass.toLowerCase()) && hasnumber.equals("yes")){
                this.weakness.setText("STRONG");
                weakness.setForeground(Color.green);
        }
        else if (this.fieldPasswordd.getText().length() > 7){
                this.weakness.setText("BAGUS");
                weakness.setForeground(Color.blue);
            }else if(this.fieldPasswordd.getText().length() > 5){
                this.weakness.setText("SEDANG");
                weakness.setForeground(Color.yellow);
            }else{
                this.weakness.setText("LEMAH");
                weakness.setForeground(Color.red);
            }
        
    }//GEN-LAST:event_fieldPassworddKeyReleased

    private void fieldPassworddMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fieldPassworddMouseExited
        weakness.setText("");
    }//GEN-LAST:event_fieldPassworddMouseExited

    private void fieldNotelpKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fieldNotelpKeyTyped
        this.filterAngka(evt);
//        this.filterChar(evt);
    }//GEN-LAST:event_fieldNotelpKeyTyped

    
    // ** backup
    private static void inibackup(){
        //        try{
//         String sql = "INSERT INTO akun(username, pass, nama, telepon, token) VALUES (?, ?, ?, ?, ?)";
//         
//               Connection conn = (Connection) koneksi.configDB();
//               PreparedStatement pst = conn.prepareStatement(sql);
//               
//               pst.setString(1, usernameUser);
//               pst.setString(2, passUser);
//               pst.setString(3, namaUser);
//               pst.setString(4, telpUser);
//
//            // make token
//                String rand = "abcdefghijklmnopqrstuvwxyz".toUpperCase();
//                int range = (rand.length()) ;
//                String Result = "";
//                for (int i = 0; i < 6; i++) {
//                    int getValue = (int)(Math.random() * range);
//                    char CharPoss = rand.charAt(getValue);
//                    Result += CharPoss;
//                }
//                
//                pst.setString(5, Result);
//               pst.executeUpdate();
//               
//               conn.close();
//               this.fieldNama.setText("");
//               this.fieldNotelp.setText("");
//               this.fieldUsername.setText("");
//               this.fieldPasswordd.setText("");
//               JOptionPane.showMessageDialog(rootPane, "Data Berhasil di Input");
//             try {
//                 TimeUnit.SECONDS.sleep(2);
//                 new LoginFrame().setVisible(true);
//                 dispose();
//             } catch (InterruptedException ex) {
//                 Logger.getLogger(RegistFrame.class.getName()).log(Level.SEVERE, null, ex);
//             }
//           }catch(SQLException ex){
//               ex.printStackTrace();
//               JOptionPane.showMessageDialog(this, "Error : " + ex.getMessage());
//           }
    }
    
    
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
            java.util.logging.Logger.getLogger(RegistFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDaftar;
    private javax.swing.JButton btn_back;
    private javax.swing.JTextField fieldNama;
    private javax.swing.JTextField fieldNotelp;
    private javax.swing.JPasswordField fieldPasswordd;
    private javax.swing.JTextField fieldUsername;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JLabel weakness;
    // End of variables declaration//GEN-END:variables
}
