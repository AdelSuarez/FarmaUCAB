package views;

import java.awt.BorderLayout;
import javax.swing.JPanel;
import controller.ControllerDashBoard;

public class Dashboard extends javax.swing.JPanel {

    private ViewPaciente viewPaciente = new ViewPaciente(this);
    private ViewConsulta viewConsulta = new ViewConsulta(this);
    private ViewInsumo viewInsumo = new ViewInsumo(this);
    private ViewEmpleado viewEmpleado = new ViewEmpleado(this);
    private ControllerDashBoard controller;

    public Dashboard(main.Main main, boolean admin, String[] datosUsuario) {
        initComponents();
        this.setSize(1400, 800);
        this.setLocation(0, 0);
        
        this.controller = new ControllerDashBoard(main, this, admin, datosUsuario);
        this.controller.horaTurno();
        this.repaint();
        
    }
    
    public void initView(JPanel view) {
        Content.removeAll();
        Content.add(view, BorderLayout.CENTER);
        Content.revalidate();
        Content.repaint();
    }

    public ViewPaciente getViewPaciente() {
        return viewPaciente;
    }

    public ViewEmpleado getViewEmpleado() {
        return viewEmpleado;
    }
    
    public ViewInsumo getViewInsumo(){
        return viewInsumo;
    }
    
    public ViewConsulta getViewConsulta(){
        return viewConsulta;
    }
    
    public void refrescarViewConsulta(){
        this.viewConsulta= new ViewConsulta(this);
    }
    
    public void refrescarViewInsumo(){
        this.viewInsumo= new ViewInsumo(this);
    }
    
    public void refrescarViewPacientes(){
        this.viewPaciente= new ViewPaciente(this);
    }
    
