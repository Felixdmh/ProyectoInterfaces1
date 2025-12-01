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
    
    // Componentes Registro
    public JButton btnValidar;
    

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                Vista vista = new Vista();
                new Controlador(vista);
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
        btnAdmin.setBounds(318, 25, 46, 47);
        PanelInicioSesion.add(btnAdmin);
        
        lblFotoFondo = new JLabel(new ImageIcon("imagenes/fondoIS.png"));
        lblFotoFondo.setBounds(0, 0, 390, 550);
        PanelInicioSesion.add(lblFotoFondo);

        // ------------------- PANEL MENÚ PRINCIPAL -------------------
        PanelMenuPrincipal = new JPanel();
        PanelMenuPrincipal.setLayout(null);
        PanelMenuPrincipal.setBounds(0, 0, 400, 584);
        contentPane.add(PanelMenuPrincipal);

        LogoPeque = new JLabel(new ImageIcon("imagenes/logo_peque.png"));
        LogoPeque.setBounds(170, 10, 53, 49);
        PanelMenuPrincipal.add(LogoPeque);

        btnPideYa = new JButton("PIDE YA");
        btnPideYa.setBounds(157, 451, 84, 20);
        PanelMenuPrincipal.add(btnPideYa);
        
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

        // ------------------- VISIBILIDAD INICIAL -------------------
        PanelInicioSesion.setVisible(true);
        PanelMenuPrincipal.setVisible(false);
    }
}
