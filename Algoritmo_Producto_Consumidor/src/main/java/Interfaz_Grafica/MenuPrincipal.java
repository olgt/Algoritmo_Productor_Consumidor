/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Interfaz_Grafica;

import Clases_Sistema.*;
import javax.swing.JTextArea;

/**
 *
 * @author zaidi
 */
public class MenuPrincipal extends javax.swing.JFrame {

    Buffer b = new Buffer(10);
    Productor p1 = new Productor(b, 1, true);
    Consumidor c = new Consumidor(b, 1, true);
    Productor p2 = new Productor(b, 2, true);
    Productor p3 = new Productor(b, 2, true);
    JTextArea something = new JTextArea();

    boolean continuarProductor1;
    boolean continuarProductor2;
    boolean continuarConsumidor1;
    boolean continuarConsumidor2;

    /**
     * Creates new form MenuPrincipal
     */
    public MenuPrincipal() {
        initComponents();
        this.setLocationRelativeTo(null);
        
        c.setTextArea(jTextArea_Consola);
        p1.setTextArea(jTextArea_Consola);
        p2.setTextArea(jTextArea_Consola);
        p3.setTextArea(jTextArea_Consola);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton_Condumidor1_Detener = new javax.swing.JButton();
        jButton_Productor1_Detener = new javax.swing.JButton();
        jButton_Productor2_Iniciar = new javax.swing.JButton();
        jButton_Condumidor1_Iniciar = new javax.swing.JButton();
        jButton_Productor2_Detener = new javax.swing.JButton();
        jButton_Condumidor2_Iniciar = new javax.swing.JButton();
        jButton_Condumidor2_Detener = new javax.swing.JButton();
        jButton_Productor1_Iniciar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea_Buffer = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea_Consola = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        setMinimumSize(new java.awt.Dimension(700, 600));
        setPreferredSize(new java.awt.Dimension(900, 500));

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton_Condumidor1_Detener.setBackground(new java.awt.Color(255, 153, 153));
        jButton_Condumidor1_Detener.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton_Condumidor1_Detener.setText("Detener");
        getContentPane().add(jButton_Condumidor1_Detener, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 100, 100, 30));

        jButton_Productor1_Detener.setBackground(new java.awt.Color(255, 153, 153));
        jButton_Productor1_Detener.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton_Productor1_Detener.setText("Detener");
        getContentPane().add(jButton_Productor1_Detener, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, 100, 30));

        jButton_Productor2_Iniciar.setBackground(new java.awt.Color(153, 255, 153));
        jButton_Productor2_Iniciar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton_Productor2_Iniciar.setText("Iniciar");
        getContentPane().add(jButton_Productor2_Iniciar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, 100, 30));

        jButton_Condumidor1_Iniciar.setBackground(new java.awt.Color(153, 255, 153));
        jButton_Condumidor1_Iniciar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton_Condumidor1_Iniciar.setText("Iniciar");
        getContentPane().add(jButton_Condumidor1_Iniciar, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 70, 100, 30));

        jButton_Productor2_Detener.setBackground(new java.awt.Color(255, 153, 153));
        jButton_Productor2_Detener.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton_Productor2_Detener.setText("Detener");
        getContentPane().add(jButton_Productor2_Detener, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 370, 100, 30));

        jButton_Condumidor2_Iniciar.setBackground(new java.awt.Color(153, 255, 153));
        jButton_Condumidor2_Iniciar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton_Condumidor2_Iniciar.setText("Iniciar");
        getContentPane().add(jButton_Condumidor2_Iniciar, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 340, 100, 30));

        jButton_Condumidor2_Detener.setBackground(new java.awt.Color(255, 153, 153));
        jButton_Condumidor2_Detener.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton_Condumidor2_Detener.setText("Detener");
        getContentPane().add(jButton_Condumidor2_Detener, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 370, 100, 30));

        jButton_Productor1_Iniciar.setBackground(new java.awt.Color(153, 255, 153));
        jButton_Productor1_Iniciar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton_Productor1_Iniciar.setText("Iniciar");
        jButton_Productor1_Iniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_Productor1_IniciarActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_Productor1_Iniciar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, 100, 30));

        jTextArea_Buffer.setBackground(new java.awt.Color(204, 204, 255));
        jTextArea_Buffer.setColumns(20);
        jTextArea_Buffer.setRows(5);
        jScrollPane1.setViewportView(jTextArea_Buffer);

<<<<<<< Updated upstream

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 100, 270, -1));
=======
        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 80, 270, -1));
>>>>>>> Stashed changes


        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Productor 1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Consumidor 1");

        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 40, -1, -1));


        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Productor 2");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Consumidor 2");

        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 310, -1, -1));


        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Buffer");
<<<<<<< Updated upstream
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 80, 40, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Consola");

        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 220, 50, -1));

=======
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 60, 90, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Consola");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 200, 80, -1));
>>>>>>> Stashed changes

        jTextArea_Consola.setBackground(new java.awt.Color(204, 204, 255));
        jTextArea_Consola.setColumns(20);
        jTextArea_Consola.setRows(5);
        jScrollPane2.setViewportView(jTextArea_Consola);

<<<<<<< Updated upstream


        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 250, 490, 160));

=======
        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 230, 490, 160));

        jButton1.setBackground(new java.awt.Color(0, 0, 51));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("SALIR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 420, 80, 30));
>>>>>>> Stashed changes

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_Productor1_IniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_Productor1_IniciarActionPerformed
        test();

    }//GEN-LAST:event_jButton_Productor1_IniciarActionPerformed

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
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
    }

    public void test() {
        p1.start();
        c.start();
        p2.start();
        p3.start();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Condumidor1_Detener;
    private javax.swing.JButton jButton_Condumidor1_Iniciar;
    private javax.swing.JButton jButton_Condumidor2_Detener;
    private javax.swing.JButton jButton_Condumidor2_Iniciar;
    private javax.swing.JButton jButton_Productor1_Detener;
    private javax.swing.JButton jButton_Productor1_Iniciar;
    private javax.swing.JButton jButton_Productor2_Detener;
    private javax.swing.JButton jButton_Productor2_Iniciar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea_Buffer;
    private javax.swing.JTextArea jTextArea_Consola;
    // End of variables declaration//GEN-END:variables
}
