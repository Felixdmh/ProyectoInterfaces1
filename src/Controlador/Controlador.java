package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;

import Modelo.Bebida;
import Modelo.Comida;
import Modelo.Complemento;
import Modelo.Patata;
import Modelo.Pedido;
import Modelo.Usuarios;
import Vista.Vista;
import java.util.ArrayList;
import java.util.HashMap;

public class Controlador {

    private Vista vista;
    private ArrayList<Usuarios> listaUsuarios;
    static String nombre;
    static HashMap<Integer, Comida> listaComidas = new HashMap<>();
    
    private int idBurger;
    private int idBebida;
    private int idPatata;
    private int idComplemento;
    private double costeTotal;
    private double costeBurger;
    private double costeBebida;
    private double costePatata;
    private double costeComplemento;
    private String nombreBurger;
    private String nombreBebida;
    private String nombrePatata;
    private String nombreComplemento;
    private String direccion;
    public static String codigo; //DEBE DE SER ESTATICO PARA PODER UTILIZARSE EN EL METODO CREAR CODIGO
    
    Comida c1 = new Comida(1, "Burger Changerburger", 1, 8.99, "Normal", "Pollo", "Mozzarella", "Extra salsa");
	Comida c2 = new Comida(2, "Hamburguesa", 2, 5.49, "Integral", "Res", "Cheddar", "Tocino");
	Comida c3 = new Comida(3, "Amumu Burger",	1, 12.99, "Centeno", "Atún", "Requeson", "Aguacate");
	Comida c4 = new Comida(4, "Rainbowlger", 2, 6.99, "Multicolor", "Gato", "Azul", "Nueces");
	Comida c5 = new Comida(5, "TacoBurger", 1, 4.99, "Maíz", "Cerdo", "Queso fresco", "Cilantro");
	Comida c6 = new Comida(6, "DaniRepBurger", 2, 7.99, "Trigo", "Pollo", "Parmesano", "Champiñones");
	Comida c7 = new Comida(7, "ChilliBurger", 1, 6.49, "Tortilla", "Pavo", "Suizo", "Lechuga");
	Comida c8 = new Comida(8, "BurgerMini", 2, 5.99, "Pan de leche", "Ninguna", "Ninguno", "Crutones");
	Comida c9 = new Comida(9, "Inferno", 1, 9.49, "Naan", "Cordero", "Ninguno", "Yogur");
	Comida c10 = new Comida(10, "Ocean", 1, 11.99, "Integral", "Mariscos", "Ninguno", "Limón");
	
    

    public Controlador(Vista vista) {
        this.vista = vista;
        listaUsuarios = new ArrayList<>();
        JComboBox<Comida> comboBox = new JComboBox<>();
        JComboBox<Bebida> comboBoxBebida = new JComboBox<>();
        JComboBox<Patata> comboBoxPatata = new JComboBox<>();

        // Usuarios de prueba
        listaUsuarios.add(new Usuarios("david", "david", 0));
        listaUsuarios.add(new Usuarios("felix", "felix", 1));
        
        
        
       
        
        
		listaComidas.put(c1.getIdComida(), c1);
		listaComidas.put(c2.getIdComida(), c2);
		listaComidas.put(c3.getIdComida(), c3);
		listaComidas.put(c4.getIdComida(), c4);
		listaComidas.put(c5.getIdComida(), c5);
		listaComidas.put(c6.getIdComida(), c6);
		listaComidas.put(c7.getIdComida(), c7);
		listaComidas.put(c8.getIdComida(), c8);
		listaComidas.put(c9.getIdComida(), c9);
		listaComidas.put(c10.getIdComida(), c10);
		
		
		Bebida b1 = new Bebida(1, "CocaCola", 1.5);
		Bebida b2 = new Bebida(2, "Agua", 1.0);
		Bebida b3 = new Bebida(3, "Monster", 2.0);
		Bebida b4 = new Bebida(4, "Cerveza", 2.5);
		Bebida b5 = new Bebida(5, "Fanta", 1.8);
		
		Patata p1 = new Patata(1, "Patatas Fritas", 2.5);
		Patata p2 = new Patata(2, "Patatas Gajo", 3.0);
		Patata p3 = new Patata(3, "Patatas Deluxe", 4.0);
		
		Complemento complemento1 = new Complemento(1, "Nachos", 5.6);
		Complemento complemento2 = new Complemento(2, "Tequenos", 4.5);
		Complemento complemento3 = new Complemento(3, "Alitas", 3.75);
		
		
		
		vista.CbRoja.addItem(c1);
		vista.CbVerde.addItem(c2);
		vista.CbRoja.addItem(c3);
		vista.CbVerde.addItem(c4);
		vista.CbRoja.addItem(c5);
		vista.CbVerde.addItem(c6);
		vista.CbRoja.addItem(c7);
		vista.CbVerde.addItem(c8);
		vista.CbRoja.addItem(c9);
		vista.CbRoja.addItem(c10);
		
		vista.CbBebida.addItem(b1);
		vista.CbBebida.addItem(b2);
		vista.CbBebida.addItem(b3);
		vista.CbBebida.addItem(b4);
		vista.CbBebida.addItem(b5);
		
		vista.CbPatatas.addItem(p1);
		vista.CbPatatas.addItem(p2);
		vista.CbPatatas.addItem(p3);
		
		vista.CbComp.addItem(complemento1);
		vista.CbComp.addItem(complemento2);
		vista.CbComp.addItem(complemento3);
		
		vista.cbBebida.addItem(b1);
		vista.cbBebida.addItem(b2);
		vista.cbBebida.addItem(b3);
		vista.cbBebida.addItem(b4);
		vista.cbBebida.addItem(b5);
		
		vista.cbPatatas.addItem(p1);
		vista.cbPatatas.addItem(p2);
		vista.cbPatatas.addItem(p3);
		
		
        

        inicializarListeners();
    }

