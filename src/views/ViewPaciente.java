package views;

import model.dataBase.PacienteDB;
import validaciones.ValidacionPaciente;
import controllers.ControllerPaciente;

public class ViewPaciente extends javax.swing.JPanel {

    private ControllerPaciente controller;
    private PacienteDB paciente = new PacienteDB();
    private ValidacionPaciente validacionPaciente = new ValidacionPaciente();

    public ViewPaciente(views.Dashboard dashboard) {
        initComponents();
        this.setSize(1180, 720);
        mensajeSeleccion.setVisible(false);
        this.controller = new ControllerPaciente(this, dashboard);
        controller.cargarTabla();
        this.repaint();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaPacientes = new javax.swing.JTable();
        inputSearchPaciente = new components.TextField();
        btnNuevoPaciente = new components.ButtonCustom();
        btnBorrarPaciente = new components.ButtonCustom();
        btnEditarPaciente = new components.ButtonCustom();
        btnBuscarPaciente = new components.ButtonCustom();
        mensajeSeleccion = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1350, 920));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Pacientes");

        tablaPacientes.setBackground(new java.awt.Color(255, 255, 255));
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

        inputSearchPaciente.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        inputSearchPaciente.setLabelText("Buscar");

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

        btnBorrarPaciente.setForeground(new java.awt.Color(255, 255, 255));
        btnBorrarPaciente.setText("Borrar");
        btnBorrarPaciente.setBorderColor(new java.awt.Color(255, 255, 255));
        btnBorrarPaciente.setColor(new java.awt.Color(231, 76, 60));
        btnBorrarPaciente.setColorClick(new java.awt.Color(208, 68, 54));
        btnBorrarPaciente.setColorOver(new java.awt.Color(185, 61, 48));
        btnBorrarPaciente.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnBorrarPaciente.setPreferredSize(new java.awt.Dimension(230, 50));
        btnBorrarPaciente.setRadius(15);

        btnEditarPaciente.setForeground(new java.awt.Color(255, 255, 255));
        btnEditarPaciente.setText("Editar");
        btnEditarPaciente.setBorderColor(new java.awt.Color(255, 255, 255));
        btnEditarPaciente.setColor(new java.awt.Color(244, 208, 63));
        btnEditarPaciente.setColorClick(new java.awt.Color(220, 187, 57));
        btnEditarPaciente.setColorOver(new java.awt.Color(195, 166, 50));
        btnEditarPaciente.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnEditarPaciente.setHideActionText(true);
        btnEditarPaciente.setPreferredSize(new java.awt.Dimension(230, 50));
        btnEditarPaciente.setRadius(15);

        btnBuscarPaciente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/search_black.png"))); // NOI18N
        btnBuscarPaciente.setBorderColor(new java.awt.Color(255, 255, 255));
        btnBuscarPaciente.setColorClick(new java.awt.Color(230, 230, 230));
        btnBuscarPaciente.setColorOver(new java.awt.Color(240, 240, 240));
        btnBuscarPaciente.setPreferredSize(new java.awt.Dimension(30, 30));
        btnBuscarPaciente.setRadius(15);
        btnBuscarPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarPacienteActionPerformed(evt);
            }
        });

        mensajeSeleccion.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        mensajeSeleccion.setForeground(new java.awt.Color(225, 0, 0));
        mensajeSeleccion.setText("Seleccione un paciente");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(mensajeSeleccion)
                        .addGap(18, 18, 18)
                        .addComponent(btnBorrarPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnEditarPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addGap(18, 18, 18)
                            .addComponent(inputSearchPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnBuscarPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnNuevoPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1073, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(345, 345, 345))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(mensajeSeleccion)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btnNuevoPaciente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(inputSearchPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1)))
                            .addComponent(btnBuscarPaciente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 507, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnBorrarPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEditarPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1180, -1));
    }// </editor-fold>//GEN-END:initComponents

    // fumada extrema que ni entiendo que hice alksdjklajdklajd
    private void btnBuscarPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarPacienteActionPerformed
        validacionPaciente.buscador(inputSearchPaciente,
                paciente.buscarPaciente(inputSearchPaciente.getText().trim()),
                tablaPacientes,
                1);
        this.repaint();
    }//GEN-LAST:event_btnBuscarPacienteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public components.ButtonCustom btnBorrarPaciente;
    private components.ButtonCustom btnBuscarPaciente;
    public components.ButtonCustom btnEditarPaciente;
    public components.ButtonCustom btnNuevoPaciente;
    private components.TextField inputSearchPaciente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    public javax.swing.JLabel mensajeSeleccion;
    public javax.swing.JTable tablaPacientes;
    // End of variables declaration//GEN-END:variables
}
