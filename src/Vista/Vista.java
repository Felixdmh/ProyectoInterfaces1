package Vista;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.Color;

public class Vista extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	public JPanel PanelInicioSesion;
	public JLabel lblCuenta;
	public JLabel lblUsuario;
	public JButton btnReg;
	public JLabel lblContraseña;
	public JTextField txtUsuario;
	public JButton btnInSes;
	public JPasswordField passwordField;
	public JLabel lblUsuarioFoto;
	public JLabel lblContraseñaFoto;
	public JLabel lblFondoCuenta;
	public JLabel lblFotoFondo;
	public JLabel lblGif;
	public JPanel PanelRegistro;
	public JLabel lblRegistro;
	public JLabel lblNombre;
	public JTextField textNombre;
	public JLabel lblCorreo;
	public JTextField textCorreo;
	public JLabel lblContrasena;
	public JTextField textContrasena;
	public JLabel lblRepetirContrasena;
	public JTextField textRepetirContrasena;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Vista frame = new Vista();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Vista() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 400, 584);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		PanelInicioSesion = new JPanel();
		PanelInicioSesion.setBorder(new EmptyBorder(0, 0, 0, 0));
		PanelInicioSesion.setBounds(0, 0, 400, 584);
		contentPane.add(PanelInicioSesion);
		PanelInicioSesion.setLayout(null);
		

		lblUsuarioFoto = new JLabel("");
		lblUsuarioFoto.setBounds(119, 119, 45, 43);
		lblUsuarioFoto.setIcon(new ImageIcon("imagenes/logo2.png")); 
		PanelInicioSesion.add(lblUsuarioFoto);
		
		
		
		
		lblCuenta = new JLabel("Cuenta");
		lblCuenta.setHorizontalAlignment(SwingConstants.CENTER);
		lblCuenta.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblCuenta.setBounds(119, 10, 145, 62);
		PanelInicioSesion.add(lblCuenta);
		lblCuenta.setForeground(new Color(255, 255, 255));
		
		
		lblUsuario = new JLabel("Usuario");
		lblUsuario.setForeground(new Color(0, 0, 0));
		lblUsuario.setBackground(new Color(255, 255, 255));
		lblUsuario.setHorizontalAlignment(SwingConstants.LEFT);
		lblUsuario.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblUsuario.setBounds(10, 131, 208, 31);
		PanelInicioSesion.add(lblUsuario);
		
		btnReg = new JButton("Registrarse");
		btnReg.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnReg.setBounds(83, 469, 220, 54);
		PanelInicioSesion.add(btnReg);
		btnReg.setBackground(new Color(72, 61, 139)); 
		btnReg.setForeground(new Color(255,255,255));
		btnReg.setBorder(new LineBorder(Color.BLACK, 5));
		
				
				lblContraseña = new JLabel("Contraseña");
				lblContraseña.setHorizontalAlignment(SwingConstants.LEFT);
				lblContraseña.setFont(new Font("Tahoma", Font.BOLD, 25));
				lblContraseña.setBounds(10, 258, 208, 31);
				PanelInicioSesion.add(lblContraseña);
				lblContraseña.setBackground(new Color(25, 25, 245));
				
				btnInSes = new JButton("Iniciar Sesión");
				btnInSes.setFont(new Font("Tahoma", Font.BOLD, 20));
				btnInSes.setBounds(83, 405, 220, 54);
				PanelInicioSesion.add(btnInSes);
				btnInSes.setBackground(new Color(72, 61, 139)); // Ponemos un color de fondo personalizado
				btnInSes.setForeground(new Color(255,255,255));// .setForeground sirve para el color del texto
				btnInSes.setBorder(new LineBorder(Color.BLACK, 5));  // borde personalizado 
				
				
				passwordField = new JPasswordField();
				passwordField.setBounds(10, 299, 190, 25);
				PanelInicioSesion.add(passwordField);
				
				lblContraseñaFoto = new JLabel("");
				lblContraseñaFoto.setBounds(160, 246, 45, 43);
				PanelInicioSesion.add(lblContraseñaFoto);
				lblContraseñaFoto.setIcon(new ImageIcon("imagenes/candado.png"));
				
				lblFondoCuenta = new JLabel("");
				lblFondoCuenta.setBounds(42, 20, 295, 48);
				PanelInicioSesion.add(lblFondoCuenta);
				lblFondoCuenta.setIcon(new ImageIcon("imagenes/qqq.png"));
				
				
				txtUsuario = new JTextField();
				txtUsuario.setBounds(10, 172, 190, 25);
				PanelInicioSesion.add(txtUsuario);
				txtUsuario.setColumns(10);
				
				lblGif = new JLabel("");
				lblGif.setBounds(221, 174, 120, 132);
				PanelInicioSesion.add(lblGif);
				lblGif.setIcon(new ImageIcon("imagenes/gifburgercolor.gif"));
				
				lblFotoFondo = new JLabel("");
				lblFotoFondo.setBounds(0, 0, 694, 550);
				PanelInicioSesion.add(lblFotoFondo);
				lblFotoFondo.setIcon(new ImageIcon("imagenes/fondoIS.png")); // así se pone una imagen en un JLabel
		
		PanelRegistro = new JPanel();
		PanelRegistro.setBounds(0, 0, 386, 547);
		contentPane.add(PanelRegistro);
		PanelRegistro.setLayout(null);
		
		lblRegistro = new JLabel("REGISTRO");
		lblRegistro.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblRegistro.setBounds(112, 35, 161, 59);
		PanelRegistro.add(lblRegistro);
		
		lblNombre = new JLabel("NOMBRE:");
		lblNombre.setBounds(32, 120, 45, 13);
		PanelRegistro.add(lblNombre);
		
		textNombre = new JTextField();
		textNombre.setBounds(32, 143, 96, 19);
		PanelRegistro.add(textNombre);
		textNombre.setColumns(10);
		
		lblCorreo = new JLabel("CORREO ELECTRONICO");
		lblCorreo.setBounds(32, 172, 161, 13);
		PanelRegistro.add(lblCorreo);
		
		textCorreo = new JTextField();
		textCorreo.setBounds(32, 195, 96, 19);
		PanelRegistro.add(textCorreo);
		textCorreo.setColumns(10);
		
		lblContrasena = new JLabel("CONTRASEÑA");
		lblContrasena.setBounds(32, 224, 127, 13);
		PanelRegistro.add(lblContrasena);
		
		textContrasena = new JTextField();
		textContrasena.setBounds(32, 247, 96, 19);
		PanelRegistro.add(textContrasena);
		textContrasena.setColumns(10);
		
		lblRepetirContrasena = new JLabel("REPETIR CONTRASEÑA");
		lblRepetirContrasena.setBounds(32, 276, 45, 13);
		PanelRegistro.add(lblRepetirContrasena);
		
		textRepetirContrasena = new JTextField();
		textRepetirContrasena.setBounds(32, 299, 96, 19);
		PanelRegistro.add(textRepetirContrasena);
		textRepetirContrasena.setColumns(10);
		
		

	}
}
