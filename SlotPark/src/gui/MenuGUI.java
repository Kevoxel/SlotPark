/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.border.LineBorder;

/**
 *
 * @author Kevin
 */
public class MenuGUI extends javax.swing.JFrame {

    private String selgame = "Poker"; //Ausgewähltes Spiel
    private String username;
    private double geld;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
        lbName.setText("Name: "+username);
    }

    public double getGeld() {
        return geld;
    }

    public void setGeld(double geld) {
        this.geld = geld;
        lbGeld.setText("Geld: "+String.format("%,.02f €", geld));
    }

    public MenuGUI() {
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        this.setUndecorated(true);
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

        jButton4 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        lbSlots = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        lbPoker = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        lbRoulette = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        lbIcon = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        lbName = new javax.swing.JLabel();
        lbGeld = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton4.setFont(new java.awt.Font("Eras Bold ITC", 0, 48)); // NOI18N
        jButton4.setText("Logout");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                onLogout(evt);
            }
        });
        getContentPane().add(jButton4, java.awt.BorderLayout.SOUTH);

        jPanel1.setLayout(new java.awt.GridLayout(1, 3));

        jPanel5.setLayout(new java.awt.BorderLayout());

        jLabel6.setFont(new java.awt.Font("Eras Bold ITC", 0, 48)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Slots");
        jPanel5.add(jLabel6, java.awt.BorderLayout.NORTH);

        lbSlots.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        lbSlots.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbSlots.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/slots.png"))); // NOI18N
        lbSlots.setName("Slots"); // NOI18N
        lbSlots.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                onSelect(evt);
            }
        });
        lbSlots.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                onPlay(evt);
            }
        });
        jPanel5.add(lbSlots, java.awt.BorderLayout.CENTER);

        jPanel1.add(jPanel5);

        jPanel4.setLayout(new java.awt.BorderLayout());

        jLabel7.setFont(new java.awt.Font("Eras Bold ITC", 0, 48)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Poker");
        jPanel4.add(jLabel7, java.awt.BorderLayout.NORTH);

        lbPoker.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        lbPoker.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbPoker.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Poker.png"))); // NOI18N
        lbPoker.setName("Poker"); // NOI18N
        lbPoker.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                onSelect(evt);
            }
        });
        lbPoker.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                onPlay(evt);
            }
        });
        jPanel4.add(lbPoker, java.awt.BorderLayout.CENTER);

        jPanel1.add(jPanel4);

        jPanel2.setLayout(new java.awt.BorderLayout());

        jLabel5.setFont(new java.awt.Font("Eras Bold ITC", 0, 48)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Roulette");
        jPanel2.add(jLabel5, java.awt.BorderLayout.NORTH);

        lbRoulette.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        lbRoulette.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbRoulette.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Roulette.png"))); // NOI18N
        lbRoulette.setName("Roulette"); // NOI18N
        lbRoulette.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                onSelect(evt);
            }
        });
        lbRoulette.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                onPlay(evt);
            }
        });
        jPanel2.add(lbRoulette, java.awt.BorderLayout.CENTER);

        jPanel1.add(jPanel2);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        jPanel3.setLayout(new java.awt.BorderLayout());

        jLabel1.setFont(new java.awt.Font("Eras Bold ITC", 0, 48)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Willkommen!");
        jPanel3.add(jLabel1, java.awt.BorderLayout.CENTER);

        jPanel6.setLayout(new java.awt.BorderLayout());

        lbIcon.setFont(new java.awt.Font("Eras Bold ITC", 0, 48)); // NOI18N
        lbIcon.setText("ICON");
        jPanel6.add(lbIcon, java.awt.BorderLayout.WEST);

        jPanel7.setLayout(new java.awt.GridLayout(2, 1));

        lbName.setFont(new java.awt.Font("Eras Bold ITC", 0, 48)); // NOI18N
        lbName.setText("Name:");
        jPanel7.add(lbName);

        lbGeld.setFont(new java.awt.Font("Eras Bold ITC", 0, 48)); // NOI18N
        lbGeld.setText("Geld:");
        jPanel7.add(lbGeld);

        jPanel6.add(jPanel7, java.awt.BorderLayout.CENTER);

        jPanel3.add(jPanel6, java.awt.BorderLayout.PAGE_START);

        getContentPane().add(jPanel3, java.awt.BorderLayout.PAGE_START);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void onLogout(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_onLogout
        LoginGUI logingui = new LoginGUI();
        logingui.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_onLogout

    private void onPlay(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_onPlay
        switch (selgame) {
            case "Slots":
                SlotsGUI slotsgui = new SlotsGUI();
                slotsgui.setVisible(true);
                this.dispose();
                break;
            case "Poker":
                PokerGUI pokergui = new PokerGUI();
                pokergui.setVisible(true);
                this.dispose();
                break;
            case "Roulette":

                break;
        }
    }//GEN-LAST:event_onPlay

    private void onSelect(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_onSelect
        JLabel lbsel = (JLabel) evt.getSource();
        selgame = lbsel.getName();
        switch (selgame) { //Setzt die Umrandung des Selektierten Spiels
            case "Slots":
                lbSlots.setBorder(new LineBorder(Color.black, 20));
                lbPoker.setBorder(null);
                lbRoulette.setBorder(null);
                break;
            case "Poker":
                lbPoker.setBorder(new LineBorder(Color.black, 20));
                lbRoulette.setBorder(null);
                lbSlots.setBorder(null);
                break;
            case "Roulette":
                lbRoulette.setBorder(new LineBorder(Color.black, 20));
                lbPoker.setBorder(null);
                lbSlots.setBorder(null);
                break;
        }
    }//GEN-LAST:event_onSelect

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
            java.util.logging.Logger.getLogger(MenuGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JLabel lbGeld;
    private javax.swing.JLabel lbIcon;
    private javax.swing.JLabel lbName;
    private javax.swing.JLabel lbPoker;
    private javax.swing.JLabel lbRoulette;
    private javax.swing.JLabel lbSlots;
    // End of variables declaration//GEN-END:variables
}
