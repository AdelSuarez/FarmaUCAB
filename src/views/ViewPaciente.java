
package views;

import java.awt.Color;


public class ViewPaciente extends javax.swing.JPanel {

    public ViewPaciente() {
        initComponents();
        this.setSize(1350,920);
//        jTable2.getTableHeader().setOpaque(false);
//        jTable2.getTableHeader().setBackground(Color.cyan);
//        this.repaint();

    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnPaciente = new components.ButtonCustom();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        textField1 = new components.TextField();
        btnPaciente1 = new components.ButtonCustom();
        btnPaciente2 = new components.ButtonCustom();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1350, 920));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Pacientes");

        btnPaciente.setForeground(new java.awt.Color(0, 0, 0));
        btnPaciente.setText("Borrar");
        btnPaciente.setBorderColor(new java.awt.Color(250, 250, 250));
        btnPaciente.setColor(new java.awt.Color(240, 240, 240));
        btnPaciente.setColorClick(new java.awt.Color(230, 230, 230));
        btnPaciente.setColorOver(new java.awt.Color(215, 215, 215));
        btnPaciente.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnPaciente.setPreferredSize(new java.awt.Dimension(230, 50));
        btnPaciente.setRadius(15);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable2.setFocusable(false);
        jTable2.setGridColor(new java.awt.Color(153, 153, 153));
        jTable2.setIntercellSpacing(new java.awt.Dimension(0, 0));
        jTable2.setOpaque(false);
        jTable2.setRowHeight(26);
        jTable2.setShowGrid(true);
        jTable2.setShowVerticalLines(false);
        jTable2.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(jTable2);

        textField1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        textField1.setLabelText("Buscar");

        btnPaciente1.setForeground(new java.awt.Color(0, 0, 0));
        btnPaciente1.setText("Añadir paciente");
        btnPaciente1.setBorderColor(new java.awt.Color(250, 250, 250));
        btnPaciente1.setColor(new java.awt.Color(240, 240, 240));
        btnPaciente1.setColorClick(new java.awt.Color(230, 230, 230));
        btnPaciente1.setColorOver(new java.awt.Color(215, 215, 215));
        btnPaciente1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnPaciente1.setPreferredSize(new java.awt.Dimension(230, 50));
        btnPaciente1.setRadius(15);

        btnPaciente2.setForeground(new java.awt.Color(0, 0, 0));
        btnPaciente2.setText("Editar");
        btnPaciente2.setBorderColor(new java.awt.Color(250, 250, 250));
        btnPaciente2.setColor(new java.awt.Color(240, 240, 240));
        btnPaciente2.setColorClick(new java.awt.Color(230, 230, 230));
        btnPaciente2.setColorOver(new java.awt.Color(215, 215, 215));
        btnPaciente2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnPaciente2.setPreferredSize(new java.awt.Dimension(230, 50));
        btnPaciente2.setRadius(15);
        btnPaciente2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPaciente2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(52, 52, 52)
                        .addComponent(textField1, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(547, 547, 547)
                        .addComponent(btnPaciente1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(btnPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(btnPaciente2, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1213, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(73, 73, 73))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel1))
                    .addComponent(textField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(btnPaciente1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(22, 22, 22)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 696, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPaciente2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnPaciente2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPaciente2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPaciente2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private components.ButtonCustom btnPaciente;
    private components.ButtonCustom btnPaciente1;
    private components.ButtonCustom btnPaciente2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2;
    private components.TextField textField1;
    // End of variables declaration//GEN-END:variables
}
