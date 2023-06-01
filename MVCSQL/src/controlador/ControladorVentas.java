package controlador;

//Librerias Java
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JFrame;

//Packages Locales
import modelo.Modelo;
import vista.Clientes;
import vista.Configuracion;
import vista.Inventario;
import vista.Productos;
import vista.VentaBuscador;
import vista.VentaVerificador;
import vista.VentanaCobro;
import vista.VentanaEntradas;
import vista.VentanaSalida;
import vista.VentanaVentas;
import vista.proveedores;
import vista.sesion;

public class ControladorVentas implements ActionListener, MouseListener{
    
//vistas de Ventas
    private sesion vistaInicioSesion;
    private VentanaVentas ventasInicial;
    private Clientes ventanaClientes;
    private Productos Product;
    private proveedores Proveedor;
    private Inventario Inv;
    private Configuracion Config;
    
    //vista Ventanas emergentes
    private VentanaEntradas Entradas;
    private VentanaSalida Salidas;
    private VentaBuscador Buscador;
    private VentaVerificador Verificador;
    private VentanaCobro Cobro;
    
    //Conexion a BD y consultas de SQL
    private Modelo model;
    
    public ControladorVentas(Modelo model, 
           sesion vistaInicioSesion, 
           VentanaVentas ventasInicial, 
           Clientes ventanaClientes, 
           Productos Product, 
           proveedores Proveedor, 
           Inventario Inv, 
           Configuracion Config,
           VentanaEntradas Entradas,
           VentanaSalida Salidas,
           VentaBuscador Buscador,
           VentaVerificador Verificador,
           VentanaCobro Cobro){
        
        //Ventana Ventas
        this.vistaInicioSesion = vistaInicioSesion;
        this.ventasInicial = ventasInicial;
        this.ventanaClientes = ventanaClientes;
        this.Product = Product;
        this.Proveedor = Proveedor;
        this.Inv = Inv;
        this.Config = Config;
        
        //Ventanas emergentes
        this.Entradas = Entradas;
        this.Salidas = Salidas;
        this.Buscador = Buscador;
        this.Verificador = Verificador;
        this.Cobro = Cobro;
        
        //Modelo
        this.model = model;
        
        //Boton de Inicio de sesion
        this.vistaInicioSesion.btnIngresar.addActionListener(this);
        //Botones para cambiar entre ventanas sourse: Ventas
        this.ventasInicial.BtnMenuClientes.addMouseListener(this);
        this.ventasInicial.BtnMenuProductos.addMouseListener(this);
        this.ventasInicial.BtnMenuProveedores.addMouseListener(this);
        this.ventasInicial.BtnMenuInventario.addMouseListener(this);
        this.ventasInicial.BtnMenuConfiguracion.addMouseListener(this);
        
        //Botones para abirir ventanas emergentes
        this.ventasInicial.BtnEntradas.addMouseListener(this);
        this.ventasInicial.BtnSalidas.addMouseListener(this);
        this.ventasInicial.BtnBuscar.addMouseListener(this);
        this.ventasInicial.BtnVerificador.addMouseListener(this);
        this.ventasInicial.BtnCobrar.addMouseListener(this);
    }
    
    //Ventana Inicio de sesion
    public void inicioDeSesion(){
        vistaInicioSesion.setTitle("Inicio de sesion");
        vistaInicioSesion.setLocationRelativeTo(null);
        vistaInicioSesion.pack(); //Abre la ventana al tamaño preferido de los componentes
        vistaInicioSesion.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        vistaInicioSesion.setLocationRelativeTo(null);
        vistaInicioSesion.setVisible(true); 
    }
    
    //Ventanas Ventas
    public void ventanaVentas(){
        ventasInicial.setTitle("Ventas");
        ventasInicial.setLocationRelativeTo(null);
        ventasInicial.pack(); //Abre la ventana al tamaño preferido de los componentes
        ventasInicial.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        ventasInicial.setLocationRelativeTo(null);
        ventasInicial.setVisible(true); 
    }
    
    public void ventanaClientes(){
        ventanaClientes.setTitle("Clientes");
        ventanaClientes.setLocationRelativeTo(null);
        ventanaClientes.pack(); //Abre la ventana al tamaño preferido de los componentes
        ventanaClientes.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        ventanaClientes.setLocationRelativeTo(null);
        ventanaClientes.setVisible(true); 
    }
    
    public void ventanaProveedores(){
        Proveedor.setTitle("Proveedores");
        Proveedor.setLocationRelativeTo(null);
        Proveedor.pack(); //Abre la ventana al tamaño preferido de los componentes
        Proveedor.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        Proveedor.setLocationRelativeTo(null);
        Proveedor.setVisible(true); 
    }
    
