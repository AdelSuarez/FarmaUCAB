package dialog;

import controller.ControllerInsumo;
import java.awt.Color;
import views.Dashboard;

public class DialogEliminarInsumo extends javax.swing.JFrame {

    private model.dataBase.InsumoDB insumo = new model.dataBase.InsumoDB();
    private String id = "";
    private views.ViewInsumo viewInsumo;
    private Dashboard dashboard;

    public DialogEliminarInsumo(String cedula, views.ViewInsumo viewInsumo, Dashboard dashboard) {
        this.setUndecorated(true);
        initComponents();
        setBackground(new Color(0, 0, 0, 0));
        this.id = cedula;
        this.dashboard = dashboard;
        this.viewInsumo = viewInsumo;
        this.repaint();

    }

    private DialogEliminarInsumo() {
        this.setUndecorated(true);
        initComponents();
        setBackground(new Color(0, 0, 0, 0));
        this.repaint();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelRound1 = new components.PanelRound();
        btnEliminarPaciente = new components.ButtonCustom();
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

        btnEliminarPaciente.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminarPaciente.setBorderColor(new java.awt.Color(255, 255, 255));
        btnEliminarPaciente.setColor(new java.awt.Color(231, 76, 60));
        btnEliminarPaciente.setColorClick(new java.awt.Color(208, 68, 54));
        btnEliminarPaciente.setColorOver(new java.awt.Color(185, 61, 48));
        btnEliminarPaciente.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnEliminarPaciente.setLabel("Borrar");
        btnEliminarPaciente.setPreferredSize(new java.awt.Dimension(230, 50));
        btnEliminarPaciente.setRadius(15);
        btnEliminarPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarPacienteActionPerformed(evt);
            }
        });

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

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Elminar Insumo");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/vaccines_black.png"))); // NOI18N

        nombrePaciente.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        javax.swing.GroupLayout panelRound1Layout = new javax.swing.GroupLayout(panelRound1);
        panelRound1.setLayout(panelRound1Layout);
        panelRound1Layout.setHorizontalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound1Layout.createSequentialGroup()
                .addContainerGap(61, Short.MAX_VALUE)
                .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(69, 69, 69))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(150, 150, 150))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound1Layout.createSequentialGroup()
                        .addComponent(btnEliminarPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound1Layout.createSequentialGroup()
                        .addComponent(nombrePaciente)
                        .addGap(149, 149, 149))))
        );
        panelRound1Layout.setVerticalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(nombrePaciente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEliminarPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17))
        );

        getContentPane().add(panelRound1);
        panelRound1.setBounds(34, 35, 345, 236);

        setSize(new java.awt.Dimension(400, 300));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnEliminarPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarPacienteActionPerformed
        // TODO add your handling code here:
        if (insumo.eliminar(id)) {
            new ControllerInsumo(dashboard, viewInsumo).cargarTabla();
            this.dispose();
        }

    }//GEN-LAST:event_btnEliminarPacienteActionPerformed

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
            java.util.logging.Logger.getLogger(DialogEliminarInsumo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DialogEliminarInsumo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DialogEliminarInsumo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DialogEliminarInsumo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DialogEliminarInsumo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private components.ButtonCustom btnCancelar;
    private components.ButtonCustom btnEliminarPaciente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel nombrePaciente;
    private components.PanelRound panelRound1;
    // End of variables declaration//GEN-END:variables
}
