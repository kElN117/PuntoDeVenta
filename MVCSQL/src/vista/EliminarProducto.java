/*
 * Descripcion: Ventana para eliminar productos
 * Fecha: 24-06-2022
 * Autor: Quiroz Vega Kevin Alexis
 * 
 */
package vista;

/**
 *
 * @author Tanya
 */
public class EliminarProducto extends javax.swing.JFrame {

    /**
     * Creates new form Inventario
     */
    public EliminarProducto() {
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

        etiquetaEliminarProducto = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        btnNuevo = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnDepartamentos = new javax.swing.JButton();
        btnCatalogo = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        etiquetaProductos1 = new javax.swing.JLabel();
        etiquetaCodigoProducto = new javax.swing.JLabel();
        txtCodigoProducto = new javax.swing.JTextField();
        btnEliminarProducto = new javax.swing.JButton();
        etiquetaAtiende = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaElimiarProducto = new javax.swing.JTable();
        BtnBuscar = new javax.swing.JToggleButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        BtnMenuVentas = new javax.swing.JMenu();
        BtnMenuClientes = new javax.swing.JMenu();
        BtnMenuProductos = new javax.swing.JMenu();
        BtnMenuProveedores = new javax.swing.JMenu();
        BtnMenuInventario = new javax.swing.JMenu();
        BtnMenuConfiguracion = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        etiquetaEliminarProducto.setBackground(new java.awt.Color(255, 153, 51));
        etiquetaEliminarProducto.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        etiquetaEliminarProducto.setForeground(new java.awt.Color(255, 153, 51));
        etiquetaEliminarProducto.setText("ELIMINAR PRODUCTO");

        btnNuevo.setText("Nuevo");

        btnAgregar.setText("Agregar");

        btnModificar.setText("Modificar");

        btnEliminar.setText("Eliminar");

        btnDepartamentos.setText("Departamentos");

        btnCatalogo.setText("Catalogo");

        etiquetaProductos1.setBackground(new java.awt.Color(255, 153, 51));
        etiquetaProductos1.setText("PRODUCTOS");

        etiquetaCodigoProducto.setText("Codigo producto:");

        txtCodigoProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoProductoActionPerformed(evt);
            }
        });

        btnEliminarProducto.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        btnEliminarProducto.setText("Eliminar este producto");
        btnEliminarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarProductoActionPerformed(evt);
            }
        });

        etiquetaAtiende.setText("Lo atiende");

        TablaElimiarProducto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Nombre producto", "Tipo producto", "Precio compra", "Precio venta", "Departamento", "Ecistencia"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(TablaElimiarProducto);

        BtnBuscar.setText("Buscar");

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addComponent(jSeparator2)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1001, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(etiquetaEliminarProducto)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnNuevo)
                                .addGap(18, 18, 18)
                                .addComponent(btnAgregar)
                                .addGap(18, 18, 18)
                                .addComponent(btnModificar)
                                .addGap(18, 18, 18)
                                .addComponent(btnEliminar)
                                .addGap(18, 18, 18)
                                .addComponent(btnDepartamentos)
                                .addGap(18, 18, 18)
                                .addComponent(btnCatalogo))
                            .addComponent(etiquetaProductos1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(etiquetaCodigoProducto)
                                .addGap(18, 18, 18)
                                .addComponent(txtCodigoProducto)
                                .addGap(18, 18, 18)
                                .addComponent(BtnBuscar)
                                .addGap(90, 90, 90)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 400, Short.MAX_VALUE)
                        .addComponent(etiquetaAtiende)
                        .addGap(32, 32, 32))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnEliminarProducto)
                .addGap(321, 321, 321))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetaProductos1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etiquetaAtiende))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNuevo)
                    .addComponent(btnAgregar)
                    .addComponent(btnModificar)
                    .addComponent(btnEliminar)
                    .addComponent(btnDepartamentos)
                    .addComponent(btnCatalogo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(etiquetaEliminarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etiquetaCodigoProducto)
                    .addComponent(txtCodigoProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnBuscar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(btnEliminarProducto)
                .addContainerGap(49, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCodigoProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoProductoActionPerformed

    private void btnEliminarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnEliminarProductoActionPerformed

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
            java.util.logging.Logger.getLogger(EliminarProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EliminarProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EliminarProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EliminarProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EliminarProducto().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JToggleButton BtnBuscar;
    public javax.swing.JMenu BtnMenuClientes;
    public javax.swing.JMenu BtnMenuConfiguracion;
    public javax.swing.JMenu BtnMenuInventario;
    public javax.swing.JMenu BtnMenuProductos;
    public javax.swing.JMenu BtnMenuProveedores;
    public javax.swing.JMenu BtnMenuVentas;
    private javax.swing.JTable TablaElimiarProducto;
    public javax.swing.JButton btnAgregar;
    public javax.swing.JButton btnCatalogo;
    public javax.swing.JButton btnDepartamentos;
    public javax.swing.JButton btnEliminar;
    public javax.swing.JButton btnEliminarProducto;
    public javax.swing.JButton btnModificar;
    public javax.swing.JButton btnNuevo;
    private javax.swing.JLabel etiquetaAtiende;
    private javax.swing.JLabel etiquetaCodigoProducto;
    private javax.swing.JLabel etiquetaEliminarProducto;
    private javax.swing.JLabel etiquetaProductos1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField txtCodigoProducto;
    // End of variables declaration//GEN-END:variables
}
