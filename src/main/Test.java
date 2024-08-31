package main;

import Login.GetID;
import scrollbar.ScrollBarCustom;
import form.Form1;
import form.Form2;
import java.awt.Component;
import javax.swing.JLayeredPane;
import javax.swing.JScrollBar;
import menu.EventMenu;
import net.miginfocom.swing.MigLayout;
import test.Slide1;
import test.Slide2;
import test.Slide3;
import test.Slide4;
import test.Slide5;
import test.Slide6;

public class Test extends javax.swing.JFrame {

    public int k;
    public Test() {
        initComponents();
        layer.setLayout(new MigLayout("fill, inset 0", "[fill]", "[fill]"));
        layer.setLayer(menu, JLayeredPane.POPUP_LAYER);
        layer.add(menu, "pos 0 0.5al 60 n", 0);
        slideshow1.k=1;
        slideshow1.initSlideshow(new Slide1(), new Slide2(), new Slide3());
        slideshow2.k=2;
        slideshow2.initSlideshow(new Slide4(), new Slide5(), new Slide6());
        scroll.setVerticalScrollBar(new ScrollBarCustom());
        ScrollBarCustom sp = new ScrollBarCustom();
        sp.setOrientation(JScrollBar.HORIZONTAL);
        scroll.setHorizontalScrollBar(sp);
        scroll.getViewport().setOpaque(false);
        scroll.setViewportBorder(null);
        scroll.getVerticalScrollBar().setUnitIncrement(16);
        winButton1.initEvent(this);
        menu.addEvent(new EventMenu() {
            @Override
            public void menuSelected(int index) {
                if (index == 0) {
                    Test t=new Test();
                    t.show();
                    dispose();
                } else if (index == 1) {
                    University.university u=new University.university();
                    u.show();
                    dispose();
                } else if (index == 2) {
                    if(GetID.flag==0)
                    {
                        Signup_Login.main.Main mp=new Signup_Login.main.Main();
                        mp.show();
                        dispose();
                    }
                    else if(GetID.flag==1)
                    {
                        com.raven.main.Main mp=new com.raven.main.Main();
                        mp.show();
                        dispose();
                    }
                } else if (index == 3) {
                    University.university u=new University.university();
                    u.show();
                    dispose();
                } else if (index == 4) {
                    University.university u=new University.university();
                    u.show();
                    dispose();
                } else if (index == 5) {
                    Aboutus.about u=new Aboutus.about();
                    u.show();
                    dispose();
                } else {
                    dispose();
                }
            }
        });
    }

    private void showForm(Component com) {
        main.removeAll();
        main.add(com);
        main.repaint();
        main.revalidate();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menu = new menu.Menu();
        jSpinner1 = new javax.swing.JSpinner();
        layer = new javax.swing.JLayeredPane();
        scroll = new javax.swing.JScrollPane();
        main = new javax.swing.JPanel();
        winButton1 = new main.win_button2.WinButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        kButton1 = new com.k33ptoo.components.KButton();
        slideshow1 = new slideshow.Slideshow();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        slideshow2 = new slideshow.Slideshow();
        jLabel13 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(30, 30, 30));
        setUndecorated(true);

        layer.setBackground(new java.awt.Color(30, 30, 30));
        layer.setOpaque(true);

        scroll.setBackground(new java.awt.Color(30, 30, 30));
        scroll.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        scroll.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        scroll.setMinimumSize(new java.awt.Dimension(1300, 800));
        scroll.setPreferredSize(new java.awt.Dimension(1300, 800));

