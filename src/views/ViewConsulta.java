package views;

import controller.ControllerConsulta ;
import model.dataBase.ConsultaDB;
import validaciones.ValidacionConsulta;


public class ViewConsulta extends javax.swing.JPanel {

    private ControllerConsulta controller;
    private ConsultaDB consulta = new model.dataBase.ConsultaDB();
    private ValidacionConsulta validacionConsulta = new ValidacionConsulta();

    public ViewConsulta (views.Dashboard dashboard) {
        initComponents();
        this.setSize(1180, 720);

        mensajeSeleccion.setVisible(false);
        this.controller = new ControllerConsulta(dashboard, this);
        this.controller.cargarTabla();
        this.repaint();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        inputBuscarConsulta = new components.TextField();
        btnNuevaConsulta = new components.ButtonCustom();
        btnBorrarConsulta = new components.ButtonCustom();
        btnBuscarConsulta = new components.ButtonCustom();
        mensajeSeleccion = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaConsulta = new javax.swing.JTable();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1350, 920));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Consulta");

        inputBuscarConsulta.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        inputBuscarConsulta.setLabelText("Buscar");

        btnNuevaConsulta.setBackground(new java.awt.Color(0, 105, 255));
        btnNuevaConsulta.setForeground(new java.awt.Color(255, 255, 255));
        btnNuevaConsulta.setText("Añadir Consulta");
        btnNuevaConsulta.setBorderColor(new java.awt.Color(255, 255, 255));
        btnNuevaConsulta.setColor(new java.awt.Color(0, 105, 255));
        btnNuevaConsulta.setColorClick(new java.awt.Color(0, 95, 230));
        btnNuevaConsulta.setColorOver(new java.awt.Color(0, 84, 204));
        btnNuevaConsulta.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnNuevaConsulta.setPreferredSize(new java.awt.Dimension(230, 50));
        btnNuevaConsulta.setRadius(15);

        btnBorrarConsulta.setForeground(new java.awt.Color(255, 255, 255));
        btnBorrarConsulta.setText("Borrar");
        btnBorrarConsulta.setBorderColor(new java.awt.Color(255, 255, 255));
        btnBorrarConsulta.setColor(new java.awt.Color(231, 76, 60));
        btnBorrarConsulta.setColorClick(new java.awt.Color(208, 68, 54));
        btnBorrarConsulta.setColorOver(new java.awt.Color(185, 61, 48));
        btnBorrarConsulta.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnBorrarConsulta.setPreferredSize(new java.awt.Dimension(230, 50));
        btnBorrarConsulta.setRadius(15);

        btnBuscarConsulta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/search_black.png"))); // NOI18N
        btnBuscarConsulta.setBorderColor(new java.awt.Color(255, 255, 255));
        btnBuscarConsulta.setColorClick(new java.awt.Color(230, 230, 230));
        btnBuscarConsulta.setColorOver(new java.awt.Color(240, 240, 240));
        btnBuscarConsulta.setPreferredSize(new java.awt.Dimension(30, 30));
        btnBuscarConsulta.setRadius(15);
        btnBuscarConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarConsultaActionPerformed(evt);
            }
        });

        mensajeSeleccion.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        mensajeSeleccion.setForeground(new java.awt.Color(225, 0, 0));
        mensajeSeleccion.setText("Seleccione una consulta");

        tablaConsulta.setBackground(new java.awt.Color(255, 255, 255));
        tablaConsulta.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tablaConsulta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tablaConsulta.setFocusable(false);
        tablaConsulta = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int colIndex){
                return false;
            }
        };
        tablaConsulta.setFocusable(false);
        tablaConsulta.setGridColor(new java.awt.Color(153, 153, 153));
        tablaConsulta.setOpaque(false);
        tablaConsulta.setRowHeight(26);
        tablaConsulta.setShowGrid(true);
        tablaConsulta.setShowVerticalLines(false);
        tablaConsulta.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(tablaConsulta);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(mensajeSeleccion, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnBorrarConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1073, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(270, 270, 270)
                                .addComponent(inputBuscarConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnBuscarConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(189, 189, 189)
                                .addComponent(btnNuevaConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(345, 345, 345))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnNuevaConsulta, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(inputBuscarConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)))
                    .addComponent(btnBuscarConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 507, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnBorrarConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mensajeSeleccion)))
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarConsultaActionPerformed
        mensajeSeleccion.setVisible(false);
        validacionConsulta.buscador(inputBuscarConsulta,
                inputBuscarConsulta.getText().trim(),
                tablaConsulta,
                2);
        repaint();
    }//GEN-LAST:event_btnBuscarConsultaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public components.ButtonCustom btnBorrarConsulta;
    public components.ButtonCustom btnBuscarConsulta;
    public components.ButtonCustom btnNuevaConsulta;
    public components.TextField inputBuscarConsulta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    public javax.swing.JLabel mensajeSeleccion;
    public javax.swing.JTable tablaConsulta;
    // End of variables declaration//GEN-END:variables
}