    public void refrescarViewEmpleado(){
        this.viewEmpleado= new ViewEmpleado(this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        panelOpciones = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btnPaciente = new components.ButtonCustom();
        btnInsumo = new components.ButtonCustom();
        jSeparator1 = new javax.swing.JSeparator();
        btnConsulta = new components.ButtonCustom();
        btnEmpleado = new components.ButtonCustom();
        jLabel1 = new javax.swing.JLabel();
        tag = new components.PanelRound();
        estatus = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        NombreEmpleado = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        btnControl = new components.ButtonCustom();
        btnEstadistica = new components.ButtonCustom();
        jPanel3 = new javax.swing.JPanel();
        btnCerrarSesion = new components.ButtonCustom();
        containerTurno = new components.PanelRound();
        titleTurno = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        wifiActivo = new javax.swing.JLabel();
        Content = new javax.swing.JPanel();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setToolTipText("");
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelOpciones.setBackground(new java.awt.Color(250, 250, 250));
        panelOpciones.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(169, 169, 169)));
        panelOpciones.setPreferredSize(new java.awt.Dimension(220, 800));
        panelOpciones.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 28)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 255));
        jLabel2.setText("Enfermeria");
        panelOpciones.add(jLabel2);
        jLabel2.setBounds(80, 20, 156, 40);

        btnPaciente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/groups_person_black.png"))); // NOI18N
        btnPaciente.setText("Pacientes");
        btnPaciente.setBorderColor(new java.awt.Color(250, 250, 250));
        btnPaciente.setColor(new java.awt.Color(250, 250, 250));
        btnPaciente.setColorClick(new java.awt.Color(230, 230, 230));
        btnPaciente.setColorOver(new java.awt.Color(215, 215, 215));
        btnPaciente.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnPaciente.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnPaciente.setPreferredSize(new java.awt.Dimension(230, 50));
        btnPaciente.setRadius(15);
        panelOpciones.add(btnPaciente);
        btnPaciente.setBounds(13, 236, 230, 50);

        btnInsumo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/vaccines_black.png"))); // NOI18N
        btnInsumo.setText("Medicamentos");
        btnInsumo.setBorderColor(new java.awt.Color(250, 250, 250));
        btnInsumo.setColor(new java.awt.Color(250, 250, 250));
        btnInsumo.setColorClick(new java.awt.Color(230, 230, 230));
        btnInsumo.setColorOver(new java.awt.Color(215, 215, 215));
        btnInsumo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnInsumo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnInsumo.setPreferredSize(new java.awt.Dimension(230, 50));
        btnInsumo.setRadius(15);
        panelOpciones.add(btnInsumo);
        btnInsumo.setBounds(13, 180, 230, 50);
        panelOpciones.add(jSeparator1);
        jSeparator1.setBounds(1, 78, 248, 10);

        btnConsulta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/assignment_black.png"))); // NOI18N
        btnConsulta.setText("Cosultas");
        btnConsulta.setBorderColor(new java.awt.Color(250, 250, 250));
        btnConsulta.setColor(new java.awt.Color(250, 250, 250));
        btnConsulta.setColorClick(new java.awt.Color(230, 230, 230));
        btnConsulta.setColorOver(new java.awt.Color(215, 215, 215));
        btnConsulta.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnConsulta.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnConsulta.setPreferredSize(new java.awt.Dimension(230, 50));
        btnConsulta.setRadius(15);
        panelOpciones.add(btnConsulta);
        btnConsulta.setBounds(13, 124, 230, 50);

        btnEmpleado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/badge_black.png"))); // NOI18N
        btnEmpleado.setText("Empleados");
        btnEmpleado.setBorderColor(new java.awt.Color(250, 250, 250));
        btnEmpleado.setColor(new java.awt.Color(250, 250, 250));
        btnEmpleado.setColorClick(new java.awt.Color(230, 230, 230));
        btnEmpleado.setColorOver(new java.awt.Color(215, 215, 215));
        btnEmpleado.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnEmpleado.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnEmpleado.setPreferredSize(new java.awt.Dimension(230, 50));
        btnEmpleado.setRadius(15);
        btnEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmpleadoActionPerformed(evt);
            }
        });
        panelOpciones.add(btnEmpleado);
        btnEmpleado.setBounds(13, 348, 230, 50);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ecg_heart.png"))); // NOI18N
        panelOpciones.add(jLabel1);
        jLabel1.setBounds(10, 10, 64, 64);

        tag.setBackground(new java.awt.Color(46, 204, 113));
        tag.setPreferredSize(new java.awt.Dimension(64, 30));
        tag.setRoundBottomLeft(15);
        tag.setRoundBottomRight(15);
        tag.setRoundTopLeft(15);
        tag.setRoundTopRight(15);

        estatus.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        estatus.setForeground(new java.awt.Color(255, 255, 255));
        estatus.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        estatus.setText("Admin");

        javax.swing.GroupLayout tagLayout = new javax.swing.GroupLayout(tag);
        tag.setLayout(tagLayout);
        tagLayout.setHorizontalGroup(
            tagLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tagLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(estatus, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
                .addContainerGap())
        );
        tagLayout.setVerticalGroup(
            tagLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tagLayout.createSequentialGroup()
                .addContainerGap(7, Short.MAX_VALUE)
                .addComponent(estatus)
                .addContainerGap())
        );

        panelOpciones.add(tag);
        tag.setBounds(178, 717, 64, 30);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/account_circle_black.png"))); // NOI18N
        panelOpciones.add(jLabel5);
        jLabel5.setBounds(13, 715, 32, 32);

        NombreEmpleado.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        NombreEmpleado.setText("Usuario");
        panelOpciones.add(NombreEmpleado);
        NombreEmpleado.setBounds(51, 717, 121, 30);
        panelOpciones.add(jSeparator2);
        jSeparator2.setBounds(1, 699, 248, 10);

        btnControl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/data_table_black.png"))); // NOI18N
        btnControl.setText("Control");
        btnControl.setBorderColor(new java.awt.Color(250, 250, 250));
        btnControl.setColor(new java.awt.Color(250, 250, 250));
        btnControl.setColorClick(new java.awt.Color(230, 230, 230));
        btnControl.setColorOver(new java.awt.Color(215, 215, 215));
        btnControl.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnControl.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnControl.setPreferredSize(new java.awt.Dimension(230, 50));
        btnControl.setRadius(15);
        panelOpciones.add(btnControl);
        btnControl.setBounds(13, 404, 230, 50);

        btnEstadistica.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/bar_chart_black.png"))); // NOI18N
        btnEstadistica.setText("Estadisticas");
        btnEstadistica.setBorderColor(new java.awt.Color(250, 250, 250));
        btnEstadistica.setColor(new java.awt.Color(250, 250, 250));
        btnEstadistica.setColorClick(new java.awt.Color(230, 230, 230));
        btnEstadistica.setColorOver(new java.awt.Color(215, 215, 215));
        btnEstadistica.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnEstadistica.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnEstadistica.setPreferredSize(new java.awt.Dimension(230, 50));
        btnEstadistica.setRadius(15);
        panelOpciones.add(btnEstadistica);
        btnEstadistica.setBounds(13, 292, 230, 50);

        jPanel1.add(panelOpciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 250, -1));

        jPanel3.setBackground(new java.awt.Color(250, 250, 250));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(169, 169, 169)));
        jPanel3.setForeground(new java.awt.Color(250, 250, 250));
        jPanel3.setPreferredSize(new java.awt.Dimension(1180, 80));

        btnCerrarSesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/logout_black.png"))); // NOI18N
        btnCerrarSesion.setBorderColor(new java.awt.Color(250, 250, 250));
        btnCerrarSesion.setColor(new java.awt.Color(250, 250, 250));
        btnCerrarSesion.setColorClick(new java.awt.Color(230, 230, 230));
        btnCerrarSesion.setColorOver(new java.awt.Color(240, 240, 240));
        btnCerrarSesion.setPreferredSize(new java.awt.Dimension(40, 40));
        btnCerrarSesion.setRadius(15);

        containerTurno.setBackground(new java.awt.Color(102, 102, 255));
        containerTurno.setPreferredSize(new java.awt.Dimension(64, 30));
        containerTurno.setRoundBottomLeft(15);
        containerTurno.setRoundBottomRight(15);
        containerTurno.setRoundTopLeft(15);
        containerTurno.setRoundTopRight(15);

        titleTurno.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        titleTurno.setForeground(new java.awt.Color(255, 255, 255));
        titleTurno.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleTurno.setText("Mañana");

        javax.swing.GroupLayout containerTurnoLayout = new javax.swing.GroupLayout(containerTurno);
        containerTurno.setLayout(containerTurnoLayout);
        containerTurnoLayout.setHorizontalGroup(
            containerTurnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(containerTurnoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titleTurno, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE)
                .addContainerGap())
        );
        containerTurnoLayout.setVerticalGroup(
            containerTurnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, containerTurnoLayout.createSequentialGroup()
                .addContainerGap(7, Short.MAX_VALUE)
                .addComponent(titleTurno)
                .addContainerGap())
        );

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(214, 214, 214));
        jLabel4.setText("Turno:");

        wifiActivo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        wifiActivo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/signal_wifi.png"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(containerTurno, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(jLabel4)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 861, Short.MAX_VALUE)
                .addComponent(wifiActivo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCerrarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(wifiActivo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCerrarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(containerTurno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 0, 1170, 80));

        Content.setPreferredSize(new java.awt.Dimension(1180, 720));
        Content.setRequestFocusEnabled(false);

        javax.swing.GroupLayout ContentLayout = new javax.swing.GroupLayout(Content);
        Content.setLayout(ContentLayout);
        ContentLayout.setHorizontalGroup(
            ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1150, Short.MAX_VALUE)
        );
        ContentLayout.setVerticalGroup(
            ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 720, Short.MAX_VALUE)
        );

        jPanel1.add(Content, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 80, 1150, 720));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmpleadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEmpleadoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JPanel Content;
    public javax.swing.JLabel NombreEmpleado;
    public components.ButtonCustom btnCerrarSesion;
    public components.ButtonCustom btnConsulta;
    public components.ButtonCustom btnControl;
    public components.ButtonCustom btnEmpleado;
    public components.ButtonCustom btnEstadistica;
    public components.ButtonCustom btnInsumo;
    public components.ButtonCustom btnPaciente;
    public components.PanelRound containerTurno;
    public javax.swing.JLabel estatus;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    public javax.swing.JPanel panelOpciones;
    public components.PanelRound tag;
    public javax.swing.JLabel titleTurno;
    public javax.swing.JLabel wifiActivo;
    // End of variables declaration//GEN-END:variables
}
