
package dialog;

import java.awt.Color;

public class DialogCerrarSesion extends javax.swing.JFrame {
    
    private main.Main main;

    public DialogCerrarSesion(main.Main main) {
        this.main = main;
        this.setUndecorated(true);
        initComponents();
        setBackground(new Color(0,0,0,0));
        this.repaint();
        
    }

    private DialogCerrarSesion() {
        this.setUndecorated(true);
        initComponents();
        setBackground(new Color(0,0,0,0));
        this.repaint();
    }




    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelRound1 = new components.PanelRound();
        btnAceptar = new components.ButtonCustom();
        btnCancelar = new components.ButtonCustom();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        nombrePaciente = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(null);

        panelRound1.setBackground(new java.awt.Color(255, 255, 255));
        panelRound1.setRoundBottomLeft(15);
        panelRound1.setRoundBottomRight(15);
        panelRound1.setRoundTopLeft(15);
        panelRound1.setRoundTopRight(15);
        panelRound1.setLayout(null);

        btnAceptar.setForeground(new java.awt.Color(255, 255, 255));
        btnAceptar.setText("Aceptar");
        btnAceptar.setBorderColor(new java.awt.Color(255, 255, 255));
        btnAceptar.setColor(new java.awt.Color(0, 105, 255));
        btnAceptar.setColorClick(new java.awt.Color(0, 95, 230));
        btnAceptar.setColorOver(new java.awt.Color(0, 84, 204));
        btnAceptar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnAceptar.setPreferredSize(new java.awt.Dimension(230, 50));
        btnAceptar.setRadius(15);
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });
        panelRound1.add(btnAceptar);
        btnAceptar.setBounds(61, 169, 100, 50);

        btnCancelar.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelar.setBorderColor(new java.awt.Color(255, 255, 255));
        btnCancelar.setColor(new java.awt.Color(244, 208, 63));
        btnCancelar.setColorClick(new java.awt.Color(220, 187, 57));
        btnCancelar.setColorOver(new java.awt.Color(195, 166, 50));
        btnCancelar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnCancelar.setLabel("Cancelar");
        btnCancelar.setPreferredSize(new java.awt.Dimension(230, 50));
        btnCancelar.setRadius(15);
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        panelRound1.add(btnCancelar);
        btnCancelar.setBounds(194, 169, 100, 50);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Deseas Cerrar sesion");
        panelRound1.add(jLabel1);
        jLabel1.setBounds(60, 80, 247, 29);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/logout_black.png"))); // NOI18N
        panelRound1.add(jLabel2);
        jLabel2.setBounds(163, 26, 32, 32);

        nombrePaciente.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        panelRound1.add(nombrePaciente);
        nombrePaciente.setBounds(196, 123, 0, 0);

        getContentPane().add(panelRound1);
        panelRound1.setBounds(34, 35, 345, 236);

        setSize(new java.awt.Dimension(400, 300));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        // TODO add your handling code here:
        main.initView(main.getLogin());
        this.dispose();
    }//GEN-LAST:event_btnAceptarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

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
            java.util.logging.Logger.getLogger(DialogCerrarSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DialogCerrarSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DialogCerrarSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DialogCerrarSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DialogCerrarSesion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private components.ButtonCustom btnAceptar;
    private components.ButtonCustom btnCancelar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel nombrePaciente;
    private components.PanelRound panelRound1;
    // End of variables declaration//GEN-END:variables
}
