
package views;

import views.viewsPaciente.NuevoPaciente;
import database.Paciente;

public class ViewPaciente extends javax.swing.JPanel {
    private NuevoPaciente nuevoPaciente;
    private views.Dashboard dashboard;
    private Paciente paciente = new Paciente();    
    
    public ViewPaciente(views.Dashboard dashboard) {
        this.dashboard = dashboard;
        this.nuevoPaciente = new NuevoPaciente(dashboard, this);
        initComponents();
        cargarTabla();
        this.setSize(1180,720);
        configuracionesTabla();
        this.repaint();

    }
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaPacientes = new javax.swing.JTable();
        textField1 = new components.TextField();
        btnNuevoPaciente = new components.ButtonCustom();
        btnBorrarPaciente = new components.ButtonCustom();
        buttonCustom3 = new components.ButtonCustom();
        buttonCustom4 = new components.ButtonCustom();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1350, 920));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Pacientes");

        tablaPacientes.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tablaPacientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tablaPacientes.setFocusable(false);
        tablaPacientes.setGridColor(new java.awt.Color(153, 153, 153));
        tablaPacientes.setIntercellSpacing(new java.awt.Dimension(0, 0));
        tablaPacientes.setOpaque(false);
        tablaPacientes.setRowHeight(26);
        tablaPacientes.setShowGrid(true);
        tablaPacientes.setShowVerticalLines(false);
        tablaPacientes.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(tablaPacientes);

        textField1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        textField1.setLabelText("Buscar");

        btnNuevoPaciente.setBackground(new java.awt.Color(0, 105, 255));
        btnNuevoPaciente.setForeground(new java.awt.Color(255, 255, 255));
        btnNuevoPaciente.setText("Nuevo paciente");
        btnNuevoPaciente.setBorderColor(new java.awt.Color(255, 255, 255));
        btnNuevoPaciente.setColor(new java.awt.Color(0, 105, 255));
        btnNuevoPaciente.setColorClick(new java.awt.Color(0, 95, 230));
        btnNuevoPaciente.setColorOver(new java.awt.Color(0, 84, 204));
        btnNuevoPaciente.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnNuevoPaciente.setPreferredSize(new java.awt.Dimension(230, 50));
        btnNuevoPaciente.setRadius(15);
        btnNuevoPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoPacienteActionPerformed(evt);
            }
        });

        btnBorrarPaciente.setForeground(new java.awt.Color(255, 255, 255));
        btnBorrarPaciente.setText("Borrar");
        btnBorrarPaciente.setBorderColor(new java.awt.Color(255, 255, 255));
        btnBorrarPaciente.setColor(new java.awt.Color(231, 76, 60));
        btnBorrarPaciente.setColorClick(new java.awt.Color(208, 68, 54));
        btnBorrarPaciente.setColorOver(new java.awt.Color(185, 61, 48));
        btnBorrarPaciente.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnBorrarPaciente.setPreferredSize(new java.awt.Dimension(230, 50));
        btnBorrarPaciente.setRadius(15);
        btnBorrarPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarPacienteActionPerformed(evt);
            }
        });

        buttonCustom3.setForeground(new java.awt.Color(255, 255, 255));
        buttonCustom3.setText("Editar");
        buttonCustom3.setBorderColor(new java.awt.Color(255, 255, 255));
        buttonCustom3.setColor(new java.awt.Color(244, 208, 63));
        buttonCustom3.setColorClick(new java.awt.Color(220, 187, 57));
        buttonCustom3.setColorOver(new java.awt.Color(195, 166, 50));
        buttonCustom3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        buttonCustom3.setHideActionText(true);
        buttonCustom3.setPreferredSize(new java.awt.Dimension(230, 50));
        buttonCustom3.setRadius(15);

        buttonCustom4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/search_black.png"))); // NOI18N
        buttonCustom4.setBorderColor(new java.awt.Color(255, 255, 255));
        buttonCustom4.setColorClick(new java.awt.Color(230, 230, 230));
        buttonCustom4.setColorOver(new java.awt.Color(240, 240, 240));
        buttonCustom4.setPreferredSize(new java.awt.Dimension(30, 30));
        buttonCustom4.setRadius(15);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnBorrarPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(buttonCustom3, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addGap(18, 18, 18)
                            .addComponent(textField1, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(buttonCustom4, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnNuevoPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1073, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(345, 345, 345))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnNuevoPaciente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)))
                    .addComponent(buttonCustom4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 507, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBorrarPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonCustom3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnNuevoPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoPacienteActionPerformed
        dashboard.initView(nuevoPaciente);
    }//GEN-LAST:event_btnNuevoPacienteActionPerformed

    private void btnBorrarPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarPacienteActionPerformed
        int filaSeleccionada = tablaPacientes.getSelectedRow();
        if (filaSeleccionada != -1) { // Verifica si se ha seleccionado una fila
            String cedula = tablaPacientes.getValueAt(filaSeleccionada, 0).toString();
            dialog.DialogEliminarPaciente dialog = new dialog.DialogEliminarPaciente(cedula, this);
            dialog.setVisible(true);
            this.repaint();
        }
    }//GEN-LAST:event_btnBorrarPacienteActionPerformed

    public void cargarTabla(){
        paciente.mostrarPacientes("Pacientes", tablaPacientes);
    }
    
    private void configuracionesTabla(){
        tablaPacientes.getColumnModel().getColumn(0).setPreferredWidth(40);
        tablaPacientes.getColumnModel().getColumn(0).setResizable(false);
        tablaPacientes.getColumnModel().getColumn(1).setPreferredWidth(250);
        tablaPacientes.getColumnModel().getColumn(1).setResizable(false);
        tablaPacientes.getColumnModel().getColumn(2).setPreferredWidth(40);
        tablaPacientes.getColumnModel().getColumn(2).setResizable(false);
        tablaPacientes.getColumnModel().getColumn(3).setPreferredWidth(100);
        tablaPacientes.getColumnModel().getColumn(3).setResizable(false);
        tablaPacientes.getColumnModel().getColumn(4).setPreferredWidth(100);
        tablaPacientes.getColumnModel().getColumn(4).setResizable(false);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private components.ButtonCustom btnBorrarPaciente;
    private components.ButtonCustom btnNuevoPaciente;
    private components.ButtonCustom buttonCustom3;
    private components.ButtonCustom buttonCustom4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tablaPacientes;
    private components.TextField textField1;
    // End of variables declaration//GEN-END:variables
}
