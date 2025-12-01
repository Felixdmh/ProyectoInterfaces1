package Vista;

import java.awt.EventQueue;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import Controlador.Controlador;

import java.awt.Color;
import java.awt.Font;

public class Vista extends JFrame {

    private static final long serialVersionUID = 1L;
    public JPanel contentPane;

    // Paneles
    public JPanel PanelInicioSesion;
    public JPanel PanelMenuPrincipal;

    // Componentes Inicio Sesión
    public JLabel lblCuenta, lblUsuario, lblContraseña, lblUsuarioFoto, lblContraseñaFoto, lblFondoCuenta, lblFotoFondo, lblGif;
    public JTextField txtUsuario;
    public JPasswordField passwordField;
    public JButton btnReg, btnInSes;

    // Componentes Menú Principal
    public JLabel LogoPeque;
    public JButton btnPideYa;

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

        // ------------------- VISIBILIDAD INICIAL -------------------
        PanelInicioSesion.setVisible(true);
        PanelMenuPrincipal.setVisible(false);
    }
}
