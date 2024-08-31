package University.win_button1;

import com.raven.swing.PanelBackground;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class WinButton extends javax.swing.JPanel {

    public WinButton() {
        initComponents();
        setOpaque(false);
    }

    public void initEvent(JFrame fram) {
        cmdClose.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                System.exit(0);
            }
        });
        cmdMi.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if (fram.getExtendedState() == JFrame.MAXIMIZED_BOTH) {
                    //panel.setRound(15);
                    fram.setExtendedState(JFrame.NORMAL);
                } else {
                    //panel.setRound(0);
                    fram.setExtendedState(JFrame.MAXIMIZED_BOTH);
                }
            }
        });
        cmdRe.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                main.Test u = new main.Test(); 
                u.show();
                fram.dispose();
            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cmdRe = new com.raven.swing.win_button.Button();
        cmdMi = new com.raven.swing.win_button.Button();
        cmdClose = new com.raven.swing.win_button.Button();

        cmdRe.setBackground(new java.awt.Color(67, 199, 51));
        cmdRe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cmdReMouseClicked(evt);
            }
        });

        cmdMi.setBackground(new java.awt.Color(227, 226, 68));
        cmdMi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cmdMiMouseClicked(evt);
            }
        });

        cmdClose.setBackground(new java.awt.Color(240, 61, 61));
        cmdClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cmdCloseMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addComponent(cmdRe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmdMi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmdClose, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cmdRe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmdMi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cmdClose, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cmdReMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmdReMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_cmdReMouseClicked

    private void cmdCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmdCloseMouseClicked
//        // TODO add your handling code here:
    }//GEN-LAST:event_cmdCloseMouseClicked

    private void cmdMiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmdMiMouseClicked
        // TODO add your handling code here:  
    }//GEN-LAST:event_cmdMiMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.raven.swing.win_button.Button cmdClose;
    private com.raven.swing.win_button.Button cmdMi;
    private com.raven.swing.win_button.Button cmdRe;
    // End of variables declaration//GEN-END:variables
}
