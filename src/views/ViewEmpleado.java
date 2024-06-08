package views;

import views.viewsGestion.GestionEmpleado;
import database.Empleado;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import validaciones.ValidacionesEmpleado;

public class ViewEmpleado extends javax.swing.JPanel {

    private views.Dashboard dashboard;
    private Empleado empleado = new Empleado();
    private GestionEmpleado viewGestionEmpleado;
    private ValidacionesEmpleado validacionesEmpleado = new ValidacionesEmpleado();

    public ViewEmpleado(views.Dashboard dashboard) {
        this.dashboard = dashboard;
        initComponents();
        cargarTabla();
        this.setSize(1180, 720);
        mensajeSeleccion.setVisible(false);
        this.repaint();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaEmpleados = new javax.swing.JTable();
        inputSearchEmpleado = new components.TextField();
        btnNuevoEmpleado = new components.ButtonCustom();
        btnBorrarEmpleado = new components.ButtonCustom();
        btnEditarEmpleado = new components.ButtonCustom();
        btnBuscarEmpleado = new components.ButtonCustom();
        mensajeSeleccion = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1350, 920));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Empleados");

        tablaEmpleados.setBackground(new java.awt.Color(255, 255, 255));
        tablaEmpleados.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tablaEmpleados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tablaEmpleados.setFocusable(false);
        tablaEmpleados.setGridColor(new java.awt.Color(153, 153, 153));
        tablaEmpleados.setIntercellSpacing(new java.awt.Dimension(0, 0));
        tablaEmpleados.setOpaque(false);
        tablaEmpleados.setRowHeight(26);
        tablaEmpleados.setShowGrid(true);
        tablaEmpleados.setShowVerticalLines(false);
        tablaEmpleados.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(tablaEmpleados);

        inputSearchEmpleado.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        inputSearchEmpleado.setLabelText("Buscar");

        btnNuevoEmpleado.setBackground(new java.awt.Color(0, 105, 255));
        btnNuevoEmpleado.setForeground(new java.awt.Color(255, 255, 255));
        btnNuevoEmpleado.setText("Nuevo Empleado");
        btnNuevoEmpleado.setBorderColor(new java.awt.Color(255, 255, 255));
        btnNuevoEmpleado.setColor(new java.awt.Color(0, 105, 255));
        btnNuevoEmpleado.setColorClick(new java.awt.Color(0, 95, 230));
        btnNuevoEmpleado.setColorOver(new java.awt.Color(0, 84, 204));
        btnNuevoEmpleado.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnNuevoEmpleado.setPreferredSize(new java.awt.Dimension(230, 50));
        btnNuevoEmpleado.setRadius(15);
        btnNuevoEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoEmpleadoActionPerformed(evt);
            }
        });

        btnBorrarEmpleado.setForeground(new java.awt.Color(255, 255, 255));
        btnBorrarEmpleado.setText("Borrar");
        btnBorrarEmpleado.setBorderColor(new java.awt.Color(255, 255, 255));
        btnBorrarEmpleado.setColor(new java.awt.Color(231, 76, 60));
        btnBorrarEmpleado.setColorClick(new java.awt.Color(208, 68, 54));
        btnBorrarEmpleado.setColorOver(new java.awt.Color(185, 61, 48));
        btnBorrarEmpleado.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnBorrarEmpleado.setPreferredSize(new java.awt.Dimension(230, 50));
        btnBorrarEmpleado.setRadius(15);
        btnBorrarEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarEmpleadoActionPerformed(evt);
            }
        });

        btnEditarEmpleado.setForeground(new java.awt.Color(255, 255, 255));
        btnEditarEmpleado.setText("Editar");
        btnEditarEmpleado.setBorderColor(new java.awt.Color(255, 255, 255));
        btnEditarEmpleado.setColor(new java.awt.Color(244, 208, 63));
        btnEditarEmpleado.setColorClick(new java.awt.Color(220, 187, 57));
        btnEditarEmpleado.setColorOver(new java.awt.Color(195, 166, 50));
        btnEditarEmpleado.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnEditarEmpleado.setHideActionText(true);
        btnEditarEmpleado.setPreferredSize(new java.awt.Dimension(230, 50));
        btnEditarEmpleado.setRadius(15);
        btnEditarEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarEmpleadoActionPerformed(evt);
            }
        });

        btnBuscarEmpleado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/search_black.png"))); // NOI18N
        btnBuscarEmpleado.setBorderColor(new java.awt.Color(255, 255, 255));
        btnBuscarEmpleado.setColorClick(new java.awt.Color(230, 230, 230));
        btnBuscarEmpleado.setColorOver(new java.awt.Color(240, 240, 240));
        btnBuscarEmpleado.setPreferredSize(new java.awt.Dimension(30, 30));
        btnBuscarEmpleado.setRadius(15);
        btnBuscarEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarEmpleadoActionPerformed(evt);
            }
        });

        mensajeSeleccion.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        mensajeSeleccion.setForeground(new java.awt.Color(225, 0, 0));
        mensajeSeleccion.setText("Seleccione un empleado");

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
                        .addComponent(btnBorrarEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnEditarEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel1)
                            .addGap(18, 18, 18)
                            .addComponent(inputSearchEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnBuscarEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnNuevoEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1073, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(366, 366, 366))
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
                                .addComponent(btnNuevoEmpleado, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(inputSearchEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1)))
                            .addComponent(btnBuscarEmpleado, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 507, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnBorrarEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEditarEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1190, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnNuevoEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoEmpleadoActionPerformed
        this.viewGestionEmpleado = new GestionEmpleado(dashboard, this, "Nuevo");
        dashboard.initView(viewGestionEmpleado);
        cargarTabla();

    }//GEN-LAST:event_btnNuevoEmpleadoActionPerformed

    private void btnBorrarEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarEmpleadoActionPerformed
        int filaSeleccionada = tablaEmpleados.getSelectedRow();
        mensajeSeleccion.setVisible(false);
        if (filaSeleccionada != -1) { // Verifica si se ha seleccionado una fila
            System.out.println(filaSeleccionada);
            String usuario = tablaEmpleados.getValueAt(filaSeleccionada, 3).toString();
            dialog.DialogEliminarEmpleado dialog = new dialog.DialogEliminarEmpleado(usuario, this);
            dialog.setVisible(true);
            this.repaint();
        } else {
            mensajeSeleccion.setVisible(true);
        }
        this.repaint();
    }//GEN-LAST:event_btnBorrarEmpleadoActionPerformed

    // fumada extrema que ni entiendo que hice alksdjklajdklajd
    private void btnBuscarEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarEmpleadoActionPerformed
        validacionesEmpleado.buscador(inputSearchEmpleado,
                empleado.buscarEmpleado(inputSearchEmpleado.getText().trim()),
                tablaEmpleados, 0);
        this.repaint();
    }//GEN-LAST:event_btnBuscarEmpleadoActionPerformed

    private void btnEditarEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarEmpleadoActionPerformed
        int filaSeleccionada = tablaEmpleados.getSelectedRow();

        mensajeSeleccion.setVisible(false);
        if (filaSeleccionada != -1) {
            String usuario = tablaEmpleados.getValueAt(filaSeleccionada, 3).toString();
            this.viewGestionEmpleado = new GestionEmpleado(dashboard, this, usuario);
            dashboard.initView(viewGestionEmpleado);
        } else {
            mensajeSeleccion.setVisible(true);
        }


    }//GEN-LAST:event_btnEditarEmpleadoActionPerformed

    public void cargarTabla() {
        if(!empleado.isEmptyTabla("Empleados")){
            empleado.mostrarEmpleado(tablaEmpleados);
            configuracionesTabla();
        }

    }

    private void configuracionesTabla() {

        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(SwingConstants.CENTER);
        tablaEmpleados.getColumnModel().getColumn(0).setPreferredWidth(250);
        tablaEmpleados.getColumnModel().getColumn(0).setResizable(false);
        tablaEmpleados.getColumnModel().getColumn(1).setPreferredWidth(200);
        tablaEmpleados.getColumnModel().getColumn(1).setResizable(false);
        tablaEmpleados.getColumnModel().getColumn(2).setPreferredWidth(120);
        tablaEmpleados.getColumnModel().getColumn(2).setResizable(false);
        tablaEmpleados.getColumnModel().getColumn(3).setPreferredWidth(120);
        tablaEmpleados.getColumnModel().getColumn(3).setResizable(false);
        tablaEmpleados.getColumnModel().getColumn(4).setPreferredWidth(120);
        tablaEmpleados.getColumnModel().getColumn(4).setResizable(false);
        tablaEmpleados.getColumnModel().getColumn(5).setPreferredWidth(50);
        tablaEmpleados.getColumnModel().getColumn(5).setResizable(false);
        tablaEmpleados.getColumnModel().getColumn(5).setCellRenderer(centerRenderer);
        DefaultTableCellRenderer headerRenderer = new DefaultTableCellRenderer();
        headerRenderer.setHorizontalAlignment(SwingConstants.CENTER);
        headerRenderer.setBackground(new Color(240, 240, 240)); // Cambia el color aquí

        // Asigna el renderizador personalizado a la cabecera
        tablaEmpleados.getTableHeader().setDefaultRenderer(headerRenderer);
        tablaEmpleados.setDefaultEditor(Object.class, null);

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private components.ButtonCustom btnBorrarEmpleado;
    private components.ButtonCustom btnBuscarEmpleado;
    private components.ButtonCustom btnEditarEmpleado;
    private components.ButtonCustom btnNuevoEmpleado;
    private components.TextField inputSearchEmpleado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel mensajeSeleccion;
    private javax.swing.JTable tablaEmpleados;
    // End of variables declaration//GEN-END:variables
}
