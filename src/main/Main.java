package main;

//  Adel Suárez
//  Santiago Chirinos
//  Eros Dos Ramos
//  Usamos Segregacion de interfacez, porque cada interfaz grafica hace una sola cosa y no obliga al cliente a usar cosas que no quiera.
//  Usamos Sustitucion de Liskov porque todo lo que hereda de otra clase en nuestro programa puede perfectamente ser usado como su padre.
import model.dataBase.DataBase;
import java.awt.BorderLayout;
import style.styleWindow;

// colocar todo en español, pero despues de la entrega final, colocarlo en ingles para el portafolio y repositorio
// optimizar codigo, testear las ventanas para conseguir errores, y si se puede implementar test unitarios, no mostrar los test en la entrega, 
public class Main extends javax.swing.JFrame {

    private model.dataBase.DataBase DB = new DataBase();
    private views.Login login;
    private views.Dashboard dashboard;

    private boolean admin = false;
    private String[] datosEmpleado = {"0", "test", "test"};

    public Main() {
//      Configuraciones de la ventana
        login = new views.Login(this);
        dashboard = new views.Dashboard(this, admin, datosEmpleado);
        styleWindow ventana = new styleWindow();
        initComponents();
        ventana.configuracionesVentana(this, 1400, 800, "Enfermeria UCAB");
        setIconImage(ventana.getIconImage("images/logo.png"));

        // DB
        iniciadorDB();

        // Interfaz
        initView(viewAdmin(true, datosEmpleado));
//        initView(login);

    }

    public views.Dashboard viewAdmin(boolean admin, String[] datosUsuario) {
        return dashboard = new views.Dashboard(this, admin, datosUsuario);
    }

    public views.Login getLogin() {
        return login;
    }

    public void initView(javax.swing.JPanel view) {
        background.removeAll();
        background.add(view, BorderLayout.CENTER);
        background.revalidate();
        background.repaint();
    }

    private void iniciadorDB() {
        DB.createDB();
        DB.createTabla(DB.getSqlCreateTablaEmpleados());
        DB.createTabla(DB.getSqlCreateTablaPacientes());
        DB.createTabla(DB.getSqlCreateTablaInsumo());
        DB.createTabla(DB.getSqlCreateTablaConsultas());

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        background.setBackground(new java.awt.Color(255, 255, 255));
        background.setPreferredSize(new java.awt.Dimension(1400, 800));

        javax.swing.GroupLayout backgroundLayout = new javax.swing.GroupLayout(background);
        background.setLayout(backgroundLayout);
        backgroundLayout.setHorizontalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1400, Short.MAX_VALUE)
        );
        backgroundLayout.setVerticalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );

        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background;
    // End of variables declaration//GEN-END:variables
}
