/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import beans.Combi;
import beans.Farbe;
import static beans.Farbe.*;
import beans.Karte;
import beans.PokerSpieler;
import java.awt.Color;
import java.io.File;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Random;
import java.util.Stack;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Kevin
 */
public class PokerGUI extends javax.swing.JFrame {

    int mindesteinsatz = 10;
    int flopedcards = 0;
    int pot = 0;
    Random rand = new Random();
    String imagepath = System.getProperty("user.dir") + File.separator + "src" + File.separator + "images" + File.separator + "karten" + File.separator;
    Stack<Karte> stapel = new Stack<>();
    Karte[] kartentisch = new Karte[5];
    boolean preflop = true;
    boolean floP = false;

    public PokerGUI() {
        this.setExtendedState(JFrame.MAXIMIZED_BOTH);
        this.setUndecorated(true);
        initComponents();
        lbPot.setText("Pot: " + pot);
        newRound();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lbIcon = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        lbName = new javax.swing.JLabel();
        lbGeld = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        tfEinsatz = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        lbPot = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        lbC1 = new javax.swing.JLabel();
        lbC2 = new javax.swing.JLabel();
        lbC3 = new javax.swing.JLabel();
        lbC4 = new javax.swing.JLabel();
        lbC5 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        lbCard1 = new javax.swing.JLabel();
        lbCard2 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new java.awt.BorderLayout());

        lbIcon.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        lbIcon.setText("Icon");
        jPanel1.add(lbIcon, java.awt.BorderLayout.WEST);

        jPanel7.setLayout(new java.awt.GridLayout(2, 0));

        lbName.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jPanel7.add(lbName);

        lbGeld.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jPanel7.add(lbGeld);

        jPanel1.add(jPanel7, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_START);

        jPanel2.setLayout(new java.awt.GridLayout(2, 0));

        jPanel4.setLayout(new java.awt.GridLayout(2, 2));

