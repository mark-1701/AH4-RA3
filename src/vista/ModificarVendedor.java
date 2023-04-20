package vista;

import java.awt.Color;
import java.awt.event.*;
import javax.swing.JOptionPane;
import modelo.Vendedor;
import modeloDAO.VendedorDAO;

public class ModificarVendedor extends javax.swing.JFrame {

    VendedorDAO dao = new VendedorDAO();
    int codigo = 0;

    public ModificarVendedor(Vendedor vendedor) {
        initComponents();
        setResizable(false);
        setTitle("Modificar Vendedor");
        setLocationRelativeTo(null);
        this.getContentPane().setBackground(new Color(242, 242, 242));
        codigo = vendedor.getCodigo();
        txtNombre.setText(vendedor.getNombre());
        txtCaja.setText(String.valueOf(vendedor.getCaja()));
        txtVentas.setText(String.valueOf(vendedor.getVentas()));
        txtGenero.setText(vendedor.getGenero());
        txtPassword.setText(vendedor.getPassword());
        cerrar();
    }

    public void cerrar() {
        try {
            addWindowListener(new WindowAdapter() {
                public void windowClosing(WindowEvent e) {
                    Administrador administrador = new Administrador();
                    administrador.setVisible(true);
                    administrador.jTabbedPane2.setSelectedIndex(3);
                }
            });
        } catch (Exception e) {

        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtCaja = new javax.swing.JTextField();
        txtVentas = new javax.swing.JTextField();
        txtGenero = new javax.swing.JTextField();
        btnCrear = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel1.setText("Modificar vendedor");

        jLabel3.setText("Nombre");

        jLabel4.setText("Caja");

        jLabel5.setText("Ventas");

        jLabel6.setText("Genero");

        txtNombre.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        txtCaja.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        txtVentas.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        txtGenero.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        btnCrear.setForeground(new java.awt.Color(255, 255, 255));
        btnCrear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn.png"))); // NOI18N
        btnCrear.setText("Crear");
        btnCrear.setContentAreaFilled(false);
        btnCrear.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCrear.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btn2.png"))); // NOI18N
        btnCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearActionPerformed(evt);
            }
        });

        jLabel7.setText("Password");

        txtPassword.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(152, Short.MAX_VALUE)
                .addComponent(btnCrear, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(148, 148, 148))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtVentas, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtNombre)
                                .addComponent(txtCaja, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(129, 129, 129)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addGap(28, 28, 28)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtCaja, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtVentas, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(btnCrear, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearActionPerformed
        if (txtNombre.getText().isEmpty() || txtCaja.getText().isEmpty() || txtVentas.getText().isEmpty()
            || txtGenero.getText().isEmpty() || txtPassword.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Debes de rellenar todas las opciones", "Alerta", JOptionPane.WARNING_MESSAGE);
        } else {
            String nombre = txtNombre.getText();
            int caja = Integer.parseInt(txtCaja.getText());
            int ventas = Integer.parseInt(txtVentas.getText());
            String genero = txtGenero.getText();
            String password = txtPassword.getText();
            Vendedor vendedor = new Vendedor(codigo, nombre, caja, ventas, genero, password);
            dao.edit(vendedor);
            this.dispose();
            Administrador administrador = new Administrador();
            administrador.setVisible(true);
            administrador.jTabbedPane2.setSelectedIndex(3);
        }
    }//GEN-LAST:event_btnCrearActionPerformed

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
            java.util.logging.Logger.getLogger(ModificarVendedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ModificarVendedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ModificarVendedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ModificarVendedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ModificarVendedor(null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCrear;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField txtCaja;
    private javax.swing.JTextField txtGenero;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtVentas;
    // End of variables declaration//GEN-END:variables
}
