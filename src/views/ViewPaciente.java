
package views;



public class ViewPaciente extends javax.swing.JPanel {

    public ViewPaciente() {
        initComponents();
        this.setSize(1350,920);
//        jTable2.getTableHeader().setOpaque(false);
//        jTable2.getTableHeader().setBackground(Color.cyan);
        this.repaint();

    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        textField1 = new components.TextField();
        buttonCustom1 = new components.ButtonCustom();
        buttonCustom2 = new components.ButtonCustom();
        buttonCustom3 = new components.ButtonCustom();
        buttonCustom4 = new components.ButtonCustom();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1350, 920));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Pacientes");

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

        buttonCustom1.setBackground(new java.awt.Color(0, 105, 255));
        buttonCustom1.setForeground(new java.awt.Color(255, 255, 255));
        buttonCustom1.setText("Añadir paciente");
        buttonCustom1.setBorderColor(new java.awt.Color(255, 255, 255));
        buttonCustom1.setColor(new java.awt.Color(0, 105, 255));
        buttonCustom1.setColorClick(new java.awt.Color(0, 95, 230));
        buttonCustom1.setColorOver(new java.awt.Color(0, 84, 204));
        buttonCustom1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        buttonCustom1.setPreferredSize(new java.awt.Dimension(230, 50));
        buttonCustom1.setRadius(15);
        buttonCustom1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCustom1ActionPerformed(evt);
            }
        });

        buttonCustom2.setForeground(new java.awt.Color(255, 255, 255));
        buttonCustom2.setText("Borrar");
        buttonCustom2.setBorderColor(new java.awt.Color(255, 255, 255));
        buttonCustom2.setColor(new java.awt.Color(231, 76, 60));
        buttonCustom2.setColorClick(new java.awt.Color(208, 68, 54));
        buttonCustom2.setColorOver(new java.awt.Color(185, 61, 48));
        buttonCustom2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        buttonCustom2.setPreferredSize(new java.awt.Dimension(230, 50));
        buttonCustom2.setRadius(15);

        buttonCustom3.setForeground(new java.awt.Color(255, 255, 255));
        buttonCustom3.setText("Editar");
        buttonCustom3.setBorderColor(new java.awt.Color(255, 255, 255));
        buttonCustom3.setColor(new java.awt.Color(244, 208, 63));
        buttonCustom3.setColorClick(new java.awt.Color(220, 187, 57));
        buttonCustom3.setColorOver(new java.awt.Color(195, 166, 50));
        buttonCustom3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        buttonCustom3.setHideActionText(true);
        buttonCustom3.setPreferredSize(new java.awt.Dimension(230, 50));
        buttonCustom3.setRadius(15);

        buttonCustom4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/search_black.png"))); // NOI18N
        buttonCustom4.setBorderColor(new java.awt.Color(255, 255, 255));
        buttonCustom4.setColorClick(new java.awt.Color(230, 230, 230));
        buttonCustom4.setColorOver(new java.awt.Color(240, 240, 240));
        buttonCustom4.setPreferredSize(new java.awt.Dimension(30, 30));
        buttonCustom4.setRadius(15);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(52, 52, 52)
                        .addComponent(textField1, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonCustom4, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(buttonCustom1, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(buttonCustom2, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(buttonCustom3, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 1213, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(179, 179, 179))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(textField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(buttonCustom1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(buttonCustom4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 696, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonCustom2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonCustom3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void buttonCustom1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCustom1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_buttonCustom1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private components.ButtonCustom buttonCustom1;
    private components.ButtonCustom buttonCustom2;
    private components.ButtonCustom buttonCustom3;
    private components.ButtonCustom buttonCustom4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2;
    private components.TextField textField1;
    // End of variables declaration//GEN-END:variables
}