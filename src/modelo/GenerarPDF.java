package modelo;

import com.itextpdf.text.*;
import com.itextpdf.text.pdf.*;
import java.awt.Desktop;
import java.io.*;
import java.time.LocalDate;
import javax.swing.JOptionPane;
import modeloDAO.ClienteDAO;
import modeloDAO.ProductoDAO;
import modeloDAO.SucursalDAO;
import modeloDAO.VendedorDAO;

public class GenerarPDF {

    SucursalDAO daoS = new SucursalDAO();
    ProductoDAO daoP = new ProductoDAO();
    ClienteDAO daoC = new ClienteDAO();
    VendedorDAO daoV = new VendedorDAO();

    //MODELO PARA PDF SUCURSALES
    public void generarPDFSucursales() throws FileNotFoundException, DocumentException {
        FileOutputStream gen = new FileOutputStream("Sucursales.pdf");
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
        float[] columnWidths = {2f, 3f, 3f, 3f, 2f};
        tabla.setTotalWidth(columnWidths);
        
        documento.add(tabla);
        documento.add(new Paragraph("\nDocumento creado el " + LocalDate.now()));
        documento.close();
        JOptionPane.showMessageDialog(null, "El archivo se creo correctamente", "Alerta", JOptionPane.WARNING_MESSAGE);
        try {
            File sucursales_doc = new File("Sucursales.pdf");
            Desktop.getDesktop().open(sucursales_doc);
        } catch (Exception e) {
        }
    }
    
    //MODELO PARA PDF PRODUCTOS
    public void generarPDFProductos() throws FileNotFoundException, DocumentException {
        FileOutputStream gen = new FileOutputStream("Productos.pdf");
        Document documento = new Document();
        PdfWriter.getInstance(documento, gen);
        documento.open();
        BaseColor color = new BaseColor(255, 255, 255); // Rojo
        Font font = new Font(Font.FontFamily.UNDEFINED, 12, Font.NORMAL, color);
        Paragraph parrafo = new Paragraph("Reporte de la tabla Productos");
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
        PdfPCell descripcion = new PdfPCell(new Phrase("Descripcion", font));
        descripcion.setBackgroundColor(BaseColor.RED);
        descripcion.setHorizontalAlignment(Element.ALIGN_CENTER);
        PdfPCell cantidad = new PdfPCell(new Phrase("Cantidad", font));
        cantidad.setBackgroundColor(BaseColor.RED);
        cantidad.setHorizontalAlignment(Element.ALIGN_CENTER);
        PdfPCell precio = new PdfPCell(new Phrase("Telefono", font));
        precio.setBackgroundColor(BaseColor.RED);
        precio.setHorizontalAlignment(Element.ALIGN_CENTER);

        tabla.addCell(codigo);
        tabla.addCell(nombre);
        tabla.addCell(descripcion);
        tabla.addCell(cantidad);
        tabla.addCell(precio);

        for (Producto p : daoP.listar()) {
            tabla.addCell(String.valueOf(p.getCodigo()));
            tabla.addCell(p.getNombre());
            tabla.addCell(p.getDescripcion());
            tabla.addCell(String.valueOf(p.getCantidad()));
            tabla.addCell(String.valueOf(p.getPrecio()));
        }

        // Crear un objeto de tipo float array para el ancho de cada columna
        float[] columnWidths = {2f, 3f, 3f, 2f, 2f};
        tabla.setTotalWidth(columnWidths);
        
        documento.add(tabla);
        documento.add(new Paragraph("\nDocumento creado el " + LocalDate.now()));
        documento.close();
        JOptionPane.showMessageDialog(null, "El archivo se creo correctamente", "Alerta", JOptionPane.WARNING_MESSAGE);
        try {
            File sucursales_doc = new File("Productos.pdf");
            Desktop.getDesktop().open(sucursales_doc);
        } catch (Exception e) {
        }
    }
    
