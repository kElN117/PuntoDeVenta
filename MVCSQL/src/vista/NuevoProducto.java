/*
 * Descripcion: Ventana para agregar un nuevo producto al catalogo
 * Fecha: 24-06-2022
 * Autor: Quiroz Vega Kevin Alexis
 * 
 */
package vista;

/**
 *
 * @author Tanya
 */
public class NuevoProducto extends javax.swing.JFrame {

    /**
     * Creates new form Inventario
     */
    public NuevoProducto() {
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

        etiquetaNuevoProducto = new javax.swing.JLabel();
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
        txtDescripcion = new javax.swing.JTextField();
        etiquetaDescripcion = new javax.swing.JLabel();
        etiquetaSeVende = new javax.swing.JLabel();
        cbKilo = new javax.swing.JCheckBox();
        cbUnidades = new javax.swing.JCheckBox();
        etiquetaPrecioCosto = new javax.swing.JLabel();
        txtPrecioCosto = new javax.swing.JTextField();
        etiquetaGanancia = new javax.swing.JLabel();
        etiquetaPrecioVenta = new javax.swing.JLabel();
        etiquetaDepartamento = new javax.swing.JLabel();
        etiquetaHay = new javax.swing.JLabel();
        txtHay = new javax.swing.JTextField();
        txtMinimo = new javax.swing.JTextField();
        etiquetaMinimo = new javax.swing.JLabel();
        txtMaximo = new javax.swing.JTextField();
        etiquetaMaximo = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        etiquetaAtiende = new javax.swing.JLabel();
        TxtGancia = new javax.swing.JTextField();
        TxtDepartamento = new javax.swing.JTextField();
        LblPrecioVenta = new javax.swing.JLabel();
        LblNombreProducto = new javax.swing.JLabel();
        txtCodigoProducto1 = new javax.swing.JTextField();
        LblIdProducto = new javax.swing.JLabel();
        txtCodigoProducto2 = new javax.swing.JTextField();
        cbKilo1 = new javax.swing.JCheckBox();
        txtDescripcion1 = new javax.swing.JTextField();
        etiquetaDescripcion1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        BtnMenuVentas = new javax.swing.JMenu();
        BtnMenuClientes = new javax.swing.JMenu();
        BtnMenuProductos = new javax.swing.JMenu();
        BtnMenuProveedores = new javax.swing.JMenu();
        BtnMenuInventario = new javax.swing.JMenu();
        BtnMenuConfiguracion = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        etiquetaNuevoProducto.setBackground(new java.awt.Color(255, 153, 51));
        etiquetaNuevoProducto.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        etiquetaNuevoProducto.setForeground(new java.awt.Color(255, 153, 51));
        etiquetaNuevoProducto.setText("NUEVO PRODUCTO");
        getContentPane().add(etiquetaNuevoProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, 24));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 665, 10));

        btnNuevo.setText("Nuevo");
        getContentPane().add(btnNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 41, -1, -1));

        btnAgregar.setText("Agregar");
        getContentPane().add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(96, 41, -1, -1));

        btnModificar.setText("Modificar");
        getContentPane().add(btnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(186, 41, -1, -1));

        btnEliminar.setText("Eliminar");
        getContentPane().add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(285, 41, -1, -1));

        btnDepartamentos.setText("Departamentos");
        getContentPane().add(btnDepartamentos, new org.netbeans.lib.awtextra.AbsoluteConstraints(376, 41, -1, -1));

        btnCatalogo.setText("Catalogo");
        getContentPane().add(btnCatalogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(505, 41, -1, -1));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 75, 665, 10));

        etiquetaProductos1.setBackground(new java.awt.Color(255, 153, 51));
        etiquetaProductos1.setText("PRODUCTOS");
        getContentPane().add(etiquetaProductos1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 0, 91, 24));

        etiquetaCodigoProducto.setText("Codigo barras:");
        getContentPane().add(etiquetaCodigoProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, -1));

        txtCodigoProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoProductoActionPerformed(evt);
            }
        });
        getContentPane().add(txtCodigoProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, 246, -1));

        txtDescripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDescripcionActionPerformed(evt);
            }
        });
        getContentPane().add(txtDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 230, 230, -1));

        etiquetaDescripcion.setText("Descripcion:");
        getContentPane().add(etiquetaDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, -1, -1));

        etiquetaSeVende.setText("Se vende");
        getContentPane().add(etiquetaSeVende, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, -1, -1));

        cbKilo.setText("Perecedero");
        cbKilo.setAlignmentY(0.0F);
        cbKilo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbKiloActionPerformed(evt);
            }
        });
        getContentPane().add(cbKilo, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 230, -1, -1));

        cbUnidades.setText("Por unidades/pieza");
        cbUnidades.setAlignmentY(0.0F);
        getContentPane().add(cbUnidades, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 300, -1, -1));

        etiquetaPrecioCosto.setText("Precio compra:");
        getContentPane().add(etiquetaPrecioCosto, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, -1, -1));

        txtPrecioCosto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrecioCostoActionPerformed(evt);
            }
        });
        getContentPane().add(txtPrecioCosto, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 340, 230, -1));

        etiquetaGanancia.setText("Ganancia:");
        getContentPane().add(etiquetaGanancia, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 380, -1, -1));

        etiquetaPrecioVenta.setText("Precio venta:");
        getContentPane().add(etiquetaPrecioVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 130, -1, -1));

        etiquetaDepartamento.setText("Departamento:");
        getContentPane().add(etiquetaDepartamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 410, -1, -1));

        etiquetaHay.setText("Hay:");
        getContentPane().add(etiquetaHay, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 450, -1, -1));

        txtHay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHayActionPerformed(evt);
            }
        });
        getContentPane().add(txtHay, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 450, 108, -1));

        txtMinimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMinimoActionPerformed(evt);
            }
        });
        getContentPane().add(txtMinimo, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 490, 108, -1));

        etiquetaMinimo.setText("Minimo:");
        getContentPane().add(etiquetaMinimo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 490, -1, -1));

        txtMaximo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMaximoActionPerformed(evt);
            }
        });
        getContentPane().add(txtMaximo, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 520, 108, -1));

        etiquetaMaximo.setText("Maximo:");
        getContentPane().add(etiquetaMaximo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 530, -1, -1));

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        getContentPane().add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 520, -1, -1));

        btnCancelar.setText("Cancelar");
        getContentPane().add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 520, -1, -1));

        jLabel12.setText("%");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 380, -1, -1));

        etiquetaAtiende.setText("Lo atiende");
        getContentPane().add(etiquetaAtiende, new org.netbeans.lib.awtextra.AbsoluteConstraints(589, 4, -1, -1));

        TxtGancia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtGanciaActionPerformed(evt);
            }
        });
        getContentPane().add(TxtGancia, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 370, -1, -1));

        TxtDepartamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtDepartamentoActionPerformed(evt);
            }
        });
        getContentPane().add(TxtDepartamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 410, 108, -1));

        LblPrecioVenta.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(LblPrecioVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 150, 51, 22));

        LblNombreProducto.setText("Nombre producto:");
        getContentPane().add(LblNombreProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, -1, -1));

        txtCodigoProducto1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoProducto1ActionPerformed(evt);
            }
        });
        getContentPane().add(txtCodigoProducto1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 190, 250, -1));

        LblIdProducto.setText("IdProducto:");
        getContentPane().add(LblIdProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, -1, -1));

        txtCodigoProducto2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoProducto2ActionPerformed(evt);
            }
        });
        getContentPane().add(txtCodigoProducto2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 110, 246, -1));

        cbKilo1.setText("Por kilogramos");
        cbKilo1.setAlignmentY(0.0F);
        cbKilo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbKilo1ActionPerformed(evt);
            }
        });
        getContentPane().add(cbKilo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 300, -1, -1));

        txtDescripcion1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDescripcion1ActionPerformed(evt);
            }
        });
        getContentPane().add(txtDescripcion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 270, 230, -1));

        etiquetaDescripcion1.setText("Proveedor:");
        getContentPane().add(etiquetaDescripcion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, -1, -1));

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

    private void txtCodigoProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoProductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoProductoActionPerformed

    private void txtDescripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDescripcionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDescripcionActionPerformed

    private void cbKiloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbKiloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbKiloActionPerformed

    private void txtPrecioCostoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrecioCostoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrecioCostoActionPerformed

    private void txtHayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHayActionPerformed

    private void txtMinimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMinimoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMinimoActionPerformed

    private void txtMaximoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMaximoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMaximoActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void TxtGanciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtGanciaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtGanciaActionPerformed

    private void TxtDepartamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtDepartamentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtDepartamentoActionPerformed

    private void txtCodigoProducto1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoProducto1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoProducto1ActionPerformed

    private void txtCodigoProducto2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoProducto2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCodigoProducto2ActionPerformed

    private void cbKilo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbKilo1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbKilo1ActionPerformed

    private void txtDescripcion1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDescripcion1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDescripcion1ActionPerformed

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
            java.util.logging.Logger.getLogger(NuevoProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NuevoProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NuevoProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NuevoProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NuevoProducto().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JMenu BtnMenuClientes;
    public javax.swing.JMenu BtnMenuConfiguracion;
    public javax.swing.JMenu BtnMenuInventario;
    public javax.swing.JMenu BtnMenuProductos;
    public javax.swing.JMenu BtnMenuProveedores;
    public javax.swing.JMenu BtnMenuVentas;
    private javax.swing.JLabel LblIdProducto;
    private javax.swing.JLabel LblNombreProducto;
    private javax.swing.JLabel LblPrecioVenta;
    private javax.swing.JTextField TxtDepartamento;
    private javax.swing.JTextField TxtGancia;
    public javax.swing.JButton btnAgregar;
    public javax.swing.JButton btnCancelar;
    public javax.swing.JButton btnCatalogo;
    public javax.swing.JButton btnDepartamentos;
    public javax.swing.JButton btnEliminar;
    public javax.swing.JButton btnGuardar;
    public javax.swing.JButton btnModificar;
    public javax.swing.JButton btnNuevo;
    private javax.swing.JCheckBox cbKilo;
    private javax.swing.JCheckBox cbKilo1;
    private javax.swing.JCheckBox cbUnidades;
    private javax.swing.JLabel etiquetaAtiende;
    private javax.swing.JLabel etiquetaCodigoProducto;
    private javax.swing.JLabel etiquetaDepartamento;
    private javax.swing.JLabel etiquetaDescripcion;
    private javax.swing.JLabel etiquetaDescripcion1;
    private javax.swing.JLabel etiquetaGanancia;
    private javax.swing.JLabel etiquetaHay;
    private javax.swing.JLabel etiquetaMaximo;
    private javax.swing.JLabel etiquetaMinimo;
    private javax.swing.JLabel etiquetaNuevoProducto;
    private javax.swing.JLabel etiquetaPrecioCosto;
    private javax.swing.JLabel etiquetaPrecioVenta;
    private javax.swing.JLabel etiquetaProductos1;
    private javax.swing.JLabel etiquetaSeVende;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField txtCodigoProducto;
    private javax.swing.JTextField txtCodigoProducto1;
    private javax.swing.JTextField txtCodigoProducto2;
    private javax.swing.JTextField txtDescripcion;
    private javax.swing.JTextField txtDescripcion1;
    private javax.swing.JTextField txtHay;
    private javax.swing.JTextField txtMaximo;
    private javax.swing.JTextField txtMinimo;
    private javax.swing.JTextField txtPrecioCosto;
    // End of variables declaration//GEN-END:variables
}