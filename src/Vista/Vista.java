package Vista;

import java.awt.EventQueue;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import Controlador.Controlador;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Dimension;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.SystemColor;

public class Vista extends JFrame {

    private static final long serialVersionUID = 1L;
    public JPanel contentPane;

    // Paneles
    public JPanel PanelInicioSesion;
    public JPanel PanelMenuPrincipal;
    public JPanel PanelRegistro;

    // Componentes Inicio Sesión
    public JLabel lblCuenta, lblUsuario, lblContraseña, lblUsuarioFoto, lblContraseñaFoto, lblFondoCuenta, lblFotoFondo, lblGif;
    public JTextField txtUsuario;
    public JPasswordField passwordField;
    public JButton btnReg, btnInSes;
    public JButton btnAdmin;

    // Componentes Menú Principal
    public JLabel LogoPeque;
    public JButton btnPideYa;
    public JTextField textNombre;
    public JTextField textCorreo;
    public JTextField textContrasena;
    public JTextField textRepetirContrasena;
    public JLabel logoPeque;
    public JLabel FotoMenuBurger;
    public JLabel FotoTitulo;
    public JLabel foticocasa;
    public JLabel foticoperfil;
    public JLabel foticodescuento;
    public JLabel foticocarro;
    
    // Componentes Registro
    public JButton btnValidar;
    public JPanel PanelAdmin;
    public JButton btnEliminarProd;
    public JButton btnModificarProd;
    public JButton btnAnadirProd;
    public JPanel PanelAnadirProd;
    public JLabel lblAnadirProd;
    public JLabel lblAdministradores;
    public JLabel lblNombreProd;
    public JTextField textNombreProd;
    public JLabel lblIdProd;
    public JTextField textIdProd;
    public JLabel lblAdministradores2;
    public JLabel lblIng1;
    public JTextField textIng1;
    public JLabel lblIng2;
    public JTextField textIng2;
    public JLabel lblGluten;
    public JCheckBox CbGluten;
    public JPanel MiPerfil;
    public JLabel lblFondoMiPerfil;
    public JLabel lblMiPerfil;
    public JLabel lblFotoMiPerfil;
    public JLabel lblFondoFondoMiPerfil;
    public JLabel lblBienvenido;
    public JLabel lblNombredeBienvenida;
    public JButton btnContacto;
    public JPanel Contacto;
    public JLabel lblUltimosPedidos;
    public JLabel lblNPedido;
    public JLabel lblFecha;
    public JLabel lblHora;
    public JLabel lblPrecio;
    public JLabel lblNPedido1;
    public JLabel lblFecha1;
    public JLabel lblFecha2;
    public JLabel lblFecha3;
    public JLabel lblNPedido2;
    public JLabel lblNPedido3;
    public JLabel lblHora1;
    public JLabel lblPrecio1;
    public JLabel lblHora2;
    public JLabel lblPrecio2;
    public JLabel lblHora3;
    public JLabel lblPrecio3;
    public JButton btnVolverMiPerfil;
    public JLabel lblFotoFondoMenuPrincipal;
    public JLabel lblFotoFondoContacto;
    public JPanel DomicilioOLocal;
    public JButton btnVolverContacto;
    public JLabel lblTablonDeAbajo;
    public JButton btnPedirDomicilio;
    public JLabel logoPequeComprar;
    public JLabel foticocasaComprar;
    public JLabel foticoperfilComprar;
    public JLabel foticodescuentoComprar;
    public JLabel foticocarroComprar;
    public JLabel lblTablonDeAbajoComprar;
    public JLabel lblFotoFondoMenuPrincipal_1;
    public JButton btnPedirEnLocal;
    public JPanel PanelLocal;
    public JLabel lblFotoFondoLocal;
    public JLabel lblBurgerRoja;
    public JComboBox CbVerde;
    public JComboBox comboBox;
    public JLabel lblBurgerVerde;
    public JLabel lblEspec;
    public JLabel lblPan;
    public JLabel lblCarne;
    public JLabel lblQueso;
    public JLabel lblExtras;
    public JLabel lblEligeTP;
    public JLabel lblPanR;
    public JLabel lblCarneR;
    public JLabel lblQuesoR;
    public JLabel lblExtraR;
    

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                Vista vista = new Vista();
                new Controlador(vista); // aqui david hizo controlador c = new controlador(vista);
                vista.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    public Vista() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 400, 584);

        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);
        
        PanelAdmin = new JPanel();
        PanelAdmin.setVisible(false);
        
        
        //----------- Panel Añadir Producto ----------//
        PanelAnadirProd = new JPanel();
        PanelAnadirProd.setVisible(false);
                                                                                        
                                                                                        PanelLocal = new JPanel();
                                                                                        PanelLocal.setBounds(0, 0, 386, 547);
                                                                                        contentPane.add(PanelLocal);
                                                                                        PanelLocal.setLayout(null);
                                                                                        
                                                                                        lblBurgerVerde = new JLabel("");
                                                                                        lblBurgerVerde.setBounds(246, 110, 93, 74);
                                                                                        PanelLocal.add(lblBurgerVerde);
                                                                                        
                                                                                        lblBurgerRoja = new JLabel(new ImageIcon("imagenes/BurgerVerde.png"));
                                                                                        lblBurgerRoja.setBounds(43, 110, 81, 74);
                                                                                        PanelLocal.add(lblBurgerRoja);
                                                                                        
                                                                                        CbVerde = new JComboBox();
                                                                                        CbVerde.setBounds(246, 194, 93, 21);
                                                                                        PanelLocal.add(CbVerde);
                                                                                        
                                                                                        comboBox = new JComboBox();
                                                                                        comboBox.setBounds(43, 194, 93, 21);
                                                                                        PanelLocal.add(comboBox);
                                                                                        
                                                                                   PanelLocal.add(lblEspec);
                                                                                    lblEspec = new JLabel("ESPECIFICACIONES");
                                                                                        lblEspec.setBounds(91, 288, 204, 29);
                                                                                                 
                                                                                        lblPan = new JLabel("PAN:");
                                                                                        lblPan.setBounds(55, 342, 45, 13);
                                                                                        PanelLocal.add(lblPan);
                                                                                        
                                                                                        lblCarne = new JLabel("CARNE:");
                                                                                        lblCarne.setBounds(55, 375, 45, 13);
                                                                                        PanelLocal.add(lblCarne);
                                                                                        
                                                                                        lblQueso = new JLabel("QUESO:");
                                                                                        lblQueso.setBounds(55, 413, 45, 13);
                                                                                        PanelLocal.add(lblQueso);
                                                                                        
                                                                                        lblExtras = new JLabel("EXTRAS:");
                                                                                        lblExtras.setBounds(55, 449, 45, 13);
                                                                                        PanelLocal.add(lblExtras);
                                                                                        
                                                                                        lblEligeTP = new JLabel("ELIGE TUS PRODUCTOS");
                                                                                        lblEligeTP.setBounds(55, 63, 272, 37);
                                                                                        PanelLocal.add(lblEligeTP);
                                                                                        
                                                                                        lblPanR = new JLabel("");
                                                                                        lblPanR.setBounds(123, 342, 172, 13);
                                                                                        PanelLocal.add(lblPanR);
                                                                                        
                                                                                        lblCarneR = new JLabel("");
                                                                                        lblCarneR.setBounds(122, 375, 173, 13);
                                                                                        PanelLocal.add(lblCarneR);
                                                                                        
                                                                                        lblQuesoR = new JLabel("");
                                                                                        lblQuesoR.setBounds(122, 413, 173, 13);
                                                                                        PanelLocal.add(lblQuesoR);
                                                                                        
                                                                                        lblExtraR = new JLabel("");
                                                                                        lblExtraR.setBounds(123, 449, 172, 13);
                                                                                        PanelLocal.add(lblExtraR);
                                                                                        
                                                                                        lblFotoFondoLocal = new JLabel("");
                                                                                        lblFotoFondoLocal.setBounds(0, 0, 386, 547);
                                                                                        PanelLocal.add(lblFotoFondoLocal);
                                                                                
                                                                                        // ------------------- PANEL INICIO SESIÓN -------------------
                                                                                        PanelInicioSesion = new JPanel();
                                                                                        PanelInicioSesion.setBorder(new EmptyBorder(0, 0, 0, 0));
                                                                                        PanelInicioSesion.setBounds(0, 0, 400, 584);
                                                                                        PanelInicioSesion.setLayout(null);
                                                                                        contentPane.add(PanelInicioSesion);
                                                                                        
                                                                                        lblUsuarioFoto = new JLabel(new ImageIcon("imagenes/logo2.png"));
                                                                                        lblUsuarioFoto.setBounds(119, 119, 45, 43);
                                                                                        PanelInicioSesion.add(lblUsuarioFoto);
                                                                                        
                lblCuenta = new JLabel("Cuenta");
                lblCuenta.setFont(new Font("Tahoma", Font.BOLD, 30));
                lblCuenta.setHorizontalAlignment(SwingConstants.CENTER);
                lblCuenta.setForeground(Color.WHITE);
                lblCuenta.setBounds(119, 10, 145, 62);
                PanelInicioSesion.add(lblCuenta);
                
                lblUsuario = new JLabel("Usuario");
                lblUsuario.setFont(new Font("Tahoma", Font.BOLD, 25));
                lblUsuario.setBounds(10, 131, 208, 31);
                PanelInicioSesion.add(lblUsuario);
                
                txtUsuario = new JTextField();
                txtUsuario.setBounds(10, 172, 190, 25);
                PanelInicioSesion.add(txtUsuario);
                
                lblContraseña = new JLabel("Contraseña");
                lblContraseña.setFont(new Font("Tahoma", Font.BOLD, 25));
                lblContraseña.setBounds(10, 258, 208, 31);
                PanelInicioSesion.add(lblContraseña);
                
              	passwordField = new JPasswordField();
              	passwordField.setBounds(10, 299, 190, 25);
              	PanelInicioSesion.add(passwordField);
              	
                lblContraseñaFoto = new JLabel(new ImageIcon("imagenes/candado.png"));
                lblContraseñaFoto.setBounds(160, 246, 45, 43);
                PanelInicioSesion.add(lblContraseñaFoto);
                
              	lblFondoCuenta = new JLabel(new ImageIcon("imagenes/qqq.png"));
              	lblFondoCuenta.setBounds(42, 20, 295, 48);
              	PanelInicioSesion.add(lblFondoCuenta);
              	
              	lblGif = new JLabel(new ImageIcon("imagenes/gifburgercolor.gif"));
              	lblGif.setBounds(221, 174, 120, 132);
              	PanelInicioSesion.add(lblGif);
              	
                btnReg = new JButton("Registrarse");
                btnReg.setFont(new Font("Tahoma", Font.BOLD, 20));
                btnReg.setBackground(new Color(72, 61, 139));
                btnReg.setForeground(Color.WHITE);
                btnReg.setBorder(new LineBorder(Color.BLACK, 5));
                btnReg.setBounds(83, 469, 220, 54);
                PanelInicioSesion.add(btnReg);
                
                btnInSes = new JButton("Iniciar Sesión");
                btnInSes.setFont(new Font("Tahoma", Font.BOLD, 20));
                btnInSes.setBackground(new Color(72, 61, 139));
                btnInSes.setForeground(Color.WHITE);
                btnInSes.setBorder(new LineBorder(Color.BLACK, 5));
                btnInSes.setBounds(83, 405, 220, 54);
                PanelInicioSesion.add(btnInSes);
                
                btnAdmin = new JButton("");
                btnAdmin.setIcon(new ImageIcon("C:\\Users\\david\\git\\t2_grupo1\\imagenes\\llaveadmin.png"));
                btnAdmin.setBounds(325, 25, 46, 46);
                PanelInicioSesion.add(btnAdmin);
                
                lblFotoFondo = new JLabel(new ImageIcon("imagenes/fondoIS.png"));
                lblFotoFondo.setBounds(0, 0, 390, 550);
                PanelInicioSesion.add(lblFotoFondo);
                                                                
                                                                        // ------------------- PANEL MENÚ PRINCIPAL -------------------
                                                                
                                                                                PanelMenuPrincipal = new JPanel();
                                                                                PanelMenuPrincipal.setVisible(false);
                                                                                PanelMenuPrincipal.setLayout(null);
                                                                                PanelMenuPrincipal.setBounds(0, 0, 400, 584);
                                                                                contentPane.add(PanelMenuPrincipal);
                                                                                
                                                                                        btnPideYa = new JButton("PIDE YA");
                                                                                        btnPideYa.setFont(new Font("Tahoma", Font.PLAIN, 25));
                                                                                        btnPideYa.setBounds(114, 395, 170, 61);
                                                                                        PanelMenuPrincipal.add(btnPideYa);
                                                                                        
                                                                                        logoPeque = new JLabel(new ImageIcon("imagenes/logo_peque.png"));
                                                                                        logoPeque.setBounds(153, 1, 96, 79);
                                                                                        PanelMenuPrincipal.add(logoPeque);
                                                                                        
                                                                                        FotoMenuBurger = new JLabel(new ImageIcon("imagenes/menuburger.png"));
                                                                                        FotoMenuBurger.setBounds(0, 198, 390, 179);
                                                                                        PanelMenuPrincipal.add(FotoMenuBurger);
                                                                                        
                                                                                        FotoTitulo = new JLabel(new ImageIcon("imagenes/FotoTitulo.png"));
                                                                                        FotoTitulo.setBounds(0, 99, 390, 89);
                                                                                        PanelMenuPrincipal.add(FotoTitulo);
                                                                                        
                                                                                        foticocasa = new JLabel(new ImageIcon("imagenes/foticocasa.png"));
                                                                                        foticocasa.setBounds(10, 505, 35, 35);
                                                                                        PanelMenuPrincipal.add(foticocasa);
                                                                                        
                                                                                        foticoperfil = new JLabel(new ImageIcon("imagenes/foticoperfil.png"));
                                                                                        foticoperfil.setBounds(122, 505, 35, 35);
                                                                                        PanelMenuPrincipal.add(foticoperfil);
                                                                                        
                                                                                        foticodescuento = new JLabel(new ImageIcon("imagenes/foticodescuento.png"));
                                                                                        foticodescuento.setBounds(340, 505, 35, 35);
                                                                                        PanelMenuPrincipal.add(foticodescuento);
                                                                                        
                                                                                        foticocarro = new JLabel(new ImageIcon("imagenes/foticocarro.png"));
                                                                                        foticocarro.setBounds(240, 505, 35, 35);
                                                                                        PanelMenuPrincipal.add(foticocarro);
                                                                                        
                                                                                        lblTablonDeAbajo = new JLabel(new ImageIcon("imagenes/tablonmaderaa.png"));
                                                                                        lblTablonDeAbajo.setBounds(0, 491, 400, 61);
                                                                                        PanelMenuPrincipal.add(lblTablonDeAbajo);
                                                                                        
                                                                                        lblFotoFondoMenuPrincipal = new JLabel(new ImageIcon("imagenes/fondoIS.png"));
                                                                                        lblFotoFondoMenuPrincipal.setBounds(0, 0, 400, 584);
                                                                                        PanelMenuPrincipal.add(lblFotoFondoMenuPrincipal);
                                                        
                                                        
                                                        
                                                        //PANEL MI PERFIL
                                                        MiPerfil = new JPanel();
                                                        MiPerfil.setVisible(false);
                                                        MiPerfil.setBounds(0, 0, 400, 584);
                                                        contentPane.add(MiPerfil);
                                                        MiPerfil.setLayout(null);
                                                        
                                                        btnVolverMiPerfil = new JButton("Volver");
                                                        btnVolverMiPerfil.setFont(new Font("Tahoma", Font.PLAIN, 15));
                                                        btnVolverMiPerfil.setBounds(20, 230, 114, 48);
                                                        MiPerfil.add(btnVolverMiPerfil);
                                                        
                                                        lblHora2 = new JLabel("");
                                                        lblHora2.setOpaque(true);
                                                        lblHora2.setBackground(new Color(245, 255, 250));
                                                        lblHora2.setForeground(SystemColor.desktop);
                                                        lblHora2.setHorizontalAlignment(SwingConstants.CENTER);
                                                        lblHora2.setFont(new Font("Tahoma", Font.PLAIN, 15));
                                                        lblHora2.setBounds(210, 460, 76, 28);
                                                        MiPerfil.add(lblHora2);
                                                        
                                                        lblPrecio3 = new JLabel("");
                                                        lblPrecio3.setOpaque(true);
                                                        lblPrecio3.setBackground(new Color(245, 255, 250));
                                                        lblPrecio3.setForeground(SystemColor.desktop);
                                                        lblPrecio3.setHorizontalAlignment(SwingConstants.CENTER);
                                                        lblPrecio3.setFont(new Font("Tahoma", Font.PLAIN, 15));
                                                        lblPrecio3.setBounds(300, 505, 68, 28);
                                                        MiPerfil.add(lblPrecio3);
                                                        
                                                        lblHora3 = new JLabel("");
                                                        lblHora3.setOpaque(true);
                                                        lblHora3.setBackground(new Color(245, 255, 250));
                                                        lblHora3.setForeground(SystemColor.desktop);
                                                        lblHora3.setHorizontalAlignment(SwingConstants.CENTER);
                                                        lblHora3.setFont(new Font("Tahoma", Font.PLAIN, 15));
                                                        lblHora3.setBounds(210, 505, 76, 28);
                                                        MiPerfil.add(lblHora3);
                                                        
                                                        lblPrecio1 = new JLabel("");
                                                        lblPrecio1.setOpaque(true);
                                                        lblPrecio1.setBackground(new Color(245, 255, 250));
                                                        lblPrecio1.setForeground(SystemColor.desktop);
                                                        lblPrecio1.setHorizontalAlignment(SwingConstants.CENTER);
                                                        lblPrecio1.setFont(new Font("Tahoma", Font.PLAIN, 15));
                                                        lblPrecio1.setBounds(300, 415, 68, 28);
                                                        MiPerfil.add(lblPrecio1);
                                                        
                                                        lblHora1 = new JLabel("");
                                                        lblHora1.setOpaque(true);
                                                        lblHora1.setBackground(new Color(245, 255, 250));
                                                        lblHora1.setForeground(SystemColor.desktop);
                                                        lblHora1.setHorizontalAlignment(SwingConstants.CENTER);
                                                        lblHora1.setFont(new Font("Tahoma", Font.PLAIN, 15));
                                                        lblHora1.setBounds(210, 415, 76, 28);
                                                        MiPerfil.add(lblHora1);
                                                        
                                                        lblPrecio2 = new JLabel("");
                                                        lblPrecio2.setOpaque(true);
                                                        lblPrecio2.setBackground(new Color(245, 255, 250));
                                                        lblPrecio2.setForeground(SystemColor.desktop);
                                                        lblPrecio2.setHorizontalAlignment(SwingConstants.CENTER);
                                                        lblPrecio2.setFont(new Font("Tahoma", Font.PLAIN, 15));
                                                        lblPrecio2.setBounds(300, 460, 68, 28);
                                                        MiPerfil.add(lblPrecio2);
                                                        
                                                        lblNPedido1 = new JLabel("");
                                                        lblNPedido1.setOpaque(true); // para que se vea el color de fondo 
                                                        lblNPedido1.setBackground(new Color(245, 255, 250)); // o cualquier color
                                                        lblNPedido1.setForeground(SystemColor.desktop);
                                                        lblNPedido1.setHorizontalAlignment(SwingConstants.CENTER);
                                                        lblNPedido1.setFont(new Font("Tahoma", Font.PLAIN, 15));
                                                        lblNPedido1.setBounds(20, 415, 84, 28);
                                                        MiPerfil.add(lblNPedido1);
                                                        
                                                        lblNPedido2 = new JLabel("");
                                                        lblNPedido2.setOpaque(true);
                                                        lblNPedido2.setBackground(new Color(245, 255, 250));
                                                        lblNPedido2.setForeground(SystemColor.desktop);
                                                        lblNPedido2.setHorizontalAlignment(SwingConstants.CENTER);
                                                        lblNPedido2.setFont(new Font("Tahoma", Font.PLAIN, 15));
                                                        lblNPedido2.setBounds(20, 460, 84, 28);
                                                        MiPerfil.add(lblNPedido2);
                                                        
                                                        lblFecha3 = new JLabel("");
                                                        lblFecha3.setOpaque(true);
                                                        lblFecha3.setBackground(new Color(245, 255, 250));
                                                        lblFecha3.setForeground(SystemColor.desktop);
                                                        lblFecha3.setHorizontalAlignment(SwingConstants.CENTER);
                                                        lblFecha3.setFont(new Font("Tahoma", Font.PLAIN, 15));
                                                        lblFecha3.setBounds(120, 505, 84, 28);
                                                        MiPerfil.add(lblFecha3);
                                                        
                                                        lblFecha1 = new JLabel("");
                                                        lblFecha1.setOpaque(true);
                                                        lblFecha1.setBackground(new Color(245, 255, 250));
                                                        lblFecha1.setForeground(SystemColor.desktop);
                                                        lblFecha1.setHorizontalAlignment(SwingConstants.CENTER);
                                                        lblFecha1.setFont(new Font("Tahoma", Font.PLAIN, 15));
                                                        lblFecha1.setBounds(120, 415, 84, 28);
                                                        MiPerfil.add(lblFecha1);
                                                        
                                                        lblNPedido3 = new JLabel("");
                                                        lblNPedido3.setOpaque(true);
                                                        lblNPedido3.setBackground(new Color(245, 255, 250));
                                                        lblNPedido3.setForeground(SystemColor.desktop);
                                                        lblNPedido3.setHorizontalAlignment(SwingConstants.CENTER);
                                                        lblNPedido3.setFont(new Font("Tahoma", Font.PLAIN, 15));
                                                        lblNPedido3.setBounds(20, 505, 84, 28);
                                                        MiPerfil.add(lblNPedido3);
                                                        
                                                        lblFecha2 = new JLabel("");
                                                        lblFecha2.setOpaque(true);
                                                        lblFecha2.setBackground(new Color(245, 255, 250));
                                                        lblFecha2.setForeground(SystemColor.desktop);
                                                        lblFecha2.setHorizontalAlignment(SwingConstants.CENTER);
                                                        lblFecha2.setFont(new Font("Tahoma", Font.PLAIN, 15));
                                                        lblFecha2.setBounds(120, 460, 84, 28);
                                                        MiPerfil.add(lblFecha2);
                                                        
                                                        lblPrecio = new JLabel("PRECIO");
                                                        lblPrecio.setBackground(new Color(220, 220, 220));
                                                        lblPrecio.setOpaque(true);
                                                        lblPrecio.setForeground(SystemColor.desktop);
                                                        lblPrecio.setHorizontalAlignment(SwingConstants.CENTER);
                                                        lblPrecio.setFont(new Font("Tahoma", Font.BOLD, 15));
                                                        lblPrecio.setBounds(294, 377, 69, 28);
                                                        MiPerfil.add(lblPrecio);
                                                        
                                                        lblFecha = new JLabel("FECHA");
                                                        lblFecha.setBackground(new Color(220, 220, 220));
                                                        lblFecha.setOpaque(true);
                                                        lblFecha.setForeground(SystemColor.desktop);
                                                        lblFecha.setHorizontalAlignment(SwingConstants.CENTER);
                                                        lblFecha.setFont(new Font("Tahoma", Font.BOLD, 15));
                                                        lblFecha.setBounds(118, 377, 84, 28);
                                                        MiPerfil.add(lblFecha);
                                                        
                                                        lblHora = new JLabel("HORA");
                                                        lblHora.setBackground(new Color(220, 220, 220));
                                                        lblHora.setOpaque(true);
                                                        lblHora.setForeground(SystemColor.desktop);
                                                        lblHora.setHorizontalAlignment(SwingConstants.CENTER);
                                                        lblHora.setFont(new Font("Tahoma", Font.BOLD, 15));
                                                        lblHora.setBounds(200, 377, 84, 28);
                                                        MiPerfil.add(lblHora);
                                                        
                                                        lblNPedido = new JLabel("Nº PEDIDO");
                                                        lblNPedido.setBackground(new Color(220, 220, 220));
                                                        lblNPedido.setOpaque(true);
                                                        lblNPedido.setForeground(SystemColor.desktop);
                                                        lblNPedido.setHorizontalAlignment(SwingConstants.CENTER);
                                                        lblNPedido.setFont(new Font("Tahoma", Font.BOLD, 15));
                                                        lblNPedido.setBounds(10, 377, 100, 28);
                                                        MiPerfil.add(lblNPedido);
                                                        
                                                        lblUltimosPedidos = new JLabel("Últimos pedidos");
                                                        lblUltimosPedidos.setForeground(SystemColor.textHighlight);
                                                        lblUltimosPedidos.setHorizontalAlignment(SwingConstants.CENTER);
                                                        lblUltimosPedidos.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
                                                        lblUltimosPedidos.setBounds(122, 339, 162, 28);
                                                        MiPerfil.add(lblUltimosPedidos);
                                                        
                                                        btnContacto = new JButton("Contacto");
                                                        btnContacto.setFont(new Font("Tahoma", Font.PLAIN, 15));
                                                        btnContacto.setBounds(246, 230, 114, 48);
                                                        MiPerfil.add(btnContacto);
                                                        
                                                        lblMiPerfil = new JLabel("Mi Perfil");
                                                        lblMiPerfil.setHorizontalAlignment(SwingConstants.CENTER);
                                                        lblMiPerfil.setForeground(Color.WHITE);
                                                        lblMiPerfil.setFont(new Font("Tahoma", Font.BOLD, 30));
                                                        lblMiPerfil.setBounds(118, 10, 144, 61);
                                                        MiPerfil.add(lblMiPerfil);
                                                        
                                                                lblFondoMiPerfil = new JLabel(new ImageIcon("imagenes/qqq.png"));
                                                                lblFondoMiPerfil.setBounds(46, 16, 294, 48);
                                                                MiPerfil.add(lblFondoMiPerfil);
                                                                
                                                                lblFotoMiPerfil = new JLabel(new ImageIcon("imagenes/felix.png"));
                                                                lblFotoMiPerfil.setBounds(32, 90, 100, 100);
                                                                MiPerfil.add(lblFotoMiPerfil);
                                                                
                                                                lblBienvenido = new JLabel("¡BIENVENIDO!");
                                                                lblBienvenido.setFont(new Font("Tahoma", Font.BOLD, 25));
                                                                lblBienvenido.setBounds(141, 81, 199, 61);
                                                                MiPerfil.add(lblBienvenido);
                                                                
                                                                lblNombredeBienvenida = new JLabel("");
                                                                lblNombredeBienvenida.setHorizontalAlignment(SwingConstants.CENTER);
                                                                lblNombredeBienvenida.setFont(new Font("Tahoma", Font.BOLD, 22));
                                                                lblNombredeBienvenida.setBounds(164, 139, 98, 36);
                                                                MiPerfil.add(lblNombredeBienvenida);
                                                                
                                                                lblFondoFondoMiPerfil = new JLabel(new ImageIcon("imagenes/fondoIS.png"));
                                                                lblFondoFondoMiPerfil.setBounds(0, 0, 400, 584);
                                                                MiPerfil.add(lblFondoFondoMiPerfil);
                                                        
                                                        Contacto = new JPanel();
                                                        Contacto.setVisible(false);
                                                        Contacto.setBounds(0, 0, 400, 584);
                                                        contentPane.add(Contacto);
                                                        Contacto.setLayout(null);
                                                        
                                                        btnVolverContacto = new JButton("<---");
                                                        btnVolverContacto.setFont(new Font("Tahoma", Font.BOLD, 23));
                                                        btnVolverContacto.setBounds(10, 230, 95, 37);
                                                        Contacto.add(btnVolverContacto);
                                                        
                                                        // APARTADO DE CONTACTOOOOOOOOOOOOOOOOOOOOOOOOO
                                                        lblFotoFondoContacto = new JLabel(new ImageIcon("imagenes/CONTACTO.png"));
                                                        lblFotoFondoContacto.setBounds(-10, 0, 400, 584);
                                                        Contacto.add(lblFotoFondoContacto);
        
                                                        
        // PANEL PEDIR COMPRAR                                                 
        DomicilioOLocal = new JPanel();
        DomicilioOLocal.setVisible(false);
        DomicilioOLocal.setBounds(0, 0, 400, 584);
        contentPane.add(DomicilioOLocal);
        DomicilioOLocal.setLayout(null);
        
        btnPedirEnLocal = new JButton("PEDIR AQUÍ");
        btnPedirEnLocal.setFont(new Font("Tahoma", Font.PLAIN, 25));
        btnPedirEnLocal.setBounds(39, 317, 308, 60);
        DomicilioOLocal.add(btnPedirEnLocal);
        
        btnPedirDomicilio = new JButton("PEDIR A DOMICILIO");
        btnPedirDomicilio.setFont(new Font("Tahoma", Font.PLAIN, 25));
        btnPedirDomicilio.setBounds(40, 160, 308, 60);
        DomicilioOLocal.add(btnPedirDomicilio);
        
        logoPequeComprar = new JLabel(new ImageIcon("imagenes/logo_peque.png"));
        logoPequeComprar.setBounds(153, 1, 96, 79);
        DomicilioOLocal.add(logoPequeComprar);
        
        foticocasaComprar = new JLabel(new ImageIcon("imagenes/foticocasa.png"));
        foticocasaComprar.setBounds(10, 505, 35, 35);
        DomicilioOLocal.add(foticocasaComprar);
        
        foticoperfilComprar = new JLabel(new ImageIcon("imagenes/foticoperfil.png"));
        foticoperfilComprar.setBounds(122, 505, 35, 35);
        DomicilioOLocal.add(foticoperfilComprar);
        
        foticodescuentoComprar = new JLabel(new ImageIcon("imagenes/foticodescuento.png"));
        foticodescuentoComprar.setBounds(340, 505, 35, 35);
        DomicilioOLocal.add(foticodescuentoComprar);
        
        foticocarroComprar = new JLabel(new ImageIcon("imagenes/foticocarro.png"));
        foticocarroComprar.setBounds(240, 505, 35, 35);
        DomicilioOLocal.add(foticocarroComprar);
        
        lblTablonDeAbajoComprar = new JLabel(new ImageIcon("imagenes/tablonmaderaa.png"));
        lblTablonDeAbajoComprar.setBounds(0, 491, 400, 61);
        DomicilioOLocal.add(lblTablonDeAbajoComprar);
        
        lblFotoFondoMenuPrincipal_1 = new JLabel(new ImageIcon("imagenes/fondoIS.png"));
        lblFotoFondoMenuPrincipal_1.setBounds(0, 0, 400, 584);
        DomicilioOLocal.add(lblFotoFondoMenuPrincipal_1);
        PanelAnadirProd.setLayout(null);
        PanelAnadirProd.setBounds(0, 0, 386, 547);
        contentPane.add(PanelAnadirProd);
        
        
        
        // panel ------------------------- ?¿?¿?¿¿?¿?
        lblAnadirProd = new JLabel("AÑADIR PRODUCTO");
        lblAnadirProd.setFont(new Font("Tahoma", Font.BOLD, 20));
        lblAnadirProd.setBounds(85, 77, 233, 42);
        PanelAnadirProd.add(lblAnadirProd);
        
        lblAdministradores = new JLabel("SOLO ADMINISTRADORES");
        lblAdministradores.setFont(new Font("Tahoma", Font.BOLD, 25));
        lblAdministradores.setBounds(30, 10, 330, 57);
        PanelAnadirProd.add(lblAdministradores);
        
        lblNombreProd = new JLabel("NOMBRE:");
        lblNombreProd.setBounds(32, 137, 45, 13);
        PanelAnadirProd.add(lblNombreProd);
        
        textNombreProd = new JTextField();
        textNombreProd.setBounds(30, 160, 96, 19);
        PanelAnadirProd.add(textNombreProd);
        textNombreProd.setColumns(10);
        
        lblIdProd = new JLabel("ID PRODUCTO");
        lblIdProd.setBounds(30, 189, 113, 13);
        PanelAnadirProd.add(lblIdProd);
        
        textIdProd = new JTextField();
        textIdProd.setBounds(30, 212, 96, 19);
        PanelAnadirProd.add(textIdProd);
        textIdProd.setColumns(10);
        
        lblIng1 = new JLabel("INGREDIENTE 1");
        lblIng1.setBounds(30, 238, 113, 13);
        PanelAnadirProd.add(lblIng1);
        
        textIng1 = new JTextField();
        textIng1.setBounds(30, 261, 96, 19);
        PanelAnadirProd.add(textIng1);
        textIng1.setColumns(10);
        
        lblIng2 = new JLabel("INGREDIENTE 2");
        lblIng2.setBounds(30, 296, 113, 13);
        PanelAnadirProd.add(lblIng2);
        
        textIng2 = new JTextField();
        textIng2.setBounds(30, 319, 96, 19);
        PanelAnadirProd.add(textIng2);
        textIng2.setColumns(10);
        
        lblGluten = new JLabel("Gluten");
        lblGluten.setBounds(30, 356, 45, 13);
        PanelAnadirProd.add(lblGluten);
        
        CbGluten = new JCheckBox("");
        CbGluten.setBounds(30, 375, 47, 42);
        PanelAnadirProd.add(CbGluten);
        PanelAdmin.setBounds(0, 0, 386, 545);
        contentPane.add(PanelAdmin);
        PanelAdmin.setLayout(null);
        
        lblAdministradores2 = new JLabel("SOLO ADMINISTRADORES");
        lblAdministradores2.setFont(new Font("Tahoma", Font.BOLD, 25));
        lblAdministradores2.setBounds(23, 35, 330, 57);
        PanelAdmin.add(lblAdministradores2);
        
        btnEliminarProd = new JButton("ELIMINAR PRODUCTO");
        btnEliminarProd.setBounds(50, 393, 285, 101);
        PanelAdmin.add(btnEliminarProd);
        
        btnModificarProd = new JButton("MODIFICAR PRODUCTO");
        btnModificarProd.setBounds(50, 270, 285, 101);
        PanelAdmin.add(btnModificarProd);
        
        btnAnadirProd = new JButton("AÑADIR PRODUCTO");
        btnAnadirProd.setBounds(50, 141, 285, 101);
        PanelAdmin.add(btnAnadirProd);

        
        
        
        
        
        //PANEL REGISTRO
        PanelRegistro = new JPanel();
        PanelRegistro.setVisible(false);
        PanelRegistro.setBounds(0, 0, 384, 545);
        contentPane.add(PanelRegistro);
        PanelRegistro.setLayout(null);
        
        JLabel lblRegistro = new JLabel("REGISTRO");
        lblRegistro.setFont(new Font("Tahoma", Font.BOLD, 30));
        lblRegistro.setBounds(104, 40, 159, 66);
        PanelRegistro.add(lblRegistro);
        
        JLabel lblNombre = new JLabel("NOMBRE");
        lblNombre.setBounds(40, 133, 46, 14);
        PanelRegistro.add(lblNombre);
        
        textNombre = new JTextField();
        textNombre.setBounds(40, 158, 86, 20);
        PanelRegistro.add(textNombre);
        textNombre.setColumns(10);
        
        JLabel lblCorreo = new JLabel("CORREO ELECTRONICO");
        lblCorreo.setBounds(40, 218, 159, 14);
        PanelRegistro.add(lblCorreo);
        
        textCorreo = new JTextField();
        textCorreo.setBounds(40, 251, 86, 20);
        PanelRegistro.add(textCorreo);
        textCorreo.setColumns(10);
        
        JLabel lblContrasena = new JLabel("CONTRASENA");
        lblContrasena.setBounds(40, 291, 159, 14);
        PanelRegistro.add(lblContrasena);
        
        textContrasena = new JTextField();
        textContrasena.setBounds(40, 316, 86, 20);
        PanelRegistro.add(textContrasena);
        textContrasena.setColumns(10);
        
        JLabel lblRepetirContrasena = new JLabel("REPETIR CONTRASENA");
        lblRepetirContrasena.setBounds(40, 347, 159, 14);
        PanelRegistro.add(lblRepetirContrasena);
        
        textRepetirContrasena = new JTextField();
        textRepetirContrasena.setBounds(40, 373, 86, 20);
        PanelRegistro.add(textRepetirContrasena);
        textRepetirContrasena.setColumns(10);
        
        JLabel lblVerificacion = new JLabel("VERIFICACION");
        lblVerificacion.setBounds(40, 463, 120, 14);
        PanelRegistro.add(lblVerificacion);
        
        btnValidar = new JButton("");
        btnValidar.setBounds(235, 459, 38, 34);
        PanelRegistro.add(btnValidar);
        
        JLabel lblFotoFondo2 = new JLabel(new ImageIcon("imagenes/fondoIS.png"));
        lblFotoFondo2.setBounds(0, 0, 390, 550);
        PanelRegistro.add(lblFotoFondo2);
    }
}
