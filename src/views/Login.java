package views;

import model.dataBase.DataBase;
import model.dataBase.EmpleadoDB;
import validaciones.ValidacionLogin;
import style.MyColor;

// Mejorar diseño del login
public class Login extends javax.swing.JPanel {

    private ValidacionLogin validacion = new ValidacionLogin();
    private model.dataBase.EmpleadoDB empleado = new EmpleadoDB();
    private main.Main main;

    public Login(main.Main main) {
        this.main = main;
        initComponents();
        textoMensaje.setVisible(false);
        this.setSize(1400, 800);
        this.setLocation(0, 0);
        mesajeInicioSesion.setVisible(false);

        // Muestra el panel de inicio de sesion dependiendo si hay usuarios o no en la tabla empleados
        if (new DataBase().isEmptyTabla("Empleados")) {
            PanelAdmin.setVisible(true);
            PanelInicioSesion.setVisible(false);
        } else {
            PanelInicioSesion.setVisible(true);
            PanelAdmin.setVisible(false);

        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        FarmaUCAB = new javax.swing.JLabel();
        PanelInicioSesion = new components.PanelRound();
        btnInicioSesion = new components.ButtonCustom();
        inputPasswordUsuario = new components.PasswordField();
        jLabel3 = new javax.swing.JLabel();
        inputUsuarioSesion = new components.TextField();
        mesajeInicioSesion = new javax.swing.JLabel();
        PanelAdmin = new components.PanelRound();
        btnRegistrar = new components.ButtonCustom();
        inputRepetirPassword = new components.PasswordField();
        inputPassword = new components.PasswordField();
        inputTelefono = new components.TextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        inputApellido = new components.TextField();
        inputNombre = new components.TextField();
        inputUsuarioRegistro = new components.TextField();
        inputCorreo = new components.TextField();
        textoMensaje = new javax.swing.JLabel();

        setBackground(new java.awt.Color(231, 231, 239));
        setLayout(null);

        FarmaUCAB.setFont(new java.awt.Font("Tahoma", 1, 56)); // NOI18N
        FarmaUCAB.setText("Enfermeria UCAB");
        add(FarmaUCAB);
        FarmaUCAB.setBounds(460, 0, 540, 68);

        PanelInicioSesion.setBackground(new java.awt.Color(255, 255, 255));
        PanelInicioSesion.setRoundBottomLeft(30);
        PanelInicioSesion.setRoundBottomRight(30);
        PanelInicioSesion.setRoundTopLeft(30);
        PanelInicioSesion.setRoundTopRight(30);
        PanelInicioSesion.setLayout(null);

        btnInicioSesion.setForeground(new java.awt.Color(255, 255, 255));
        btnInicioSesion.setText("Iniciar");
        btnInicioSesion.setBorderColor(new java.awt.Color(255, 255, 255));
        btnInicioSesion.setColor(new java.awt.Color(0, 102, 255));
        btnInicioSesion.setColorClick(new java.awt.Color(0, 102, 255));
        btnInicioSesion.setColorOver(new java.awt.Color(0, 102, 204));
        btnInicioSesion.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnInicioSesion.setRadius(15);
        btnInicioSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInicioSesionActionPerformed(evt);
            }
        });
        PanelInicioSesion.add(btnInicioSesion);
        btnInicioSesion.setBounds(124, 455, 100, 36);

        inputPasswordUsuario.setToolTipText("");
        inputPasswordUsuario.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        inputPasswordUsuario.setLabelText("Contraseña");
        inputPasswordUsuario.setShowAndHide(true);
        PanelInicioSesion.add(inputPasswordUsuario);
        inputPasswordUsuario.setBounds(39, 240, 270, 47);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setText("Iniciar sesion");
        PanelInicioSesion.add(jLabel3);
        jLabel3.setBounds(91, 38, 160, 29);

        inputUsuarioSesion.setForeground(new java.awt.Color(80, 80, 80));
        inputUsuarioSesion.setToolTipText("");
        inputUsuarioSesion.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        inputUsuarioSesion.setLabelText("Usuario");
        PanelInicioSesion.add(inputUsuarioSesion);
        inputUsuarioSesion.setBounds(39, 175, 270, 47);

        mesajeInicioSesion.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        mesajeInicioSesion.setForeground(new java.awt.Color(225, 0, 0));
        mesajeInicioSesion.setText("Usuario o contraseña incorrecto");
        PanelInicioSesion.add(mesajeInicioSesion);
        mesajeInicioSesion.setBounds(90, 420, 180, 15);

        add(PanelInicioSesion);
        PanelInicioSesion.setBounds(525, 115, 350, 530);

        PanelAdmin.setBackground(new java.awt.Color(255, 255, 255));
        PanelAdmin.setPreferredSize(new java.awt.Dimension(350, 600));
        PanelAdmin.setRoundBottomLeft(30);
        PanelAdmin.setRoundBottomRight(30);
        PanelAdmin.setRoundTopLeft(30);
        PanelAdmin.setRoundTopRight(30);

        btnRegistrar.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrar.setText("Registrar");
        btnRegistrar.setBorderColor(new java.awt.Color(255, 255, 255));
        btnRegistrar.setColor(new java.awt.Color(0, 102, 255));
        btnRegistrar.setColorClick(new java.awt.Color(0, 102, 255));
        btnRegistrar.setColorOver(new java.awt.Color(0, 102, 204));
        btnRegistrar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        btnRegistrar.setRadius(15);
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        inputRepetirPassword.setForeground(new java.awt.Color(80, 80, 80));
        inputRepetirPassword.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        inputRepetirPassword.setLabelText("Confirmar contraseña");
        inputRepetirPassword.setShowAndHide(true);

        inputPassword.setForeground(new java.awt.Color(80, 80, 80));
        inputPassword.setToolTipText("");
        inputPassword.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        inputPassword.setLabelText("Contraseña");
        inputPassword.setShowAndHide(true);

        inputTelefono.setForeground(new java.awt.Color(80, 80, 80));
        inputTelefono.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        inputTelefono.setLabelText("Telefono");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Registro de usuario");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(169, 169, 169));
        jLabel2.setText("Admin");

        inputApellido.setForeground(new java.awt.Color(80, 80, 80));
        inputApellido.setToolTipText("");
        inputApellido.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        inputApellido.setLabelText("Apellido");

        inputNombre.setForeground(new java.awt.Color(80, 80, 80));
        inputNombre.setToolTipText("");
        inputNombre.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        inputNombre.setLabelText("Nombre");

        inputUsuarioRegistro.setForeground(new java.awt.Color(80, 80, 80));
        inputUsuarioRegistro.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        inputUsuarioRegistro.setLabelText("Usuario");

        inputCorreo.setForeground(new java.awt.Color(80, 80, 80));
        inputCorreo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        inputCorreo.setLabelText("Correo");

        textoMensaje.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        textoMensaje.setForeground(new java.awt.Color(225, 0, 0));
        textoMensaje.setText("Mensaje");

        javax.swing.GroupLayout PanelAdminLayout = new javax.swing.GroupLayout(PanelAdmin);
        PanelAdmin.setLayout(PanelAdminLayout);
        PanelAdminLayout.setHorizontalGroup(
            PanelAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelAdminLayout.createSequentialGroup()
                .addContainerGap(123, Short.MAX_VALUE)
                .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(127, 127, 127))
            .addGroup(PanelAdminLayout.createSequentialGroup()
                .addGroup(PanelAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelAdminLayout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(PanelAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(inputApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(PanelAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(inputUsuarioRegistro, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(inputPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)
                                .addComponent(inputCorreo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(inputRepetirPassword, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(inputTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(inputNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textoMensaje, javax.swing.GroupLayout.Alignment.LEADING)))
                    .addGroup(PanelAdminLayout.createSequentialGroup()
                        .addGap(151, 151, 151)
                        .addComponent(jLabel2))
                    .addGroup(PanelAdminLayout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanelAdminLayout.setVerticalGroup(
            PanelAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelAdminLayout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(inputNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(inputApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(inputTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(inputCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(inputUsuarioRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(inputPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(inputRepetirPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textoMensaje)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
        );

        add(PanelAdmin);
        PanelAdmin.setBounds(525, 115, 350, 600);
    }// </editor-fold>//GEN-END:initComponents

    private void btnInicioSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInicioSesionActionPerformed
        mesajeInicioSesion.setVisible(false);

        if (validacion.ceroCamposVaciosInicioSesion(inputUsuarioSesion, inputPasswordUsuario) == 2) {
            if (empleado.inicioEmpleado(inputUsuarioSesion.getText().trim(), inputPasswordUsuario.getText().trim())) {
                if (empleado.validarEmpleadoAdmin(inputUsuarioSesion.getText().trim())) {
                    inputUsuarioSesion.setText("");
                    inputPasswordUsuario.setText("");
                    main.initView(main.viewAdmin(true));
                    mesajeInicioSesion.setVisible(false);

                } else {
                    inputUsuarioSesion.setText("");
                    inputPasswordUsuario.setText("");
                    main.initView(main.viewAdmin(false));
                    mesajeInicioSesion.setVisible(false);
                }

            } else {
                inputUsuarioSesion.setLineColor(new MyColor().getRED());
                inputPasswordUsuario.setLineColor(new MyColor().getRED());
                mesajeInicioSesion.setVisible(true);
            }
        }
        this.repaint();

    }//GEN-LAST:event_btnInicioSesionActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        if (validacion.ceroCamposVaciosRegistro(inputNombre, inputApellido, inputTelefono, inputCorreo, inputUsuarioRegistro, inputPassword, inputRepetirPassword)
                && validacion.verificacionPassword(textoMensaje, inputPassword, inputRepetirPassword)) {
            empleado.nuevo(
                    inputNombre.getText().trim(),
                    inputApellido.getText().trim(),
                    inputTelefono.getText().trim(),
                    inputCorreo.getText().trim(),
                    inputUsuarioRegistro.getText().trim(),
                    true,
                    inputPassword.getText().trim());
            main.initView(main.viewAdmin(true));

        } else {
            validacion.verificacionPassword(textoMensaje, inputPassword, inputRepetirPassword);
        }
        this.repaint();

    }//GEN-LAST:event_btnRegistrarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel FarmaUCAB;
    private components.PanelRound PanelAdmin;
    private components.PanelRound PanelInicioSesion;
    private components.ButtonCustom btnInicioSesion;
    private components.ButtonCustom btnRegistrar;
    private components.TextField inputApellido;
    private components.TextField inputCorreo;
    private components.TextField inputNombre;
    private components.PasswordField inputPassword;
    private components.PasswordField inputPasswordUsuario;
    private components.PasswordField inputRepetirPassword;
    private components.TextField inputTelefono;
    private components.TextField inputUsuarioRegistro;
    private components.TextField inputUsuarioSesion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel mesajeInicioSesion;
    private javax.swing.JLabel textoMensaje;
    // End of variables declaration//GEN-END:variables

}
