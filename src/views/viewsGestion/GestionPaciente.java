package views.viewsGestion;

import validaciones.ValidacionPaciente;
import model.dataBase.PacienteDB;
import controller.ControllerPaciente;

public class GestionPaciente extends javax.swing.JPanel {

    
    private PacienteDB paciente = new PacienteDB();
    private views.Dashboard dashboard;
    private views.ViewPaciente viewPaciente;
    private ValidacionPaciente validacionPaciente = new ValidacionPaciente();
    private String cedula;
    private String[] datosPaciente;
    private String id;

    public GestionPaciente(views.Dashboard dashboard, views.ViewPaciente viewPaciente, String ventana) {
        this.cedula = ventana;
        this.dashboard = dashboard;
        this.viewPaciente = viewPaciente;
        initComponents();
        this.setSize(1180, 720);
        this.mensajeGuardado.setVisible(false);
        seleccionVentana(ventana);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnRegresar = new components.ButtonCustom();
        panelRound1 = new components.PanelRound();
        apellidoPaciente = new components.TextField();
        nombrePaciente = new components.TextField();
        telefonoPaciente = new components.TextField();
        cedulaPaciente = new components.TextField();
        DEPaciente = new components.TextField();
        textAreaScroll2 = new components.TextAreaScroll();
        descripcionPaciente = new components.TextArea();
        generoPaciente = new components.Combobox();
        tittuloSecundario = new javax.swing.JLabel();
        edadPaciente = new components.TextField();
        btnGuardarPaciente = new components.ButtonCustom();
        mensajeGuardado = new javax.swing.JLabel();
        tituloPrincipal = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/arrow_back_black.png"))); // NOI18N
        btnRegresar.setBorderColor(new java.awt.Color(255, 255, 255));
        btnRegresar.setColorClick(new java.awt.Color(230, 230, 230));
        btnRegresar.setColorOver(new java.awt.Color(240, 240, 240));
        btnRegresar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnRegresar.setPreferredSize(new java.awt.Dimension(40, 40));
        btnRegresar.setRadius(15);
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 50, -1));

        panelRound1.setBackground(new java.awt.Color(240, 240, 240));
        panelRound1.setRoundBottomLeft(15);
        panelRound1.setRoundBottomRight(15);
        panelRound1.setRoundTopLeft(15);
        panelRound1.setRoundTopRight(15);

        apellidoPaciente.setBackground(new java.awt.Color(240, 240, 240));
        apellidoPaciente.setForeground(new java.awt.Color(80, 80, 80));
        apellidoPaciente.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        apellidoPaciente.setLabelText("Apellido");

        nombrePaciente.setBackground(new java.awt.Color(240, 240, 240));
        nombrePaciente.setForeground(new java.awt.Color(80, 80, 80));
        nombrePaciente.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        nombrePaciente.setLabelText("Nombre");

        telefonoPaciente.setBackground(new java.awt.Color(240, 240, 240));
        telefonoPaciente.setForeground(new java.awt.Color(80, 80, 80));
        telefonoPaciente.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        telefonoPaciente.setLabelText("Telefono");

        cedulaPaciente.setBackground(new java.awt.Color(240, 240, 240));
        cedulaPaciente.setForeground(new java.awt.Color(80, 80, 80));
        cedulaPaciente.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cedulaPaciente.setLabelText("Cedula");

        DEPaciente.setBackground(new java.awt.Color(240, 240, 240));
        DEPaciente.setForeground(new java.awt.Color(80, 80, 80));
        DEPaciente.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        DEPaciente.setLabelText("Dependencia/Escuela");

        textAreaScroll2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        textAreaScroll2.setLabelText("Descripcion");

        descripcionPaciente.setBackground(new java.awt.Color(235, 235, 235));
        descripcionPaciente.setColumns(20);
        descripcionPaciente.setForeground(new java.awt.Color(80, 80, 80));
        descripcionPaciente.setRows(5);
        descripcionPaciente.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        textAreaScroll2.setViewportView(descripcionPaciente);

        generoPaciente.setBackground(new java.awt.Color(240, 240, 240));
        generoPaciente.setForeground(new java.awt.Color(0, 0, 0));
        generoPaciente.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Masculino", "Femenino" }));
        generoPaciente.setSelectedIndex(-1);
        generoPaciente.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        generoPaciente.setLabeText("Genero");

        tittuloSecundario.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        tittuloSecundario.setText("Datos del Paciente");

        edadPaciente.setBackground(new java.awt.Color(240, 240, 240));
        edadPaciente.setForeground(new java.awt.Color(80, 80, 80));
        edadPaciente.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        edadPaciente.setLabelText("Edad");

        btnGuardarPaciente.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardarPaciente.setBorderColor(new java.awt.Color(240, 240, 240));
        btnGuardarPaciente.setColor(new java.awt.Color(0, 105, 255));
        btnGuardarPaciente.setColorClick(new java.awt.Color(0, 95, 230));
        btnGuardarPaciente.setColorOver(new java.awt.Color(0, 84, 204));
        btnGuardarPaciente.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnGuardarPaciente.setLabel("Guardar");
        btnGuardarPaciente.setPreferredSize(new java.awt.Dimension(86, 40));
        btnGuardarPaciente.setRadius(15);
        btnGuardarPaciente.setRolloverEnabled(true);
        btnGuardarPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarPacienteActionPerformed(evt);
            }
        });

        mensajeGuardado.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        mensajeGuardado.setForeground(new java.awt.Color(40, 180, 99));

        javax.swing.GroupLayout panelRound1Layout = new javax.swing.GroupLayout(panelRound1);
        panelRound1.setLayout(panelRound1Layout);
        panelRound1Layout.setHorizontalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound1Layout.createSequentialGroup()
                .addGap(105, 105, 105)
                .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRound1Layout.createSequentialGroup()
                        .addComponent(mensajeGuardado)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnGuardarPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelRound1Layout.createSequentialGroup()
                        .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tittuloSecundario)
                            .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(nombrePaciente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(apellidoPaciente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(telefonoPaciente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(DEPaciente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cedulaPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 111, Short.MAX_VALUE)
                        .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(textAreaScroll2, javax.swing.GroupLayout.PREFERRED_SIZE, 447, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelRound1Layout.createSequentialGroup()
                                .addComponent(generoPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(edadPaciente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap(57, Short.MAX_VALUE))
        );
        panelRound1Layout.setVerticalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound1Layout.createSequentialGroup()
                .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelRound1Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(tittuloSecundario)
                        .addGap(50, 50, 50)
                        .addComponent(nombrePaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(apellidoPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cedulaPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(telefonoPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(DEPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(panelRound1Layout.createSequentialGroup()
                        .addGap(142, 142, 142)
                        .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(generoPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(edadPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(textAreaScroll2, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                        .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnGuardarPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mensajeGuardado))))
                .addGap(49, 49, 49))
        );

        jPanel1.add(panelRound1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, 1010, 560));

        tituloPrincipal.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        tituloPrincipal.setText("Nuevo Paciente");
        jPanel1.add(tituloPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 20, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1123, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 667, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        // TODO add your handling code here:
        dashboard.initView(dashboard.getViewPaciente());
        this.mensajeGuardado.setVisible(false);
        new ControllerPaciente(viewPaciente, dashboard).cargarTabla();
        this.repaint();
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void btnGuardarPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarPacienteActionPerformed
        // TODO add your handling code here:
        if (cedula.equals("Nuevo")) {
            guardarPaciete();

        } else {
            editarPaciente();
        }

    }//GEN-LAST:event_btnGuardarPacienteActionPerformed

    private void guardarPaciete() {
        if (validacionPaciente.datosValidados(nombrePaciente, apellidoPaciente, cedulaPaciente, edadPaciente, telefonoPaciente, DEPaciente, generoPaciente)) {
            if (paciente.nuevo(nombrePaciente.getText().trim(),
                    apellidoPaciente.getText().trim(),
                    cedulaPaciente.getText().trim(),
                    telefonoPaciente.getText().trim(),
                    DEPaciente.getText().trim(),
                    generoPaciente.getSelectedItem().toString(),
                    Integer.parseInt(edadPaciente.getText().trim()),
                    descripcionPaciente.getText().trim())) {
                validacionPaciente.mensaje(mensajeGuardado, "Paciente guardado");
                limpiarInput();
                this.repaint();
            }
        }
        this.repaint();
    }

    private void editarPaciente() {
        if (validacionPaciente.datosValidados(nombrePaciente, apellidoPaciente, cedulaPaciente, edadPaciente, telefonoPaciente, DEPaciente, generoPaciente)) {
            if (paciente.editarPaciente(id,
                    nombrePaciente.getText().trim(),
                    apellidoPaciente.getText().trim(),
                    cedulaPaciente.getText().trim(),
                    telefonoPaciente.getText().trim(),
                    DEPaciente.getText().trim(),
                    generoPaciente.getSelectedItem().toString(),
                    Integer.parseInt(edadPaciente.getText().trim()),
                    descripcionPaciente.getText().trim())) {
                validacionPaciente.mensaje(mensajeGuardado, "Editado con exito");
                limpiarInput();
                this.repaint();
            }

        }
    }
    
    private void limpiarInput() {
        nombrePaciente.setText("");
        apellidoPaciente.setText("");
        cedulaPaciente.setText("");
        telefonoPaciente.setText("");
        edadPaciente.setText("");
        DEPaciente.setText("");
        descripcionPaciente.setText("");
        generoPaciente.setSelectedIndex(-1);
    }

    private void seleccionVentana(String ventana) {
        if (ventana.equals("Nuevo")) {
            tituloPrincipal.setText("Nuevo Paciente");

        } else {
            tituloPrincipal.setText("Editar Paciente");
            this.datosPaciente = paciente.buscar(ventana);
            this.id = datosPaciente[0];
            nombrePaciente.setText(datosPaciente[1]);
            apellidoPaciente.setText(datosPaciente[2]);
            edadPaciente.setText(datosPaciente[3]);
            telefonoPaciente.setText(datosPaciente[5]);
            cedulaPaciente.setText(datosPaciente[6]);
            DEPaciente.setText(datosPaciente[7]);
            System.out.println(datosPaciente[4]);
            if (datosPaciente[4].equals("Masculino")) {
                generoPaciente.setSelectedIndex(0);
            } else {
                generoPaciente.setSelectedIndex(1);

            }
            descripcionPaciente.setText(datosPaciente[8]);

        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private components.TextField DEPaciente;
    private components.TextField apellidoPaciente;
    private components.ButtonCustom btnGuardarPaciente;
    private components.ButtonCustom btnRegresar;
    private components.TextField cedulaPaciente;
    private components.TextArea descripcionPaciente;
    private components.TextField edadPaciente;
    private components.Combobox generoPaciente;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel mensajeGuardado;
    private components.TextField nombrePaciente;
    private components.PanelRound panelRound1;
    private components.TextField telefonoPaciente;
    private components.TextAreaScroll textAreaScroll2;
    private javax.swing.JLabel tittuloSecundario;
    private javax.swing.JLabel tituloPrincipal;
    // End of variables declaration//GEN-END:variables
}
