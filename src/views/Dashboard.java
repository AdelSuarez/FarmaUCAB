
package views;

import java.awt.BorderLayout;
import javax.swing.JPanel;
import style.MyColor;

public class Dashboard extends javax.swing.JPanel {
    private ViewPaciente viewPaciente = new ViewPaciente();
    private ViewConsulta viewConsulta = new ViewConsulta();
    private ViewInsumo viewInsumo = new ViewInsumo();
    private main.Main main;

    public Dashboard(main.Main main) {
        this.main = main;
        initComponents();
        this.setSize(1600,1000);       
        btnPaciente.setColor(new MyColor().getBTNSELECTCOLOR());
        this.setLocation(0,0);
        initView(viewPaciente);
        
    }
    
    private void initView(JPanel view){
        Content.removeAll();
        Content.add(view, BorderLayout.CENTER);
        Content.revalidate();
        Content.repaint();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btnConsulta = new components.ButtonCustom();
        btnPaciente = new components.ButtonCustom();
        btnInsumo = new components.ButtonCustom();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        buttonCustom2 = new components.ButtonCustom();
        Content = new javax.swing.JPanel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setToolTipText("");
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(250, 250, 250));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(169, 169, 169)));
        jPanel2.setPreferredSize(new java.awt.Dimension(220, 1000));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 28)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 255));
        jLabel2.setText("Enfermeria");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, -1, 40));

        btnConsulta.setForeground(new java.awt.Color(0, 0, 0));
        btnConsulta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/assignment_black.png"))); // NOI18N
        btnConsulta.setText("Cosultas");
        btnConsulta.setBorderColor(new java.awt.Color(250, 250, 250));
        btnConsulta.setColor(new java.awt.Color(240, 240, 240));
        btnConsulta.setColorClick(new java.awt.Color(230, 230, 230));
        btnConsulta.setColorOver(new java.awt.Color(215, 215, 215));
        btnConsulta.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnConsulta.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnConsulta.setPreferredSize(new java.awt.Dimension(230, 50));
        btnConsulta.setRadius(15);
        btnConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultaActionPerformed(evt);
            }
        });
        jPanel2.add(btnConsulta, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 236, -1, -1));

        btnPaciente.setForeground(new java.awt.Color(0, 0, 0));
        btnPaciente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/groups_person_black.png"))); // NOI18N
        btnPaciente.setText("Pacientes");
        btnPaciente.setBorderColor(new java.awt.Color(250, 250, 250));
        btnPaciente.setColor(new java.awt.Color(240, 240, 240));
        btnPaciente.setColorClick(new java.awt.Color(230, 230, 230));
        btnPaciente.setColorOver(new java.awt.Color(215, 215, 215));
        btnPaciente.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnPaciente.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnPaciente.setPreferredSize(new java.awt.Dimension(230, 50));
        btnPaciente.setRadius(15);
        btnPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPacienteActionPerformed(evt);
            }
        });
        jPanel2.add(btnPaciente, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 124, -1, -1));

        btnInsumo.setForeground(new java.awt.Color(0, 0, 0));
        btnInsumo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/vaccines_black.png"))); // NOI18N
        btnInsumo.setText("Medicamentos");
        btnInsumo.setBorderColor(new java.awt.Color(250, 250, 250));
        btnInsumo.setColor(new java.awt.Color(240, 240, 240));
        btnInsumo.setColorClick(new java.awt.Color(230, 230, 230));
        btnInsumo.setColorOver(new java.awt.Color(215, 215, 215));
        btnInsumo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnInsumo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnInsumo.setPreferredSize(new java.awt.Dimension(230, 50));
        btnInsumo.setRadius(15);
        btnInsumo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsumoActionPerformed(evt);
            }
        });
        jPanel2.add(btnInsumo, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 180, -1, -1));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 78, 248, 10));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ecg_heart.png"))); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logo.png"))); // NOI18N
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 890, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("V1.0.0");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 940, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 250, -1));

        jPanel3.setBackground(new java.awt.Color(250, 250, 250));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(169, 169, 169)));
        jPanel3.setForeground(new java.awt.Color(250, 250, 250));

        buttonCustom2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/logout_black.png"))); // NOI18N
        buttonCustom2.setBorderColor(new java.awt.Color(250, 250, 250));
        buttonCustom2.setColor(new java.awt.Color(250, 250, 250));
        buttonCustom2.setColorClick(new java.awt.Color(230, 230, 230));
        buttonCustom2.setColorOver(new java.awt.Color(240, 240, 240));
        buttonCustom2.setPreferredSize(new java.awt.Dimension(40, 40));
        buttonCustom2.setRadius(15);
        buttonCustom2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCustom2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(1306, Short.MAX_VALUE)
                .addComponent(buttonCustom2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addComponent(buttonCustom2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 0, 1380, 80));

        Content.setRequestFocusEnabled(false);

        javax.swing.GroupLayout ContentLayout = new javax.swing.GroupLayout(Content);
        Content.setLayout(ContentLayout);
        ContentLayout.setHorizontalGroup(
            ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1350, Short.MAX_VALUE)
        );
        ContentLayout.setVerticalGroup(
            ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 920, Short.MAX_VALUE)
        );

        jPanel1.add(Content, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 80, 1350, 920));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnInsumoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsumoActionPerformed
        btnPaciente.setColor(new MyColor().getBTNBGDASHBOAR());
        btnInsumo.setColor(new MyColor().getBTNSELECTCOLOR());
        btnConsulta.setColor(new MyColor().getBTNBGDASHBOAR());
        initView(viewInsumo);
    }//GEN-LAST:event_btnInsumoActionPerformed

    private void btnPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPacienteActionPerformed
        btnInsumo.setColor(new MyColor().getBTNBGDASHBOAR());
        btnPaciente.setColor(new MyColor().getBTNSELECTCOLOR());
        btnConsulta.setColor(new MyColor().getBTNBGDASHBOAR());
        initView(viewPaciente);
    }//GEN-LAST:event_btnPacienteActionPerformed

    private void btnConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultaActionPerformed
        // TODO add your handling code here:
        btnPaciente.setColor(new MyColor().getBTNBGDASHBOAR());
        btnInsumo.setColor(new MyColor().getBTNBGDASHBOAR());
        btnConsulta.setColor(new MyColor().getBTNSELECTCOLOR());
        initView(viewConsulta);
    }//GEN-LAST:event_btnConsultaActionPerformed

    private void buttonCustom2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCustom2ActionPerformed
        // TODO add your handling code here:
        main.initView(main.getLogin());
    }//GEN-LAST:event_buttonCustom2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Content;
    private components.ButtonCustom btnConsulta;
    private components.ButtonCustom btnInsumo;
    private components.ButtonCustom btnPaciente;
    private components.ButtonCustom buttonCustom2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