    public ArrayList<Usuarios> getListaUsuarios() {
        return listaUsuarios;
    }

    private void inicializarListeners() {
    	
    	vista.btnReg.addActionListener(e -> {
    	    vista.PanelRegistro.setVisible(true);
    	    vista.PanelInicioSesion.setVisible(false);
    	    vista.PanelMenuPrincipal.setVisible(false);
    	});
    	
    	vista.btnValidar.addActionListener(new ActionListener() {
    	    @Override
    	    public void actionPerformed(ActionEvent e) {

    	        nombre = vista.textNombre.getText().trim();
    	        String correo = vista.textCorreo.getText().trim();
    	        String contrasena = vista.textContrasena.getText().trim();
    	        String repetirContrasena = vista.textRepetirContrasena.getText().trim();

    	 
    	        if (nombre.isEmpty() || correo.isEmpty() || contrasena.isEmpty() || repetirContrasena.isEmpty()) {
    	            JOptionPane.showMessageDialog(vista, "Por favor, complete todos los campos.");
    	            return;
    	        }

    	        if (!contrasena.equals(repetirContrasena)) {
    	            JOptionPane.showMessageDialog(vista, "Las contraseñas no coinciden.");
    	            return;
    	        }

    
    	        for (Usuarios u : listaUsuarios) {
    	            if (u.getNombre().equalsIgnoreCase(nombre)) {
    	                JOptionPane.showMessageDialog(vista, "El nombre de usuario ya existe.");
    	                return;
    	            }
    	        }

    	     
    	        listaUsuarios.add(new Usuarios(nombre, contrasena, listaUsuarios.size() + 1));
    	        JOptionPane.showMessageDialog(vista, "Registro exitoso. Ahora puede iniciar sesión.");

 
    	        vista.textNombre.setText("");
    	        vista.textCorreo.setText("");
    	        vista.textContrasena.setText("");
    	        vista.textRepetirContrasena.setText("");

    
    	        vista.PanelRegistro.setVisible(false);
    	        vista.PanelInicioSesion.setVisible(true);
    	    }
    	});
    	
    		//BOTON ADMIN
    		vista.btnAdmin.addActionListener(new ActionListener() {
    			public void actionPerformed(ActionEvent e) {
    				nombre = vista.txtUsuario.getText().trim();
	                String contraseña = new String(vista.passwordField.getPassword()).trim();
	
	                if (nombre.isEmpty()) {
	                    JOptionPane.showMessageDialog(vista, "Ingrese el nombre de usuario");
	                    return;
	                }
	
	                if (contraseña.isEmpty()) {
	                    JOptionPane.showMessageDialog(vista, "Ingrese la contraseña");
	                    return;
	                }
	
	                boolean encontrado = false;
	                for (Usuarios u : listaUsuarios) {
	                    if (u.getNombre().equalsIgnoreCase(nombre) && u.getContraseña().equals(contraseña)) {
	                        encontrado = true;
	                        break;
	                    }
	                }
	                if(encontrado) {
	                	
	            	    String codigo = JOptionPane.showInputDialog(
	            	            vista,
	            	            "Ingrese el código de administrador:",
	            	            "Verificación",
	            	            JOptionPane.QUESTION_MESSAGE
	            	    );
	
	            	 
	            	    if (codigo == null) {
	            	        return;
	            	    }
	
	            	
	            	    if (codigo.equals("123")) {
	
	            	       
	            	        JOptionPane.showMessageDialog(vista, "Acceso concedido.");
	
	            	        vista.PanelInicioSesion.setVisible(false);
	            	        vista.PanelAdmin.setVisible(true);
	
	            	    } else {
	            	      
	            	        JOptionPane.showMessageDialog(vista, "Código incorrecto. Acceso denegado.");
	            	    }
	            	}
	                
	                	
	                }

        		 
        });
    		//BOTON AÑADIR PROD
    		 vista.btnAnadirProd.addActionListener(new ActionListener() {
    	        	public void actionPerformed(ActionEvent e) {
    	        		
    	        		vista.PanelAdmin.setVisible(false);
    	        		vista.PanelAnadirProd.setVisible(true);
    	        		
    	        		
    	        	}
    	        });
    		 vista.btnModificarProd.addActionListener(new ActionListener() {
    	        	public void actionPerformed(ActionEvent e) {
    	        		
    	        		
    	        	}
    	        });
    		 
    		 vista.btnEliminarProd.addActionListener(new ActionListener() {
    	        	public void actionPerformed(ActionEvent e) {
    	        		
    	        		
    	        	}
    	        });
    		

        //BOTON INICIAR SESION
        vista.btnInSes.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                nombre = vista.txtUsuario.getText().trim();
                String contraseña = new String(vista.passwordField.getPassword()).trim();

                if (nombre.isEmpty()) {
                    JOptionPane.showMessageDialog(vista, "Ingrese el nombre de usuario");
                    return;
                }

                if (contraseña.isEmpty()) {
                    JOptionPane.showMessageDialog(vista, "Ingrese la contraseña");
                    return;
                }

                boolean encontrado = false;
                for (Usuarios u : listaUsuarios) {
                    if (u.getNombre().equalsIgnoreCase(nombre) && u.getContraseña().equals(contraseña)) {
                        encontrado = true;
                        break;
                    }
                }

                if (encontrado) {
                    JOptionPane.showMessageDialog(vista, "Usuario autentificado correctamente");

                    vista.txtUsuario.setText("");
                    vista.passwordField.setText("");

            
                    vista.PanelInicioSesion.setVisible(false);
                    vista.PanelMenuPrincipal.setVisible(true);
                    vista.Contacto.setVisible(false);

                } else {
                    JOptionPane.showMessageDialog(vista, "Usuario inexistente o contraseña incorrecta");
                }
            }
        });

        
        
        
        //FOTO DE ABAJO DEL PRFIL
        vista.foticoperfil.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) {
        		vista.MiPerfil.setVisible(true);
        		vista.PanelMenuPrincipal.setVisible(false);
        		
        		vista.lblNombredeBienvenida.setText(nombre);
        	}
        });
        
        //VOLVER AL MENU PRINCIPAL DESDE EL PERFIL
        vista.btnVolverMiPerfil.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				vista.MiPerfil.setVisible(false);
				vista.PanelMenuPrincipal.setVisible(true);
			}
		});
        
        //BOTON PARA IR A CONTACTO
        vista.btnContacto.addActionListener(new ActionListener() {
        				public void actionPerformed(ActionEvent e) {
        					vista.MiPerfil.setVisible(false);
							vista.Contacto.setVisible(true);
        				}
        });
        
        
        //VOLVER AL PERFIL DESDE CONTACTO
        vista.btnVolverContacto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				vista.Contacto.setVisible(false);
				vista.MiPerfil.setVisible(true);
			}
		});
        
        
        
        
        
        
        
        
        //BOTON PARA VOLVER AL INICIO SESIÓN DESDE MENU PRINCIPAL
        vista.foticocasa.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {

                int opcion = JOptionPane.showConfirmDialog(vista,"¿Quieres cerrar sesión?","",JOptionPane.YES_NO_OPTION);

                if(opcion == JOptionPane.YES_OPTION) { 
                    vista.PanelMenuPrincipal.setVisible(false);
                    vista.PanelInicioSesion.setVisible(true);
                }
            }
        });

        
        // BOTON PARA IR A COMPRAR DESDE MENU PRINCIPAL
        vista.foticocarro.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				vista.PanelMenuPrincipal.setVisible(false);
				vista.DomicilioOLocal.setVisible(true);
				vista.Contacto.setVisible(false);
			}
		});
        
        
        // BOTON PARA IR AL PERFIL DESDE COMPRAR
        vista.foticoperfilComprar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				vista.DomicilioOLocal.setVisible(false);
				vista.MiPerfil.setVisible(true);
				
			}
		});
        
        
        
        // BOTON PARA IR AL PERFIL DESDE COMPRAR
        vista.btnPideYa.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				vista.PanelMenuPrincipal.setVisible(false);
				vista.DomicilioOLocal.setVisible(true);
				
			}
		});
        
        
        
      //BOTON PARA VOLVER AL INICIO SESIÓN DESDE MENU PRINCIPAL
        vista.foticocasaComprar.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {

                int opcion = JOptionPane.showConfirmDialog(vista,"¿Quieres cerrar sesión?", "", JOptionPane.YES_NO_OPTION);

                if(opcion == JOptionPane.YES_OPTION) {
                	vista.Contacto.setVisible(false);
                    vista.PanelMenuPrincipal.setVisible(false);
                    vista.PanelInicioSesion.setVisible(true);
                    vista.DomicilioOLocal.setVisible(false);
                    
                }
            }
        });
        
        //BOTON PARA IR DESDE PEDIDOOLOCAL A LA SECCION PEDIR EN EL LOCAL
        vista.btnPedirEnLocal.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		
        		actualizarComidas();
        		vista.DomicilioOLocal.setVisible(false);
				vista.PanelLocal.setVisible(true);
				
				
        	}
        });
        
        //BOTON PARA IR DESDE PODIDOOLOCAL A LA SECCION A DOMICILIO
        vista.btnPedirDomicilio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				actualizarComidas();
				vista.DomicilioOLocal.setVisible(false);
				vista.PanelDomicilio.setVisible(true);
				
				
				
				
			}
		});
        
     // CUANDO EL USUARIO CAMBIA LA ROJA
        vista.CbRoja_1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                Comida comidaRoja = (Comida) vista.CbRoja_1.getSelectedItem();
                if (comidaRoja == null) return;

                vista.lblPanR_1.setText(comidaRoja.getPan());
                vista.lblCarneR_1.setText(comidaRoja.getCarne());
                vista.lblQuesoR_1.setText(comidaRoja.getQueso());
                vista.lblExtraR_1.setText(comidaRoja.getExtra());
                
                idBurger = comidaRoja.getIdComida();
                nombreBurger = comidaRoja.getNombre();
                costeBurger = comidaRoja.getPrecio();
                
                
            }
        });

        // CUANDO EL USUARIO CAMBIA LA VERDE
        vista.CbVerde_1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                Comida comidaVerde = (Comida) vista.CbVerde_1.getSelectedItem();
                if (comidaVerde == null) return;

                vista.lblPanR_1.setText(comidaVerde.getPan());
                vista.lblCarneR_1.setText(comidaVerde.getCarne());
                vista.lblQuesoR_1.setText(comidaVerde.getQueso());
                vista.lblExtraR_1.setText(comidaVerde.getExtra());
                
                idBurger = comidaVerde.getIdComida();
                nombreBurger = comidaVerde.getNombre();
                costeBurger = comidaVerde.getPrecio();
            }
        });
        //BOTON AVANZAR DESDE DOMICILIO 1
        vista.btnAvanzar_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				vista.PanelDomicilio.setVisible(false);
				vista.PanelDomicilio2.setVisible(true);
			}
		});
        
        //VOLVER DESDE DOMICILIO 1
        vista.btnRetroceder_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				vista.PanelDomicilio.setVisible(false);
				vista.DomicilioOLocal.setVisible(true);
			}
		});
        
        //VOLVER DESDE DOMICILIO 2
        vista.btnRetroceso_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				vista.PanelDomicilio2.setVisible(false);
				vista.PanelDomicilio.setVisible(true);
			}
		});
        
        //BOTON AVANZAR AL RESUMEN DEL PEDIDO DESDE DOMICILIO
        vista.btnSig_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				vista.PanelDomicilio2.setVisible(false);
				vista.PanelResumen.setVisible(true);
				
			}
		});
        
     // CUANDO EL USUARIO CAMBIA LA ROJA
        vista.CbRoja.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                Comida comidaRoja = (Comida) vista.CbRoja.getSelectedItem();
                if (comidaRoja == null) return;

                vista.lblPanR.setText(comidaRoja.getPan());
                vista.lblCarneR.setText(comidaRoja.getCarne());
                vista.lblQuesoR.setText(comidaRoja.getQueso());
                vista.lblExtraR.setText(comidaRoja.getExtra());
                
                idBurger = comidaRoja.getIdComida();
                nombreBurger = comidaRoja.getNombre();
                costeBurger = comidaRoja.getPrecio();
                
                
            }
        });

        // CUANDO EL USUARIO CAMBIA LA VERDE
        vista.CbVerde.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                Comida comidaVerde = (Comida) vista.CbVerde.getSelectedItem();
                if (comidaVerde == null) return;

                vista.lblPanR.setText(comidaVerde.getPan());
                vista.lblCarneR.setText(comidaVerde.getCarne());
                vista.lblQuesoR.setText(comidaVerde.getQueso());
                vista.lblExtraR.setText(comidaVerde.getExtra());
                
                idBurger = comidaVerde.getIdComida();
                nombreBurger = comidaVerde.getNombre();
                costeBurger = comidaVerde.getPrecio();
            }
        });
        
        // CUANDO EL USUARIO ELIGE LA BEBIDA
        vista.CbBebida.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				Bebida bebida = (Bebida) vista.CbBebida.getSelectedItem();
				if (bebida == null) return;
				
				idBebida = bebida.getId();
				nombreBebida = bebida.getNombre();
				costeBebida = bebida.getPrecio();

				
			}
		});
        
     // CUANDO EL USUARIO ELIGE LA BEBIDA A DOMICILIO
        vista.cbBebida.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				Bebida bebida = (Bebida) vista.cbBebida.getSelectedItem();
				if (bebida == null) return;
				
				idBebida = bebida.getId();
				nombreBebida = bebida.getNombre();
				costeBebida = bebida.getPrecio();

				
			}
		});
        
        // CUANDO EL USUARIO ELIGE LAS PATATAS
        vista.CbPatatas.addActionListener(new ActionListener() {
        	@Override
        	public void actionPerformed(ActionEvent e) {

				Patata patata = (Patata) vista.CbPatatas.getSelectedItem();
				if (patata == null) return;
				
				idPatata = patata.getIdPatata();
				nombrePatata = patata.getNombre();
				costePatata = patata.getPrecio();
				

        	}
		});
        	
        // CUANDO EL USUARIO ELIGE EL COMPLEMENTO
        vista.CbComp.addActionListener(new ActionListener() {
        	@Override
			public void actionPerformed(ActionEvent e) {
        		Complemento complemento = (Complemento) vista.CbComp.getSelectedItem();
				if (complemento == null) return;
				
				idComplemento = complemento.getIdComplemento();
				nombreComplemento = complemento.getNombre();
				costeComplemento = complemento.getPrecio();
        	}
        });
			
     // CUANDO EL USUARIO ELIGE EL COMPLEMENTO A DOMICILIO
        vista.cbPatatas.addActionListener(new ActionListener() {
        	@Override
			public void actionPerformed(ActionEvent e) {
        		Patata patata = (Patata) vista.cbPatatas.getSelectedItem();
				if (patata == null) return;
				
				idPatata = patata.getIdPatata();
				nombrePatata = patata.getNombre();
				costePatata = patata.getPrecio();
        	}
        });
        
        //BOTON AVANZAR PEDIDO
        vista.btnAvanzar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				vista.DomicilioOLocal.setVisible(false);
				vista.PanelLocal.setVisible(false);
				vista.PanelLocal2.setVisible(true);
			}
		});

        //BOTON RETROCEDER PEDIDO
        vista.btnRetroceso.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				vista.PanelLocal2.setVisible(false);
				vista.PanelLocal.setVisible(true);
			}
		});
        
        //BOTON RETROCEDER DESDE EL PANEL DE ANADIR PRODUCTO
        vista.btnRetroceder.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				vista.PanelLocal.setVisible(false);
				vista.DomicilioOLocal.setVisible(true);
				
			}
		});
        
        //BOTON AVANZAR AL RESUMEN EN LOCAL DEL PEDIDO
        vista.btnSig.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				vista.PanelLocal2.setVisible(false);
				vista.PanelResumen.setVisible(true);
				
				vista.lblBurgerElegido.setText(nombreBurger);
				vista.lblBebidaElegida.setText(nombreBebida);
				vista.lblPatataElegida.setText(nombrePatata);
				vista.lblComplementoElegido.setText(nombreComplemento);
				
				costeTotal = costeBurger + costeBebida + costePatata + costeComplemento;
				vista.lblCostePedido.setText(String.format("%.2f €", costeTotal));
				
				
				
				
				
			}
		});
        
        //BOTON AVANZAR AL RESUMEN A DOMICILIO DEL PEDIDO
        vista.btnSig_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				vista.PanelDomicilio2.setVisible(false);
				vista.PanelResumenDomicilio.setVisible(true);
				
				vista.lblBurgerElegido_1.setText(nombreBurger);
				vista.lblBebidaElegida_1.setText(nombreBebida);
				vista.lblPatataElegida_1.setText(nombrePatata);
				
				
				costeTotal = costeBurger + costeBebida + costePatata;
				vista.lblCostePedido_1.setText(String.format("%.2f €", costeTotal));
				
				
				
				
				
			}
		});
        
        //BOTON CONFIRMAR PEDIDO A DOMICILIO
        vista.btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				direccion = vista.textDireccion.getText();
				
				if(direccion.isEmpty()) {
					JOptionPane.showMessageDialog(vista, "Por favor, ingrese una dirección de entrega.");
					return;
				}
				
				vista.PanelResumenDomicilio.setVisible(false);
				vista.PanelCodDomicilio.setVisible(true);
				
				crearCodigo();
				
				vista.lblDireccionPedido.setText(direccion);
				vista.lblCodigo_1.setText(codigo);
				vista.PanelResumen.setVisible(false);
				vista.PanelResumenDomicilio.setVisible(false);
			}
			
			public static String crearCodigo() {
				codigo = "";

			    for (int i = 0; i < 3; i++) {
			     
			        int numAleat = (int) (Math.random() * 26);

			  
			        char letra = (char) ('A' + numAleat);

			        codigo = codigo + letra;
			    }

			    return codigo;
				
				
			}
		});
        
        //BOTON RETROCEDER DESDE EL RESUMEN DEL PEDIDO
        vista.btnVolver3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				vista.PanelResumen.setVisible(false);
				vista.PanelLocal2.setVisible(true);
			}
		});
        
        //BOTON RETROCEDER DESDE EL RESUMEN DEL PEDIDO A DOMICILIO
        vista.btnVolver3_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				vista.PanelResumenDomicilio.setVisible(false);
				vista.PanelDomicilio2.setVisible(true);
				vista.PanelResumen.setVisible(false);
				
			}
		});
        
        //BOTON CONFIRMAR PEDIDO
        vista.btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				vista.PanelResumen.setVisible(false);
				vista.PanelCodPedido.setVisible(true);
				
				crearCodigo();
				
				vista.lblCodigo.setText(codigo);
					
			}

			public static String crearCodigo() {
				codigo = "";

			    for (int i = 0; i < 3; i++) {
			     
			        int numAleat = (int) (Math.random() * 26);

			  
			        char letra = (char) ('A' + numAleat);

			        codigo = codigo + letra;
			    }

			    return codigo;
				
				
			}
		});
        
        
        //AÑADIR PRODUCTO DESDE LA VISTA DE ADMINISTRADOR
        vista.btnAnadir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int numComida = listaComidas.size() + 1;
				String indiceComida ="c" + Integer.toString(numComida);
				int colorComida = Integer.parseInt(vista.textColor.getText());
				double precioComida = Double.parseDouble(vista.textPrecioB.getText());
				String nombreComida = vista.textNombreProd.getText();
				String panComida = vista.textPanB.getText();
				String carneComida = vista.textCarneB.getText();
				String quesoComida = vista.textQuesoB.getText();
				String extraComida = vista.textExtraB.getText();
					
				Comida nuevaComida = new Comida(numComida, nombreComida, colorComida, precioComida, panComida, carneComida, quesoComida, extraComida);

				
				if(colorComida == 1) {
					vista.CbRoja.addItem(nuevaComida);
					vista.CbRoja_1.addItem(nuevaComida);
					
				} else if (colorComida == 2) {
					vista.CbVerde.addItem(nuevaComida);
					vista.CbVerde_1.addItem(nuevaComida);
					vista.CbVerde_1.getSelectedItem().toString();
					
				}else {
					JOptionPane.showMessageDialog(vista, "El color debe ser 1 (Roja) o 2 (Verde)");
					return;
				}
				
				
				listaComidas.put(numComida, nuevaComida);
				
				actualizarComidas();
				
				
				JOptionPane.showMessageDialog(vista, "Producto añadido correctamente");
				
				vista.PanelAnadirProd.setVisible(false);
				vista.PanelMenuPrincipal.setVisible(true);
			
				
			}

			
		});
        
      //BOTON ELIMINAR PRODUCTO DESDE LA VISTA DE ADMINISTRADOR
        vista.btnEliminarProducto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				if(!vista.textBurgerElim.getText().isEmpty()) {
					String nombreAEliminar = vista.textBurgerElim.getText();
					listaComidas.values().removeIf(comida -> comida.getNombre().equalsIgnoreCase(nombreAEliminar));
					
					JOptionPane.showMessageDialog(vista, "Producto eliminado correctamente");
		
					vista.CbRoja.removeItem(nombreAEliminar);
					vista.CbVerde.removeItem(nombreAEliminar);	
					
				}
				 
				if(!vista.textBebidaElim.getText().isEmpty()) {
					String nombreAEliminar = vista.textBebidaElim.getText();
	
					vista.CbBebida.removeItem(nombreAEliminar);
					JOptionPane.showMessageDialog(vista, "Producto eliminado correctamente");
					return;
					
				}
				
				if(!vista.textPatataElim.getText().isEmpty()) {
					String nombreAEliminar = vista.textPatataElim.getText();
				
					vista.CbPatatas.removeItem(nombreAEliminar);
					JOptionPane.showMessageDialog(vista, "Producto eliminado correctamente");
					return;
					
				}
				
				if(!vista.textExtraElim.getText().isEmpty()) {
					String nombreAEliminar = vista.textExtraElim.getText();
				
					vista.CbComp.removeItem(nombreAEliminar);
					JOptionPane.showMessageDialog(vista, "Producto eliminado correctamente");
					return;
					
				}
				
				vista.PanelAnadirProd.setVisible(false);
				vista.PanelMenuPrincipal.setVisible(true);
				vista.PanelEliminarProd.setVisible(false);
				vista.PanelAdmin.setVisible(false);
				vista.PanelEliminarProd.setVisible(false);
			}
			
			
		});
        
        //CANCELAR ELIMINR PRODUCTO
        vista.btnEliminarProductoCancelado.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
				
        		vista.PanelEliminarProd.setVisible(false);
        		vista.PanelAdmin.setVisible(true);
			}
		});
        
        //CANCELAR AÑADIR PRODUCTO
        vista.btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				vista.PanelAnadirProd.setVisible(false);
				vista.PanelAdmin.setVisible(true);
			}
		});
        
        
        //CAMBIAR A VISTA ELIMINAR PRODUCTO DESDE ADMINISTRADOR
        
        vista.btnEliminarProd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				vista.PanelAdmin.setVisible(false);
				vista.PanelEliminarProd.setVisible(true);
			}
		});
        
        //VOLVER AL MENU PRINCIPAL DESDE LA PANTALLA DEL CODIGO DEL PEDIDO A DOMICILIO
        vista.btnMenuPrincipalDomicilio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				vista.PanelCodDomicilio.setVisible(false);
				vista.PanelMenuPrincipal.setVisible(true);
				vista.PanelResumenDomicilio.setVisible(false);
				vista.PanelResumen.setVisible(false);
				
			}
		});
        
        //VOLVER AL MENU PRINCIPAL DESDE LA PANTALLA DEL CODIGO DEL PEDIDO EN LOCAL
        vista.btnMenuPrincipalLocal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				vista.PanelCodPedido.setVisible(false);
				vista.PanelMenuPrincipal.setVisible(true);
				vista.PanelResumen.setVisible(false);
				vista.PanelResumenDomicilio.setVisible(false);
			}
		});
        
        
        //BOTON SALIR DEL PANEL ADMIN
        vista.btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				vista.PanelAdmin.setVisible(false);
				vista.PanelInicioSesion.setVisible(true);
				vista.PanelMenuPrincipal.setVisible(false);
			}
		});
        
        //BOTON IR A MODIFICAR PRODUCTO DESDE PANEL ADMIN
        vista.btnModificarProd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				vista.PanelAdmin.setVisible(false);
				vista.PanelModificarProd.setVisible(true);
				actualizarComidas();

				
				
			}

		});
        
        //EL COMBO DE MODIFICAR PRODUCTO

        vista.comboBoxM.addActionListener(new ActionListener() {
        	@Override
			public void actionPerformed(ActionEvent e) {
        		Comida comidaSelec = (Comida) vista.comboBoxM.getSelectedItem();
				if (comidaSelec == null) return;
				
				vista.lblPanR_2.setText(comidaSelec.getPan());
	            vista.lblCarneR_2.setText(comidaSelec.getCarne());
	            vista.lblQuesoR_2.setText(comidaSelec.getQueso());
	            vista.lblExtraR_2.setText(comidaSelec.getExtra());
	            vista.lblPrecioR.setText(String.valueOf(comidaSelec.getPrecio()));
				
        	}
        });
        
        //CANCELAR MODIFICAR PRODUCTO
        vista.btnCancelarModificacion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				vista.PanelModificarProd.setVisible(false);
				vista.PanelAdmin.setVisible(true);
				
				
			}
		});
        
        //BOTON MODIFICAR PRODUCTO
        vista.btnConfirmarModificacion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Comida comidaSeleccionada = (Comida) vista.comboBoxM.getSelectedItem();
				if (comidaSeleccionada == null) {
				    JOptionPane.showMessageDialog(vista, "Por favor, seleccione una comida para modificar.");
				    return;
				}

			
		
				String nuevoPan = vista.textPanMod.getText();
				String nuevaCarne = vista.textCarneMod.getText();
				String nuevoQueso = vista.textQuesoMod.getText();
				String nuevoExtra = vista.textExtraMod.getText();
				String nuevoPrecioStr = vista.textPrecioMod.getText();

				
				if (!nuevoPan.isEmpty()) {
				    comidaSeleccionada.setPan(nuevoPan);
				}
				if (!nuevaCarne.isEmpty()) {
				    comidaSeleccionada.setCarne(nuevaCarne);
				}
				if (!nuevoQueso.isEmpty()) {
				    comidaSeleccionada.setQueso(nuevoQueso);
				}
				if (!nuevoExtra.isEmpty()) {
				    comidaSeleccionada.setExtra(nuevoExtra);
				}
				if (!nuevoPrecioStr.isEmpty()) {
				    try {
				        double nuevoPrecio = Double.parseDouble(nuevoPrecioStr);
				        comidaSeleccionada.setPrecio(nuevoPrecio);
				    } catch (NumberFormatException ex) {
				        JOptionPane.showMessageDialog(vista, "Precio inválido. Por favor, ingrese un número válido.");
				        return;
				    }
				}

				JOptionPane.showMessageDialog(vista, "Producto modificado correctamente.");

		
				vista.textPanMod.setText("");
				vista.textCarneMod.setText("");
				vista.textQuesoMod.setText("");
				vista.textExtraMod.setText("");
				vista.textPrecioMod.setText("");

				actualizarComidas();
				vista.PanelModificarProd.setVisible(false);
				vista.PanelAdmin.setVisible(true);
			}
		});
        
        //CANCELAR REGISTRO
        vista.btnCancelarRegistro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				vista.PanelRegistro.setVisible(false);
				vista.PanelInicioSesion.setVisible(true);
			}
		});

    }
    public void actualizarComidas() {
		
		vista.CbRoja.removeAllItems();
        vista.CbVerde.removeAllItems();
        vista.CbRoja_1.removeAllItems();
        vista.CbVerde_1.removeAllItems();

    
        for (Comida c : listaComidas.values()) {
            if (c.getColor() == 1) {
                vista.CbRoja.addItem(c);
                vista.CbRoja_1.addItem(c);
                vista.comboBoxM.addItem(c);
            } else if (c.getColor() == 2) {
                vista.CbVerde.addItem(c);
                vista.CbVerde_1.addItem(c);
                vista.comboBoxM.addItem(c);
            }
        }
		
	}
}