        jButton3.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jButton3.setText("Check");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                onCheck(evt);
            }
        });
        jPanel4.add(jButton3);

        tfEinsatz.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        tfEinsatz.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel4.add(tfEinsatz);

        jButton4.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jButton4.setText("Fold");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                onFold(evt);
            }
        });
        jPanel4.add(jButton4);

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jButton2.setText("Erhöhen");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                onRaise(evt);
            }
        });
        jPanel4.add(jButton2);

        jPanel2.add(jPanel4);

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jButton1.setText("Zurück");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                onBack(evt);
            }
        });
        jPanel2.add(jButton1);

        getContentPane().add(jPanel2, java.awt.BorderLayout.PAGE_END);

        jPanel3.setLayout(new java.awt.GridLayout(2, 0));

        jPanel10.setLayout(new java.awt.BorderLayout());

        jPanel11.setLayout(new java.awt.GridLayout(2, 1));

        lbPot.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        lbPot.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbPot.setText("POT: 0 Chips");
        jPanel11.add(lbPot);

        jPanel12.setLayout(new java.awt.GridLayout(1, 3));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Spieler 1");
        jPanel12.add(jLabel10);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Spieler 2");
        jPanel12.add(jLabel9);

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Spieler 3");
        jPanel12.add(jLabel11);

        jPanel11.add(jPanel12);

        jPanel10.add(jPanel11, java.awt.BorderLayout.NORTH);

        jPanel5.setLayout(new java.awt.GridLayout(1, 5));

        lbC1.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        lbC1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbC1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/karten/red_back.png"))); // NOI18N
        jPanel5.add(lbC1);

        lbC2.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        lbC2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbC2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/karten/red_back.png"))); // NOI18N
        jPanel5.add(lbC2);

        lbC3.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        lbC3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbC3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/karten/red_back.png"))); // NOI18N
        jPanel5.add(lbC3);

        lbC4.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        lbC4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbC4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/karten/red_back.png"))); // NOI18N
        jPanel5.add(lbC4);

        lbC5.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        lbC5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbC5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/karten/red_back.png"))); // NOI18N
        jPanel5.add(lbC5);

        jPanel10.add(jPanel5, java.awt.BorderLayout.CENTER);

        jPanel3.add(jPanel10);

        jPanel6.setLayout(new java.awt.GridLayout(1, 2));

        jPanel8.setLayout(new java.awt.GridLayout(1, 2));

        lbCard1.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        lbCard1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbCard1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/karten/10C.png"))); // NOI18N
        jPanel8.add(lbCard1);

        lbCard2.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        lbCard2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbCard2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/karten/10C.png"))); // NOI18N
        jPanel8.add(lbCard2);

        jPanel6.add(jPanel8);

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1000, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );

        jPanel6.add(jPanel9);

        jPanel3.add(jPanel6);

        getContentPane().add(jPanel3, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void onBack(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_onBack
        MenuGUI menugui = new MenuGUI();
        menugui.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_onBack

    private void onCheck(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_onCheck
        if (preflop) {
            flop(lbC1);
            flop(lbC2);
            flop(lbC3);
            flopedcards = 3;
            preflop = false;
        } else {
            switch (flopedcards) {
                case 3:
                    flop(lbC4);
                    break;
                case 4:
                    flop(lbC5);
                    break;
            }
            flopedcards++;
        }

    }//GEN-LAST:event_onCheck

    private void onRaise(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_onRaise
        try {
            int einsatz = Integer.parseInt(tfEinsatz.getText());
            tfEinsatz.setBackground(Color.WHITE);
            pot = pot + einsatz;
            lbPot.setText("Pot: " + pot);
        } catch (NumberFormatException e) {
            System.out.println("Einsatz muss eine Zahl sein!");
            tfEinsatz.setBackground(Color.RED);
        }


    }//GEN-LAST:event_onRaise

    private void onFold(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_onFold
        newRound();
    }//GEN-LAST:event_onFold

    public void createCards(Farbe farbe) {
        for (int i = 0; i < 10; i++) {
            stapel.add(new Karte(i + 1, farbe));
        }
        Collections.shuffle(stapel);
    }

    public void flop(JLabel lb) {
        if (stapel.size() - 1 > -1) {
            Karte karte = stapel.pop();
            lb.setIcon(new ImageIcon(imagepath + (karte.getWert() + karte.getFarbe().getName() + ".png")));
            System.out.println(karte.getWert() + karte.getFarbe().getName());
        }
    }

    public Combi checkCombi(PokerSpieler spieler) {
        Karte[] deck = spieler.getKarten();
        Karte[] alle = new Karte[7];
        for (int i = 0; i < deck.length; i++) {
            alle[i] = deck[i];
        }
        for (int i = 0; i < kartentisch.length; i++) {
            alle[i + 2] = kartentisch[i];
        }
        Combi combi = null;
        return combi;
    }

    public void newRound() {
        preflop = true;
        stapel.clear();
        flopedcards = 0;
        createCards(HERZ);
        createCards(PIK);
        createCards(KARO);
        createCards(KREUZ);
        lbC1.setIcon(new ImageIcon(imagepath + "red_back.png"));
        lbC2.setIcon(new ImageIcon(imagepath + "red_back.png"));
        lbC3.setIcon(new ImageIcon(imagepath + "red_back.png"));
        lbC4.setIcon(new ImageIcon(imagepath + "red_back.png"));
        lbC5.setIcon(new ImageIcon(imagepath + "red_back.png"));
        if (stapel.size() - 1 > -1) {
            //int kartenindex = rand.nextInt((stapel.size() - 1) - 0 + 1) + 0;
            Karte karte = stapel.pop();
            lbCard1.setIcon(new ImageIcon(imagepath + (karte.getWert() + karte.getFarbe().getName() + ".png")));
            karte = stapel.pop();
            lbCard2.setIcon(new ImageIcon(imagepath + (karte.getWert() + karte.getFarbe().getName() + ".png")));

        }
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
            java.util.logging.Logger.getLogger(PokerGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PokerGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PokerGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PokerGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PokerGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JLabel lbC1;
    private javax.swing.JLabel lbC2;
    private javax.swing.JLabel lbC3;
    private javax.swing.JLabel lbC4;
    private javax.swing.JLabel lbC5;
    private javax.swing.JLabel lbCard1;
    private javax.swing.JLabel lbCard2;
    private javax.swing.JLabel lbGeld;
    private javax.swing.JLabel lbIcon;
    private javax.swing.JLabel lbName;
    private javax.swing.JLabel lbPot;
    private javax.swing.JTextField tfEinsatz;
    // End of variables declaration//GEN-END:variables
}
