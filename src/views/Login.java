
package views;

import java.awt.Color;
import database.DataBase;

// Mejorar diseño del login

public class Login extends javax.swing.JPanel {
    private main.Main main;
    private String aviso = " (Campo vacío)";

    public Login(main.Main main) {
        this.main = main;
        initComponents();
        textoPassword.setVisible(false);
        this.setSize(1200,800);
        this.setLocation(0,0);
        
        // Muestra el panel de inicio de sesion dependiendo si hay usuarios o no en la tabla empleados
        if (new DataBase().isEmptyTabla("Empleados")){
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
        PanelAdmin = new components.PanelRound();
        btnRegistrar = new button.ButtonCustom();
        inputRepetirPassword = new components.PasswordField();
        inputPassword = new components.PasswordField();
        inputTelefono = new components.TextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        inputApellido = new components.TextField();
        inputNombre = new components.TextField();
        inputUsuarioRegistro = new components.TextField();
        inputCorreo = new components.TextField();
        textoPassword = new javax.swing.JLabel();
        PanelInicioSesion = new components.PanelRound();
        btnInicioSesion = new button.ButtonCustom();
        inputPasswordUsuario = new components.PasswordField();
        jLabel3 = new javax.swing.JLabel();
        inputUsuarioSesion = new components.TextField();

        setBackground(new java.awt.Color(231, 231, 239));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        FarmaUCAB.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        FarmaUCAB.setText("Enfermeria UCAB");
        add(FarmaUCAB, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 30, -1, -1));

        PanelAdmin.setBackground(new java.awt.Color(255, 255, 255));
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

        textoPassword.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        textoPassword.setForeground(new java.awt.Color(225, 0, 0));
        textoPassword.setText("Las contraseñas no coinciden!");

        javax.swing.GroupLayout PanelAdminLayout = new javax.swing.GroupLayout(PanelAdmin);
        PanelAdmin.setLayout(PanelAdminLayout);
        PanelAdminLayout.setHorizontalGroup(
            PanelAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelAdminLayout.createSequentialGroup()
                .addGroup(PanelAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelAdminLayout.createSequentialGroup()
                        .addGap(149, 149, 149)
                        .addComponent(jLabel2))
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
                            .addComponent(textoPassword, javax.swing.GroupLayout.Alignment.LEADING))))
                .addContainerGap(41, Short.MAX_VALUE))
            .addGroup(PanelAdminLayout.createSequentialGroup()
                .addContainerGap(63, Short.MAX_VALUE)
                .addGroup(PanelAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelAdminLayout.createSequentialGroup()
                        .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(127, 127, 127))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelAdminLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(56, 56, 56))))
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
                .addComponent(textoPassword)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
        );

        add(PanelAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 120, -1, 560));

        PanelInicioSesion.setBackground(new java.awt.Color(255, 255, 255));
        PanelInicioSesion.setRoundBottomLeft(30);
        PanelInicioSesion.setRoundBottomRight(30);
        PanelInicioSesion.setRoundTopLeft(30);
        PanelInicioSesion.setRoundTopRight(30);

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

        inputPasswordUsuario.setToolTipText("");
        inputPasswordUsuario.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        inputPasswordUsuario.setLabelText("Contraseña");
        inputPasswordUsuario.setShowAndHide(true);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setText("Iniciar sesion");

        inputUsuarioSesion.setForeground(new java.awt.Color(80, 80, 80));
        inputUsuarioSesion.setToolTipText("");
        inputUsuarioSesion.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        inputUsuarioSesion.setLabelText("Usuario");

        javax.swing.GroupLayout PanelInicioSesionLayout = new javax.swing.GroupLayout(PanelInicioSesion);
        PanelInicioSesion.setLayout(PanelInicioSesionLayout);
        PanelInicioSesionLayout.setHorizontalGroup(
            PanelInicioSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelInicioSesionLayout.createSequentialGroup()
                .addGroup(PanelInicioSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelInicioSesionLayout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addComponent(jLabel3))
                    .addGroup(PanelInicioSesionLayout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(PanelInicioSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(inputPasswordUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(inputUsuarioSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(41, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelInicioSesionLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnInicioSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(126, 126, 126))
        );
        PanelInicioSesionLayout.setVerticalGroup(
            PanelInicioSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelInicioSesionLayout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel3)
                .addGap(108, 108, 108)
                .addComponent(inputUsuarioSesion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(inputPasswordUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 198, Short.MAX_VALUE)
                .addComponent(btnInicioSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
        );

        add(PanelInicioSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 120, -1, 560));
    }// </editor-fold>//GEN-END:initComponents

    private void btnInicioSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInicioSesionActionPerformed
        // todavia en desarrollo, primero hay que implementar el registro del primer usuario
//        validarInput(inputUsuarioSesion, "Usuario");
//        validarInputPassword(inputPasswordUsuario, "Contraseña");
        
        System.out.println(inputUsuarioSesion.getText());
        System.out.println(inputPasswordUsuario.getText());
    }//GEN-LAST:event_btnInicioSesionActionPerformed

   
    
    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed

        if (ceroCamposVacios()){
            
            if (verificacionPassword()){
                System.out.println("las claves son iguales");
                System.out.println("No hay campos vacios");

            } else {
                textoPassword.setVisible(true);
            }
        } else {
            System.out.println("hay campos vacios");
            verificacionPassword();
        }
        
//        new DataBase().insertEmpleado(
//                inputNombre.getText().trim(),
//                inputApellido.getText().trim(), 
//                Integer.parseInt(inputTelefono.getText().trim()), 
//                inputCorreo.getText().trim(),
//                inputUsuarioRegistro.getText().trim(), 
//                true,
//                inputPassword.getText().trim());        
    }//GEN-LAST:event_btnRegistrarActionPerformed
    
    private boolean verificacionPassword(){
        boolean estanIguales = false;
        // Activa el JLabel que muestra si las dos contraseñas son iguales
        if (inputPassword.getText().trim().equals(inputRepetirPassword.getText().trim())){
            textoPassword.setVisible(false);
            estanIguales = true;

        } else {
            textoPassword.setVisible(true);
        }
        return estanIguales;
    }
    
    private boolean ceroCamposVacios(){
        boolean estanVacios = false;
        // se usa un array para que se se guarde los cambios que se realizan a la variable con las otras funciones
        int[] contadorInput = {0};
        
        validarInput(inputNombre, "Nombre", contadorInput);
        validarInput(inputApellido, "Apellido", contadorInput);
        validarInput(inputTelefono, "Telefono", contadorInput);
        validarInput(inputCorreo, "Correo", contadorInput);
        validarInput(inputUsuarioRegistro, "Usuario", contadorInput);
        validarInputPassword(inputPassword, "Contraseña", contadorInput);
        validarInputPassword(inputRepetirPassword, "Confirmar contraseña", contadorInput);
        System.out.println(contadorInput[0]);
        
        if(contadorInput[0] == 7){
            estanVacios = true;
        }
        return estanVacios;
    }
    
    // no se ha usado
    private boolean validarNombre(components.TextField textfiel){
        String regex = "^[a-zA-Z]*$";
        return textfiel.getText().matches(regex);
    }
     
    
    // Verificadores de campos vacios
    private void validarInput(components.TextField textfiel, String Texto, int[] contador){
        if(textfiel.getText().equals("")){
            textfiel.setLineColor(new Color(225,0,0));
            textfiel.setLabelText(Texto + aviso);
        } else {
            textfiel.setLineColor(new Color(3, 155, 216));
            textfiel.setLabelText(Texto);
            contador[0]++;
        }
        this.repaint();
    }
    
    private void validarInputPassword(components.PasswordField textfielpassword, String Texto, int[] contador){
        if(textfielpassword.getText().equals("")){
            textfielpassword.setLineColor(new Color(225,0,0));
            textfielpassword.setLabelText(Texto + aviso);
        } else {
            textfielpassword.setLineColor(new Color(3, 155, 216));
            textfielpassword.setLabelText(Texto);
            contador[0]++;
        }
        this.repaint();
    }
    //

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel FarmaUCAB;
    private components.PanelRound PanelAdmin;
    private components.PanelRound PanelInicioSesion;
    private button.ButtonCustom btnInicioSesion;
    private button.ButtonCustom btnRegistrar;
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
    private javax.swing.JLabel textoPassword;
    // End of variables declaration//GEN-END:variables

}
