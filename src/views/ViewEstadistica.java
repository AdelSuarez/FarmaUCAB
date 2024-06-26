package views;

import controller.ControllerEstadistica;

public class ViewEstadistica extends javax.swing.JPanel {

    private ControllerEstadistica controller;

    public ViewEstadistica(views.Dashboard dashboard) {
        initComponents();
        this.setSize(1180, 720);

        this.controller = new ControllerEstadistica(dashboard, this);
        this.repaint();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        impPacientesPdf = new components.ButtonCustom();
        impConsultasPdf = new components.ButtonCustom();
        impInsumosPdf = new components.ButtonCustom();
        impEstadisticasPdf = new components.ButtonCustom();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1350, 920));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Estadisticas");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(38, 25, 141, 29);

        impPacientesPdf.setBackground(new java.awt.Color(0, 105, 255));
        impPacientesPdf.setForeground(new java.awt.Color(255, 255, 255));
        impPacientesPdf.setText("Imprimir Pacientes Pdf");
        impPacientesPdf.setBorderColor(new java.awt.Color(255, 255, 255));
        impPacientesPdf.setColor(new java.awt.Color(0, 105, 255));
        impPacientesPdf.setColorClick(new java.awt.Color(0, 95, 230));
        impPacientesPdf.setColorOver(new java.awt.Color(0, 84, 204));
        impPacientesPdf.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        impPacientesPdf.setPreferredSize(new java.awt.Dimension(230, 50));
        impPacientesPdf.setRadius(15);
        jPanel1.add(impPacientesPdf);
        impPacientesPdf.setBounds(50, 200, 230, 50);

        impConsultasPdf.setBackground(new java.awt.Color(0, 105, 255));
        impConsultasPdf.setForeground(new java.awt.Color(255, 255, 255));
        impConsultasPdf.setText("Imprimir Consultas Pdf");
        impConsultasPdf.setBorderColor(new java.awt.Color(255, 255, 255));
        impConsultasPdf.setColor(new java.awt.Color(0, 105, 255));
        impConsultasPdf.setColorClick(new java.awt.Color(0, 95, 230));
        impConsultasPdf.setColorOver(new java.awt.Color(0, 84, 204));
        impConsultasPdf.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        impConsultasPdf.setPreferredSize(new java.awt.Dimension(230, 50));
        impConsultasPdf.setRadius(15);
        jPanel1.add(impConsultasPdf);
        impConsultasPdf.setBounds(50, 110, 230, 50);

        impInsumosPdf.setBackground(new java.awt.Color(0, 105, 255));
        impInsumosPdf.setForeground(new java.awt.Color(255, 255, 255));
        impInsumosPdf.setText("Imprimir Insumos Pdf");
        impInsumosPdf.setBorderColor(new java.awt.Color(255, 255, 255));
        impInsumosPdf.setColor(new java.awt.Color(0, 105, 255));
        impInsumosPdf.setColorClick(new java.awt.Color(0, 95, 230));
        impInsumosPdf.setColorOver(new java.awt.Color(0, 84, 204));
        impInsumosPdf.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        impInsumosPdf.setPreferredSize(new java.awt.Dimension(230, 50));
        impInsumosPdf.setRadius(15);
        jPanel1.add(impInsumosPdf);
        impInsumosPdf.setBounds(50, 290, 230, 50);

        impEstadisticasPdf.setBackground(new java.awt.Color(0, 105, 255));
        impEstadisticasPdf.setForeground(new java.awt.Color(255, 255, 255));
        impEstadisticasPdf.setText("Imprimir Estadísticas Pdf");
        impEstadisticasPdf.setBorderColor(new java.awt.Color(255, 255, 255));
        impEstadisticasPdf.setColor(new java.awt.Color(0, 105, 255));
        impEstadisticasPdf.setColorClick(new java.awt.Color(0, 95, 230));
        impEstadisticasPdf.setColorOver(new java.awt.Color(0, 84, 204));
        impEstadisticasPdf.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        impEstadisticasPdf.setPreferredSize(new java.awt.Dimension(230, 50));
        impEstadisticasPdf.setRadius(15);
        impEstadisticasPdf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                impEstadisticasPdfActionPerformed(evt);
            }
        });
        jPanel1.add(impEstadisticasPdf);
        impEstadisticasPdf.setBounds(50, 380, 230, 50);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1180, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void impEstadisticasPdfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_impEstadisticasPdfActionPerformed

    }//GEN-LAST:event_impEstadisticasPdfActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public components.ButtonCustom impConsultasPdf;
    public components.ButtonCustom impEstadisticasPdf;
    public components.ButtonCustom impInsumosPdf;
    public components.ButtonCustom impPacientesPdf;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