    //MODELO PARA PDF CLIENTES
    public void generarPDFClientes() throws FileNotFoundException, DocumentException {
        FileOutputStream gen = new FileOutputStream("Clientes.pdf");
        Document documento = new Document();
        PdfWriter.getInstance(documento, gen);
        documento.open();
        BaseColor color = new BaseColor(255, 255, 255); // Rojo
        Font font = new Font(Font.FontFamily.UNDEFINED, 12, Font.NORMAL, color);
        Paragraph parrafo = new Paragraph("Reporte de la tabla Clientes");
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
        PdfPCell nit = new PdfPCell(new Phrase("NIT", font));
        nit.setBackgroundColor(BaseColor.RED);
        nit.setHorizontalAlignment(Element.ALIGN_CENTER);
        PdfPCell correo = new PdfPCell(new Phrase("Correo", font));
        correo.setBackgroundColor(BaseColor.RED);
        correo.setHorizontalAlignment(Element.ALIGN_CENTER);
        PdfPCell genero = new PdfPCell(new Phrase("Genero", font));
        genero.setBackgroundColor(BaseColor.RED);
        genero.setHorizontalAlignment(Element.ALIGN_CENTER);

        tabla.addCell(codigo);
        tabla.addCell(nombre);
        tabla.addCell(nit);
        tabla.addCell(correo);
        tabla.addCell(genero);

        for (Cliente c : daoC.listar()) {
            tabla.addCell(String.valueOf(c.getCodigo()));
            tabla.addCell(c.getNombre());
            tabla.addCell(c.getNit());
            tabla.addCell(c.getCorreo());
            tabla.addCell(c.getGenero());
        }

        // Crear un objeto de tipo float array para el ancho de cada columna
        float[] columnWidths = {2f, 2f, 2f, 4f, 2f};
        tabla.setTotalWidth(columnWidths);
        
        documento.add(tabla);
        documento.add(new Paragraph("\nDocumento creado el " + LocalDate.now()));
        documento.close();
        JOptionPane.showMessageDialog(null, "El archivo se creo correctamente", "Alerta", JOptionPane.WARNING_MESSAGE);
        try {
            File sucursales_doc = new File("Clientes.pdf");
            Desktop.getDesktop().open(sucursales_doc);
        } catch (Exception e) {
        }
    }
    
    //MODELO PARA PDF VENDEDORES
    public void generarPDFVendedores() throws FileNotFoundException, DocumentException {
        FileOutputStream gen = new FileOutputStream("Vendedores.pdf");
        Document documento = new Document();
        PdfWriter.getInstance(documento, gen);
        documento.open();
        BaseColor color = new BaseColor(255, 255, 255); // Rojo
        Font font = new Font(Font.FontFamily.UNDEFINED, 12, Font.NORMAL, color);
        Paragraph parrafo = new Paragraph("Reporte de la tabla Vendedores");
        parrafo.setAlignment(1);
        documento.add(parrafo);
        documento.add(new Paragraph("\n"));
        String texto = "Toda la informacion es delicada y usted se compromete a la debida utilización.\n\n";
        documento.add(new Paragraph(texto));

        PdfPTable tabla = new PdfPTable(6);
        tabla.setWidthPercentage(100);
        tabla.getDefaultCell().setHorizontalAlignment(Element.ALIGN_CENTER);
        PdfPCell codigo = new PdfPCell(new Phrase("Codigo", font));
        codigo.setBackgroundColor(BaseColor.RED);
        codigo.setHorizontalAlignment(Element.ALIGN_CENTER);
        PdfPCell nombre = new PdfPCell(new Phrase("Nombre", font));
        nombre.setBackgroundColor(BaseColor.RED);
        nombre.setHorizontalAlignment(Element.ALIGN_CENTER);
        PdfPCell caja = new PdfPCell(new Phrase("Caja", font));
        caja.setBackgroundColor(BaseColor.RED);
        caja.setHorizontalAlignment(Element.ALIGN_CENTER);
        PdfPCell ventas = new PdfPCell(new Phrase("Ventas", font));
        ventas.setBackgroundColor(BaseColor.RED);
        ventas.setHorizontalAlignment(Element.ALIGN_CENTER);
        PdfPCell genero = new PdfPCell(new Phrase("Genero", font));
        genero.setBackgroundColor(BaseColor.RED);
        genero.setHorizontalAlignment(Element.ALIGN_CENTER);
        PdfPCell password = new PdfPCell(new Phrase("Password", font));
        password.setBackgroundColor(BaseColor.RED);
        password.setHorizontalAlignment(Element.ALIGN_CENTER);

        tabla.addCell(codigo);
        tabla.addCell(nombre);
        tabla.addCell(caja);
        tabla.addCell(ventas);
        tabla.addCell(genero);
        tabla.addCell(password);

        for (Vendedor v : daoV.listar()) {
            tabla.addCell(String.valueOf(v.getCodigo()));
            tabla.addCell(v.getNombre());
            tabla.addCell(String.valueOf(v.getCaja()));
            tabla.addCell(String.valueOf(v.getVentas()));
            tabla.addCell(v.getGenero());
            tabla.addCell(v.getPassword());
        }

        // Crear un objeto de tipo float array para el ancho de cada columna
        float[] columnWidths = {2f, 2f, 2f, 2f, 2f, 4f};
        tabla.setTotalWidth(columnWidths);
        
        documento.add(tabla);
        documento.add(new Paragraph("\nDocumento creado el " + LocalDate.now()));
        documento.close();
        JOptionPane.showMessageDialog(null, "El archivo se creo correctamente", "Alerta", JOptionPane.WARNING_MESSAGE);
        try {
            File sucursales_doc = new File("Vendedores.pdf");
            Desktop.getDesktop().open(sucursales_doc);
        } catch (Exception e) {
        }
    }
}
