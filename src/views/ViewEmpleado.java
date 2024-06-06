package views;

import views.viewsGestion.GestionEmpleado;
import database.Empleado;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.JTableHeader;

public class ViewEmpleado extends javax.swing.JPanel {

    private views.Dashboard dashboard;
    private Empleado empleado = new Empleado();
    private GestionEmpleado viewGestionEmpleado;

    public ViewEmpleado(views.Dashboard dashboard) {
        this.dashboard = dashboard;
        initComponents();
        cargarTabla();
        this.setSize(1180, 720);
        this.repaint();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaEmpleados = new javax.swing.JTable();
        inputSearchPaciente = new components.TextField();
        btnNuevoEmpleado = new components.ButtonCustom();
        btnBorrarPaciente = new components.ButtonCustom();
        btnEditarPaciente = new components.ButtonCustom();
        btnBuscarPaciente = new components.ButtonCustom();

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

        inputSearchPaciente.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        inputSearchPaciente.setLabelText("Buscar");

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

        btnBorrarPaciente.setForeground(new java.awt.Color(255, 255, 255));
        btnBorrarPaciente.setText("Borrar");
        btnBorrarPaciente.setBorderColor(new java.awt.Color(255, 255, 255));
        btnBorrarPaciente.setColor(new java.awt.Color(231, 76, 60));
        btnBorrarPaciente.setColorClick(new java.awt.Color(208, 68, 54));
        btnBorrarPaciente.setColorOver(new java.awt.Color(185, 61, 48));
        btnBorrarPaciente.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnBorrarPaciente.setPreferredSize(new java.awt.Dimension(230, 50));
        btnBorrarPaciente.setRadius(15);
        btnBorrarPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarPacienteActionPerformed(evt);
            }
        });

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
        btnEditarPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarPacienteActionPerformed(evt);
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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
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
                            .addComponent(btnNuevoEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1073, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(366, 366, 366))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnNuevoEmpleado, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(inputSearchPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)))
                    .addComponent(btnBuscarPaciente, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 507, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBorrarPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEditarPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1190, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnNuevoEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoEmpleadoActionPerformed
        this.viewGestionEmpleado = new GestionEmpleado(dashboard, this);
        dashboard.initView(viewGestionEmpleado);

    }//GEN-LAST:event_btnNuevoEmpleadoActionPerformed

    private void btnBorrarPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarPacienteActionPerformed

    }//GEN-LAST:event_btnBorrarPacienteActionPerformed

    // fumada extrema que ni entiendo que hice alksdjklajdklajd
    private void btnBuscarPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarPacienteActionPerformed

    }//GEN-LAST:event_btnBuscarPacienteActionPerformed

    private void btnEditarPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarPacienteActionPerformed


    }//GEN-LAST:event_btnEditarPacienteActionPerformed

    public void cargarTabla() {
        empleado.mostrarEmpleado(tablaEmpleados);
        configuracionesTabla();
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
    private components.ButtonCustom btnBorrarPaciente;
    private components.ButtonCustom btnBuscarPaciente;
    private components.ButtonCustom btnEditarPaciente;
    private components.ButtonCustom btnNuevoEmpleado;
    private components.TextField inputSearchPaciente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tablaEmpleados;
    // End of variables declaration//GEN-END:variables
}