        main.setBackground(new java.awt.Color(30, 30, 30));
        main.setMinimumSize(new java.awt.Dimension(1300, 2000));
        main.setPreferredSize(new java.awt.Dimension(1300, 2180));
        main.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        main.add(winButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1240, 10, -1, -1));

        jLabel3.setBackground(new java.awt.Color(0, 0, 85));
        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 1, 40)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText(" A new chapter,");
        jLabel3.setOpaque(true);
        main.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 70, 330, 60));

        jLabel1.setBackground(new java.awt.Color(0, 0, 85));
        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 40)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText(" new facet,");
        jLabel1.setOpaque(true);
        main.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 140, 240, 60));

        jLabel2.setBackground(new java.awt.Color(0, 0, 85));
        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 1, 40)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText(" new phase.");
        jLabel2.setOpaque(true);
        main.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 210, 240, 60));

        kButton1.setText("Let's get there");
        kButton1.setFont(new java.awt.Font("Segoe UI", 1, 28)); // NOI18N
        kButton1.setkBackGroundColor(new java.awt.Color(51, 102, 255));
        kButton1.setkBorderRadius(50);
        kButton1.setkEndColor(new java.awt.Color(102, 255, 255));
        kButton1.setkForeGround(new java.awt.Color(0, 0, 102));
        kButton1.setkHoverEndColor(new java.awt.Color(0, 0, 102));
        kButton1.setkHoverForeGround(new java.awt.Color(255, 255, 255));
        kButton1.setkHoverStartColor(new java.awt.Color(0, 51, 102));
        kButton1.setkSelectedColor(new java.awt.Color(102, 255, 255));
        kButton1.setkStartColor(new java.awt.Color(153, 255, 204));
        kButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kButton1ActionPerformed(evt);
            }
        });
        main.add(kButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 290, 260, 60));

        slideshow1.setBackground(new java.awt.Color(30, 30, 30));
        main.add(slideshow1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1300, 400));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 32)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Where are you thinking of studying?");
        main.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 430, 550, 60));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Ire.PNG"))); // NOI18N
        jLabel5.setText("jLabel5");
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel5.setPreferredSize(new java.awt.Dimension(350, 350));
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        main.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 530, 350, 350));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Aus.PNG"))); // NOI18N
        jLabel6.setText("jLabel5");
        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel6.setPreferredSize(new java.awt.Dimension(350, 350));
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        main.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 530, 350, 350));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Can.PNG"))); // NOI18N
        jLabel7.setText("jLabel5");
        jLabel7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel7.setPreferredSize(new java.awt.Dimension(350, 350));
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });
        main.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 530, 350, 350));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/UK.PNG"))); // NOI18N
        jLabel8.setText("jLabel5");
        jLabel8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel8.setPreferredSize(new java.awt.Dimension(350, 350));
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });
        main.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 900, 350, 350));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/NZ.PNG"))); // NOI18N
        jLabel9.setText("jLabel5");
        jLabel9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel9.setPreferredSize(new java.awt.Dimension(350, 350));
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });
        main.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 900, 350, 350));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/USA.PNG"))); // NOI18N
        jLabel10.setText("jLabel5");
        jLabel10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel10.setPreferredSize(new java.awt.Dimension(350, 350));
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });
        main.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 900, 350, 350));

        slideshow2.setBackground(new java.awt.Color(30, 30, 30));
        main.add(slideshow2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 1310, 1300, 400));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/2.png"))); // NOI18N
        main.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 1940, 380, 155));

        jLabel12.setBackground(new java.awt.Color(0, 0, 85));
        jLabel12.setOpaque(true);
        main.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 1920, 380, 200));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/main/1.jpg"))); // NOI18N
        main.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 1760, 1300, 420));

        scroll.setViewportView(main);

        layer.setLayer(scroll, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout layerLayout = new javax.swing.GroupLayout(layer);
        layer.setLayout(layerLayout);
        layerLayout.setHorizontalGroup(
            layerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layerLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(scroll, javax.swing.GroupLayout.PREFERRED_SIZE, 1300, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layerLayout.setVerticalGroup(
            layerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layerLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(scroll, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(layer)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(layer)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void kButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kButton1ActionPerformed
        // TODO add your handling code here:
        if(GetID.flag==0)
        {
            Signup_Login.main.Main mp=new Signup_Login.main.Main();
            mp.show();
            dispose();
        }
        else if(GetID.flag==1)
        {
            com.raven.main.Main mp=new com.raven.main.Main();
            mp.show();
            dispose();
        }
    }//GEN-LAST:event_kButton1ActionPerformed

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        // TODO add your handling code here:
        University.university u=new University.university("select * from  university_information where country like '%Australia%' order by ranking asc");
        u.show();
        dispose();
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        // TODO add your handling code here:
        University.university u=new University.university("select * from  university_information where country like '%Canada%' order by ranking asc");
        u.show();
        dispose();
    }//GEN-LAST:event_jLabel7MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        // TODO add your handling code here:
        University.university u=new University.university("select * from  university_information where country like '%Ireland%' order by ranking asc");
        u.show();
        dispose();
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        // TODO add your handling code here:
        University.university u=new University.university("select * from  university_information where country like '%New Zealand%' order by ranking asc");
        u.show();
        dispose();
    }//GEN-LAST:event_jLabel9MouseClicked

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        // TODO add your handling code here:
        University.university u=new University.university("select * from  university_information where country like '%United Kingdom%' order by ranking asc");
        u.show();
        dispose();
    }//GEN-LAST:event_jLabel8MouseClicked

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        // TODO add your handling code here:
        University.university u=new University.university("select * from  university_information where country like '%United States%' order by ranking asc");
        u.show();
        dispose();
    }//GEN-LAST:event_jLabel10MouseClicked

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
            java.util.logging.Logger.getLogger(Test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Test.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Test().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSpinner jSpinner1;
    private com.k33ptoo.components.KButton kButton1;
    private javax.swing.JLayeredPane layer;
    private javax.swing.JPanel main;
    private menu.Menu menu;
    private javax.swing.JScrollPane scroll;
    private slideshow.Slideshow slideshow1;
    private slideshow.Slideshow slideshow2;
    private main.win_button2.WinButton winButton1;
    // End of variables declaration//GEN-END:variables

    
}
