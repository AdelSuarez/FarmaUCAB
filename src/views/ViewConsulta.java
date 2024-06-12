package views;

import controller.ControllerConsulta;



public class ViewConsulta extends javax.swing.JPanel {
    private views.Dashboard dashboard;
    private views.viewsGestion.GestionConsulta viewConsulta;
    private ControllerConsulta controller;
    private String dato;

    public ViewConsulta (views.Dashboard dashboard, views.viewsGestion.GestionConsulta viewConsulta) {
        this.dashboard = dashboard;
        initComponents();
        this.setSize(1180, 720);

        this.mensajeDeGuardado.setVisible(false);
        this.controller = new ControllerConsulta(dashboard, viewConsulta, this, dato);
        this.repaint();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btnMostrarConsulta = new components.ButtonCustom();
        panelRound1 = new components.PanelRound();
        jLabel3 = new javax.swing.JLabel();
        CIPaciente = new components.TextField();
        doctoraCargo = new components.TextField();
        btnGuardarConsulta = new components.ButtonCustom();
        fechaActual = new components.TextField();
        insumosDelPaciente = new components.Combobox();
        btnAñadir = new components.ButtonCustom();
        btnQuitar = new components.ButtonCustom();
        CantidadInsumo = new components.TextField();
        mensajeDeGuardado = new javax.swing.JLabel();
        ListaDeInsumos = new javax.swing.JList<>();

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setPreferredSize(new java.awt.Dimension(1350, 920));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("Consulta");

        btnMostrarConsulta.setForeground(new java.awt.Color(255, 255, 255));
        btnMostrarConsulta.setText("Ver Consultas");
        btnMostrarConsulta.setBorderColor(new java.awt.Color(255, 255, 255));
        btnMostrarConsulta.setColor(new java.awt.Color(40, 180, 99));
        btnMostrarConsulta.setColorClick(new java.awt.Color(36, 162, 89));
        btnMostrarConsulta.setColorOver(new java.awt.Color(32, 144, 79));
        btnMostrarConsulta.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnMostrarConsulta.setPreferredSize(new java.awt.Dimension(230, 50));
        btnMostrarConsulta.setRadius(15);

        panelRound1.setBackground(new java.awt.Color(240, 240, 240));
        panelRound1.setPreferredSize(new java.awt.Dimension(825, 486));
        panelRound1.setRoundBottomLeft(15);
        panelRound1.setRoundBottomRight(15);
        panelRound1.setRoundTopLeft(15);
        panelRound1.setRoundTopRight(15);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("Datos de la Consulta");

        CIPaciente.setBackground(new java.awt.Color(240, 240, 240));
        CIPaciente.setForeground(new java.awt.Color(80, 80, 80));
        CIPaciente.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        CIPaciente.setLabelText("Cédula del paciente");

        doctoraCargo.setBackground(new java.awt.Color(240, 240, 240));
        doctoraCargo.setForeground(new java.awt.Color(80, 80, 80));
        doctoraCargo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        doctoraCargo.setLabelText("Doctor / Enfermera");

        btnGuardarConsulta.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardarConsulta.setBorderColor(new java.awt.Color(240, 240, 240));
        btnGuardarConsulta.setColor(new java.awt.Color(0, 105, 255));
        btnGuardarConsulta.setColorClick(new java.awt.Color(0, 95, 230));
        btnGuardarConsulta.setColorOver(new java.awt.Color(0, 84, 204));
        btnGuardarConsulta.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnGuardarConsulta.setLabel("Guardar");
        btnGuardarConsulta.setPreferredSize(new java.awt.Dimension(86, 40));
        btnGuardarConsulta.setRadius(15);

        fechaActual.setEditable(false);
        fechaActual.setBackground(new java.awt.Color(240, 240, 240));
        fechaActual.setForeground(new java.awt.Color(80, 80, 80));
        fechaActual.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        fechaActual.setLabelText("Fecha Actual");

        insumosDelPaciente.setBackground(new java.awt.Color(240, 240, 240));
        insumosDelPaciente.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        insumosDelPaciente.setLabeText("Insumos");

        btnAñadir.setForeground(new java.awt.Color(255, 255, 255));
        btnAñadir.setText("Añadir Insumo");
        btnAñadir.setBorderColor(new java.awt.Color(240, 240, 240));
        btnAñadir.setColor(new java.awt.Color(244, 208, 63));
        btnAñadir.setColorClick(new java.awt.Color(220, 187, 57));
        btnAñadir.setColorOver(new java.awt.Color(195, 166, 50));
        btnAñadir.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnAñadir.setHideActionText(true);
        btnAñadir.setPreferredSize(new java.awt.Dimension(230, 50));
        btnAñadir.setRadius(15);

        btnQuitar.setForeground(new java.awt.Color(255, 255, 255));
        btnQuitar.setText("Quitar Insumo");
        btnQuitar.setBorderColor(new java.awt.Color(240, 240, 240));
        btnQuitar.setColor(new java.awt.Color(244, 208, 63));
        btnQuitar.setColorClick(new java.awt.Color(220, 187, 57));
        btnQuitar.setColorOver(new java.awt.Color(195, 166, 50));
        btnQuitar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnQuitar.setHideActionText(true);
        btnQuitar.setPreferredSize(new java.awt.Dimension(230, 50));
        btnQuitar.setRadius(15);

        CantidadInsumo.setBackground(new java.awt.Color(240, 240, 240));
        CantidadInsumo.setForeground(new java.awt.Color(80, 80, 80));
        CantidadInsumo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        CantidadInsumo.setLabelText("Cantidad");

        mensajeDeGuardado.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        mensajeDeGuardado.setForeground(new java.awt.Color(40, 180, 99));
        mensajeDeGuardado.setText("Insumo guardado");

        ListaDeInsumos.setBackground(new java.awt.Color(216, 216, 216));
        ListaDeInsumos.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        javax.swing.GroupLayout panelRound1Layout = new javax.swing.GroupLayout(panelRound1);
        panelRound1.setLayout(panelRound1Layout);
        panelRound1Layout.setHorizontalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound1Layout.createSequentialGroup()
                .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound1Layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(mensajeDeGuardado, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnGuardarConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound1Layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CIPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(doctoraCargo, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fechaActual, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(139, 139, 139)
                        .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ListaDeInsumos, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelRound1Layout.createSequentialGroup()
                                .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(CantidadInsumo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(insumosDelPaciente, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE))
                                .addGap(31, 31, 31)
                                .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnAñadir, javax.swing.GroupLayout.DEFAULT_SIZE, 163, Short.MAX_VALUE)
                                    .addComponent(btnQuitar, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))))))
                .addGap(88, 88, 88))
        );
        panelRound1Layout.setVerticalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound1Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRound1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(CIPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(doctoraCargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(ListaDeInsumos, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAñadir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(insumosDelPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRound1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CantidadInsumo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fechaActual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btnQuitar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardarConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mensajeDeGuardado))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelRound1, javax.swing.GroupLayout.DEFAULT_SIZE, 1072, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(780, 780, 780)
                        .addComponent(btnMostrarConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(245, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnMostrarConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addComponent(panelRound1, javax.swing.GroupLayout.PREFERRED_SIZE, 552, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(293, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 1356, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 926, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public components.TextField CIPaciente;
    public components.TextField CantidadInsumo;
    public javax.swing.JList<String> ListaDeInsumos;
    public components.ButtonCustom btnAñadir;
    public components.ButtonCustom btnGuardarConsulta;
    public components.ButtonCustom btnMostrarConsulta;
    public components.ButtonCustom btnQuitar;
    public components.TextField doctoraCargo;
    public components.TextField fechaActual;
    public components.Combobox insumosDelPaciente;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel3;
    public javax.swing.JLabel mensajeDeGuardado;
    private components.PanelRound panelRound1;
    // End of variables declaration//GEN-END:variables
}
