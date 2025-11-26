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
		lblUsuarioFoto.setBounds(268, 172, 45, 43);
		lblUsuarioFoto.setIcon(new ImageIcon("imagenes/usuario.png")); 
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
		lblUsuario.setBounds(10, 121, 208, 31);
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
		lblContraseña.setBounds(10, 248, 208, 31);
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
		passwordField.setBounds(10, 299, 254, 43);
		PanelInicioSesion.add(passwordField);
		
		lblContraseñaFoto = new JLabel("");
		lblContraseñaFoto.setBounds(219, 299, 45, 43);
		PanelInicioSesion.add(lblContraseñaFoto);
		
		lblFondoCuenta = new JLabel("");
		lblFondoCuenta.setBounds(42, 20, 295, 48);
		PanelInicioSesion.add(lblFondoCuenta);
		lblFondoCuenta.setIcon(new ImageIcon("imagenes/qqq.png"));
		


		
		txtUsuario = new JTextField();
		txtUsuario.setBounds(10, 172, 254, 43);
		PanelInicioSesion.add(txtUsuario);
		txtUsuario.setColumns(10);
		
		lblFotoFondo = new JLabel("");
		lblFotoFondo.setBounds(0, 0, 694, 550);
		PanelInicioSesion.add(lblFotoFondo);
		lblFotoFondo.setIcon(new ImageIcon("imagenes/fondo.png")); // así se pone una imagen en un JLabel
		
		

	}
}