    public void ventanaInventario(){
        Inv.setTitle("Inventario");
        Inv.setLocationRelativeTo(null);
        Inv.pack(); //Abre la ventana al tamaño preferido de los componentes
        Inv.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        Inv.setLocationRelativeTo(null);
        Inv.setVisible(true); 
    }
    
    public void ventanaProductos(){
        Product.setTitle("Productos");
        Product.setLocationRelativeTo(null);
        Product.pack(); //Abre la ventana al tamaño preferido de los componentes
        Product.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        Product.setLocationRelativeTo(null);
        Product.setVisible(true); 
    }
    
    public void ventanaConfiguracion(){
        Config.setTitle("Configuracion");
        Config.setLocationRelativeTo(null);
        Config.pack(); //Abre la ventana al tamaño preferido de los componentes
        Config.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        Config.setLocationRelativeTo(null);
        Config.setVisible(true);
    }
    
    //Ventanas Emergentes
    public void ventanaEntradas(){
        Entradas.setTitle("Entradas");
        Entradas.setLocationRelativeTo(null);
        Entradas.pack(); //Abre la ventana al tamaño preferido de los componentes
        Entradas.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE); 
        Entradas.setLocationRelativeTo(null);
        Entradas.setVisible(true);
    }
    
    public void ventanaSalidas(){
        Salidas.setTitle("Salidas");
        Salidas.setLocationRelativeTo(null);
        Salidas.pack(); //Abre la ventana al tamaño preferido de los componentes
        Salidas.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        Salidas.setLocationRelativeTo(null);
        Salidas.setVisible(true);
    }
    
    public void ventanaBuscador(){
        Buscador.setTitle("Buscador");
        Buscador.setLocationRelativeTo(null);
        Buscador.pack(); //Abre la ventana al tamaño preferido de los componentes
        Buscador.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE); 
        Buscador.setLocationRelativeTo(null);
        Buscador.setVisible(true);
    }
    
    public void ventanaVerificador(){
        Verificador.setTitle("Verificador");
        Verificador.setLocationRelativeTo(null);
        Verificador.pack(); //Abre la ventana al tamaño preferido de los componentes
        Verificador.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE); 
        Verificador.setLocationRelativeTo(null);
        Verificador.setVisible(true);
    }
    
    public void ventanaCobro(){
        Cobro.setTitle("Cobro");
        Cobro.setLocationRelativeTo(null);
        Cobro.pack(); //Abre la ventana al tamaño preferido de los componentes
        Cobro.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE); 
        Cobro.setLocationRelativeTo(null);
        Cobro.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e){
        model.setUsuario(vistaInicioSesion.txtUsuario.getText());
        model.setContraseña(String.valueOf(vistaInicioSesion.passUsuario.getPassword()));
        model.conectar();
        if(model.conectar() == true){
            vistaInicioSesion.setVisible(false); 
            ventanaVentas();
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if(ventasInicial.BtnMenuClientes == e.getSource()){
            ventasInicial.setVisible(false); 
            ventanaClientes();  
        }else if(ventasInicial.BtnMenuProductos == e.getSource()){
            ventasInicial.setVisible(false); 
            ventanaProductos();
        }else if(ventasInicial.BtnMenuProveedores == e.getSource()){
            ventasInicial.setVisible(false);
            ventanaProveedores();
        }else if(ventasInicial.BtnMenuInventario == e.getSource()){
            ventasInicial.setVisible(false);
            ventanaInventario();
        }else if(ventasInicial.BtnMenuProductos == e.getSource()){
            ventasInicial.setVisible(false);
            ventanaProductos();
        }else if(ventasInicial.BtnMenuConfiguracion == e.getSource()){
            ventasInicial.setVisible(false);
            ventanaConfiguracion();
        }else if(ventasInicial.BtnEntradas == e.getSource()){
            ventanaEntradas();
        }else if(ventasInicial.BtnSalidas == e.getSource()){
            ventanaSalidas();
        }else if(ventasInicial.BtnBuscar == e.getSource()){
            ventanaBuscador();
        }else if(ventasInicial.BtnVerificador == e.getSource()){
            ventanaVerificador();
        }else if(ventasInicial.BtnCobrar == e.getSource()){
            ventanaCobro();
        }
        
    }

    @Override
    public void mousePressed(MouseEvent e) {
        
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        
    }

    @Override
    public void mouseExited(MouseEvent e) {
        
    }
}