package views;

import dialog.DialogCerrarSesion;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import style.MyColor;

public class Dashboard extends javax.swing.JPanel {

    private ViewPaciente viewPaciente = new ViewPaciente(this);
    private ViewConsulta viewConsulta = new ViewConsulta();
    private ViewInsumo viewInsumo = new ViewInsumo(this);
    private ViewEmpleado viewEmpleado = new ViewEmpleado(this);
    private main.Main main;
    private boolean admin = false;

    public Dashboard(main.Main main, boolean admin) {
        initComponents();
        this.main = main;
        this.admin = admin;

        this.setSize(1400, 800);
        this.setLocation(0, 0);
        adminActivo.setVisible(admin);
        btnPaciente.setColor(new MyColor().getBTNSELECTCOLOR());
        btnEmpleado.setVisible(admin);
        initView(viewPaciente);
        this.repaint();

    }

    public void initView(JPanel view) {
        Content.removeAll();
        Content.add(view, BorderLayout.CENTER);
        Content.revalidate();
        Content.repaint();
    }

    public ViewPaciente getViewPaciente() {
        return viewPaciente;
    }

    public ViewEmpleado getViewEmpleado() {
        return viewEmpleado;
    }
    
    public ViewInsumo getViewInsumo(){
        return viewInsumo;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btnPaciente = new components.ButtonCustom();
        btnInsumo = new components.ButtonCustom();
        jSeparator1 = new javax.swing.JSeparator();
        btnConsulta = new components.ButtonCustom();
        btnEmpleado = new components.ButtonCustom();
        jLabel1 = new javax.swing.JLabel();
        adminActivo = new components.ButtonCustom();
        jPanel3 = new javax.swing.JPanel();
        btnCerrarSesion = new components.ButtonCustom();
        Content = new javax.swing.JPanel();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setToolTipText("");
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(250, 250, 250));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(169, 169, 169)));
        jPanel2.setPreferredSize(new java.awt.Dimension(220, 800));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 28)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 255));
        jLabel2.setText("Enfermeria");

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

        btnEmpleado.setForeground(new java.awt.Color(0, 0, 0));
        btnEmpleado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/badge_black.png"))); // NOI18N
        btnEmpleado.setText("Empleados");
        btnEmpleado.setBorderColor(new java.awt.Color(250, 250, 250));
        btnEmpleado.setColor(new java.awt.Color(240, 240, 240));
        btnEmpleado.setColorClick(new java.awt.Color(230, 230, 230));
        btnEmpleado.setColorOver(new java.awt.Color(215, 215, 215));
        btnEmpleado.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnEmpleado.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnEmpleado.setPreferredSize(new java.awt.Dimension(230, 50));
        btnEmpleado.setRadius(15);
        btnEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmpleadoActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ecg_heart.png"))); // NOI18N

        adminActivo.setForeground(new java.awt.Color(255, 255, 255));
        adminActivo.setText("Admin");
        adminActivo.setBorderColor(new java.awt.Color(240, 240, 240));
        adminActivo.setColor(new java.awt.Color(46, 204, 113));
        adminActivo.setColorClick(new java.awt.Color(46, 204, 113));
        adminActivo.setColorOver(new java.awt.Color(46, 204, 113));
        adminActivo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        adminActivo.setRadius(15);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jLabel1)
                .addGap(6, 6, 6)
                .addComponent(jLabel2))
            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(btnPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(btnInsumo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(btnConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(adminActivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(4, 4, 4)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(btnPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(btnInsumo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(btnConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 384, Short.MAX_VALUE)
                .addComponent(adminActivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 250, -1));

        jPanel3.setBackground(new java.awt.Color(250, 250, 250));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(169, 169, 169)));
        jPanel3.setForeground(new java.awt.Color(250, 250, 250));
        jPanel3.setPreferredSize(new java.awt.Dimension(1180, 80));

        btnCerrarSesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/logout_black.png"))); // NOI18N
        btnCerrarSesion.setBorderColor(new java.awt.Color(250, 250, 250));
        btnCerrarSesion.setColor(new java.awt.Color(250, 250, 250));
        btnCerrarSesion.setColorClick(new java.awt.Color(230, 230, 230));
        btnCerrarSesion.setColorOver(new java.awt.Color(240, 240, 240));
        btnCerrarSesion.setPreferredSize(new java.awt.Dimension(40, 40));
        btnCerrarSesion.setRadius(15);
        btnCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarSesionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(1087, Short.MAX_VALUE)
                .addComponent(btnCerrarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(btnCerrarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 0, 1170, 80));

        Content.setPreferredSize(new java.awt.Dimension(1180, 720));
        Content.setRequestFocusEnabled(false);

        javax.swing.GroupLayout ContentLayout = new javax.swing.GroupLayout(Content);
        Content.setLayout(ContentLayout);
        ContentLayout.setHorizontalGroup(
            ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1150, Short.MAX_VALUE)
        );
        ContentLayout.setVerticalGroup(
            ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 720, Short.MAX_VALUE)
        );

        jPanel1.add(Content, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 80, 1150, 720));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnInsumoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsumoActionPerformed
        btnPaciente.setColor(new MyColor().getBTNBGDASHBOAR());
        btnInsumo.setColor(new MyColor().getBTNSELECTCOLOR());
        btnConsulta.setColor(new MyColor().getBTNBGDASHBOAR());
        btnEmpleado.setColor(new MyColor().getBTNBGDASHBOAR());
        initView(viewInsumo);
    }//GEN-LAST:event_btnInsumoActionPerformed

    private void btnPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPacienteActionPerformed
        btnInsumo.setColor(new MyColor().getBTNBGDASHBOAR());
        btnPaciente.setColor(new MyColor().getBTNSELECTCOLOR());
        btnConsulta.setColor(new MyColor().getBTNBGDASHBOAR());
        btnEmpleado.setColor(new MyColor().getBTNBGDASHBOAR());
        initView(viewPaciente);
    }//GEN-LAST:event_btnPacienteActionPerformed

    private void btnEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmpleadoActionPerformed
        btnPaciente.setColor(new MyColor().getBTNBGDASHBOAR());
        btnInsumo.setColor(new MyColor().getBTNBGDASHBOAR());
        btnConsulta.setColor(new MyColor().getBTNBGDASHBOAR());
        btnEmpleado.setColor(new MyColor().getBTNSELECTCOLOR());
        initView(viewEmpleado);

    }//GEN-LAST:event_btnEmpleadoActionPerformed

    private void btnCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarSesionActionPerformed
        dialog.DialogCerrarSesion dialog = new DialogCerrarSesion(main);
        dialog.setVisible(true);
    }//GEN-LAST:event_btnCerrarSesionActionPerformed

    private void btnConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultaActionPerformed
        btnPaciente.setColor(new MyColor().getBTNBGDASHBOAR());
        btnInsumo.setColor(new MyColor().getBTNBGDASHBOAR());
        btnConsulta.setColor(new MyColor().getBTNSELECTCOLOR());
        btnEmpleado.setColor(new MyColor().getBTNBGDASHBOAR());
        initView(viewConsulta);
    }//GEN-LAST:event_btnConsultaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Content;
    private components.ButtonCustom adminActivo;
    private components.ButtonCustom btnCerrarSesion;
    private components.ButtonCustom btnConsulta;
    private components.ButtonCustom btnEmpleado;
    private components.ButtonCustom btnInsumo;
    private components.ButtonCustom btnPaciente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
