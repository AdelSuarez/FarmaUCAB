package model.dataBase;
import com.itextpdf.text.*;
import com.itextpdf.text.pdf.*;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.*;
import java.io.IOException;
import java.net.URISyntaxException;
//Estos imports de path es por si queremos poner imagenes
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JTable;
public class ConversorPDF {
    protected final String DIRECCIONDB = "jdbc:sqlite:./DataBase.db";
    protected final String ORG = "org.sqlite.JDBC";
    protected Connection conexion = null;
    protected Statement statement = null;
    
     //A partir de acá todo lo necesario para hacer el pdf de pacientes
    public String[] buscarDatosPaciente(String cedula) {
        Connection conexion = null;
        try {
            Class.forName(ORG);
            conexion = DriverManager.getConnection(DIRECCIONDB);
            String sqlSelect = "SELECT * FROM Pacientes WHERE CEDULA = ?";

            PreparedStatement preparedStatement = conexion.prepareStatement(sqlSelect);
            preparedStatement.setString(1, cedula);

            ResultSet resultado = preparedStatement.executeQuery();
            if (resultado.next()) {
                String nombre = resultado.getString("NOMBRE");
                String apellido = resultado.getString("APELLIDO");
                int edad = resultado.getInt("EDAD");
                String cedulaP = resultado.getString("CEDULA");
                String DE = resultado.getString("DE");
                String genero = resultado.getString("GENERO");
                String telefono = resultado.getString("TELEFONO");
                String descripcion = resultado.getString("DESCRIPCION");

                preparedStatement.close();

                // Crear un arreglo con los datos del paciente
                String[] datosPaciente = { nombre, apellido, String.valueOf(edad), genero, telefono, cedulaP, DE, descripcion};
                return datosPaciente;
            } else {
                // No se encontró ningún paciente con esa cédula
                preparedStatement.close();
                return null;
            }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            throw new RuntimeException("Error al buscar el paciente.");
        } finally {
            try {
                if (conexion != null) {
                    conexion.close();
                }
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        }
    }
    
    
    private static void encabezadoPacientes(PdfPTable table) {
    Stream.of("Nombre", "Apellido","Edad","Genero","Telefono","Cedula","DE","Descripción")
      .forEach(columnTitle -> {
        PdfPCell header = new PdfPCell();
        header.setBackgroundColor(BaseColor.LIGHT_GRAY);
        header.setBorderWidth(1);
        header.setPhrase(new Phrase(columnTitle));
        table.addCell(header);
        });
    }
    
    private static void agregarPacienteAPDF(PdfPTable table, String[] datosPaciente) 
        throws URISyntaxException, BadElementException, IOException {
        for(int i=0;i<8;i++){
            PdfPCell horizontalAlignCell = new PdfPCell(new Phrase(datosPaciente[i]));
            horizontalAlignCell.setHorizontalAlignment(Element.ALIGN_CENTER);
            table.addCell(horizontalAlignCell);
        }
    }
    
    private void crearPDFPacientes(PdfPTable tabla, String nombre) throws FileNotFoundException, DocumentException, BadElementException, IOException, URISyntaxException{
        Document documento = new Document();
        documento.setMargins(0, 0, 30, 30);
        
        documento.setPageSize(PageSize.LETTER.rotate());
        try {
            PdfWriter.getInstance(documento, new FileOutputStream(nombre + ".pdf"));
        } catch (DocumentException ex) {
            Logger.getLogger(ConversorPDF.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        Path path = Paths.get(ClassLoader.getSystemResource("images/logo-ucab.png").toURI());
        documento.open();
        
        Image img = Image.getInstance(path.toAbsolutePath().toString());
        img.scalePercent(5);
        documento.add(img);
        Font font = FontFactory.getFont(FontFactory.COURIER, 10, BaseColor.BLACK);
        Paragraph parrafo= new Paragraph("    ",font);
        documento.add(parrafo);
        try {
            documento.add(tabla);
        } catch (DocumentException ex) {
            Logger.getLogger(ConversorPDF.class.getName()).log(Level.SEVERE, null, ex);
        }
        documento.close();
    }
    
    public static PdfPTable crearTablaPacientes(){
        PdfPTable table = new PdfPTable(8);
        encabezadoPacientes(table);
        return table;
    }
    
    public void llenarPDFPacientes(JTable tablaPacientes, String nombre) throws FileNotFoundException, URISyntaxException, BadElementException, IOException, DocumentException{
        ConversorPDF conversor=new ConversorPDF();
        int numeroPacientes=tablaPacientes.getRowCount();
        String[] datosPaciente;
        PdfPTable tabla=crearTablaPacientes();
        float[] anchos={10,10,5,10,15,10,10,15};
        try {
            tabla.setTotalWidth(anchos);
        } catch (DocumentException ex) {
            Logger.getLogger(ConversorPDF.class.getName()).log(Level.SEVERE, null, ex);
        }
        for(int i=0;i<numeroPacientes;i++){
            datosPaciente=conversor.buscarDatosPaciente((String) tablaPacientes.getModel().getValueAt(i, 0));
            agregarPacienteAPDF(tabla,datosPaciente);
        }
        conversor.crearPDFPacientes(tabla, nombre);
    }
    
    //Acá empezará todo lo necesario para hacer el pdf de consultas
    
    public String[] buscarDatosConsulta(String idConsulta) {
        Connection conexion = null;
        try {
            Class.forName(ORG);
            conexion = DriverManager.getConnection(DIRECCIONDB);
            String sqlSelect = "SELECT * FROM Consultas WHERE ID = ?";

            PreparedStatement preparedStatement = conexion.prepareStatement(sqlSelect);
            preparedStatement.setString(1, idConsulta);

            ResultSet resultado = preparedStatement.executeQuery();
            if (resultado.next()) {
                String id = resultado.getString("ID");
                String fecha = resultado.getString("FECHA");
                String cedulaPaciente = resultado.getString("CIPACIENTE");
                String doctor = resultado.getString("DOCTOR");
                String insumo = resultado.getString("INSUMO");
                //String descripcion = resultado.getString("DESCRIPCION");

                preparedStatement.close();

                // Crear un arreglo con los datos del paciente
                String[] datosPaciente = { id, fecha, cedulaPaciente, doctor,insumo};
                return datosPaciente;
            } else {
                // No se encontró ningún paciente con esa cédula
                preparedStatement.close();
                return null;
            }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            throw new RuntimeException("Error al buscar la consulta.");
        } finally {
            try {
                if (conexion != null) {
                    conexion.close();
                }
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        }
    }
    
    private static void encabezadoConsultas(PdfPTable table) {
    Stream.of("ID", "Fecha","CI paciente","Doctor","Insumos")
      .forEach(columnTitle -> {
        PdfPCell header = new PdfPCell();
        header.setBackgroundColor(BaseColor.LIGHT_GRAY);
        header.setBorderWidth(1);
        header.setPhrase(new Phrase(columnTitle));
        table.addCell(header);
        });
    }
    
    public static PdfPTable crearTablaConsultas(){
        PdfPTable table = new PdfPTable(5);
        encabezadoConsultas(table);
        return table;
    }
    
    private static void agregarConsultaAPDF(PdfPTable table, String[] datosConsulta) 
        throws URISyntaxException, BadElementException, IOException {
        for(int i=0;i<5;i++){
            PdfPCell horizontalAlignCell = new PdfPCell(new Phrase(datosConsulta[i]));
            horizontalAlignCell.setHorizontalAlignment(Element.ALIGN_CENTER);
            table.addCell(horizontalAlignCell);
        }
    }
    
    private void crearPDFConsultas(PdfPTable tabla , String nombre) throws FileNotFoundException, DocumentException, BadElementException, IOException, URISyntaxException{
        Document documento = new Document();
        documento.setMargins(0, 0, 30, 30);
        
        documento.setPageSize(PageSize.LETTER.rotate());
        try {
            PdfWriter.getInstance(documento, new FileOutputStream(nombre + ".pdf"));
        } catch (DocumentException ex) {
            Logger.getLogger(ConversorPDF.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        Path path = Paths.get(ClassLoader.getSystemResource("images/logo-ucab.png").toURI());
        documento.open();
        
        Image img = Image.getInstance(path.toAbsolutePath().toString());
        img.scalePercent(5);
        documento.add(img);
        Font font = FontFactory.getFont(FontFactory.COURIER, 10, BaseColor.BLACK);
        Paragraph parrafo= new Paragraph("    ",font);
        documento.add(parrafo);
        try {
            documento.add(tabla);
        } catch (DocumentException ex) {
            Logger.getLogger(ConversorPDF.class.getName()).log(Level.SEVERE, null, ex);
        }
        documento.close();
    }
    
    public void llenarPDFConsultas(JTable tablaConsultas, String nombre) throws FileNotFoundException, URISyntaxException, BadElementException, IOException, DocumentException{
        ConversorPDF conversor=new ConversorPDF();
        int numeroConsultas=tablaConsultas.getRowCount();
        String[] datosConsulta;
        PdfPTable tabla=crearTablaConsultas();
        float[] anchos={5,10,10,10,15};
        try {
            tabla.setTotalWidth(anchos);
        } catch (DocumentException ex) {
            Logger.getLogger(ConversorPDF.class.getName()).log(Level.SEVERE, null, ex);
        }
        for(int i=0;i<numeroConsultas;i++){
            datosConsulta=conversor.buscarDatosConsulta((String) tablaConsultas.getModel().getValueAt(i, 0));
            agregarConsultaAPDF(tabla,datosConsulta);
        }
        conversor.crearPDFConsultas(tabla, nombre);
    }
    
    //Acá empezará todo lo necesario para hacer el pdf de insumos    
    public String[] buscarDatosInsumos(String idInsumos){
        Connection conexion = null;
        try {
            Class.forName(ORG);
            conexion = DriverManager.getConnection(DIRECCIONDB);
            String sqlSelect = "SELECT * FROM Insumos WHERE ID = ?";

            PreparedStatement preparedStatement = conexion.prepareStatement(sqlSelect);
            preparedStatement.setString(1, idInsumos);

            ResultSet resultado = preparedStatement.executeQuery();
            if (resultado.next()) {
                String nombre = resultado.getString("NOMBRE");
                String fecha = resultado.getString("FECHA");
                String stock = resultado.getString("STOCK");
                String cantidadBlister = resultado.getString("CANTIDADBLISTER");
                String descripcion = resultado.getString("DESCRIPCION");

                preparedStatement.close();

                // Crear un arreglo con los datos del paciente
                String[] datosInsumos = { nombre, fecha, stock, cantidadBlister, descripcion};
                return datosInsumos;
            } else {
                // No se encontró ningún paciente con esa cédula
                preparedStatement.close();
                return null;
            }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            throw new RuntimeException("Error al buscar los Insumos.");
        } finally {
            try {
                if (conexion != null) {
                    conexion.close();
                }
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        }
    }
    
    private static void encabezadoInsumos(PdfPTable table) {
    Stream.of("Nombre", "Fecha","Stock","Cantidad de Blister","Descripción")
      .forEach(columnTitle -> {
        PdfPCell header = new PdfPCell();
        header.setBackgroundColor(BaseColor.LIGHT_GRAY);
        header.setBorderWidth(1);
        header.setPhrase(new Phrase(columnTitle));
        table.addCell(header);
        });
    }
    
    public static PdfPTable crearTablaInsumos(){
        PdfPTable table = new PdfPTable(5);
        encabezadoInsumos(table);
        return table;
    }
    
    private static void agregarInsumosAPDF(PdfPTable table, String[] datosInsumos) 
        throws URISyntaxException, BadElementException, IOException {
        for(int i=0;i<5;i++){
            PdfPCell horizontalAlignCell = new PdfPCell(new Phrase(datosInsumos[i]));
            horizontalAlignCell.setHorizontalAlignment(Element.ALIGN_CENTER);
            table.addCell(horizontalAlignCell);
        }
    }
    
    private void crearPDFInsumos(PdfPTable tabla, String nombre) throws FileNotFoundException, DocumentException, BadElementException, IOException, URISyntaxException{
        Document documento = new Document();
        documento.setMargins(0, 0, 30, 30);
        
        documento.setPageSize(PageSize.LETTER.rotate());
        try {
            PdfWriter.getInstance(documento, new FileOutputStream(nombre + ".pdf"));
        } catch (DocumentException ex) {
            Logger.getLogger(ConversorPDF.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        Path path = Paths.get(ClassLoader.getSystemResource("images/logo-ucab.png").toURI());
        documento.open();
        
        Image img = Image.getInstance(path.toAbsolutePath().toString());
        img.scalePercent(5);
        documento.add(img);
        Font font = FontFactory.getFont(FontFactory.COURIER, 10, BaseColor.BLACK);
        Paragraph parrafo= new Paragraph("    ",font);
        documento.add(parrafo);
        try {
            documento.add(tabla);
        } catch (DocumentException ex) {
            Logger.getLogger(ConversorPDF.class.getName()).log(Level.SEVERE, null, ex);
        }
        documento.close();
    }
    
    public void llenarPDFInsumos(JTable tablaInsumos, String nombre) throws FileNotFoundException, URISyntaxException, BadElementException, IOException, DocumentException{
        ConversorPDF conversor=new ConversorPDF();
        int numeroConsultas=tablaInsumos.getRowCount();
        String[] datosInsumos;
        PdfPTable tabla=crearTablaInsumos();
        float[] anchos={5,10,10,10,15};
        try {
            tabla.setTotalWidth(anchos);
        } catch (DocumentException ex) {
            Logger.getLogger(ConversorPDF.class.getName()).log(Level.SEVERE, null, ex);
        }
        for(int i=0;i<numeroConsultas;i++){
            datosInsumos=conversor.buscarDatosInsumos((String) tablaInsumos.getModel().getValueAt(i, 0));
            agregarInsumosAPDF(tabla,datosInsumos);
        }
        conversor.crearPDFInsumos(tabla, nombre);
    }
    
    //Acá empezará todo lo necesario para hacer el pdf de estadisticas
    public String[] buscarDatosUsoMedicamentos(String id){
        Connection conexion = null;
        try {
            InsumoDB insumo=new InsumoDB();
            Class.forName(ORG);
            conexion = DriverManager.getConnection(DIRECCIONDB);
            String sqlSelect = "SELECT * FROM Insumos WHERE ID = ?";

            PreparedStatement preparedStatement = conexion.prepareStatement(sqlSelect);
            preparedStatement.setString(1, id);

            ResultSet resultado = preparedStatement.executeQuery();
            if (resultado.next()) {
                String nombre = resultado.getString("NOMBRE");
                String diario=String.valueOf(insumo.usoDiario(id));
                String semanal =String.valueOf(insumo.calcularUsoSemanal(id));
                String mensual = String.valueOf(insumo.calcularUsoMensual(id));

                preparedStatement.close();

                // Crear un arreglo con los datos del paciente
                String[] datosUso = { id, nombre, diario, semanal, mensual};
                return datosUso;
            } else {
                // No se encontró ningún paciente con esa cédula
                preparedStatement.close();
                return null;
            }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            throw new RuntimeException("Error al buscar los Insumos.");
        } finally {
            try {
                if (conexion != null) {
                    conexion.close();
                }
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        }
    }
    
    private static void encabezadoUsoMedicamentos(PdfPTable table) {
    Stream.of("ID", "Nombre","Uso diario","Uso semanal","Uso mensual")
      .forEach(columnTitle -> {
        PdfPCell header = new PdfPCell();
        header.setBackgroundColor(BaseColor.LIGHT_GRAY);
        header.setBorderWidth(1);
        header.setPhrase(new Phrase(columnTitle));
        table.addCell(header);
        });
    }
    
    public static PdfPTable crearTablaUsoMedicamentos(){
        PdfPTable table = new PdfPTable(5);
        encabezadoUsoMedicamentos(table);
        return table;
    }
    
    private static void agregarUsoMedicamentoAPDF(PdfPTable table, String[] datosInsumos) 
        throws URISyntaxException, BadElementException, IOException {
        for(int i=0;i<5;i++){
            PdfPCell horizontalAlignCell = new PdfPCell(new Phrase(datosInsumos[i]));
            horizontalAlignCell.setHorizontalAlignment(Element.ALIGN_CENTER);
            table.addCell(horizontalAlignCell);
        }
    }
    
    private void crearPDFUsoMedicamentos(PdfPTable tabla, String nombre) throws FileNotFoundException, DocumentException, BadElementException, IOException, URISyntaxException{
        Document documento = new Document();
        documento.setMargins(0, 0, 30, 30);
        
        documento.setPageSize(PageSize.LETTER.rotate());
        try {
            PdfWriter.getInstance(documento, new FileOutputStream(nombre + ".pdf"));
        } catch (DocumentException ex) {
            Logger.getLogger(ConversorPDF.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        Path path = Paths.get(ClassLoader.getSystemResource("images/logo-ucab.png").toURI());
        documento.open();
        
        Image img = Image.getInstance(path.toAbsolutePath().toString());
        img.scalePercent(5);
        documento.add(img);
        Font font = FontFactory.getFont(FontFactory.COURIER, 10, BaseColor.BLACK);
        Paragraph parrafo= new Paragraph("    ",font);
        documento.add(parrafo);
        try {
            documento.add(tabla);
        } catch (DocumentException ex) {
            Logger.getLogger(ConversorPDF.class.getName()).log(Level.SEVERE, null, ex);
        }
        documento.close();
    }
    
    public void llenarPDFUsoMedicamentos(JTable tablaMedicamentos, String nombre) throws FileNotFoundException, URISyntaxException, BadElementException, IOException, DocumentException{
        ConversorPDF conversor=new ConversorPDF();
        int numeroInsumos=tablaMedicamentos.getRowCount();
        String[] datosMedicamentos;
        PdfPTable tabla=crearTablaUsoMedicamentos();
        float[] anchos={5,10,10,10,15};
        try {
            tabla.setTotalWidth(anchos);
        } catch (DocumentException ex) {
            Logger.getLogger(ConversorPDF.class.getName()).log(Level.SEVERE, null, ex);
        }
        for(int i=0;i<numeroInsumos;i++){
            datosMedicamentos=conversor.buscarDatosUsoMedicamentos((String) tablaMedicamentos.getModel().getValueAt(i, 0));
            agregarUsoMedicamentoAPDF(tabla,datosMedicamentos);
        }
        conversor.crearPDFUsoMedicamentos(tabla, nombre);
    }
    
    
    //a partir de aca todo lo necesario para el pdf de numero de consultas
    
    private static void encabezadoNumeroConsultas(PdfPTable table) {
    Stream.of("ID", "Fecha","Numero de consultas")
      .forEach(columnTitle -> {
        PdfPCell header = new PdfPCell();
        header.setBackgroundColor(BaseColor.LIGHT_GRAY);
        header.setBorderWidth(1);
        header.setPhrase(new Phrase(columnTitle));
        table.addCell(header);
        });
    }
    
    private static void agregarNumeroConsultasAPDF(PdfPTable table, String[] datos) 
        throws URISyntaxException, BadElementException, IOException {
        for(int i=0;i<3;i++){
            PdfPCell horizontalAlignCell = new PdfPCell(new Phrase(datos[i]));
            horizontalAlignCell.setHorizontalAlignment(Element.ALIGN_CENTER);
            table.addCell(horizontalAlignCell);
        }
    }
    
    private void crearPDFNumeroConsultas(PdfPTable tabla, String nombre) throws FileNotFoundException, DocumentException, BadElementException, IOException, URISyntaxException{
        Document documento = new Document();
        documento.setMargins(0, 0, 30, 30);
        
        try {
            PdfWriter.getInstance(documento, new FileOutputStream(nombre + ".pdf"));
        } catch (DocumentException ex) {
            Logger.getLogger(ConversorPDF.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        Path path = Paths.get(ClassLoader.getSystemResource("images/logo-ucab.png").toURI());
        documento.open();
        
        Image img = Image.getInstance(path.toAbsolutePath().toString());
        img.scalePercent(5);
        documento.add(img);
        Font font = FontFactory.getFont(FontFactory.COURIER, 10, BaseColor.BLACK);
        Paragraph parrafo= new Paragraph("    ",font);
        documento.add(parrafo);
        try {
            documento.add(tabla);
        } catch (DocumentException ex) {
            Logger.getLogger(ConversorPDF.class.getName()).log(Level.SEVERE, null, ex);
        }
        documento.close();
    }
    
    public static PdfPTable crearTablaNumeroConsultas(){
        PdfPTable table = new PdfPTable(3);
        encabezadoNumeroConsultas(table);
        return table;
    }
    
    public void llenarPDFNumeroConsultas(String nombre) throws URISyntaxException, BadElementException, IOException, FileNotFoundException, DocumentException {
        try {
            ConversorPDF conversor=new ConversorPDF();
            Class.forName(ORG);
            conexion = DriverManager.getConnection(DIRECCIONDB);
            String sqlConsulta = "SELECT * FROM ConsultasMensuales ORDER BY DIA";

            statement = (Statement) conexion.createStatement();
            ResultSet resultado = statement.executeQuery(sqlConsulta);

            String[] datos = new String[3];
            PdfPTable tabla=crearTablaNumeroConsultas();
            while (resultado.next()) {
                datos[0] = resultado.getString(1);
                datos[1] = resultado.getString(2);
                datos[2] = resultado.getString(3);
                agregarNumeroConsultasAPDF(tabla,datos);
                
            }
            conversor.crearPDFNumeroConsultas(tabla, nombre);

            resultado.close();
            statement.close();

        } catch (ClassNotFoundException | SQLException e) {
            System.out.println(e.getMessage() + "error");
        } finally {
            try {
                if (conexion != null) {
                    conexion.close();
                }
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        }

    }
}