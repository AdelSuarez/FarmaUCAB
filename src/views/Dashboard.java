
package views;

import java.awt.BorderLayout;
import javax.swing.JPanel;
import style.MyColor;

public class Dashboard extends javax.swing.JPanel {
    private boolean estaSeleccionado = false;
    private ViewPaciente viewPaciente = new ViewPaciente() ;
    private ViewInsumo viewInsumo = new ViewInsumo();
    private ViewConsulta viewConsulta = new ViewConsulta();

    public Dashboard() {
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
        jPanel3 = new javax.swing.JPanel();
        Content = new javax.swing.JPanel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setToolTipText("");
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(250, 250, 250));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(169, 169, 169)));
        jPanel2.setPreferredSize(new java.awt.Dimension(220, 1000));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 255));
        jLabel2.setText("Enfermeria");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, -1, -1));

        btnConsulta.setForeground(new java.awt.Color(0, 0, 0));
        btnConsulta.setText("Cosultas");
        btnConsulta.setBorderColor(new java.awt.Color(250, 250, 250));
        btnConsulta.setColor(new java.awt.Color(240, 240, 240));
        btnConsulta.setColorClick(new java.awt.Color(230, 230, 230));
        btnConsulta.setColorOver(new java.awt.Color(215, 215, 215));
        btnConsulta.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnConsulta.setPreferredSize(new java.awt.Dimension(230, 50));
        btnConsulta.setRadius(15);
        btnConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultaActionPerformed(evt);
            }
        });
        jPanel2.add(btnConsulta, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 236, -1, -1));

        btnPaciente.setForeground(new java.awt.Color(0, 0, 0));
        btnPaciente.setText("Pacientes");
        btnPaciente.setBorderColor(new java.awt.Color(250, 250, 250));
        btnPaciente.setColor(new java.awt.Color(240, 240, 240));
        btnPaciente.setColorClick(new java.awt.Color(230, 230, 230));
        btnPaciente.setColorOver(new java.awt.Color(215, 215, 215));
        btnPaciente.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnPaciente.setPreferredSize(new java.awt.Dimension(230, 50));
        btnPaciente.setRadius(15);
        btnPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPacienteActionPerformed(evt);
            }
        });
        jPanel2.add(btnPaciente, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 124, -1, -1));

        btnInsumo.setForeground(new java.awt.Color(0, 0, 0));
        btnInsumo.setText("Medicamentos");
        btnInsumo.setBorderColor(new java.awt.Color(250, 250, 250));
        btnInsumo.setColor(new java.awt.Color(240, 240, 240));
        btnInsumo.setColorClick(new java.awt.Color(230, 230, 230));
        btnInsumo.setColorOver(new java.awt.Color(215, 215, 215));
        btnInsumo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnInsumo.setPreferredSize(new java.awt.Dimension(230, 50));
        btnInsumo.setRadius(15);
        btnInsumo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsumoActionPerformed(evt);
            }
        });
        jPanel2.add(btnInsumo, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 180, -1, -1));
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

    private void btnPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPacienteActionPerformed
        btnInsumo.setColor(new MyColor().getBTNBGDASHBOAR());
        btnPaciente.setColor(new MyColor().getBTNSELECTCOLOR());
        btnConsulta.setColor(new MyColor().getBTNBGDASHBOAR());
        initView(viewPaciente);
    }//GEN-LAST:event_btnPacienteActionPerformed

    private void btnInsumoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsumoActionPerformed
        btnPaciente.setColor(new MyColor().getBTNBGDASHBOAR());
        btnInsumo.setColor(new MyColor().getBTNSELECTCOLOR());
        btnConsulta.setColor(new MyColor().getBTNBGDASHBOAR());
        initView(viewInsumo);
    }//GEN-LAST:event_btnInsumoActionPerformed

    private void btnConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultaActionPerformed
        // TODO add your handling code here:
        btnPaciente.setColor(new MyColor().getBTNBGDASHBOAR());
        btnInsumo.setColor(new MyColor().getBTNBGDASHBOAR());
        btnConsulta.setColor(new MyColor().getBTNSELECTCOLOR());
        initView(viewConsulta);
    }//GEN-LAST:event_btnConsultaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Content;
    private components.ButtonCustom btnConsulta;
    private components.ButtonCustom btnInsumo;
    private components.ButtonCustom btnPaciente;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
