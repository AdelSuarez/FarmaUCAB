package views;

import controller.ControllerDatos;

public class ViewDatos extends javax.swing.JPanel {

    private ControllerDatos controller;

    public ViewDatos(views.Dashboard dashboard) {
        initComponents();
        this.setSize(1180, 720);

        this.controller = new ControllerDatos(dashboard, this);
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
        impUsoInsumosPdf = new components.ButtonCustom();
        jLabel2 = new javax.swing.JLabel();
        impConsultasMensualesPdf = new components.ButtonCustom();
        jLabel3 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1350, 920));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("//Todos los PDFs se envian a la carpeta en la que esta la aplicación");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(30, 550, 820, 29);

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

        impUsoInsumosPdf.setBackground(new java.awt.Color(0, 105, 255));
        impUsoInsumosPdf.setForeground(new java.awt.Color(255, 255, 255));
        impUsoInsumosPdf.setText("Uso de Insumos Pdf");
        impUsoInsumosPdf.setBorderColor(new java.awt.Color(255, 255, 255));
        impUsoInsumosPdf.setColor(new java.awt.Color(0, 105, 255));
        impUsoInsumosPdf.setColorClick(new java.awt.Color(0, 95, 230));
        impUsoInsumosPdf.setColorOver(new java.awt.Color(0, 84, 204));
        impUsoInsumosPdf.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        impUsoInsumosPdf.setPreferredSize(new java.awt.Dimension(230, 50));
        impUsoInsumosPdf.setRadius(15);
        impUsoInsumosPdf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                impUsoInsumosPdfActionPerformed(evt);
            }
        });
        jPanel1.add(impUsoInsumosPdf);
        impUsoInsumosPdf.setBounds(50, 380, 230, 50);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("Datos en PDF");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(38, 25, 190, 29);

        impConsultasMensualesPdf.setBackground(new java.awt.Color(0, 105, 255));
        impConsultasMensualesPdf.setForeground(new java.awt.Color(255, 255, 255));
        impConsultasMensualesPdf.setText("Consultas Mensules Pdf");
        impConsultasMensualesPdf.setBorderColor(new java.awt.Color(255, 255, 255));
        impConsultasMensualesPdf.setColor(new java.awt.Color(0, 105, 255));
        impConsultasMensualesPdf.setColorClick(new java.awt.Color(0, 95, 230));
        impConsultasMensualesPdf.setColorOver(new java.awt.Color(0, 84, 204));
        impConsultasMensualesPdf.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        impConsultasMensualesPdf.setPreferredSize(new java.awt.Dimension(230, 50));
        impConsultasMensualesPdf.setRadius(15);
        impConsultasMensualesPdf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                impConsultasMensualesPdfActionPerformed(evt);
            }
        });
        jPanel1.add(impConsultasMensualesPdf);
        impConsultasMensualesPdf.setBounds(50, 470, 230, 50);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/imagenPDF.png"))); // NOI18N
        jPanel1.add(jLabel3);
        jLabel3.setBounds(490, 50, 490, 460);

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

    private void impUsoInsumosPdfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_impUsoInsumosPdfActionPerformed

    }//GEN-LAST:event_impUsoInsumosPdfActionPerformed

    private void impConsultasMensualesPdfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_impConsultasMensualesPdfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_impConsultasMensualesPdfActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public components.ButtonCustom impConsultasMensualesPdf;
    public components.ButtonCustom impConsultasPdf;
    public components.ButtonCustom impInsumosPdf;
    public components.ButtonCustom impPacientesPdf;
    public components.ButtonCustom impUsoInsumosPdf;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
