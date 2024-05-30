
package views;

public class Dashboard extends javax.swing.JPanel {

    public Dashboard() {
        initComponents();
        this.setSize(1600,1000);
        this.setLocation(0,0);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        buttonCustom1 = new button.ButtonCustom();
        buttonCustom2 = new button.ButtonCustom();
        buttonCustom3 = new button.ButtonCustom();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel3 = new javax.swing.JPanel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setToolTipText("");
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("DashBoard");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1323, 524, -1, -1));

        jPanel2.setBackground(new java.awt.Color(250, 250, 250));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(169, 169, 169)));
        jPanel2.setPreferredSize(new java.awt.Dimension(220, 1000));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 255));
        jLabel2.setText("Emfermeria");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        buttonCustom1.setForeground(new java.awt.Color(0, 0, 0));
        buttonCustom1.setText("Cosultas");
        buttonCustom1.setBorderColor(new java.awt.Color(250, 250, 250));
        buttonCustom1.setColor(new java.awt.Color(240, 240, 240));
        buttonCustom1.setColorClick(new java.awt.Color(230, 230, 230));
        buttonCustom1.setColorOver(new java.awt.Color(215, 215, 215));
        buttonCustom1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        buttonCustom1.setPreferredSize(new java.awt.Dimension(230, 50));
        buttonCustom1.setRadius(15);
        jPanel2.add(buttonCustom1, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 236, -1, -1));

        buttonCustom2.setForeground(new java.awt.Color(0, 0, 0));
        buttonCustom2.setText("Pacientes");
        buttonCustom2.setBorderColor(new java.awt.Color(250, 250, 250));
        buttonCustom2.setColor(new java.awt.Color(240, 240, 240));
        buttonCustom2.setColorClick(new java.awt.Color(230, 230, 230));
        buttonCustom2.setColorOver(new java.awt.Color(215, 215, 215));
        buttonCustom2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        buttonCustom2.setPreferredSize(new java.awt.Dimension(230, 50));
        buttonCustom2.setRadius(15);
        jPanel2.add(buttonCustom2, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 124, -1, -1));

        buttonCustom3.setForeground(new java.awt.Color(0, 0, 0));
        buttonCustom3.setText("Medicamentos");
        buttonCustom3.setBorderColor(new java.awt.Color(250, 250, 250));
        buttonCustom3.setColor(new java.awt.Color(240, 240, 240));
        buttonCustom3.setColorClick(new java.awt.Color(230, 230, 230));
        buttonCustom3.setColorOver(new java.awt.Color(215, 215, 215));
        buttonCustom3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        buttonCustom3.setPreferredSize(new java.awt.Dimension(230, 50));
        buttonCustom3.setRadius(15);
        jPanel2.add(buttonCustom3, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 180, -1, -1));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 78, 248, 10));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 250, -1));

        jPanel3.setBackground(new java.awt.Color(250, 250, 250));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(169, 169, 169)));
        jPanel3.setForeground(new java.awt.Color(250, 250, 250));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1378, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 78, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 0, 1380, 80));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private button.ButtonCustom buttonCustom1;
    private button.ButtonCustom buttonCustom2;
    private button.ButtonCustom buttonCustom3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
