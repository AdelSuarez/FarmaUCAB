package views.viewsGestion;

import controller.ControllerGestionInsumo;

public class GestionInsumo extends javax.swing.JPanel {

    private views.Dashboard dashboard;
    private views.ViewInsumo viewInsumo;
    private model.dataBase.InsumoDB insumo = new model.dataBase.InsumoDB();
    private ControllerGestionInsumo controller;
    private String dato;
    private validaciones.ValidacionInsumo validacionesInsumo = new validaciones.ValidacionInsumo();

    public GestionInsumo(views.Dashboard dashboard, views.ViewInsumo viewInsumo, String dato) {
        this.dashboard = dashboard;
        this.viewInsumo = viewInsumo;
        this.dato = dato;
        initComponents();

        this.setSize(1180, 720);
        this.mensajeGuardado.setVisible(false);
        this.controller = new ControllerGestionInsumo(dashboard, viewInsumo, this, dato);
        this.repaint();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnRegresar = new components.ButtonCustom();
        panelRound1 = new components.PanelRound();
        tittuloSecundario = new javax.swing.JLabel();
        btnGuardarInsumo = new components.ButtonCustom();
        mensajeGuardado = new javax.swing.JLabel();
        nombreInsumo = new components.TextField();
        StockInsumo = new components.Spinner();
        textAreaScroll2 = new components.TextAreaScroll();
        descripcionInsumo = new components.TextArea();
        Fecha = new javax.swing.JLabel();
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
        jPanel1.add(btnRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 50, -1));

        panelRound1.setBackground(new java.awt.Color(240, 240, 240));
        panelRound1.setRoundBottomLeft(15);
        panelRound1.setRoundBottomRight(15);
        panelRound1.setRoundTopLeft(15);
        panelRound1.setRoundTopRight(15);

        tittuloSecundario.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        tittuloSecundario.setText("Datos del Insumo");

        btnGuardarInsumo.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardarInsumo.setBorderColor(new java.awt.Color(240, 240, 240));
        btnGuardarInsumo.setColor(new java.awt.Color(0, 105, 255));
        btnGuardarInsumo.setColorClick(new java.awt.Color(0, 95, 230));
        btnGuardarInsumo.setColorOver(new java.awt.Color(0, 84, 204));
        btnGuardarInsumo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnGuardarInsumo.setLabel("Guardar");
        btnGuardarInsumo.setPreferredSize(new java.awt.Dimension(86, 40));
        btnGuardarInsumo.setRadius(15);
        btnGuardarInsumo.setRolloverEnabled(true);

        mensajeGuardado.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        mensajeGuardado.setForeground(new java.awt.Color(40, 180, 99));
        mensajeGuardado.setText("Insumo guardado");

        nombreInsumo.setBackground(new java.awt.Color(240, 240, 240));
        nombreInsumo.setForeground(new java.awt.Color(80, 80, 80));
        nombreInsumo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        nombreInsumo.setLabelText("Nombre");

        StockInsumo.setBackground(new java.awt.Color(240, 240, 240));
        StockInsumo.setForeground(new java.awt.Color(80, 80, 80));
        StockInsumo.setToolTipText("");
        StockInsumo.setFocusable(false);
        StockInsumo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        StockInsumo.setLabelText("Stock");

        textAreaScroll2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        textAreaScroll2.setLabelText("Descripcion");

        descripcionInsumo.setBackground(new java.awt.Color(235, 235, 235));
        descripcionInsumo.setColumns(20);
        descripcionInsumo.setForeground(new java.awt.Color(80, 80, 80));
        descripcionInsumo.setRows(5);
        descripcionInsumo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        textAreaScroll2.setViewportView(descripcionInsumo);

        Fecha.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        javax.swing.GroupLayout panelRound1Layout = new javax.swing.GroupLayout(panelRound1);
        panelRound1.setLayout(panelRound1Layout);
        panelRound1Layout.setHorizontalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound1Layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(panelRound1Layout.createSequentialGroup()
                        .addComponent(tittuloSecundario)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Fecha))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelRound1Layout.createSequentialGroup()
                        .addComponent(mensajeGuardado)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnGuardarInsumo, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(textAreaScroll2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(StockInsumo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nombreInsumo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 65, Short.MAX_VALUE))
        );
        panelRound1Layout.setVerticalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tittuloSecundario)
                    .addComponent(Fecha))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(nombreInsumo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(StockInsumo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(textAreaScroll2, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnGuardarInsumo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mensajeGuardado))
                .addContainerGap(55, Short.MAX_VALUE))
        );

        jPanel1.add(panelRound1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 70, 500, 560));

        tituloPrincipal.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        tituloPrincipal.setText("Nuevo Insumo");
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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel Fecha;
    public components.Spinner StockInsumo;
    public components.ButtonCustom btnGuardarInsumo;
    public components.ButtonCustom btnRegresar;
    public components.TextArea descripcionInsumo;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JLabel mensajeGuardado;
    public components.TextField nombreInsumo;
    private components.PanelRound panelRound1;
    private components.TextAreaScroll textAreaScroll2;
    private javax.swing.JLabel tittuloSecundario;
    public javax.swing.JLabel tituloPrincipal;
    // End of variables declaration//GEN-END:variables
}
