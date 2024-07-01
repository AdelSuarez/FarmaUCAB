package dialog;

import com.itextpdf.text.DocumentException;
import java.awt.Color;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URISyntaxException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.dataBase.ConversorPDF;
import validaciones.ValidacionArchivo;

import views.Dashboard;
import views.ViewInsumo;
import views.ViewPaciente;
import views.viewsGestion.GestionConsulta;


public class DialogGuardarNombrePDF extends javax.swing.JFrame {

    private Dashboard dashboard;
    private ValidacionArchivo validacionArchivo = new ValidacionArchivo(); 
    private GestionConsulta viewGestionConsulta = new GestionConsulta(dashboard);
    private ViewPaciente viewPaciente = new ViewPaciente(dashboard);
    private ViewInsumo viewInsumo = new ViewInsumo(dashboard);
    private ConversorPDF conversorPdf = new ConversorPDF();
    private String NombrePredeterminado = ""; 
    private int NumeroBoton = -1;
    
    public DialogGuardarNombrePDF(String nombre, int numBoton) {
        this.setUndecorated(true);
        initComponents();
        setBackground(new Color(0, 0, 0, 0));
        this.NombrePredeterminado = nombre;
        this.NumeroBoton = numBoton; 
        nombrePredetermindado();
        this.repaint();
    }
    
    private DialogGuardarNombrePDF() {
        this.setUndecorated(true);
        initComponents();
        setBackground(new Color(0, 0, 0, 0));
        this.repaint();
    }
    public void nombrePredetermindado() {
        nombrePDF.setText("datos_"+ NombrePredeterminado + "_" + fechaActual());
    }
    
    public static String fechaActual() {

        Date fecha = new Date();
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd-MM-YYYY");

        return formatoFecha.format(fecha);
    }

    public void GuardarPDF() throws URISyntaxException, IOException, FileNotFoundException, DocumentException {
        switch (NumeroBoton) {
            case 1:
                conversorPdf.llenarPDFConsultas(viewGestionConsulta.tablaConsulta,nombrePDF.getText());
                break;
            case 2:
                conversorPdf.llenarPDFPacientes(viewPaciente.tablaPacientes,nombrePDF.getText());
                break;
            case 3:
                conversorPdf.llenarPDFInsumos(viewInsumo.tablaInsumos,nombrePDF.getText());
                break;
            case 4:
                conversorPdf.llenarPDFUsoMedicamentos(viewInsumo.tablaInsumos,nombrePDF.getText());
                break;
            case 5:
                conversorPdf.llenarPDFNumeroConsultas(nombrePDF.getText());
                break;    
        }
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelRound1 = new components.PanelRound();
        btnGuardar = new components.ButtonCustom();
        nombrePaciente = new javax.swing.JLabel();
        btnCancelar = new components.ButtonCustom();
        nombrePDF = new components.TextField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelRound1.setBackground(new java.awt.Color(255, 255, 255));
        panelRound1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        panelRound1.setRoundBottomLeft(15);
        panelRound1.setRoundBottomRight(15);
        panelRound1.setRoundTopLeft(15);
        panelRound1.setRoundTopRight(15);

        btnGuardar.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardar.setText("Guardar");
        btnGuardar.setBorderColor(new java.awt.Color(255, 255, 255));
        btnGuardar.setColor(new java.awt.Color(0, 204, 255));
        btnGuardar.setColorClick(new java.awt.Color(0, 204, 255));
        btnGuardar.setColorOver(new java.awt.Color(102, 153, 255));
        btnGuardar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnGuardar.setPreferredSize(new java.awt.Dimension(230, 50));
        btnGuardar.setRadius(15);
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        nombrePaciente.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        btnCancelar.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelar.setBorderColor(new java.awt.Color(255, 255, 255));
        btnCancelar.setColor(new java.awt.Color(244, 208, 63));
        btnCancelar.setColorClick(new java.awt.Color(220, 187, 57));
        btnCancelar.setColorOver(new java.awt.Color(195, 166, 50));
        btnCancelar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnCancelar.setLabel("Cancelar");
        btnCancelar.setPreferredSize(new java.awt.Dimension(230, 50));
        btnCancelar.setRadius(15);
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        nombrePDF.setForeground(new java.awt.Color(80, 80, 80));
        nombrePDF.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        nombrePDF.setLabelText("Nombre del Archivo:");

        javax.swing.GroupLayout panelRound1Layout = new javax.swing.GroupLayout(panelRound1);
        panelRound1.setLayout(panelRound1Layout);
        panelRound1Layout.setHorizontalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelRound1Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nombrePaciente))
                .addGap(49, 49, 49))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(nombrePDF, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );
        panelRound1Layout.setVerticalGroup(
            panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelRound1Layout.createSequentialGroup()
                .addGap(101, 101, 101)
                .addComponent(nombrePDF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(nombrePaciente)
                .addGap(18, 18, 18)
                .addGroup(panelRound1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(45, Short.MAX_VALUE))
        );

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/Icono Archivo.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(178, 178, 178)
                .addComponent(jLabel2)
                .addContainerGap(183, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 26, Short.MAX_VALUE)
                    .addComponent(panelRound1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 27, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jLabel2)
                .addContainerGap(209, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 10, Short.MAX_VALUE)
                    .addComponent(panelRound1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 9, Short.MAX_VALUE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        if (validacionArchivo.datosValidados(nombrePDF)) {
            try {
                GuardarPDF();
            } catch (URISyntaxException ex) {
                Logger.getLogger(DialogGuardarNombrePDF.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(DialogGuardarNombrePDF.class.getName()).log(Level.SEVERE, null, ex);
            } catch (DocumentException ex) {
                Logger.getLogger(DialogGuardarNombrePDF.class.getName()).log(Level.SEVERE, null, ex);
            }   
        this.dispose();
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(DialogGuardarNombrePDF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DialogGuardarNombrePDF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DialogGuardarNombrePDF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DialogGuardarNombrePDF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DialogGuardarNombrePDF().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private components.ButtonCustom btnCancelar;
    private components.ButtonCustom btnGuardar;
    private javax.swing.JLabel jLabel2;
    public components.TextField nombrePDF;
    private javax.swing.JLabel nombrePaciente;
    private components.PanelRound panelRound1;
    // End of variables declaration//GEN-END:variables
}
