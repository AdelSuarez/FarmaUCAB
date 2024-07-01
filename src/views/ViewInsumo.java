package views;

import controller.ControllerInsumo;

public class ViewInsumo extends javax.swing.JPanel {

    public ControllerInsumo controller;

    public ViewInsumo(views.Dashboard dashboard) {
        initComponents();
        this.setSize(1180, 720);

        this.controller = new ControllerInsumo(dashboard, this);
        this.controller.cargarTabla();
        this.repaint();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaInsumos = new javax.swing.JTable();
        inputBuscarInsumo = new components.TextField();
        btnNuevoInsumo = new components.ButtonCustom();
        btnBorrarInsumo = new components.ButtonCustom();
        btnEditarInsumo = new components.ButtonCustom();
        btnBuscarInsumo = new components.ButtonCustom();
        mensajeSeleccion = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1350, 920));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Medicamentos");

        tablaInsumos.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tablaInsumos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tablaInsumos.setFocusable(false);
        tablaInsumos.setGridColor(new java.awt.Color(153, 153, 153));
        tablaInsumos.setOpaque(false);
        tablaInsumos.setRowHeight(26);
        tablaInsumos.setShowGrid(true);
        tablaInsumos.setShowVerticalLines(false);
        tablaInsumos.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(tablaInsumos);

        inputBuscarInsumo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        inputBuscarInsumo.setLabelText("Buscar ( por ID )");

        btnNuevoInsumo.setBackground(new java.awt.Color(0, 105, 255));
        btnNuevoInsumo.setForeground(new java.awt.Color(255, 255, 255));
        btnNuevoInsumo.setText("Nuevo Insumo");
        btnNuevoInsumo.setBorderColor(new java.awt.Color(255, 255, 255));
        btnNuevoInsumo.setColor(new java.awt.Color(0, 105, 255));
        btnNuevoInsumo.setColorClick(new java.awt.Color(0, 95, 230));
        btnNuevoInsumo.setColorOver(new java.awt.Color(0, 84, 204));
        btnNuevoInsumo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnNuevoInsumo.setPreferredSize(new java.awt.Dimension(230, 50));
        btnNuevoInsumo.setRadius(15);

        btnBorrarInsumo.setForeground(new java.awt.Color(255, 255, 255));
        btnBorrarInsumo.setText("Borrar");
        btnBorrarInsumo.setBorderColor(new java.awt.Color(255, 255, 255));
        btnBorrarInsumo.setColor(new java.awt.Color(231, 76, 60));
        btnBorrarInsumo.setColorClick(new java.awt.Color(208, 68, 54));
        btnBorrarInsumo.setColorOver(new java.awt.Color(185, 61, 48));
        btnBorrarInsumo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnBorrarInsumo.setPreferredSize(new java.awt.Dimension(230, 50));
        btnBorrarInsumo.setRadius(15);

        btnEditarInsumo.setForeground(new java.awt.Color(255, 255, 255));
        btnEditarInsumo.setText("Editar");
        btnEditarInsumo.setBorderColor(new java.awt.Color(255, 255, 255));
        btnEditarInsumo.setColor(new java.awt.Color(244, 208, 63));
        btnEditarInsumo.setColorClick(new java.awt.Color(220, 187, 57));
        btnEditarInsumo.setColorOver(new java.awt.Color(195, 166, 50));
        btnEditarInsumo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnEditarInsumo.setHideActionText(true);
        btnEditarInsumo.setPreferredSize(new java.awt.Dimension(230, 50));
        btnEditarInsumo.setRadius(15);

        btnBuscarInsumo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/search_black.png"))); // NOI18N
        btnBuscarInsumo.setBorderColor(new java.awt.Color(255, 255, 255));
        btnBuscarInsumo.setColorClick(new java.awt.Color(230, 230, 230));
        btnBuscarInsumo.setColorOver(new java.awt.Color(240, 240, 240));
        btnBuscarInsumo.setPreferredSize(new java.awt.Dimension(30, 30));
        btnBuscarInsumo.setRadius(15);

        mensajeSeleccion.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        mensajeSeleccion.setForeground(new java.awt.Color(225, 0, 0));
        mensajeSeleccion.setText("Seleccione un insumo");

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
                        .addComponent(btnBorrarInsumo, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnEditarInsumo, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(inputBuscarInsumo, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnBuscarInsumo, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(195, 195, 195)
                            .addComponent(btnNuevoInsumo, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1073, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(345, 345, 345))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnNuevoInsumo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(inputBuscarInsumo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addComponent(btnBuscarInsumo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 507, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnBorrarInsumo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEditarInsumo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(mensajeSeleccion, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1180, -1));
    }// </editor-fold>//GEN-END:initComponents
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public components.ButtonCustom btnBorrarInsumo;
    public components.ButtonCustom btnBuscarInsumo;
    public components.ButtonCustom btnEditarInsumo;
    public components.ButtonCustom btnNuevoInsumo;
    public components.TextField inputBuscarInsumo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    public javax.swing.JLabel mensajeSeleccion;
    public javax.swing.JTable tablaInsumos;
    // End of variables declaration//GEN-END:variables
}
