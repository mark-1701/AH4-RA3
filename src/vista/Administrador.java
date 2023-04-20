package vista;

import com.itextpdf.text.DocumentException;
import java.awt.Color;
import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.swing.table.*;
import modelo.CargaMasiva;
import modelo.Cliente;
import modelo.GenerarPDF;
import modelo.Producto;
import modelo.Sucursal;
import modeloDAO.ClienteDAO;
import modeloDAO.ProductoDAO;
//import modeloDAO.ClienteDAO;
import modeloDAO.SucursalDAO;
//import modeloDAO.VendedorDAO;

public class Administrador extends javax.swing.JFrame {

//    VendedorDAO dao = new VendedorDAO();
    SucursalDAO daoS = new SucursalDAO();
    ProductoDAO daoP = new ProductoDAO();
    ClienteDAO daoC = new ClienteDAO();
    DefaultTableModel tabla;
    int fila = -1;
    GenerarPDF generarPDF = new GenerarPDF();
    CargaMasiva cargaMasiva = new CargaMasiva();

    public Administrador() {
        initComponents();
        setResizable(false);
        setTitle("Administrador");
        setLocationRelativeTo(null);
        jTabbedPane2.setSelectedIndex(0);
        //DISENIOS TODAVIA NO PREPARADO
//        this.getContentPane().setBackground(new Color(242, 242, 242));
//        jPVendedores.setBackground(new Color(242, 242, 242));
//        cargarVendedores();
        cargarSucursales();
        cargarProductos();
        cargarCliente();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPSucursales = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableSucursales = new javax.swing.JTable();
        crearS = new javax.swing.JButton();
        cargaMasivaS = new javax.swing.JButton();
        actualizarS = new javax.swing.JButton();
        eliminarS = new javax.swing.JButton();
        pdfS = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jPProductos = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTableProductos = new javax.swing.JTable();
        crearP = new javax.swing.JButton();
        cargamasivaP = new javax.swing.JButton();
        actualizarP = new javax.swing.JButton();
        eliminarP = new javax.swing.JButton();
        pdfP = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jPClientes = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTableClientes = new javax.swing.JTable();
        crearC = new javax.swing.JButton();
        actualizarC = new javax.swing.JButton();
        cargamasivaC = new javax.swing.JButton();
        eliminarC = new javax.swing.JButton();
        pdfC = new javax.swing.JButton();
        jPVendedores = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableVendedores = new javax.swing.JTable();
        crearV = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        actualizarV = new javax.swing.JButton();
        eliminarV = new javax.swing.JButton();
        pdfV = new javax.swing.JButton();
        cargamasivaV = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Cerrar Cesion");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTabbedPane2.setName(""); // NOI18N

        jTableSucursales.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Codigo", "Nombre", "Direccion", "Correo", "Telefono"
            }
        ));
        jTableSucursales.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane2.setViewportView(jTableSucursales);

        crearS.setForeground(new java.awt.Color(255, 255, 255));
        crearS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn.png"))); // NOI18N
        crearS.setText("Crear");
        crearS.setContentAreaFilled(false);
        crearS.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        crearS.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn2.png"))); // NOI18N
        crearS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearSActionPerformed(evt);
            }
        });

        cargaMasivaS.setForeground(new java.awt.Color(255, 255, 255));
        cargaMasivaS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn.png"))); // NOI18N
        cargaMasivaS.setText("Carga Masiva");
        cargaMasivaS.setContentAreaFilled(false);
        cargaMasivaS.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        cargaMasivaS.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn2.png"))); // NOI18N
        cargaMasivaS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cargaMasivaSActionPerformed(evt);
            }
        });

        actualizarS.setForeground(new java.awt.Color(255, 255, 255));
        actualizarS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn.png"))); // NOI18N
        actualizarS.setText("Actualizar");
        actualizarS.setContentAreaFilled(false);
        actualizarS.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        actualizarS.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn2.png"))); // NOI18N
        actualizarS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actualizarSActionPerformed(evt);
            }
        });

        eliminarS.setForeground(new java.awt.Color(255, 255, 255));
        eliminarS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn.png"))); // NOI18N
        eliminarS.setText("Eliminar");
        eliminarS.setContentAreaFilled(false);
        eliminarS.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        eliminarS.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn2.png"))); // NOI18N
        eliminarS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarSActionPerformed(evt);
            }
        });

        pdfS.setForeground(new java.awt.Color(255, 255, 255));
        pdfS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnLargo.png"))); // NOI18N
        pdfS.setText("Exportar lista a PDF");
        pdfS.setContentAreaFilled(false);
        pdfS.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        pdfS.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnLargo2.png"))); // NOI18N
        pdfS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pdfSActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/d1.png"))); // NOI18N

        javax.swing.GroupLayout jPSucursalesLayout = new javax.swing.GroupLayout(jPSucursales);
        jPSucursales.setLayout(jPSucursalesLayout);
        jPSucursalesLayout.setHorizontalGroup(
            jPSucursalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPSucursalesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPSucursalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPSucursalesLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(jPSucursalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPSucursalesLayout.createSequentialGroup()
                                .addGroup(jPSucursalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(crearS, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(actualizarS, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(27, 27, 27)
                                .addGroup(jPSucursalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(eliminarS, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cargaMasivaS, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(pdfS, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(31, Short.MAX_VALUE))
                    .addGroup(jPSucursalesLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(103, 103, 103))))
        );
        jPSucursalesLayout.setVerticalGroup(
            jPSucursalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPSucursalesLayout.createSequentialGroup()
                .addGroup(jPSucursalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPSucursalesLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(jPSucursalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(crearS, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cargaMasivaS, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addGroup(jPSucursalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(actualizarS, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(eliminarS, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addComponent(pdfS, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(70, 70, 70)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPSucursalesLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Sucursales", jPSucursales);

        jTableProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Codigo", "Nombre", "Descripcion", "Cantidad", "Precios"
            }
        ));
        jTableProductos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane3.setViewportView(jTableProductos);

        crearP.setForeground(new java.awt.Color(255, 255, 255));
        crearP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn.png"))); // NOI18N
        crearP.setText("Crear");
        crearP.setContentAreaFilled(false);
        crearP.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        crearP.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn2.png"))); // NOI18N
        crearP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearPActionPerformed(evt);
            }
        });

        cargamasivaP.setForeground(new java.awt.Color(255, 255, 255));
        cargamasivaP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn.png"))); // NOI18N
        cargamasivaP.setText("Carga Masiva");
        cargamasivaP.setContentAreaFilled(false);
        cargamasivaP.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        cargamasivaP.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn2.png"))); // NOI18N
        cargamasivaP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cargamasivaPActionPerformed(evt);
            }
        });

        actualizarP.setForeground(new java.awt.Color(255, 255, 255));
        actualizarP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn.png"))); // NOI18N
        actualizarP.setText("Actualizar");
        actualizarP.setContentAreaFilled(false);
        actualizarP.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        actualizarP.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn2.png"))); // NOI18N
        actualizarP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actualizarPActionPerformed(evt);
            }
        });

        eliminarP.setForeground(new java.awt.Color(255, 255, 255));
        eliminarP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn.png"))); // NOI18N
        eliminarP.setText("Eliminar");
        eliminarP.setContentAreaFilled(false);
        eliminarP.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        eliminarP.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn2.png"))); // NOI18N
        eliminarP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarPActionPerformed(evt);
            }
        });

        pdfP.setForeground(new java.awt.Color(255, 255, 255));
        pdfP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnLargo.png"))); // NOI18N
        pdfP.setText("Exportar lista a PDF");
        pdfP.setContentAreaFilled(false);
        pdfP.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        pdfP.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnLargo2.png"))); // NOI18N
        pdfP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pdfPActionPerformed(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/d2.png"))); // NOI18N

        javax.swing.GroupLayout jPProductosLayout = new javax.swing.GroupLayout(jPProductos);
        jPProductos.setLayout(jPProductosLayout);
        jPProductosLayout.setHorizontalGroup(
            jPProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPProductosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPProductosLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(jPProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPProductosLayout.createSequentialGroup()
                                .addGroup(jPProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(crearP, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(actualizarP, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(27, 27, 27)
                                .addGroup(jPProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(eliminarP, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cargamasivaP, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(pdfP, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(31, Short.MAX_VALUE))
                    .addGroup(jPProductosLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(103, 103, 103))))
        );
        jPProductosLayout.setVerticalGroup(
            jPProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPProductosLayout.createSequentialGroup()
                .addGroup(jPProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPProductosLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(jPProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(crearP, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cargamasivaP, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addGroup(jPProductosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(actualizarP, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(eliminarP, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addComponent(pdfP, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(70, 70, 70)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPProductosLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Productos", jPProductos);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/d3.png"))); // NOI18N

        jTableClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Codigo", "Nombre", "Caja", "Ventas", "Genero"
            }
        ));
        jTableClientes.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane4.setViewportView(jTableClientes);

        crearC.setForeground(new java.awt.Color(255, 255, 255));
        crearC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn.png"))); // NOI18N
        crearC.setText("Crear");
        crearC.setContentAreaFilled(false);
        crearC.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        crearC.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn2.png"))); // NOI18N
        crearC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearCActionPerformed(evt);
            }
        });

        actualizarC.setForeground(new java.awt.Color(255, 255, 255));
        actualizarC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn.png"))); // NOI18N
        actualizarC.setText("Actualizar");
        actualizarC.setContentAreaFilled(false);
        actualizarC.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        actualizarC.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn2.png"))); // NOI18N
        actualizarC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actualizarCActionPerformed(evt);
            }
        });

        cargamasivaC.setForeground(new java.awt.Color(255, 255, 255));
        cargamasivaC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn.png"))); // NOI18N
        cargamasivaC.setText("Carga Masiva");
        cargamasivaC.setContentAreaFilled(false);
        cargamasivaC.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        cargamasivaC.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn2.png"))); // NOI18N
        cargamasivaC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cargamasivaCActionPerformed(evt);
            }
        });

        eliminarC.setForeground(new java.awt.Color(255, 255, 255));
        eliminarC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn.png"))); // NOI18N
        eliminarC.setText("Eliminar");
        eliminarC.setContentAreaFilled(false);
        eliminarC.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        eliminarC.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn2.png"))); // NOI18N
        eliminarC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarCActionPerformed(evt);
            }
        });

        pdfC.setForeground(new java.awt.Color(255, 255, 255));
        pdfC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnLargo.png"))); // NOI18N
        pdfC.setText("Exportar lista a PDF");
        pdfC.setContentAreaFilled(false);
        pdfC.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        pdfC.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnLargo2.png"))); // NOI18N
        pdfC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pdfCActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPClientesLayout = new javax.swing.GroupLayout(jPClientes);
        jPClientes.setLayout(jPClientesLayout);
        jPClientesLayout.setHorizontalGroup(
            jPClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPClientesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPClientesLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(jPClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPClientesLayout.createSequentialGroup()
                                .addGroup(jPClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(crearC, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(actualizarC, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(27, 27, 27)
                                .addGroup(jPClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(eliminarC, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cargamasivaC, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(pdfC, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(31, Short.MAX_VALUE))
                    .addGroup(jPClientesLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(103, 103, 103))))
        );
        jPClientesLayout.setVerticalGroup(
            jPClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPClientesLayout.createSequentialGroup()
                .addGroup(jPClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPClientesLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(jPClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(crearC, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cargamasivaC, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addGroup(jPClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(actualizarC, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(eliminarC, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addComponent(pdfC, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(70, 70, 70)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPClientesLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Clientes", jPClientes);

        jTableVendedores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Codigo", "Nombre", "Caja", "Ventas", "Genero"
            }
        ));
        jTableVendedores.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane1.setViewportView(jTableVendedores);

        crearV.setForeground(new java.awt.Color(255, 255, 255));
        crearV.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn.png"))); // NOI18N
        crearV.setText("Crear");
        crearV.setContentAreaFilled(false);
        crearV.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        crearV.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn2.png"))); // NOI18N
        crearV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearVActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/d7.png"))); // NOI18N

        actualizarV.setForeground(new java.awt.Color(255, 255, 255));
        actualizarV.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn.png"))); // NOI18N
        actualizarV.setText("Actualizar");
        actualizarV.setContentAreaFilled(false);
        actualizarV.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        actualizarV.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn2.png"))); // NOI18N
        actualizarV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actualizarVActionPerformed(evt);
            }
        });

        eliminarV.setForeground(new java.awt.Color(255, 255, 255));
        eliminarV.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn.png"))); // NOI18N
        eliminarV.setText("Eliminar");
        eliminarV.setContentAreaFilled(false);
        eliminarV.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        eliminarV.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn2.png"))); // NOI18N
        eliminarV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarVActionPerformed(evt);
            }
        });

        pdfV.setForeground(new java.awt.Color(255, 255, 255));
        pdfV.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnLargo.png"))); // NOI18N
        pdfV.setText("Exportar lista a PDF");
        pdfV.setContentAreaFilled(false);
        pdfV.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        cargamasivaV.setForeground(new java.awt.Color(255, 255, 255));
        cargamasivaV.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn.png"))); // NOI18N
        cargamasivaV.setText("Carga Masiva");
        cargamasivaV.setContentAreaFilled(false);
        cargamasivaV.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        cargamasivaV.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn2.png"))); // NOI18N

        javax.swing.GroupLayout jPVendedoresLayout = new javax.swing.GroupLayout(jPVendedores);
        jPVendedores.setLayout(jPVendedoresLayout);
        jPVendedoresLayout.setHorizontalGroup(
            jPVendedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPVendedoresLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPVendedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPVendedoresLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(jPVendedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPVendedoresLayout.createSequentialGroup()
                                .addGroup(jPVendedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(crearV, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(actualizarV, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(27, 27, 27)
                                .addGroup(jPVendedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(eliminarV, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cargamasivaV, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(pdfV, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(31, Short.MAX_VALUE))
                    .addGroup(jPVendedoresLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(103, 103, 103))))
        );
        jPVendedoresLayout.setVerticalGroup(
            jPVendedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPVendedoresLayout.createSequentialGroup()
                .addGroup(jPVendedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPVendedoresLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(jPVendedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(crearV, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cargamasivaV, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addGroup(jPVendedoresLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(actualizarV, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(eliminarV, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addComponent(pdfV, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(70, 70, 70)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPVendedoresLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("Vendedores", jPVendedores);

        jTabbedPane2.setSelectedComponent(jPVendedores);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 680, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 465, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
        new Login().setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void eliminarVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarVActionPerformed

    }//GEN-LAST:event_eliminarVActionPerformed

    private void actualizarVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actualizarVActionPerformed

    }//GEN-LAST:event_actualizarVActionPerformed

    private void crearVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearVActionPerformed
//        this.dispose();
//        new AgregarVendedor().setVisible(true);
    }//GEN-LAST:event_crearVActionPerformed

    private void eliminarSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarSActionPerformed
        fila = jTableSucursales.getSelectedRow();
        if (jTableSucursales.getSelectedRow() < 0) {
            JOptionPane.showMessageDialog(null, "Elige una opcion para eliminar", "Alerta", JOptionPane.WARNING_MESSAGE);
        } else {
            int codigo = Integer.parseInt(jTableSucursales.getValueAt(fila, 0).toString());
            daoS.delete(codigo);
            this.dispose();
            Administrador administrador = new Administrador();
            administrador.setVisible(true);
            administrador.jTabbedPane2.setSelectedIndex(0);
        }
    }//GEN-LAST:event_eliminarSActionPerformed

    private void actualizarSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actualizarSActionPerformed
        fila = jTableSucursales.getSelectedRow();
        if (jTableSucursales.getSelectedRow() < 0) {
            JOptionPane.showMessageDialog(null, "Elige una opcion para modificar", "Alerta", JOptionPane.WARNING_MESSAGE);
        } else {
            int codigo = Integer.parseInt(jTableSucursales.getValueAt(fila, 0).toString());
            this.dispose();
            new ModificarSucursal(daoS.search(codigo)).setVisible(true);
        }
    }//GEN-LAST:event_actualizarSActionPerformed

    private void crearSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearSActionPerformed
        this.dispose();
        new AgregarSucursal().setVisible(true);
    }//GEN-LAST:event_crearSActionPerformed

    private void crearCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearCActionPerformed
        this.dispose();
        new AgregarCliente().setVisible(true);
    }//GEN-LAST:event_crearCActionPerformed

    private void actualizarCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actualizarCActionPerformed
        fila = jTableClientes.getSelectedRow();
        if (jTableClientes.getSelectedRow() < 0) {
            JOptionPane.showMessageDialog(null, "Elige una opcion para modificar", "Alerta", JOptionPane.WARNING_MESSAGE);
        } else {
            int codigo = Integer.parseInt(jTableClientes.getValueAt(fila, 0).toString());
            this.dispose();
            new ModificarCliente(daoC.search(codigo)).setVisible(true);
        }
    }//GEN-LAST:event_actualizarCActionPerformed

    private void eliminarCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarCActionPerformed
        fila = jTableClientes.getSelectedRow();
        if (jTableClientes.getSelectedRow() < 0) {
            JOptionPane.showMessageDialog(null, "Elige una opcion para eliminar", "Alerta", JOptionPane.WARNING_MESSAGE);
        } else {
            int codigo = Integer.parseInt(jTableClientes.getValueAt(fila, 0).toString());
            daoC.delete(codigo);
            this.dispose();
            Administrador administrador = new Administrador();
            administrador.setVisible(true);
            administrador.jTabbedPane2.setSelectedIndex(2);
        }
    }//GEN-LAST:event_eliminarCActionPerformed

    private void eliminarPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarPActionPerformed
        fila = jTableProductos.getSelectedRow();
        if (jTableProductos.getSelectedRow() < 0) {
            JOptionPane.showMessageDialog(null, "Elige una opcion para eliminar", "Alerta", JOptionPane.WARNING_MESSAGE);
        } else {
            int codigo = Integer.parseInt(jTableProductos.getValueAt(fila, 0).toString());
            daoP.delete(codigo);
            this.dispose();
            Administrador administrador = new Administrador();
            administrador.setVisible(true);
            administrador.jTabbedPane2.setSelectedIndex(1);
        }
    }//GEN-LAST:event_eliminarPActionPerformed

    private void actualizarPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actualizarPActionPerformed
        fila = jTableProductos.getSelectedRow();
        if (jTableProductos.getSelectedRow() < 0) {
            JOptionPane.showMessageDialog(null, "Elige una opcion para modificar", "Alerta", JOptionPane.WARNING_MESSAGE);
        } else {
            int codigo = Integer.parseInt(jTableProductos.getValueAt(fila, 0).toString());
            this.dispose();
            new ModificarProducto(daoP.search(codigo)).setVisible(true);
        }
    }//GEN-LAST:event_actualizarPActionPerformed

    private void crearPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearPActionPerformed
        this.dispose();
        new AgregarProducto().setVisible(true);
    }//GEN-LAST:event_crearPActionPerformed

    private void pdfSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pdfSActionPerformed
//        try {
//            gPDF.generar_pdf();
//        } catch (FileNotFoundException ex) {
//            Logger.getLogger(Administrador.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (DocumentException ex) {
//            Logger.getLogger(Administrador.class.getName()).log(Level.SEVERE, null, ex);
//        }

        try {
            generarPDF.generarPDFSucursales();
        } catch (Exception e) {
            System.out.println("ERROR A GENERAR PDF SUCURSALES: " + e);
        }
    }//GEN-LAST:event_pdfSActionPerformed

    private void cargaMasivaSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cargaMasivaSActionPerformed
        try {
            cargaMasiva.carga_masiva(0);
            this.dispose();
            Administrador administrador = new Administrador();
            administrador.setVisible(true);
            administrador.jTabbedPane2.setSelectedIndex(0);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error en carga masiva", "Alerta", JOptionPane.WARNING_MESSAGE);
            System.out.println("ERROR EN CARGA MASIVA: " + e);
        }
    }//GEN-LAST:event_cargaMasivaSActionPerformed

    private void pdfPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pdfPActionPerformed
        try {
            generarPDF.generarPDFProductos();
        } catch (Exception e) {
            System.out.println("ERROR A GENERAR PDF PRODUCTOS: " + e);
        }
    }//GEN-LAST:event_pdfPActionPerformed

    private void cargamasivaPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cargamasivaPActionPerformed
        try {
            cargaMasiva.carga_masiva(1);
            this.dispose();
            Administrador administrador = new Administrador();
            administrador.setVisible(true);
            administrador.jTabbedPane2.setSelectedIndex(1);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error en carga masiva", "Alerta", JOptionPane.WARNING_MESSAGE);
            System.out.println("ERROR EN CARGA MASIVA: " + e);
        }
    }//GEN-LAST:event_cargamasivaPActionPerformed

    private void pdfCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pdfCActionPerformed
        try {
            generarPDF.generarPDFClientes();
        } catch (Exception e) {
            System.out.println("ERROR A GENERAR PDF CLIENTES: " + e);
        }
    }//GEN-LAST:event_pdfCActionPerformed

    private void cargamasivaCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cargamasivaCActionPerformed
        try {
            cargaMasiva.carga_masiva(2);
            this.dispose();
            Administrador administrador = new Administrador();
            administrador.setVisible(true);
            administrador.jTabbedPane2.setSelectedIndex(2);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error en carga masiva", "Alerta", JOptionPane.WARNING_MESSAGE);
            System.out.println("ERROR EN CARGA MASIVA: " + e);
        }
    }//GEN-LAST:event_cargamasivaCActionPerformed

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
            java.util.logging.Logger.getLogger(Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Administrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Administrador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton actualizarC;
    private javax.swing.JButton actualizarP;
    private javax.swing.JButton actualizarS;
    private javax.swing.JButton actualizarV;
    private javax.swing.JButton cargaMasivaS;
    private javax.swing.JButton cargamasivaC;
    private javax.swing.JButton cargamasivaP;
    private javax.swing.JButton cargamasivaV;
    private javax.swing.JButton crearC;
    private javax.swing.JButton crearP;
    private javax.swing.JButton crearS;
    private javax.swing.JButton crearV;
    private javax.swing.JButton eliminarC;
    private javax.swing.JButton eliminarP;
    private javax.swing.JButton eliminarS;
    private javax.swing.JButton eliminarV;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPClientes;
    private javax.swing.JPanel jPProductos;
    private javax.swing.JPanel jPSucursales;
    private javax.swing.JPanel jPVendedores;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    public javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTable jTableClientes;
    private javax.swing.JTable jTableProductos;
    private javax.swing.JTable jTableSucursales;
    private javax.swing.JTable jTableVendedores;
    private javax.swing.JButton pdfC;
    private javax.swing.JButton pdfP;
    private javax.swing.JButton pdfS;
    private javax.swing.JButton pdfV;
    // End of variables declaration//GEN-END:variables

    public void cargarSucursales() {
        String columnas[] = {"Codigo", "Nombre", "Direccion", "Correo", "Telefono"};
        tabla = new DefaultTableModel(null, columnas);
        for (Sucursal s : daoS.listar()) {
            Object fila[] = new Object[6];
            fila[0] = s.getCodigo();
            fila[1] = s.getNombre();
            fila[2] = s.getDireccion();
            fila[3] = s.getCorreo();
            fila[4] = s.getTelefono();
            tabla.addRow(fila);
        }
        jTableSucursales.setModel(tabla);
    }

    public void cargarProductos() {
        String columnas[] = {"Codigo", "Nombre", "Descripcion", "Cantidad", "Precio"};
        tabla = new DefaultTableModel(null, columnas);
        for (Producto p : daoP.listar()) {
            Object fila[] = new Object[6];
            fila[0] = p.getCodigo();
            fila[1] = p.getNombre();
            fila[2] = p.getDescripcion();
            fila[3] = p.getCantidad();
            fila[4] = p.getPrecio();
            tabla.addRow(fila);
        }
        jTableProductos.setModel(tabla);
    }

    public void cargarCliente() {
        String columnas[] = {"Codigo", "Nombre", "NIT", "Correo", "Genero"};
        tabla = new DefaultTableModel(null, columnas);
        for (Cliente c : daoC.listar()) {
            Object fila[] = new Object[6];
            fila[0] = c.getCodigo();
            fila[1] = c.getNombre();
            fila[2] = c.getNit();
            fila[3] = c.getCorreo();
            fila[4] = c.getGenero();
            tabla.addRow(fila);
        }
        jTableClientes.setModel(tabla);
    }

    public void cargarVendedores() {
//        jTableVendedores.setModel(dao.listar());
//        jScrollPane1.setViewportView(jTableVendedores);

        /*
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(JLabel.CENTER);
        TableCellRenderer rendererFromHeader = jTableVendedores.getTableHeader().getDefaultRenderer();
        JLabel headerLabel = (JLabel) rendererFromHeader;
        headerLabel.setHorizontalAlignment(JLabel.CENTER);
        for (int i = 0; i < 5; i++) {
            jTableVendedores.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
        }*/
    }
}
