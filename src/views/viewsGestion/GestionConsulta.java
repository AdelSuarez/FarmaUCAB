package views.viewsGestion;

import controller.ControllerGestionConsulta ;
import model.dataBase.ConsultaDB;
import validaciones.ValidacionConsulta;


public class GestionConsulta extends javax.swing.JPanel {

    private ControllerGestionConsulta controller;
    private ConsultaDB consulta = new model.dataBase.ConsultaDB();
    private ValidacionConsulta validacionConsulta = new ValidacionConsulta();

    public GestionConsulta (views.Dashboard dashboard) {
        initComponents();
        this.setSize(1180, 720);

        mensajeSeleccion.setVisible(false);
        this.controller = new ControllerGestionConsulta(dashboard, this);
        this.controller.cargarTabla();
        this.repaint();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        inputBuscarConsulta = new components.TextField();
        btnBorrarConsulta = new components.ButtonCustom();
        btnBuscarConsulta = new components.ButtonCustom();
        mensajeSeleccion = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaConsulta = new javax.swing.JTable();
        btnRegresar = new components.ButtonCustom();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1350, 920));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Consulta");

        inputBuscarConsulta.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        inputBuscarConsulta.setLabelText("Buscar");

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

        mensajeSeleccion.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        mensajeSeleccion.setForeground(new java.awt.Color(225, 0, 0));
        mensajeSeleccion.setText("Seleccione una consulta");

        jScrollPane2.setBackground(new java.awt.Color(255, 255, 255));

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

        btnRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/arrow_back_black.png"))); // NOI18N
        btnRegresar.setBorderColor(new java.awt.Color(255, 255, 255));
        btnRegresar.setColorClick(new java.awt.Color(230, 230, 230));
        btnRegresar.setColorOver(new java.awt.Color(240, 240, 240));
        btnRegresar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnRegresar.setPreferredSize(new java.awt.Dimension(40, 40));
        btnRegresar.setRadius(15);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1073, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(mensajeSeleccion, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnBorrarConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(btnRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel1)
                                .addGap(218, 218, 218)
                                .addComponent(inputBuscarConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnBuscarConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(377, 377, 377)))))
                .addGap(345, 345, 345))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btnRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(inputBuscarConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)))
                    .addComponent(btnBuscarConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 507, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnBorrarConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mensajeSeleccion)))
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

//            mensajeSeleccion.setVisible(false);
//        validacionConsulta.buscador(inputBuscarConsulta,
//                inputBuscarConsulta.getText().trim(),
//                tablaConsulta,
//                2);
//        repaint();
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public components.ButtonCustom btnBorrarConsulta;
    public components.ButtonCustom btnBuscarConsulta;
    public components.ButtonCustom btnRegresar;
    public components.TextField inputBuscarConsulta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JScrollPane jScrollPane2;
    public javax.swing.JLabel mensajeSeleccion;
    public javax.swing.JTable tablaConsulta;
    // End of variables declaration//GEN-END:variables
}
