/*
 * Descripccion: VENTANA ELIMINAR PROVEEDOR
 * Alumno: JOSÉ LUIS ROCHA LÓPEZ
 * Fecha: 26/06/2022
 */
package vista;

/**
 *
 * @author Ching
 */
public class eliminar extends javax.swing.JFrame {

    /**
     * Creates new form eliminar
     */
    public eliminar() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LBModificarProveedor = new javax.swing.JLabel();
        LBproveedor = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        BTTNuevoProveedor = new javax.swing.JButton();
        BTTModificarProveedor = new javax.swing.JButton();
        BTTEliminarProveedor = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaproveedores = new javax.swing.JTable();
        btnEliminarProducto = new javax.swing.JButton();
        etiquetaCodigoProducto = new javax.swing.JLabel();
        txtCodigoProducto = new javax.swing.JTextField();
        BtnBuscar = new javax.swing.JToggleButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        BtnMenuVentas = new javax.swing.JMenu();
        BtnMenuClientes = new javax.swing.JMenu();
        BtnMenuProductos = new javax.swing.JMenu();
        BtnMenuProveedores = new javax.swing.JMenu();
        BtnMenuInventario = new javax.swing.JMenu();
        BtnMenuConfiguracion = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Eliminar Proveedor");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LBModificarProveedor.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        LBModificarProveedor.setForeground(new java.awt.Color(255, 153, 102));
        LBModificarProveedor.setText("ELIMINAR PROVEEDOR");
        getContentPane().add(LBModificarProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, -1, -1));

        LBproveedor.setText("PROVEEDORES");
        getContentPane().add(LBproveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 1020, 10));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 1020, 10));

        BTTNuevoProveedor.setText("Nuevo");
        getContentPane().add(BTTNuevoProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));

        BTTModificarProveedor.setText("Modificar");
        BTTModificarProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTTModificarProveedorActionPerformed(evt);
            }
        });
        getContentPane().add(BTTModificarProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 40, -1, -1));

        BTTEliminarProveedor.setText("Eliminar");
        getContentPane().add(BTTEliminarProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 40, -1, -1));

        tablaproveedores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "IdProveedores", "Nombre Proveedor", "RFC", "Telefonos", "Correo", "Calle Y Numero", "Colonia", "Municipio", "Estado"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tablaproveedores);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 1020, 400));

        btnEliminarProducto.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        btnEliminarProducto.setText("Eliminar este producto");
        btnEliminarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarProductoActionPerformed(evt);
            }
        });
        getContentPane().add(btnEliminarProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 590, -1, -1));

        etiquetaCodigoProducto.setText("Codigo del proveedor:");
        getContentPane().add(etiquetaCodigoProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, -1, -1));

        txtCodigoProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoProductoActionPerformed(evt);
            }
        });
        getContentPane().add(txtCodigoProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 120, 70, -1));

        BtnBuscar.setText("Buscar");
        getContentPane().add(BtnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 120, -1, -1));

        BtnMenuVentas.setText("Ventas");
        jMenuBar1.add(BtnMenuVentas);

        BtnMenuClientes.setText("Clientes");
        jMenuBar1.add(BtnMenuClientes);

        BtnMenuProductos.setText("Productos");
        jMenuBar1.add(BtnMenuProductos);

        BtnMenuProveedores.setText("Proveedores");
        jMenuBar1.add(BtnMenuProveedores);

        BtnMenuInventario.setText("Inventario");
        jMenuBar1.add(BtnMenuInventario);

        BtnMenuConfiguracion.setText("Configuracion");
        jMenuBar1.add(BtnMenuConfiguracion);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BTTModificarProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTTModificarProveedorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BTTModificarProveedorActionPerformed

    private void btnEliminarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEliminarProductoActionPerformed

    private void txtCodigoProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoProductoActionPerformed

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
            java.util.logging.Logger.getLogger(eliminar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(eliminar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(eliminar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(eliminar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new eliminar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton BTTEliminarProveedor;
    public javax.swing.JButton BTTModificarProveedor;
    public javax.swing.JButton BTTNuevoProveedor;
    public javax.swing.JToggleButton BtnBuscar;
    public javax.swing.JMenu BtnMenuClientes;
    public javax.swing.JMenu BtnMenuConfiguracion;
    public javax.swing.JMenu BtnMenuInventario;
    public javax.swing.JMenu BtnMenuProductos;
    public javax.swing.JMenu BtnMenuProveedores;
    public javax.swing.JMenu BtnMenuVentas;
    private javax.swing.JLabel LBModificarProveedor;
    private javax.swing.JLabel LBproveedor;
    public javax.swing.JButton btnEliminarProducto;
    private javax.swing.JLabel etiquetaCodigoProducto;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable tablaproveedores;
    private javax.swing.JTextField txtCodigoProducto;
    // End of variables declaration//GEN-END:variables
}
