package Vista;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;

import Controlador.Controlador;
import Modelo.Usuarios;

import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.Color;

public class Vista extends JFrame {

	private Controlador controlador;
	
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
	public JPanel PanelMenuPrincipal;
	public JLabel LogoPeque;
	public JButton btnPideYa;

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
		controlador = new Controlador(); // Importo la clase controlador(también está mas arriba)

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 400, 584);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
	    
	    
	    //PANEL DE INICIO DE SESIÓN
	    PanelInicioSesion = new JPanel();
	    PanelInicioSesion.setBorder(new EmptyBorder(0, 0, 0, 0));
	    PanelInicioSesion.setBounds(0, 0, 400, 584);
	    contentPane.add(PanelInicioSesion);
	    PanelInicioSesion.setLayout(null);
	    

	    // FOTO CAMPO USUARIO
	    lblUsuarioFoto = new JLabel("");
	    lblUsuarioFoto.setBounds(119, 119, 45, 43);
	    lblUsuarioFoto.setIcon(new ImageIcon("imagenes/logo2.png")); 
	    PanelInicioSesion.add(lblUsuarioFoto);
	    
	    
	    // TITULO CUENTA
	    lblCuenta = new JLabel("Cuenta");
	    lblCuenta.setHorizontalAlignment(SwingConstants.CENTER);
	    lblCuenta.setFont(new Font("Tahoma", Font.BOLD, 30));
	    lblCuenta.setBounds(119, 10, 145, 62);
	    PanelInicioSesion.add(lblCuenta);
	    lblCuenta.setForeground(new Color(255, 255, 255));
	    
	    
	    // TITULO USUARIO
	    lblUsuario = new JLabel("Usuario");
	    lblUsuario.setForeground(new Color(0, 0, 0));
	    lblUsuario.setBackground(new Color(255, 255, 255));
	    lblUsuario.setHorizontalAlignment(SwingConstants.LEFT);
	    lblUsuario.setFont(new Font("Tahoma", Font.BOLD, 25));
	    lblUsuario.setBounds(10, 131, 208, 31);
	    PanelInicioSesion.add(lblUsuario);
	    
	    
	    // BOTÓN REGISTRARSE
	    btnReg = new JButton("Registrarse");
	    btnReg.setFont(new Font("Tahoma", Font.BOLD, 20));
	    btnReg.setBounds(83, 469, 220, 54);
	    PanelInicioSesion.add(btnReg);
	    btnReg.setBackground(new Color(72, 61, 139)); 
	    btnReg.setForeground(new Color(255,255,255));
	    btnReg.setBorder(new LineBorder(Color.BLACK, 5));
	    
	    		
	    		// TITULO CONTRASEÑA
	    		lblContraseña = new JLabel("Contraseña");
	    		lblContraseña.setHorizontalAlignment(SwingConstants.LEFT);
	    		lblContraseña.setFont(new Font("Tahoma", Font.BOLD, 25));
	    		lblContraseña.setBounds(10, 258, 208, 31);
	    		PanelInicioSesion.add(lblContraseña);
	    		lblContraseña.setBackground(new Color(25, 25, 245));
	    		
	    		
	    		// BOTÓN INICIO SESIÓN
	    		btnInSes = new JButton("Iniciar Sesión");
	    		btnInSes.setFont(new Font("Tahoma", Font.BOLD, 20));
	    		btnInSes.setBounds(83, 405, 220, 54);
	    		PanelInicioSesion.add(btnInSes);
	    		btnInSes.setBackground(new Color(72, 61, 139)); // Ponemos un color de fondo personalizado
	    		btnInSes.setForeground(new Color(255,255,255));// .setForeground sirve para el color del texto
	    		btnInSes.setBorder(new LineBorder(Color.BLACK, 5));  // borde personalizado 
	    		
	    		
	    		// CAMPO CONTRASEÑA
	    		passwordField = new JPasswordField();
	    		passwordField.setBounds(10, 299, 190, 25);
	    		PanelInicioSesion.add(passwordField);
	    		
	    		
	    		// FOTO DEL CAMPO CONTRASEÑA
	    		lblContraseñaFoto = new JLabel("");
	    		lblContraseñaFoto.setBounds(160, 246, 45, 43);
	    		PanelInicioSesion.add(lblContraseñaFoto);
	    		lblContraseñaFoto.setIcon(new ImageIcon("imagenes/candado.png"));
	    		
	    		
	    		// FONDO CUENTA
	    		lblFondoCuenta = new JLabel("");
	    		lblFondoCuenta.setBounds(42, 20, 295, 48);
	    		PanelInicioSesion.add(lblFondoCuenta);
	    		lblFondoCuenta.setIcon(new ImageIcon("imagenes/qqq.png"));
	    		
	    		
	    		// CAMPO USUARIO
	    		txtUsuario = new JTextField();
	    		txtUsuario.setBounds(10, 172, 190, 25);
	    		PanelInicioSesion.add(txtUsuario);
	    		txtUsuario.setColumns(10);
	    		
	    		
	    		// GIF BURGER
	    		lblGif = new JLabel("");
	    		lblGif.setBounds(238, 172, 120, 132);
	    		PanelInicioSesion.add(lblGif);
	    		lblGif.setIcon(new ImageIcon("imagenes/gifburgercolor.gif"));
	    		
	    		
	    		// FOTO CAMPO USUSARIO
	    		lblFotoFondo = new JLabel("");
	    		lblFotoFondo.setBounds(0, 0, 694, 550);
	    		PanelInicioSesion.add(lblFotoFondo);
	    		lblFotoFondo.setIcon(new ImageIcon("imagenes/fondoIS.png")); // así se pone una imagen en un JLabel
	    		
	    		
	    		// MÉTODO QUE TE METE EN EL MENÚ PRINCIPAL UNA VEZ HAS INTRODUCIDO LOS DATOS PARA INICIAR SESIÓN
	    btnInSes.addActionListener(e -> {
	    	
		    String nombre = txtUsuario.getText();
		    String contraseña = new String(passwordField.getPassword()); // se pone asi porque passwordfield devuelve un char[] y lo queremos convertir en String para poder manejarlo facilmente
		    
	        if(nombre.isEmpty()) {
	            JOptionPane.showMessageDialog(this, "Ingrese el nombre de usuario antes de iniciar sesión");
	            return; 
	        }

	        if(contraseña.isEmpty()) {
	            JOptionPane.showMessageDialog(this, "Ingrese la contraseña antes de iniciar sesión");
	            return;
	        }

	        boolean encontrado = false;

	        // Recorremos todos los usuarios para ver si existe en nuestra bbdd
	        for (Usuarios u : controlador.getListaUsuarios()) {
	            if(u.getNombre().equalsIgnoreCase(nombre) && u.getContraseña().equals(contraseña)) {
	                encontrado = true;
	                break;
	            }
	        }

	        if(encontrado) {
	            JOptionPane.showMessageDialog(this, "Usuario autentificado correctamente");
	    	    
	            txtUsuario.setText("");
	            passwordField.setText("");
	            
	        } else {
	            JOptionPane.showMessageDialog(this, "Usuario inexistente, pruebe a registrarse");
	        }
	    });


	/*      // PANEL DEL MENÚ PRINCIPAL
        PanelMenuPrincipal = new JPanel();
        PanelMenuPrincipal.setBounds(0, 0, 400, 584);
        contentPane.add(PanelMenuPrincipal);
        PanelMenuPrincipal.setLayout(null);
        
        LogoPeque = new JLabel("");
        LogoPeque.setBounds(170, 10, 53, 49);
        PanelMenuPrincipal.add(LogoPeque);
        
        btnPideYa = new JButton("PIDE YA");
        btnPideYa.setBounds(157, 451, 84, 20);
        PanelMenuPrincipal.add(btnPideYa);
        PanelMenuPrincipal.setVisible(true);
        */


		      
	    	            
 

	}
}
