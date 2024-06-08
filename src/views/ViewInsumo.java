package views;

import views.viewsGestion.GestionInsumo;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import validaciones.ValidacionInsumo;

public class ViewInsumo extends javax.swing.JPanel {

    private GestionInsumo nuevoInsumo;
    private views.Dashboard dashboard;
    private database.Insumo insumo = new database.Insumo();
    private ValidacionInsumo validacionInsumo = new ValidacionInsumo();

    public ViewInsumo(views.Dashboard dashboard) {
        this.dashboard = dashboard;
        initComponents();
        this.setSize(1180, 720);
        mensajeSeleccion.setVisible(false);
        cargarTabla();
        this.repaint();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaInsumos = new javax.swing.JTable();
        inputSearchInsumo = new components.TextField();
        btnNuevoInsumo = new components.ButtonCustom();
        btnBorrarInsumo = new components.ButtonCustom();
        btnEditarInsumo = new components.ButtonCustom();
        btnBuscarPaciente = new components.ButtonCustom();
        mensajeSeleccion = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1350, 920));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Insumos");

        tablaInsumos.setBackground(new java.awt.Color(255, 255, 255));
        tablaInsumos.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tablaInsumos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tablaInsumos.setFocusable(false);
        tablaInsumos.setGridColor(new java.awt.Color(153, 153, 153));
        tablaInsumos.setIntercellSpacing(new java.awt.Dimension(0, 0));
        tablaInsumos.setOpaque(false);
        tablaInsumos.setRowHeight(26);
        tablaInsumos.setShowGrid(true);
        tablaInsumos.setShowVerticalLines(false);
        tablaInsumos.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(tablaInsumos);

        inputSearchInsumo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        inputSearchInsumo.setLabelText("Buscar");

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
        btnNuevoInsumo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoInsumoActionPerformed(evt);
            }
        });

        btnBorrarInsumo.setForeground(new java.awt.Color(255, 255, 255));
        btnBorrarInsumo.setText("Borrar");
        btnBorrarInsumo.setBorderColor(new java.awt.Color(255, 255, 255));
        btnBorrarInsumo.setColor(new java.awt.Color(231, 76, 60));
        btnBorrarInsumo.setColorClick(new java.awt.Color(208, 68, 54));
        btnBorrarInsumo.setColorOver(new java.awt.Color(185, 61, 48));
        btnBorrarInsumo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnBorrarInsumo.setPreferredSize(new java.awt.Dimension(230, 50));
        btnBorrarInsumo.setRadius(15);
        btnBorrarInsumo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarInsumoActionPerformed(evt);
            }
        });

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
        btnEditarInsumo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarInsumoActionPerformed(evt);
            }
        });

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
                            .addGap(18, 18, 18)
                            .addComponent(inputSearchInsumo, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnBuscarPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnNuevoInsumo, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                                .addComponent(btnNuevoInsumo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(inputSearchInsumo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1)))
                            .addComponent(btnBuscarPaciente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 507, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnBorrarInsumo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEditarInsumo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1180, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnNuevoInsumoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoInsumoActionPerformed
        this.nuevoInsumo = new GestionInsumo(dashboard, this, "Nuevo");
        dashboard.initView(nuevoInsumo);
        cargarTabla();
    }//GEN-LAST:event_btnNuevoInsumoActionPerformed

    private void btnBorrarInsumoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarInsumoActionPerformed
        int filaSeleccionada = tablaInsumos.getSelectedRow();
        mensajeSeleccion.setVisible(false);
        if (filaSeleccionada != -1) { // Verifica si se ha seleccionado una fila
            String id = tablaInsumos.getValueAt(filaSeleccionada, 0).toString();
            dialog.DialogEliminarInsumo dialog = new dialog.DialogEliminarInsumo(id, this);
            dialog.setVisible(true);
            this.repaint();
        } else {
            mensajeSeleccion.setVisible(true);
        }
        this.repaint();
    }//GEN-LAST:event_btnBorrarInsumoActionPerformed

    // fumada extrema que ni entiendo que hice alksdjklajdklajd
    private void btnBuscarPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarPacienteActionPerformed
        validacionInsumo.buscador(inputSearchInsumo,
                insumo.buscarInsumo(inputSearchInsumo.getText().trim()),
                tablaInsumos,
                1);
        this.repaint();
    }//GEN-LAST:event_btnBuscarPacienteActionPerformed

    private void btnEditarInsumoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarInsumoActionPerformed
        int filaSeleccionada = tablaInsumos.getSelectedRow();
        mensajeSeleccion.setVisible(false);
        if (filaSeleccionada != -1) { // Verifica si se ha seleccionado una fila
            String id = tablaInsumos.getValueAt(filaSeleccionada, 0).toString();
            this.nuevoInsumo = new GestionInsumo(dashboard, this, id);
            dashboard.initView(nuevoInsumo);
            this.repaint();
        } else {
            mensajeSeleccion.setVisible(true);
        }
        this.repaint();


    }//GEN-LAST:event_btnEditarInsumoActionPerformed

    public void cargarTabla() {
        if (!insumo.isEmptyTabla("Insumos")) {
            try {
                insumo.mostrarInsumos(tablaInsumos);
                configuracionesTabla();
            } catch (Exception e) {
            }
        }

    }

    private void configuracionesTabla() {
        // COnfiguraciones de la jtable
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(SwingConstants.CENTER);
        tablaInsumos.getColumnModel().getColumn(0).setPreferredWidth(100);
        tablaInsumos.getColumnModel().getColumn(0).setResizable(false);
        tablaInsumos.getColumnModel().getColumn(0).setCellRenderer(centerRenderer);
        tablaInsumos.getColumnModel().getColumn(1).setPreferredWidth(250);
        tablaInsumos.getColumnModel().getColumn(1).setResizable(false);
        tablaInsumos.getColumnModel().getColumn(2).setPreferredWidth(40);
        tablaInsumos.getColumnModel().getColumn(2).setResizable(false);
        tablaInsumos.getColumnModel().getColumn(2).setCellRenderer(centerRenderer);
        tablaInsumos.getColumnModel().getColumn(3).setPreferredWidth(100);
        tablaInsumos.getColumnModel().getColumn(3).setResizable(false);
        tablaInsumos.getColumnModel().getColumn(3).setCellRenderer(centerRenderer);
        tablaInsumos.getColumnModel().getColumn(4).setPreferredWidth(100);
        tablaInsumos.getColumnModel().getColumn(4).setResizable(false);
        DefaultTableCellRenderer headerRenderer = new DefaultTableCellRenderer();
        headerRenderer.setHorizontalAlignment(SwingConstants.CENTER);
        headerRenderer.setBackground(new Color(240, 240, 240)); // Cambia el color aquí

        // Asigna el renderizador personalizado a la cabecera
        tablaInsumos.getTableHeader().setDefaultRenderer(headerRenderer);
        tablaInsumos.setDefaultEditor(Object.class, null);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private components.ButtonCustom btnBorrarInsumo;
    private components.ButtonCustom btnBuscarPaciente;
    private components.ButtonCustom btnEditarInsumo;
    private components.ButtonCustom btnNuevoInsumo;
    private components.TextField inputSearchInsumo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel mensajeSeleccion;
    private javax.swing.JTable tablaInsumos;
    // End of variables declaration//GEN-END:variables
}
