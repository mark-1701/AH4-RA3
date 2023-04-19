package modelo;

import com.itextpdf.text.*;
import com.itextpdf.text.pdf.*;
import java.awt.Desktop;
import java.io.*;
import java.time.LocalDate;
import javax.swing.JOptionPane;
import modeloDAO.SucursalDAO;

public class GenerarPDF {
    
    SucursalDAO daoS = new SucursalDAO();
    
    public void generar_pdf() throws FileNotFoundException, DocumentException {
        FileOutputStream gen = new FileOutputStream("Ejemplo.pdf");
        Document documento = new Document();
        PdfWriter.getInstance(documento, gen);
        documento.open();
        BaseColor color = new BaseColor(255, 255, 255); // Rojo
        Font font = new Font(Font.FontFamily.UNDEFINED, 12, Font.NORMAL, color);
        
        Paragraph parrafo = new Paragraph("Reporte de la tabla Sucursales");
        parrafo.setAlignment(1);
        documento.add(parrafo);
        documento.add(new Paragraph("\n"));
        String texto = "Toda la informacion es delicada y usted se compromete a la debida utilización.\n\n";
        documento.add(new Paragraph(texto));

        PdfPTable tabla = new PdfPTable(5);
        tabla.setWidthPercentage(100);
        tabla.getDefaultCell().setHorizontalAlignment(Element.ALIGN_CENTER);
        PdfPCell codigo = new PdfPCell(new Phrase("Codigo", font));
        codigo.setBackgroundColor(BaseColor.RED);
        codigo.setHorizontalAlignment(Element.ALIGN_CENTER);
        PdfPCell nombre = new PdfPCell(new Phrase("Nombre", font));
        nombre.setBackgroundColor(BaseColor.RED);
        nombre.setHorizontalAlignment(Element.ALIGN_CENTER);
        PdfPCell direccion = new PdfPCell(new Phrase("Direccion", font));
        direccion.setBackgroundColor(BaseColor.RED);
        direccion.setHorizontalAlignment(Element.ALIGN_CENTER);
        PdfPCell correo = new PdfPCell(new Phrase("Correo", font));
        correo.setBackgroundColor(BaseColor.RED);
        correo.setHorizontalAlignment(Element.ALIGN_CENTER);
        PdfPCell telefono = new PdfPCell(new Phrase("Telefono", font));
        telefono.setBackgroundColor(BaseColor.RED);
        telefono.setHorizontalAlignment(Element.ALIGN_CENTER);

        tabla.addCell(codigo);
        tabla.addCell(nombre);
        tabla.addCell(direccion);
        tabla.addCell(correo);
        tabla.addCell(telefono);
        
        for (Sucursal s : daoS.listar()) {
            tabla.addCell(String.valueOf(s.getCodigo()));
            tabla.addCell(s.getNombre());
            tabla.addCell(s.getDireccion());
            tabla.addCell(s.getCorreo());
            tabla.addCell(s.getTelefono());
        }

        // Crear un objeto de tipo float array para el ancho de cada columna
        float[] columnWidths = {2f, 2f, 2f, 2f, 2f};
        tabla.setTotalWidth(columnWidths);
        documento.add(tabla);
        documento.add(new Paragraph("\nDocumento creado el " + LocalDate.now()));
        documento.close();
        JOptionPane.showMessageDialog(null, "El archivo se creo correctamente", "Alerta", JOptionPane.WARNING_MESSAGE);
        try {
            File sucursales_doc = new File("Ejemplo.pdf");
            Desktop.getDesktop().open(sucursales_doc);
        } catch (Exception e) {
        }
    }
}
