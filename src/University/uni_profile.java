/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

package University;

import Login.main.Main;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Desktop;
import static java.awt.SystemColor.menu;
import java.net.URL;
import java.sql.Connection;
import javax.swing.JOptionPane;
import javax.swing.JScrollBar;
import scrollbar.ScrollBarCustom;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import static javax.swing.UIManager.put;
import com.raven.swing.win_button.WinButton;
import java.awt.Color;
import static java.awt.Color.yellow;


/**
 *
 * @author SAJID
 */
public class uni_profile extends javax.swing.JFrame {

    /** Creates new form uni_profile */
    Connection conn=null;
    PreparedStatement ps=null;
    ResultSet rs=null;
    String rnk;
    public uni_profile(String Rank,Color color) {
        initComponents();
        
        
        conn=Jconnection.CC();
        System.out.println(Rank); 
        pro3.setBackground(color);
        rnk=Rank;
        try{
            
            String query = "SELECT * FROM university_information where ranking = " + Rank ;
            System.out.println(Rank); 
            ps = conn.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            
            rs.next();
            ImageIcon iconLogo = new ImageIcon("src/University/unipro/"+Rank+".jpg"); 
            jLabel1.setIcon(iconLogo);
            ImageIcon iconLogo1 = new ImageIcon("src/University/unipro/"+Rank+"s.jpg"); 
            jLabel2.setIcon(iconLogo1);
            jLabel3.setText(rs.getString("uni_name"));
            jLabel5.setText("Country : "+rs.getString("country"));
            jLabel4.setText("QS Rank : "+rs.getString("ranking"));
            jLabel6.setText("Tution Fee : "+rs.getString("tution_fee"));
            jLabel7.setText("Requirements : Minimum IELTS "+rs.getString("requirements"));

            
            System.out.println(rs.getString("uni_name") );

        }catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        winButton2.initEvent(this);
        //menu.initWinButton(uni_profile.this, jPanel1);
        //menu.initMenu(eventMenu);
    }
//    public void initWinButton(JFrame fram, JPanel panel) {
//        winButton.initEvent(fram, panel);
//    }
    
    

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        winButton2 = new University.win_button2.WinButton();
        jLabel2 = new javax.swing.JLabel();
        pro3 = new progressbar.ProgressBarCustom();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        cmdSignIn = new com.k33ptoo.components.KButton();
        cmdSignIn1 = new com.k33ptoo.components.KButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(winButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1240, 10, -1, -1));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setOpaque(true);
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 330, 150, 150));

        pro3.setBackground(new java.awt.Color(255, 51, 51));
        pro3.setString("");
        jPanel1.add(pro3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 390, 1300, -1));

        jLabel7.setBackground(new java.awt.Color(30, 30, 30));
        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("jLabel4");
        jLabel7.setOpaque(true);
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 600, 450, 50));

        jLabel6.setBackground(new java.awt.Color(30, 30, 30));
        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("jLabel4");
        jLabel6.setOpaque(true);
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 600, 450, 50));

        jLabel5.setBackground(new java.awt.Color(30, 30, 30));
        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("jLabel4");
        jLabel5.setOpaque(true);
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 520, 450, 50));

        jLabel4.setBackground(new java.awt.Color(30, 30, 30));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("jLabel4");
        jLabel4.setOpaque(true);
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 520, 450, 50));

        jLabel3.setBackground(new java.awt.Color(30, 30, 30));
        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 28)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("jLabel3");
        jLabel3.setOpaque(true);
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 430, 960, 60));

        jLabel1.setBackground(new java.awt.Color(0, 0, 204));
        jLabel1.setText("jLabel1");
        jLabel1.setOpaque(true);
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1300, 400));

        cmdSignIn.setText("Learn more");
        cmdSignIn.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        cmdSignIn.setkBackGroundColor(new java.awt.Color(51, 102, 255));
        cmdSignIn.setkBorderRadius(40);
        cmdSignIn.setkEndColor(new java.awt.Color(102, 255, 255));
        cmdSignIn.setkForeGround(new java.awt.Color(0, 0, 102));
        cmdSignIn.setkHoverEndColor(new java.awt.Color(0, 0, 102));
        cmdSignIn.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        cmdSignIn.setkHoverStartColor(new java.awt.Color(0, 51, 102));
        cmdSignIn.setkSelectedColor(new java.awt.Color(102, 255, 255));
        cmdSignIn.setkStartColor(new java.awt.Color(153, 255, 204));
        cmdSignIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdSignInActionPerformed(evt);
            }
        });
        jPanel1.add(cmdSignIn, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 690, -1, 50));

        cmdSignIn1.setText("Apply");
        cmdSignIn1.setFont(new java.awt.Font("Century Gothic", 1, 20)); // NOI18N
        cmdSignIn1.setkBackGroundColor(new java.awt.Color(51, 102, 255));
        cmdSignIn1.setkBorderRadius(40);
        cmdSignIn1.setkEndColor(new java.awt.Color(102, 255, 255));
        cmdSignIn1.setkForeGround(new java.awt.Color(0, 0, 102));
        cmdSignIn1.setkHoverEndColor(new java.awt.Color(0, 0, 102));
        cmdSignIn1.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        cmdSignIn1.setkHoverStartColor(new java.awt.Color(0, 51, 102));
        cmdSignIn1.setkSelectedColor(new java.awt.Color(102, 255, 255));
        cmdSignIn1.setkStartColor(new java.awt.Color(153, 255, 204));
        cmdSignIn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmdSignIn1ActionPerformed(evt);
            }
        });
        jPanel1.add(cmdSignIn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 690, -1, 50));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1300, 800));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cmdSignInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdSignInActionPerformed
        // TODO add your handling code here:

        try{
            Desktop.getDesktop().browse(new URL("https://www.mit.edu/about/").toURI()); 
        }catch(Exception e){
}

    }//GEN-LAST:event_cmdSignInActionPerformed

    private void cmdSignIn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmdSignIn1ActionPerformed
        // TODO add your handling code here:
        try{
            String query = "SELECT website FROM university_information where ranking = " + rnk ;
            ps = conn.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            rs.next();
            String sr=rs.getString("website");
                   
            Desktop.getDesktop().browse(new URL(sr).toURI()); 
        }catch(Exception e){
           
            }
    }//GEN-LAST:event_cmdSignIn1ActionPerformed

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
            java.util.logging.Logger.getLogger(uni_profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(uni_profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(uni_profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(uni_profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new uni_profile("",yellow).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.k33ptoo.components.KButton cmdSignIn;
    private com.k33ptoo.components.KButton cmdSignIn1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private progressbar.ProgressBarCustom pro3;
    private University.win_button2.WinButton winButton2;
    // End of variables declaration//GEN-END:variables

}
