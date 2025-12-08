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
	
	public JPanel PanelInicioSesion;
	public JPanel PanelMenuPrincipal;
	public JPanel PanelRegistro;
	public JLabel lblCuenta, lblUsuario, lblContraseña, lblUsuarioFoto, lblContraseñaFoto, lblFondoCuenta, lblFotoFondo, lblGif;
	public JTextField txtUsuario;
	public JPasswordField passwordField;
	public JButton btnReg, btnInSes;
	public JButton btnAdmin;
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
	public JButton btnValidar;
	public JPanel PanelAdmin;
	public JButton btnEliminarProd;
	public JButton btnModificarProd;
	public JButton btnAnadirProd;
	public JPanel PanelAnadirProd;
	public JLabel lblAnadirProd;
	public JLabel lblNombreProd;
	public JTextField textNombreProd;
	public JLabel lblColor;
	public JTextField textColor;
	public JLabel lblAdministradores2;
	public JLabel lblPanB;
	public JTextField textPanB;
	public JLabel lblCarneB;
	public JTextField textCarneB;
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
	public JComboBox CbRoja;
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
	public JLabel lblTablon;
	public JButton btnAvanzar;
	public JButton btnRetroceder;
	public JPanel PanelLocal2;
	public JComboBox CbPatatas;
	public JComboBox CbBebida;
	public JComboBox CbComp;
	public JButton btnSig;
	public JButton btnRetroceso;
	public JLabel lblFotoFondoPedido2;
	public JLabel lblPatata;
	public JLabel lblBebida;
	public JLabel lblComp;
	public JPanel PanelCodPedido;
	public JPanel PanelResumen;
	public JButton btnNewButton;
	public JLabel lblResumenPedido;
	public JLabel lblBurgerElegido;
	public JLabel lblBebidaElegida;
	public JLabel lblPatataElegida;
	public JLabel lblComplementoElegido;
	public JLabel lblPrecioResumen;
	public JButton btnVolver3;
	public JLabel lblPergaminoPedido;
	public JLabel lblCostePedido;
	public JLabel lblFotoFondoResumen;
	public JLabel lblFotoFondoCod;
	public JLabel lblPedidoCompletado;
	public JLabel lblTextoCodigo;
	public JLabel lblCodigo;
	public JLabel lblNewLabel;
	public JLabel lblMuchasGracias;
	public JButton btnAnadir;
	public JButton btnCancelar;
	public JLabel lblPrecioB;
	public JTextField textPrecioB;
	public JLabel lblExtraB;
	public JTextField textExtraB;
	public JTextField textQuesoB;
	public JLabel lblQuesoB;
	public JPanel PanelEliminarProd;
	public JLabel lblEliminarProd;
	public JButton btnEliminarProducto;
	public JTextField textBurgerElim;
	public JTextField textPatataElim;
	public JTextField textBebidaElim;
	public JTextField textExtraElim;
	public JLabel lblNombreBurgerElim;
	public JLabel lblPatataElim;
	public JLabel lblBebidaElim;
	public JLabel lblExtraElim;
	public JButton btnEliminarProductoCancelado;
	public JLabel lblBurgerVerde_1;
	public JLabel lblBurgerRoja_1;
	public JPanel PanelDomicilio;
	public JComboBox CbVerde_1;
	public JComboBox CbRoja_1;
	public JLabel lblFotoFondoDomicilio;
	public JLabel lblPan_1;
	public JLabel lblCarne_1;
	public JLabel lblQueso_1;
	public JLabel lblExtras_1;
	public JLabel lblEligeTP_1;
	public JLabel lblPanR_1;
	public JLabel lblCarneR_1;
	public JLabel lblQuesoR_1;
	public JLabel lblExtraR_1;
	public JLabel lblTablon_1;
	public JButton btnAvanzar_1;
	public JButton btnRetroceder_1;
	public JPanel PanelDomicilio2;
	public JLabel lblComp_1;
	public JLabel lblBebida_1;
	public JLabel lblPatata_1;
	public JComboBox cbPatatas;
	public JComboBox cbBebida;
	public JButton btnSig_1;
	public JButton btnRetroceso_1;
	public JLabel lblFotoFondoPedido2_1;
	public JLabel lblCruz;
	public JLabel lblSoloTienda;
	public JPanel PanelResumenDomicilio;
	public JLabel lblCostePedido_1;
	public JLabel lblResumenPedido_1;
	public JButton btnNewButton_1;
	public JLabel lblBurgerElegido_1;
	public JLabel lblBebidaElegida_1;
	public JLabel lblPatataElegida_1;
	public JLabel lblComplementoElegido_1;
	public JLabel lblPrecioResumen_1;
	public JButton btnVolver3_1;
	public JLabel lblPergaminoPedido_1;
	public JLabel lblFotoFondoResumen_1;
	public JLabel lblDireccion;
	public JTextField textDireccion;
	public JPanel PanelCodDomicilio;
	public JLabel lblPedidoCompletado_1;
	public JLabel lblTextoCodigo_1;
	public JLabel lblCodigo_1;
	public JLabel lblDireccionPedido;
	public JLabel lblMuchasGracias_1;
	public JLabel lblFotoFondoCod_1;
	public JButton btnMenuPrincipalDomicilio;
	public JButton btnMenuPrincipalLocal;
	public JLabel lblCompletaMenu;
	public JLabel lblFotoFondoAnadirProd;
	public JLabel lblAdministradores2_1;
	public JLabel lblTablonAdmin_1;
	public JLabel lblAdministradores2_2;
	public JLabel lblTablonAdmin_2;
	public JLabel lblFotoFondoElimProd;
	public JButton btnSalir;
	public JPanel PanelModificarProd;
	public JLabel lblFotoFondoModificar;
	public JLabel lblAdministradores2_3;
	public JLabel lblTablonAdmin_3;
	public JLabel lblModificarProd;
	public JLabel lblPan_2;
	public JLabel lblCarne_2;
	public JLabel lblQueso_2;
	public JLabel lblExtras_2;
	public JLabel lblPanR_2;
	public JLabel lblCarneR_2;
	public JLabel lblQuesoR_2;
	public JLabel lblExtraR_2;
	public JLabel lblPrecioProd;
	public JTextField textPanMod;
	public JTextField textCarneMod;
	public JTextField textQuesoMod;
	public JTextField textExtraMod;
	public JTextField textPrecioMod;
	public JButton btnCancelarModificacion;
	public JButton btnConfirmarModificacion;
	public JComboBox comboBoxM;
	public JLabel lblPrecioR;
	public JLabel lblPrecioProd_1;
	public JLabel lblPan_2_1;
	public JLabel lblCarne_2_1;
	public JLabel lblQueso_2_1;
	public JLabel lblExtras_2_1;
	public JButton btnCancelarRegistro;
	public JLabel lblAdministradores2_3_1;
	public JLabel lblTablonAdmin_3_1;
	public JLabel lblNombre;
	public JLabel lblContrasena;
	public JLabel lblRepetirContrasena;
	public JLabel lblVerificacion;
	public JLabel lblFotoFondo2;
	public JLabel lblCorreo;
	public JLabel lblFotoFondoPAdmin;
	public JLabel lblTablonAdmin;
	private JLabel lblCompletaMenu_1;
	


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
		lblEspec = new JLabel("ESPECIFICACIONES");
		lblEspec.setBounds(91, 288, 204, 29);


		// PANEL PEDIR COMPRAR                                                 
		DomicilioOLocal = new JPanel();
		DomicilioOLocal.setVisible(false);

		PanelDomicilio = new JPanel();
		PanelDomicilio.setVisible(false);

		PanelLocal2 = new JPanel();
		PanelLocal2.setVisible(false);

		PanelLocal = new JPanel();
		PanelLocal.setVisible(false);


		//----------- Panel Añadir Producto ----------//
		PanelAnadirProd = new JPanel();
		PanelAnadirProd.setVisible(false);

		PanelEliminarProd = new JPanel();
		PanelEliminarProd.setVisible(false);

		PanelAdmin = new JPanel();
		PanelAdmin.setVisible(false);
		
		PanelModificarProd = new JPanel();
		PanelModificarProd.setVisible(false);
		
		
		
		
		
		
				//PANEL REGISTRO
				PanelRegistro = new JPanel();
				PanelRegistro.setVisible(false);
				PanelRegistro.setBounds(0, 0, 384, 545);
				contentPane.add(PanelRegistro);
				PanelRegistro.setLayout(null);
								
								btnCancelarRegistro = new JButton("CANCELAR");
								btnCancelarRegistro.setBounds(68, 449, 253, 41);
								PanelRegistro.add(btnCancelarRegistro);
								
								lblAdministradores2_3_1 = new JLabel("REGISTRO");
								lblAdministradores2_3_1.setForeground(Color.BLACK);
								lblAdministradores2_3_1.setFont(new Font("Tahoma", Font.BOLD, 25));
								lblAdministradores2_3_1.setBounds(127, 30, 132, 69);
								PanelRegistro.add(lblAdministradores2_3_1);
								
								lblTablonAdmin_3_1 = new JLabel(new ImageIcon("imagenes/TablonAdmin.png"));
								lblTablonAdmin_3_1.setBounds(0, 30, 386, 69);
								PanelRegistro.add(lblTablonAdmin_3_1);
						
								lblNombre = new JLabel("NOMBRE");
								lblNombre.setFont(new Font("Tempus Sans ITC", Font.BOLD, 15));
								lblNombre.setBounds(156, 133, 69, 14);
								PanelRegistro.add(lblNombre);
								
										textNombre = new JTextField();
										textNombre.setBounds(40, 158, 307, 20);
										PanelRegistro.add(textNombre);
										textNombre.setColumns(10);
										
												lblCorreo = new JLabel("CORREO ELECTRONICO");
												lblCorreo.setFont(new Font("Tempus Sans ITC", Font.BOLD, 15));
												lblCorreo.setBounds(106, 189, 181, 14);
												PanelRegistro.add(lblCorreo);
												
														textCorreo = new JTextField();
														textCorreo.setBounds(40, 214, 307, 20);
														PanelRegistro.add(textCorreo);
														textCorreo.setColumns(10);
														
																lblContrasena = new JLabel("CONTRASEÑA");
																lblContrasena.setFont(new Font("Tempus Sans ITC", Font.BOLD, 15));
																lblContrasena.setBounds(134, 245, 103, 14);
																PanelRegistro.add(lblContrasena);
																
																		textContrasena = new JTextField();
																		textContrasena.setBounds(40, 268, 307, 20);
																		PanelRegistro.add(textContrasena);
																		textContrasena.setColumns(10);
																		
																				lblRepetirContrasena = new JLabel("REPETIR CONTRASEÑA");
																				lblRepetirContrasena.setFont(new Font("Tempus Sans ITC", Font.BOLD, 15));
																				lblRepetirContrasena.setBounds(114, 299, 173, 14);
																				PanelRegistro.add(lblRepetirContrasena);
																				
																						textRepetirContrasena = new JTextField();
																						textRepetirContrasena.setBounds(40, 324, 307, 20);
																						PanelRegistro.add(textRepetirContrasena);
																						textRepetirContrasena.setColumns(10);
																						
																								lblVerificacion = new JLabel("VERIFICACION");
																								lblVerificacion.setFont(new Font("Tempus Sans ITC", Font.BOLD, 15));
																								lblVerificacion.setBounds(92, 375, 120, 14);
																								PanelRegistro.add(lblVerificacion);
																								
																										btnValidar = new JButton("");
																										btnValidar.setBounds(238, 366, 38, 34);
																										PanelRegistro.add(btnValidar);
																										
																												lblFotoFondo2 = new JLabel(new ImageIcon("imagenes/fondoIS.png"));
																												lblFotoFondo2.setBounds(0, 0, 390, 550);
																												PanelRegistro.add(lblFotoFondo2);
		PanelModificarProd.setBounds(0, 0, 386, 545);
		contentPane.add(PanelModificarProd);
		PanelModificarProd.setLayout(null);
		
		btnConfirmarModificacion = new JButton("MODIFICAR");
		btnConfirmarModificacion.setBounds(257, 148, 89, 23);
		PanelModificarProd.add(btnConfirmarModificacion);
		
		comboBoxM = new JComboBox();
		comboBoxM.setBounds(133, 148, 102, 20);
		PanelModificarProd.add(comboBoxM);
		
		btnCancelarModificacion = new JButton("CANCELAR");
		btnCancelarModificacion.setBounds(30, 147, 89, 23);
		PanelModificarProd.add(btnCancelarModificacion);
		
		lblPrecioR = new JLabel("");
		lblPrecioR.setBounds(136, 329, 173, 13);
		PanelModificarProd.add(lblPrecioR);
		
		lblPanR_2 = new JLabel("");
		lblPanR_2.setBounds(136, 190, 172, 13);
		PanelModificarProd.add(lblPanR_2);
		
		lblPan_2 = new JLabel("PAN:");
		lblPan_2.setFont(new Font("Tempus Sans ITC", Font.BOLD, 11));
		lblPan_2.setBounds(68, 190, 45, 13);
		PanelModificarProd.add(lblPan_2);
		
		lblQueso_2 = new JLabel("QUESO:");
		lblQueso_2.setFont(new Font("Tempus Sans ITC", Font.BOLD, 11));
		lblQueso_2.setBounds(68, 261, 45, 13);
		PanelModificarProd.add(lblQueso_2);
		
		lblExtras_2 = new JLabel("EXTRAS:");
		lblExtras_2.setFont(new Font("Tempus Sans ITC", Font.BOLD, 11));
		lblExtras_2.setBounds(68, 297, 45, 13);
		PanelModificarProd.add(lblExtras_2);
		
		lblPrecioProd = new JLabel("PRECIO:");
		lblPrecioProd.setFont(new Font("Tempus Sans ITC", Font.BOLD, 11));
		lblPrecioProd.setBounds(68, 330, 45, 13);
		PanelModificarProd.add(lblPrecioProd);
		
		lblCarne_2 = new JLabel("CARNE:");
		lblCarne_2.setFont(new Font("Tempus Sans ITC", Font.BOLD, 11));
		lblCarne_2.setBounds(68, 223, 45, 13);
		PanelModificarProd.add(lblCarne_2);
		
		lblExtraR_2 = new JLabel("");
		lblExtraR_2.setBounds(136, 297, 172, 13);
		PanelModificarProd.add(lblExtraR_2);
		
		lblCarneR_2 = new JLabel("");
		lblCarneR_2.setBounds(135, 223, 173, 13);
		PanelModificarProd.add(lblCarneR_2);
		
		lblQuesoR_2 = new JLabel("");
		lblQuesoR_2.setBounds(135, 261, 173, 13);
		PanelModificarProd.add(lblQuesoR_2);
		
		lblAdministradores2_3 = new JLabel("SOLO \r\nADMINISTRADORES");
		lblAdministradores2_3.setForeground(Color.BLACK);
		lblAdministradores2_3.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblAdministradores2_3.setBounds(58, 30, 266, 69);
		PanelModificarProd.add(lblAdministradores2_3);
		
		lblTablonAdmin_3 = new JLabel(new ImageIcon("imagenes/TablonAdmin.png"));
		lblTablonAdmin_3.setBounds(0, 30, 386, 69);
		PanelModificarProd.add(lblTablonAdmin_3);
		
		lblModificarProd = new JLabel("MODIFICAR PRODUCTO");
		lblModificarProd.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblModificarProd.setBounds(68, 95, 241, 42);
		PanelModificarProd.add(lblModificarProd);
		
		lblPrecioProd_1 = new JLabel("PRECIO:");
		lblPrecioProd_1.setFont(new Font("Tempus Sans ITC", Font.BOLD, 11));
		lblPrecioProd_1.setBounds(68, 515, 45, 13);
		PanelModificarProd.add(lblPrecioProd_1);
		
		lblPan_2_1 = new JLabel("PAN:");
		lblPan_2_1.setFont(new Font("Tempus Sans ITC", Font.BOLD, 11));
		lblPan_2_1.setBounds(68, 375, 45, 13);
		PanelModificarProd.add(lblPan_2_1);
		
		lblCarne_2_1 = new JLabel("CARNE:");
		lblCarne_2_1.setFont(new Font("Tempus Sans ITC", Font.BOLD, 11));
		lblCarne_2_1.setBounds(68, 408, 45, 13);
		PanelModificarProd.add(lblCarne_2_1);
		
		lblQueso_2_1 = new JLabel("QUESO:");
		lblQueso_2_1.setFont(new Font("Tempus Sans ITC", Font.BOLD, 11));
		lblQueso_2_1.setBounds(68, 446, 45, 13);
		PanelModificarProd.add(lblQueso_2_1);
		
		lblExtras_2_1 = new JLabel("EXTRAS:");
		lblExtras_2_1.setFont(new Font("Tempus Sans ITC", Font.BOLD, 11));
		lblExtras_2_1.setBounds(68, 482, 45, 13);
		PanelModificarProd.add(lblExtras_2_1);
		
		textPanMod = new JTextField();
		textPanMod.setBounds(136, 371, 173, 20);
		PanelModificarProd.add(textPanMod);
		textPanMod.setColumns(10);
		
		textCarneMod = new JTextField();
		textCarneMod.setColumns(10);
		textCarneMod.setBounds(136, 404, 173, 20);
		PanelModificarProd.add(textCarneMod);
		
		textQuesoMod = new JTextField();
		textQuesoMod.setColumns(10);
		textQuesoMod.setBounds(136, 442, 173, 20);
		PanelModificarProd.add(textQuesoMod);
		
		textExtraMod = new JTextField();
		textExtraMod.setText("    ");
		textExtraMod.setColumns(10);
		textExtraMod.setBounds(136, 478, 173, 20);
		PanelModificarProd.add(textExtraMod);
		
		textPrecioMod = new JTextField();
		textPrecioMod.setColumns(10);
		textPrecioMod.setBounds(136, 511, 173, 20);
		PanelModificarProd.add(textPrecioMod);
		
		lblFotoFondoModificar = new JLabel(new ImageIcon("imagenes/fondoIS.png"));
		lblFotoFondoModificar.setBounds(0, 0, 386, 545);
		PanelModificarProd.add(lblFotoFondoModificar);
		PanelAdmin.setBounds(0, 0, 386, 545);
		contentPane.add(PanelAdmin);
		PanelAdmin.setLayout(null);

		btnSalir = new JButton("SALIR");
		btnSalir.setBounds(151, 505, 89, 23);
		PanelAdmin.add(btnSalir);

		lblAdministradores2 = new JLabel("SOLO \r\nADMINISTRADORES");
		lblAdministradores2.setForeground(new Color(0, 0, 0));
		lblAdministradores2.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblAdministradores2.setBounds(58, 37, 266, 69);
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

		lblTablonAdmin = new JLabel(new ImageIcon("imagenes/TablonAdmin.png"));
		lblTablonAdmin.setBounds(0, 37, 386, 69);
		PanelAdmin.add(lblTablonAdmin);

		lblFotoFondoPAdmin = new JLabel(new ImageIcon("imagenes/fondoIS.png"));
		lblFotoFondoPAdmin.setBounds(0, 0, 386, 545);
		PanelAdmin.add(lblFotoFondoPAdmin);
		PanelEliminarProd.setBounds(0, 0, 386, 547);
		contentPane.add(PanelEliminarProd);
		PanelEliminarProd.setLayout(null);

		lblAdministradores2_2 = new JLabel("SOLO \r\nADMINISTRADORES");
		lblAdministradores2_2.setForeground(Color.BLACK);
		lblAdministradores2_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblAdministradores2_2.setBounds(58, 31, 266, 69);
		PanelEliminarProd.add(lblAdministradores2_2);

		lblTablonAdmin_2 = new JLabel(new ImageIcon("imagenes/TablonAdmin.png"));
		lblTablonAdmin_2.setBounds(0, 31, 386, 69);
		PanelEliminarProd.add(lblTablonAdmin_2);

		lblEliminarProd = new JLabel("ELIMINAR PRODUCTO");
		lblEliminarProd.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblEliminarProd.setBounds(85, 93, 233, 42);
		PanelEliminarProd.add(lblEliminarProd);

		btnEliminarProducto = new JButton("ELIMINAR");
		btnEliminarProducto.setBounds(217, 469, 101, 42);
		PanelEliminarProd.add(btnEliminarProducto);

		textBurgerElim = new JTextField();
		textBurgerElim.setBounds(222, 160, 96, 19);
		PanelEliminarProd.add(textBurgerElim);
		textBurgerElim.setColumns(10);

		textPatataElim = new JTextField();
		textPatataElim.setBounds(222, 245, 96, 19);
		PanelEliminarProd.add(textPatataElim);
		textPatataElim.setColumns(10);

		textBebidaElim = new JTextField();
		textBebidaElim.setBounds(222, 329, 96, 19);
		PanelEliminarProd.add(textBebidaElim);
		textBebidaElim.setColumns(10);

		textExtraElim = new JTextField();
		textExtraElim.setBounds(222, 418, 96, 19);
		PanelEliminarProd.add(textExtraElim);
		textExtraElim.setColumns(10);

		lblNombreBurgerElim = new JLabel("NOMBRE DE LA HAMBURGUESA:");
		lblNombreBurgerElim.setFont(new Font("Tempus Sans ITC", Font.BOLD, 11));
		lblNombreBurgerElim.setBounds(29, 164, 183, 13);
		PanelEliminarProd.add(lblNombreBurgerElim);

		lblPatataElim = new JLabel("NOMBRE DE LA PATATA:");
		lblPatataElim.setFont(new Font("Tempus Sans ITC", Font.BOLD, 11));
		lblPatataElim.setBounds(29, 249, 183, 13);
		PanelEliminarProd.add(lblPatataElim);

		lblBebidaElim = new JLabel("NOMBRE DE LA BEBIDA:");
		lblBebidaElim.setFont(new Font("Tempus Sans ITC", Font.BOLD, 11));
		lblBebidaElim.setBounds(29, 333, 183, 13);
		PanelEliminarProd.add(lblBebidaElim);

		lblExtraElim = new JLabel("NOMBRE DEL EXTRA:");
		lblExtraElim.setFont(new Font("Tempus Sans ITC", Font.BOLD, 11));
		lblExtraElim.setBounds(29, 422, 183, 13);
		PanelEliminarProd.add(lblExtraElim);

		btnEliminarProductoCancelado = new JButton("CANCELAR");

		btnEliminarProductoCancelado.setBounds(55, 469, 101, 42);
		PanelEliminarProd.add(btnEliminarProductoCancelado);

		lblFotoFondoElimProd = new JLabel(new ImageIcon("imagenes/fondoIS.png"));
		lblFotoFondoElimProd.setBounds(0, 0, 386, 547);
		PanelEliminarProd.add(lblFotoFondoElimProd);
		PanelAnadirProd.setLayout(null);
		PanelAnadirProd.setBounds(0, 0, 386, 547);
		contentPane.add(PanelAnadirProd);

		lblAdministradores2_1 = new JLabel("SOLO \r\nADMINISTRADORES");
		lblAdministradores2_1.setForeground(Color.BLACK);
		lblAdministradores2_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblAdministradores2_1.setBounds(58, 29, 266, 69);
		PanelAnadirProd.add(lblAdministradores2_1);

		lblTablonAdmin_1 = new JLabel(new ImageIcon("imagenes/TablonAdmin.png"));
		lblTablonAdmin_1.setBounds(0, 29, 386, 69);
		PanelAnadirProd.add(lblTablonAdmin_1);



		// panel ------------------------- ?¿?¿?¿¿?¿?
		lblAnadirProd = new JLabel("AÑADIR PRODUCTO");
		lblAnadirProd.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblAnadirProd.setBounds(85, 113, 208, 42);
		PanelAnadirProd.add(lblAnadirProd);

		lblNombreProd = new JLabel("NOMBRE:");
		lblNombreProd.setFont(new Font("Tempus Sans ITC", Font.BOLD, 13));
		lblNombreProd.setBounds(58, 177, 70, 27);
		PanelAnadirProd.add(lblNombreProd);

		textNombreProd =  new JTextField();
		textNombreProd.setBounds(222, 180, 96, 19);
		PanelAnadirProd.add(textNombreProd);
		textNombreProd.setColumns(10);

		lblColor = new JLabel("COLOR:");
		lblColor.setFont(new Font("Tempus Sans ITC", Font.BOLD, 13));
		lblColor.setBounds(58, 215, 70, 27);
		PanelAnadirProd.add(lblColor);

		textColor = new JTextField();
		textColor.setBounds(222, 218, 96, 19);
		PanelAnadirProd.add(textColor);
		textColor.setColumns(10);

		lblPanB = new JLabel("PAN:");
		lblPanB.setFont(new Font("Tempus Sans ITC", Font.BOLD, 13));
		lblPanB.setBounds(58, 296, 70, 27);
		PanelAnadirProd.add(lblPanB);

		textPanB = new JTextField();
		textPanB.setBounds(222, 299, 96, 19);
		PanelAnadirProd.add(textPanB);
		textPanB.setColumns(10);

		lblCarneB = new JLabel("CARNE:");
		lblCarneB.setFont(new Font("Tempus Sans ITC", Font.BOLD, 13));
		lblCarneB.setBounds(58, 334, 70, 27);
		PanelAnadirProd.add(lblCarneB);

		textCarneB = new JTextField();
		textCarneB.setBounds(222, 337, 96, 19);
		PanelAnadirProd.add(textCarneB);
		textCarneB.setColumns(10);

		btnAnadir = new JButton("ANADIR");

		btnAnadir.setBounds(243, 471, 113, 42);
		PanelAnadirProd.add(btnAnadir);

		btnCancelar = new JButton("CANCELAR");
		btnCancelar.setBounds(45, 471, 113, 42);
		PanelAnadirProd.add(btnCancelar);

		lblPrecioB = new JLabel("PRECIO:");
		lblPrecioB.setFont(new Font("Tempus Sans ITC", Font.BOLD, 13));
		lblPrecioB.setBounds(58, 258, 70, 27);
		PanelAnadirProd.add(lblPrecioB);

		textPrecioB = new JTextField();
		textPrecioB.setBounds(222, 261, 96, 19);
		PanelAnadirProd.add(textPrecioB);
		textPrecioB.setColumns(10);

		lblExtraB = new JLabel("EXTRA:");
		lblExtraB.setFont(new Font("Tempus Sans ITC", Font.BOLD, 13));
		lblExtraB.setBounds(58, 410, 70, 27);
		PanelAnadirProd.add(lblExtraB);

		textExtraB = new JTextField();
		textExtraB.setColumns(10);
		textExtraB.setBounds(222, 413, 96, 19);
		PanelAnadirProd.add(textExtraB);

		textQuesoB = new JTextField();
		textQuesoB.setColumns(10);
		textQuesoB.setBounds(222, 375, 96, 19);
		PanelAnadirProd.add(textQuesoB);

		lblQuesoB = new JLabel("QUESO:");
		lblQuesoB.setFont(new Font("Tempus Sans ITC", Font.BOLD, 13));
		lblQuesoB.setBounds(58, 372, 70, 27);
		PanelAnadirProd.add(lblQuesoB);

		lblFotoFondoAnadirProd = new JLabel(new ImageIcon("imagenes/fondoIS.png"));
		lblFotoFondoAnadirProd.setBounds(0, 0, 386, 547);
		PanelAnadirProd.add(lblFotoFondoAnadirProd);
		PanelLocal.setBounds(0, 0, 386, 547);
		contentPane.add(PanelLocal);
		PanelLocal.setLayout(null);

		lblBurgerVerde = new JLabel(new ImageIcon("imagenes/BurgerV.png"));
		lblBurgerVerde.setBounds(246, 110, 93, 74);
		PanelLocal.add(lblBurgerVerde);

		lblBurgerRoja = new JLabel(new ImageIcon("imagenes/BurgerR.png"));
		lblBurgerRoja.setBounds(43, 110, 81, 74);
		PanelLocal.add(lblBurgerRoja);

		CbVerde = new JComboBox();
		CbVerde.setBounds(246, 194, 93, 21);
		PanelLocal.add(CbVerde);

		CbRoja = new JComboBox();
		CbRoja.setBounds(43, 194, 93, 21);
		PanelLocal.add(CbRoja);

		PanelLocal.add(CbVerde);

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

		lblEligeTP = new JLabel("ELIGE TUS \r\nPRODUCTOS");
		lblEligeTP.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblEligeTP.setBounds(50, 48, 295, 53);
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

		lblTablon = new JLabel(new ImageIcon("imagenes/TablonFondo.png"));
		lblTablon.setBounds(31, 314, 314, 191);
		PanelLocal.add(lblTablon);

		btnAvanzar = new JButton("--->");

		btnAvanzar.setBounds(254, 266, 85, 21);
		PanelLocal.add(btnAvanzar);

		btnRetroceder = new JButton("<---");
		btnRetroceder.setBounds(51, 266, 85, 21);
		PanelLocal.add(btnRetroceder);

		lblFotoFondoLocal = new JLabel(new ImageIcon("imagenes/fondoIS.png"));
		lblFotoFondoLocal.setBounds(0, 0, 386, 547);
		PanelLocal.add(lblFotoFondoLocal);
		PanelLocal2.setBounds(0, 0, 386, 547);
		contentPane.add(PanelLocal2);
		PanelLocal2.setLayout(null);

		lblCompletaMenu = new JLabel("COMPLETA TU MENU");
		lblCompletaMenu.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblCompletaMenu.setBounds(61, 59, 256, 48);
		PanelLocal2.add(lblCompletaMenu);

		lblComp = new JLabel(new ImageIcon("imagenes/Complementos.png"));
		lblComp.setBounds(139, 240, 100, 82);
		PanelLocal2.add(lblComp);

		lblBebida = new JLabel(new ImageIcon("imagenes/Bebida.png"));
		lblBebida.setBounds(252, 118, 100, 82);
		PanelLocal2.add(lblBebida);

		lblPatata = new JLabel(new ImageIcon("imagenes/Patatas.png"));
		lblPatata.setBounds(32, 118, 100, 82);
		PanelLocal2.add(lblPatata);

		CbPatatas = new JComboBox();
		CbPatatas.setBounds(32, 210, 100, 21);
		PanelLocal2.add(CbPatatas);

		CbBebida = new JComboBox();
		CbBebida.setBounds(252, 210, 100, 21);
		PanelLocal2.add(CbBebida);

		CbComp = new JComboBox();
		CbComp.setBounds(139, 329, 100, 21);
		PanelLocal2.add(CbComp);

		btnSig = new JButton("--->");
		btnSig.setBounds(267, 432, 85, 21);
		PanelLocal2.add(btnSig);

		btnRetroceso = new JButton("<---");
		btnRetroceso.setBounds(32, 432, 85, 21);
		PanelLocal2.add(btnRetroceso);

		lblFotoFondoPedido2 = new JLabel(new ImageIcon("imagenes/fondoIS.png"));
		lblFotoFondoPedido2.setBounds(0, 0, 386, 547);
		PanelLocal2.add(lblFotoFondoPedido2);
		
				PanelCodDomicilio = new JPanel();
				PanelCodDomicilio.setVisible(false);
				PanelCodDomicilio.setBounds(0, 0, 386, 547);
				contentPane.add(PanelCodDomicilio);
				PanelCodDomicilio.setLayout(null);
				
						btnMenuPrincipalDomicilio = new JButton("VOLVER AL MENU");
						btnMenuPrincipalDomicilio.setBounds(78, 458, 241, 46);
						PanelCodDomicilio.add(btnMenuPrincipalDomicilio);
						
								lblPedidoCompletado_1 = new JLabel("PEDIDO COMPLETADO");
								lblPedidoCompletado_1.setFont(new Font("Viner Hand ITC", Font.BOLD, 25));
								lblPedidoCompletado_1.setBounds(55, 65, 286, 40);
								PanelCodDomicilio.add(lblPedidoCompletado_1);
								
										lblTextoCodigo_1 = new JLabel("CODIGO:");
										lblTextoCodigo_1.setFont(new Font("Viner Hand ITC", Font.BOLD, 20));
										lblTextoCodigo_1.setBounds(78, 192, 91, 88);
										PanelCodDomicilio.add(lblTextoCodigo_1);
										
												lblCodigo_1 = new JLabel("");
												lblCodigo_1.setFont(new Font("Viner Hand ITC", Font.BOLD, 20));
												lblCodigo_1.setBounds(179, 192, 91, 88);
												PanelCodDomicilio.add(lblCodigo_1);
												
														lblDireccionPedido = new JLabel("");
														lblDireccionPedido.setFont(new Font("Viner Hand ITC", Font.BOLD, 20));
														lblDireccionPedido.setBounds(69, 329, 250, 32);
														PanelCodDomicilio.add(lblDireccionPedido);
														
																lblMuchasGracias_1 = new JLabel("MUCHAS GRACIAS");
																lblMuchasGracias_1.setFont(new Font("Viner Hand ITC", Font.BOLD, 30));
																lblMuchasGracias_1.setBounds(44, 380, 301, 46);
																PanelCodDomicilio.add(lblMuchasGracias_1);
																
																		lblFotoFondoCod_1 = new JLabel(new ImageIcon("imagenes/fondoIS.png"));
																		lblFotoFondoCod_1.setBounds(0, 0, 386, 547);
																		PanelCodDomicilio.add(lblFotoFondoCod_1);
		
				PanelCodPedido = new JPanel();
				PanelCodPedido.setVisible(false);
				PanelCodPedido.setBounds(0, 0, 386, 547);
				contentPane.add(PanelCodPedido);
				PanelCodPedido.setLayout(null);
				
						btnMenuPrincipalLocal = new JButton("VOLVER AL MENU");
						btnMenuPrincipalLocal.setBounds(95, 452, 200, 40);
						PanelCodPedido.add(btnMenuPrincipalLocal);
						
								lblPedidoCompletado = new JLabel("PEDIDO COMPLETADO");
								lblPedidoCompletado.setFont(new Font("Viner Hand ITC", Font.BOLD, 25));
								lblPedidoCompletado.setBounds(47, 81, 286, 40);
								PanelCodPedido.add(lblPedidoCompletado);
								
										lblTextoCodigo = new JLabel("CODIGO:");
										lblTextoCodigo.setFont(new Font("Viner Hand ITC", Font.BOLD, 20));
										lblTextoCodigo.setBounds(58, 200, 91, 88);
										PanelCodPedido.add(lblTextoCodigo);
										
												lblCodigo = new JLabel("");
												lblCodigo.setFont(new Font("Viner Hand ITC", Font.BOLD, 20));
												lblCodigo.setBounds(204, 200, 91, 88);
												PanelCodPedido.add(lblCodigo);
												
														lblNewLabel = new JLabel("RECOGER EN MOSTRADOR");
														lblNewLabel.setFont(new Font("Viner Hand ITC", Font.BOLD, 20));
														lblNewLabel.setBounds(58, 361, 275, 46);
														PanelCodPedido.add(lblNewLabel);
														
																lblMuchasGracias = new JLabel("MUCHAS GRACIAS");
																lblMuchasGracias.setFont(new Font("Viner Hand ITC", Font.BOLD, 20));
																lblMuchasGracias.setBounds(95, 418, 200, 23);
																PanelCodPedido.add(lblMuchasGracias);
																
																		lblFotoFondoCod = new JLabel(new ImageIcon("imagenes/fondoIS.png"));
																		lblFotoFondoCod.setBounds(0, 0, 386, 547);
																		PanelCodPedido.add(lblFotoFondoCod);
		PanelDomicilio.setBounds(0, 0, 386, 547);
		contentPane.add(PanelDomicilio);
		PanelDomicilio.setLayout(null);

		lblBurgerVerde_1 = new JLabel(new ImageIcon("imagenes/BurgerV.png"));
		lblBurgerVerde_1.setBounds(246, 130, 93, 74);
		PanelDomicilio.add(lblBurgerVerde_1);

		lblBurgerRoja_1 = new JLabel(new ImageIcon("imagenes/BurgerR.png"));
		lblBurgerRoja_1.setBounds(43, 130, 81, 74);
		PanelDomicilio.add(lblBurgerRoja_1);

		CbVerde_1 = new JComboBox();
		CbVerde_1.setBounds(256, 219, 93, 21);
		PanelDomicilio.add(CbVerde_1);

		CbRoja_1 = new JComboBox();
		CbRoja_1.setBounds(43, 219, 93, 21);
		PanelDomicilio.add(CbRoja_1);

		lblPan_1 = new JLabel("PAN:");
		lblPan_1.setBounds(55, 346, 45, 13);
		PanelDomicilio.add(lblPan_1);

		lblCarne_1 = new JLabel("CARNE:");
		lblCarne_1.setBounds(55, 379, 45, 13);
		PanelDomicilio.add(lblCarne_1);

		lblQueso_1 = new JLabel("QUESO:");
		lblQueso_1.setBounds(55, 417, 45, 13);
		PanelDomicilio.add(lblQueso_1);

		lblExtras_1 = new JLabel("EXTRAS:");
		lblExtras_1.setBounds(55, 453, 45, 13);
		PanelDomicilio.add(lblExtras_1);

		lblEligeTP_1 = new JLabel("ELIGE TUS \r\nPRODUCTOS");
		lblEligeTP_1.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblEligeTP_1.setBounds(50, 41, 295, 63);
		PanelDomicilio.add(lblEligeTP_1);

		lblPanR_1 = new JLabel("");
		lblPanR_1.setBounds(123, 346, 172, 13);
		PanelDomicilio.add(lblPanR_1);

		lblCarneR_1 = new JLabel("");
		lblCarneR_1.setBounds(122, 379, 173, 13);
		PanelDomicilio.add(lblCarneR_1);

		lblQuesoR_1 = new JLabel("");
		lblQuesoR_1.setBounds(122, 417, 173, 13);
		PanelDomicilio.add(lblQuesoR_1);

		lblExtraR_1 = new JLabel("");
		lblExtraR_1.setBounds(123, 453, 172, 13);
		PanelDomicilio.add(lblExtraR_1);

		lblTablon_1 = new JLabel(new ImageIcon("imagenes/TablonFondo.png"));
		lblTablon_1.setBounds(31, 318, 314, 191);
		PanelDomicilio.add(lblTablon_1);

		btnAvanzar_1 = new JButton("--->");
		btnAvanzar_1.setBounds(254, 270, 85, 21);
		PanelDomicilio.add(btnAvanzar_1);

		btnRetroceder_1 = new JButton("<---");
		btnRetroceder_1.setBounds(51, 270, 85, 21);
		PanelDomicilio.add(btnRetroceder_1);

		lblFotoFondoDomicilio = new JLabel(new ImageIcon("imagenes/fondoIS.png"));
		lblFotoFondoDomicilio.setBounds(0, 0, 384, 545);
		PanelDomicilio.add(lblFotoFondoDomicilio);
		
				PanelDomicilio2 = new JPanel();
				PanelDomicilio2.setVisible(false);
				PanelDomicilio2.setBounds(0, 0, 386, 547);
				contentPane.add(PanelDomicilio2);
				PanelDomicilio2.setLayout(null);
				
				lblCompletaMenu_1 = new JLabel("COMPLETA TU MENU");
				lblCompletaMenu_1.setFont(new Font("Tahoma", Font.BOLD, 25));
				lblCompletaMenu_1.setBounds(65, 61, 256, 48);
				PanelDomicilio2.add(lblCompletaMenu_1);
				
						lblCruz = new JLabel(new ImageIcon("imagenes/CruzRoja.png"));
						lblCruz.setBounds(138, 254, 118, 122);
						PanelDomicilio2.add(lblCruz);
						
								lblComp_1 = new JLabel(new ImageIcon("imagenes/Complementos.png"));
								lblComp_1.setBounds(146, 266, 100, 82);
								PanelDomicilio2.add(lblComp_1);
								
										lblBebida_1 = new JLabel(new ImageIcon("imagenes/Bebida.png"));
										lblBebida_1.setBounds(252, 118, 100, 82);
										PanelDomicilio2.add(lblBebida_1);
										
												lblPatata_1 = new JLabel(new ImageIcon("imagenes/Patatas.png"));
												lblPatata_1.setBounds(32, 118, 100, 82);
												PanelDomicilio2.add(lblPatata_1);
												
														cbPatatas = new JComboBox();
														cbPatatas.setBounds(32, 210, 100, 21);
														PanelDomicilio2.add(cbPatatas);
														
																cbBebida = new JComboBox();
																cbBebida.setBounds(252, 210, 100, 21);
																PanelDomicilio2.add(cbBebida);
																
																		btnSig_1 = new JButton("--->");
																		btnSig_1.setBounds(267, 432, 85, 21);
																		PanelDomicilio2.add(btnSig_1);
																		
																				btnRetroceso_1 = new JButton("<---");
																				btnRetroceso_1.setBounds(32, 432, 85, 21);
																				PanelDomicilio2.add(btnRetroceso_1);
																				
																						lblSoloTienda = new JLabel("SOLO EN TIENDA");
																						lblSoloTienda.setFont(new Font("Tempus Sans ITC", Font.BOLD, 13));
																						lblSoloTienda.setBounds(148, 387, 108, 21);
																						PanelDomicilio2.add(lblSoloTienda);
																						
																								lblFotoFondoPedido2_1 = new JLabel(new ImageIcon("imagenes/fondoIS.png"));
																								lblFotoFondoPedido2_1.setBounds(0, 0, 386, 547);
																								PanelDomicilio2.add(lblFotoFondoPedido2_1);
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
		btnAdmin.setIcon(new ImageIcon("imagenes/llaveadmin.png"));
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
		
				PanelResumenDomicilio = new JPanel();
				PanelResumenDomicilio.setVisible(false);
				PanelResumenDomicilio.setBounds(0, 0, 386, 547);
				contentPane.add(PanelResumenDomicilio);
				PanelResumenDomicilio.setLayout(null);
				
						textDireccion = new JTextField();
						textDireccion.setBounds(215, 464, 86, 20);
						PanelResumenDomicilio.add(textDireccion);
						textDireccion.setColumns(10);
						
								lblDireccion = new JLabel("DIRECCION:");
								lblDireccion.setFont(new Font("Tempus Sans ITC", Font.BOLD, 13));
								lblDireccion.setBounds(72, 467, 104, 14);
								PanelResumenDomicilio.add(lblDireccion);
								
										lblCostePedido_1 = new JLabel("\r\n");
										lblCostePedido_1.setFont(new Font("Tempus Sans ITC", Font.BOLD, 13));
										lblCostePedido_1.setBounds(186, 375, 45, 13);
										PanelResumenDomicilio.add(lblCostePedido_1);
										
												lblResumenPedido_1 = new JLabel("RESUMEN DEL PEDIDO");
												lblResumenPedido_1.setFont(new Font("Times New Roman", Font.BOLD, 25));
												lblResumenPedido_1.setBounds(48, 50, 294, 43);
												PanelResumenDomicilio.add(lblResumenPedido_1);
												
														btnNewButton_1 = new JButton("--->");
														btnNewButton_1.setBounds(310, 229, 66, 61);
														PanelResumenDomicilio.add(btnNewButton_1);
														
																lblBurgerElegido_1 = new JLabel("");
																lblBurgerElegido_1.setFont(new Font("Tempus Sans ITC", Font.BOLD, 13));
																lblBurgerElegido_1.setBounds(117, 190, 144, 20);
																PanelResumenDomicilio.add(lblBurgerElegido_1);
																
																		lblBebidaElegida_1 = new JLabel("");
																		lblBebidaElegida_1.setFont(new Font("Tempus Sans ITC", Font.BOLD, 13));
																		lblBebidaElegida_1.setBounds(117, 219, 144, 20);
																		PanelResumenDomicilio.add(lblBebidaElegida_1);
																		
																				lblPatataElegida_1 = new JLabel("");
																				lblPatataElegida_1.setFont(new Font("Tempus Sans ITC", Font.BOLD, 13));
																				lblPatataElegida_1.setBounds(117, 249, 144, 20);
																				PanelResumenDomicilio.add(lblPatataElegida_1);
																				
																						lblComplementoElegido_1 = new JLabel("");
																						lblComplementoElegido_1.setFont(new Font("Tempus Sans ITC", Font.BOLD, 13));
																						lblComplementoElegido_1.setBounds(117, 279, 144, 20);
																						PanelResumenDomicilio.add(lblComplementoElegido_1);
																						
																								lblPrecioResumen_1 = new JLabel("PRECIO:");
																								lblPrecioResumen_1.setFont(new Font("Tempus Sans ITC", Font.BOLD, 13));
																								lblPrecioResumen_1.setBounds(117, 371, 66, 20);
																								PanelResumenDomicilio.add(lblPrecioResumen_1);
																								
																										btnVolver3_1 = new JButton("<---");
																										btnVolver3_1.setBounds(22, 495, 85, 21);
																										PanelResumenDomicilio.add(btnVolver3_1);
																										
																												lblPergaminoPedido_1 = new JLabel(new ImageIcon("imagenes/Pergamino.png"));
																												lblPergaminoPedido_1.setBounds(62, 130, 238, 331);
																												PanelResumenDomicilio.add(lblPergaminoPedido_1);
																												
																														lblFotoFondoResumen_1 = new JLabel(new ImageIcon("imagenes/fondoIS.png"));
																														lblFotoFondoResumen_1.setBounds(0, 0, 386, 547);
																														PanelResumenDomicilio.add(lblFotoFondoResumen_1);
																														
																																PanelResumen = new JPanel();
																																PanelResumen.setVisible(false);
																																PanelResumen.setBounds(0, 0, 386, 547);
																																contentPane.add(PanelResumen);
																																PanelResumen.setLayout(null);
																																
																																		lblCostePedido = new JLabel("\r\n");
																																		lblCostePedido.setFont(new Font("Tempus Sans ITC", Font.BOLD, 13));
																																		lblCostePedido.setBounds(176, 375, 45, 13);
																																		PanelResumen.add(lblCostePedido);
																																		
																																				lblResumenPedido = new JLabel("RESUMEN DEL PEDIDO");
																																				lblResumenPedido.setFont(new Font("Times New Roman", Font.BOLD, 25));
																																				lblResumenPedido.setBounds(56, 68, 288, 26);
																																				PanelResumen.add(lblResumenPedido);
																																				
																																						btnNewButton = new JButton("--->");
																																						btnNewButton.setBounds(310, 229, 66, 61);
																																						PanelResumen.add(btnNewButton);
																																						
																																								lblBurgerElegido = new JLabel("");
																																								lblBurgerElegido.setFont(new Font("Tempus Sans ITC", Font.BOLD, 13));
																																								lblBurgerElegido.setBounds(117, 190, 144, 20);
																																								PanelResumen.add(lblBurgerElegido);
																																								
																																										lblBebidaElegida = new JLabel("");
																																										lblBebidaElegida.setFont(new Font("Tempus Sans ITC", Font.BOLD, 13));
																																										lblBebidaElegida.setBounds(117, 219, 144, 20);
																																										PanelResumen.add(lblBebidaElegida);
																																										
																																												lblPatataElegida = new JLabel("");
																																												lblPatataElegida.setFont(new Font("Tempus Sans ITC", Font.BOLD, 13));
																																												lblPatataElegida.setBounds(117, 249, 144, 20);
																																												PanelResumen.add(lblPatataElegida);
																																												
																																														lblComplementoElegido = new JLabel("");
																																														lblComplementoElegido.setFont(new Font("Tempus Sans ITC", Font.BOLD, 13));
																																														lblComplementoElegido.setBounds(117, 279, 144, 20);
																																														PanelResumen.add(lblComplementoElegido);
																																														
																																																lblPrecioResumen = new JLabel("PRECIO:");
																																																lblPrecioResumen.setFont(new Font("Tempus Sans ITC", Font.BOLD, 13));
																																																lblPrecioResumen.setBounds(117, 371, 49, 20);
																																																PanelResumen.add(lblPrecioResumen);
																																																
																																																		btnVolver3 = new JButton("<---");
																																																		btnVolver3.setBounds(22, 495, 85, 21);
																																																		PanelResumen.add(btnVolver3);
																																																		
																																																				lblPergaminoPedido = new JLabel(new ImageIcon("imagenes/Pergamino.png"));
																																																				lblPergaminoPedido.setBounds(62, 130, 238, 331);
																																																				PanelResumen.add(lblPergaminoPedido);
																																																				
																																																						lblFotoFondoResumen = new JLabel(new ImageIcon("imagenes/fondoIS.png"));
																																																						lblFotoFondoResumen.setBounds(0, 0, 386, 547);
																																																						PanelResumen.add(lblFotoFondoResumen);
	}
}
