package views.viewsGestion;

import controller.ControllerGestionConsulta;

public class GestionConsulta extends javax.swing.JPanel {
    
    private views.Dashboard dashboard;
    private views.ViewConsulta viewConsulta;
    private ControllerGestionConsulta controller;
    private String dato;
    
    public GestionConsulta(views.Dashboard dashboard, views.ViewConsulta viewConsulta) {
        this.dashboard = dashboard;
        this.viewConsulta = viewConsulta;
        initComponents();
        this.setSize(1180,720);
        
        this.mensajeDeGuardado.setVisible(false);
        this.controller = new ControllerGestionConsulta(dashboard, viewConsulta, this, dato);
        this.repaint();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        panelRound1 = new components.PanelRound();
        CIPaciente = new components.TextField();
        jLabel2 = new javax.swing.JLabel();
        doctoraCargo = new components.TextField();
        btnGuardarConsulta = new components.ButtonCustom();
        fechaActual = new components.TextField();
        insumosDelPaciente = new components.Combobox();
        botonAñadir = new components.ButtonCustom();
        botonQuitar = new components.ButtonCustom();
        jScrollPane1 = new javax.swing.JScrollPane();
        ListaDeInsumos = new javax.swing.JList<>();
        Cantidad = new components.TextField();
        mensajeDeGuardado = new javax.swing.JLabel();
        titulo = new javax.swing.JLabel();
        botonMostrarConsulta = new components.ButtonCustom();

        setLayout(new java.awt.BorderLayout());

        jPanel1.setLayout(new java.awt.BorderLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(960, 627));

        panelRound1.setBackground(new java.awt.Color(240, 240, 240));
        panelRound1.setPreferredSize(new java.awt.Dimension(825, 486));
        panelRound1.setRoundBottomLeft(15);
        panelRound1.setRoundBottomRight(15);
        panelRound1.setRoundTopLeft(15);
        panelRound1.setRoundTopRight(15);

        CIPaciente.setBackground(new java.awt.Color(240, 240, 240));
        CIPaciente.setForeground(new java.awt.Color(80, 80, 80));
        CIPaciente.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        CIPaciente.setLabelText("Cédula del paciente");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Datos de la Consulta");

        doctoraCargo.setBackground(new java.awt.Color(240, 240, 240));
        doctoraCargo.setForeground(new java.awt.Color(80, 80, 80));
        doctoraCargo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        doctoraCargo.setLabelText("Doctor a Cargo");

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

        botonAñadir.setForeground(new java.awt.Color(255, 255, 255));
        botonAñadir.setText("Añadir Insumo");
        botonAñadir.setBorderColor(new java.awt.Color(240, 240, 240));
        botonAñadir.setColor(new java.awt.Color(244, 208, 63));
        botonAñadir.setColorClick(new java.awt.Color(220, 187, 57));
        botonAñadir.setColorOver(new java.awt.Color(195, 166, 50));
        botonAñadir.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        botonAñadir.setHideActionText(true);
        botonAñadir.setPreferredSize(new java.awt.Dimension(230, 50));
        botonAñadir.setRadius(15);

        botonQuitar.setForeground(new java.awt.Color(255, 255, 255));
        botonQuitar.setText("Quitar Insumo");
        botonQuitar.setBorderColor(new java.awt.Color(240, 240, 240));
        botonQuitar.setColor(new java.awt.Color(244, 208, 63));
        botonQuitar.setColorClick(new java.awt.Color(220, 187, 57));
        botonQuitar.setColorOver(new java.awt.Color(195, 166, 50));
        botonQuitar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        botonQuitar.setHideActionText(true);
        botonQuitar.setPreferredSize(new java.awt.Dimension(230, 50));
        botonQuitar.setRadius(15);

        jScrollPane1.setViewportView(ListaDeInsumos);

        Cantidad.setBackground(new java.awt.Color(240, 240, 240));
        Cantidad.setForeground(new java.awt.Color(80, 80, 80));
        Cantidad.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Cantidad.setLabelText("Cantidad");

        mensajeDeGuardado.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        mensajeDeGuardado.setForeground(new java.awt.Color(40, 180, 99));
        mensajeDeGuardado.setText("Insumo guardado");

        javax.swing.GroupLayout panelRound1Layout = new javax.swing.GroupLayout(panelRound1);
        panelRound1.setLayout(panelRound1Layout);
        panelRound1Layout.setHorizontalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound1Layout.createSequentialGroup()
                .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelRound1Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnGuardarConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(doctoraCargo, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(CIPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(fechaActual, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(mensajeDeGuardado, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(52, 52, 52)
                        .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelRound1Layout.createSequentialGroup()
                                .addComponent(insumosDelPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(panelRound1Layout.createSequentialGroup()
                                .addComponent(botonAñadir, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(botonQuitar, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1)))
                    .addGroup(panelRound1Layout.createSequentialGroup()
                        .addGap(304, 304, 304)
                        .addComponent(jLabel2)))
                .addGap(77, 77, 77))
        );
        panelRound1Layout.setVerticalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel2)
                .addGap(62, 62, 62)
                .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panelRound1Layout.createSequentialGroup()
                        .addComponent(CIPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(doctoraCargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1))
                .addGap(40, 40, 40)
                .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fechaActual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonAñadir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonQuitar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardarConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(insumosDelPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addComponent(mensajeDeGuardado)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        titulo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        titulo.setText("Nueva Consulta");

        botonMostrarConsulta.setForeground(new java.awt.Color(255, 255, 255));
        botonMostrarConsulta.setText("Mostrar Consultas");
        botonMostrarConsulta.setBorderColor(new java.awt.Color(255, 255, 255));
        botonMostrarConsulta.setColor(new java.awt.Color(244, 208, 63));
        botonMostrarConsulta.setColorClick(new java.awt.Color(220, 187, 57));
        botonMostrarConsulta.setColorOver(new java.awt.Color(195, 166, 50));
        botonMostrarConsulta.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        botonMostrarConsulta.setHideActionText(true);
        botonMostrarConsulta.setPreferredSize(new java.awt.Dimension(230, 50));
        botonMostrarConsulta.setRadius(15);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(panelRound1, javax.swing.GroupLayout.PREFERRED_SIZE, 901, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(titulo)
                        .addGap(250, 250, 250)
                        .addComponent(botonMostrarConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(titulo)
                    .addComponent(botonMostrarConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelRound1, javax.swing.GroupLayout.PREFERRED_SIZE, 547, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, java.awt.BorderLayout.CENTER);

        add(jPanel1, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents
   
 
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public components.TextField CIPaciente;
    public components.TextField Cantidad;
    public javax.swing.JList<String> ListaDeInsumos;
    public components.ButtonCustom botonAñadir;
    public components.ButtonCustom botonMostrarConsulta;
    public components.ButtonCustom botonQuitar;
    public components.ButtonCustom btnGuardarConsulta;
    public components.TextField doctoraCargo;
    public components.TextField fechaActual;
    public components.Combobox insumosDelPaciente;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JLabel mensajeDeGuardado;
    private components.PanelRound panelRound1;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}
