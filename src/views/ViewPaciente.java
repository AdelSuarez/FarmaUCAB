package views;

import controller.ControllerPaciente;

public class ViewPaciente extends javax.swing.JPanel {

    private ControllerPaciente controller;

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
        inputBuscarPaciente = new components.TextField();
        btnNuevoPaciente = new components.ButtonCustom();
        btnBorrarPaciente = new components.ButtonCustom();
        btnEditarPaciente = new components.ButtonCustom();
        btnBuscarPaciente = new components.ButtonCustom();
        mensajeSeleccion = new javax.swing.JLabel();
        numPacientes = new javax.swing.JLabel();

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
        tablaPacientes.setOpaque(false);
        tablaPacientes.setRowHeight(26);
        tablaPacientes.setShowGrid(true);
        tablaPacientes.setShowVerticalLines(false);
        tablaPacientes.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(tablaPacientes);

        inputBuscarPaciente.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        inputBuscarPaciente.setLabelText(" Buscar ( por Cédula )");

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

        mensajeSeleccion.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        mensajeSeleccion.setForeground(new java.awt.Color(225, 0, 0));
        mensajeSeleccion.setText("Seleccione un paciente");

        numPacientes.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        numPacientes.setText("Pacientes Registrados:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(mensajeSeleccion)
                                .addGap(18, 18, 18))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(numPacientes)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addComponent(btnBorrarPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnEditarPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(inputBuscarPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBuscarPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(195, 195, 195)
                        .addComponent(btnNuevoPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 1073, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(345, 345, 345))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnNuevoPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(inputBuscarPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addComponent(btnBuscarPaciente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 507, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnBorrarPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEditarPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(numPacientes)))
                    .addComponent(mensajeSeleccion, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1180, -1));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public components.ButtonCustom btnBorrarPaciente;
    public components.ButtonCustom btnBuscarPaciente;
    public components.ButtonCustom btnEditarPaciente;
    public components.ButtonCustom btnNuevoPaciente;
    public components.TextField inputBuscarPaciente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    public javax.swing.JLabel mensajeSeleccion;
    public javax.swing.JLabel numPacientes;
    public javax.swing.JTable tablaPacientes;
    // End of variables declaration//GEN-END:variables
}
