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
import Modelo.Usuarios;
import Vista.Vista;
import java.util.ArrayList;

public class Controlador {

    private Vista vista;
    private ArrayList<Usuarios> listaUsuarios;
    static String nombre;
    
    //Valiables necesarias para pedir
    private int idBurger;
    private int idBebida;
    private int idPatata;
    private int idComplemento;
    private String nombreBurger;
    private String nombreBebida;
    private String nombrePatata;
    private String nombreComplemento;
    
    

    public Controlador(Vista vista) {
        this.vista = vista;
        listaUsuarios = new ArrayList<>();
        JComboBox<Comida> comboBox = new JComboBox<>();
        JComboBox<Bebida> comboBoxBebida = new JComboBox<>();
        JComboBox<Patata> comboBoxPatata = new JComboBox<>();

        // Usuarios de prueba
        listaUsuarios.add(new Usuarios("david", "david"));
        listaUsuarios.add(new Usuarios("felix", "felix"));
        
        
        Comida c1 = new Comida(1, "Pizza", 1, 8.99, "Normal", "Pollo", "Mozzarella", "Extra salsa");
		Comida c2 = new Comida(2, "Hamburguesa", 2, 5.49, "Integral", "Res", "Cheddar", "Tocino");
		Comida c3 = new Comida(3, "Sushi",	1, 12.99, "Centeno", "Atún", "Requeson", "Aguacate");
		Comida c4 = new Comida(4, "Ensalada", 2, 6.99, "Sin pan", "Ninguna", "Feta", "Nueces");
		Comida c5 = new Comida(5, "Taco", 1, 4.99, "Maíz", "Cerdo", "Queso fresco", "Cilantro");
		Comida c6 = new Comida(6, "Pasta", 2, 7.99, "Sin pan", "Pollo", "Parmesano", "Champiñones");
		Comida c7 = new Comida(7, "Wrap", 1, 6.49, "Tortilla", "Pavo", "Suizo", "Lechuga");
		Comida c8 = new Comida(8, "Sopa", 2, 5.99, "Sin pan", "Ninguna", "Ninguno", "Crutones");
		Comida c9 = new Comida(9, "Curry", 1, 9.49, "Naan", "Cordero", "Ninguno", "Yogur");
		Comida c10 = new Comida(10, "Paella", 1, 11.99, "Sin pan", "Mariscos", "Ninguno", "Limón");
		
		
		Bebida b1 = new Bebida(1, "Coca-Cola", 1.5);
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

    	        // Validaciones
    	        if (nombre.isEmpty() || correo.isEmpty() || contrasena.isEmpty() || repetirContrasena.isEmpty()) {
    	            JOptionPane.showMessageDialog(vista, "Por favor, complete todos los campos.");
    	            return;
    	        }

    	        if (!contrasena.equals(repetirContrasena)) {
    	            JOptionPane.showMessageDialog(vista, "Las contraseñas no coinciden.");
    	            return;
    	        }

    	        // comprobar usuario existente
    	        for (Usuarios u : listaUsuarios) {
    	            if (u.getNombre().equalsIgnoreCase(nombre)) {
    	                JOptionPane.showMessageDialog(vista, "El nombre de usuario ya existe.");
    	                return;
    	            }
    	        }

    	        // Añadir usuario
    	        listaUsuarios.add(new Usuarios(nombre, contrasena));
    	        JOptionPane.showMessageDialog(vista, "Registro exitoso. Ahora puede iniciar sesión.");

    	        // LIMPIAR CAMPOS
    	        vista.textNombre.setText("");
    	        vista.textCorreo.setText("");
    	        vista.textContrasena.setText("");
    	        vista.textRepetirContrasena.setText("");

    	        // Volver al menú
    	        vista.PanelRegistro.setVisible(false);
    	        vista.PanelInicioSesion.setVisible(true);
    	    }
    	});
    	
    		//boton administrador
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
	                	// Solicitar código
	            	    String codigo = JOptionPane.showInputDialog(
	            	            vista,
	            	            "Ingrese el código de administrador:",
	            	            "Verificación",
	            	            JOptionPane.QUESTION_MESSAGE
	            	    );
	
	            	    // Si cancela o cierra ventana
	            	    if (codigo == null) {
	            	        return;
	            	    }
	
	            	    // Validación
	            	    if (codigo.equals("123")) {
	
	            	        // Código correcto → entrar al menú
	            	        JOptionPane.showMessageDialog(vista, "Acceso concedido.");
	
	            	        vista.PanelInicioSesion.setVisible(false);
	            	        vista.PanelAdmin.setVisible(true);
	
	            	    } else {
	            	        // Código incorrecto
	            	        JOptionPane.showMessageDialog(vista, "Código incorrecto. Acceso denegado.");
	            	    }
	            	}
	                
	                	
	                }

        		 
        });
    		//Panel de admins
    		//boton añadir producto
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
    		

        // ------------ LISTENER INICIO SESIÓN ------------
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

                    // CAMBIO DE PANEL
                    vista.PanelInicioSesion.setVisible(false);
                    vista.PanelMenuPrincipal.setVisible(true);
                    vista.Contacto.setVisible(false);

                } else {
                    JOptionPane.showMessageDialog(vista, "Usuario inexistente o contraseña incorrecta");
                }
            }
        });

        // Listener de Registro si quieres usarlo en el futuro:
        vista.btnReg.addActionListener(e -> {
            JOptionPane.showMessageDialog(vista, "Aquí iría el registro");
        });
        
        
        // Listener para ir a Mi Perfil
        vista.foticoperfil.addMouseListener(new MouseAdapter() {
        	@Override
        	public void mouseClicked(MouseEvent e) {
        		vista.MiPerfil.setVisible(true);
        		vista.PanelMenuPrincipal.setVisible(false);
        		
        		vista.lblNombredeBienvenida.setText(nombre);
        	}
        });
        
        //Boton para volver al menu principal desde mi perfil
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
        
        
        //Boton para volver al perfil desde contacto
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

                int opcion = JOptionPane.showConfirmDialog(
                        vista,
                        "¿Quieres cerrar sesión?", // texto del cuadro
                        "", // titulo del cuadro 
                        JOptionPane.YES_NO_OPTION // opciones de botones
                );

                if(opcion == JOptionPane.YES_OPTION) { // si la opcion es sí nos saca al inicio de sesión
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

                int opcion = JOptionPane.showConfirmDialog(
                        vista,
                        "¿Quieres cerrar sesión?", // texto del cuadro
                        "", // titulo del cuadro 
                        JOptionPane.YES_NO_OPTION // opciones de botones
                );

                if(opcion == JOptionPane.YES_OPTION) { // si la opcion es sí nos saca al inicio de sesión
                	vista.Contacto.setVisible(false);
                    vista.PanelMenuPrincipal.setVisible(false);
                    vista.PanelInicioSesion.setVisible(true);
                }
            }
        });
        
        //BOTON PARA IR DESDE PEDIDOOLOCAL O LA SECCION PEDIR EN EL LOCAL
        vista.btnPedirEnLocal.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		
        		vista.DomicilioOLocal.setVisible(false);
				vista.PanelLocal.setVisible(true);
				
        	}
        });
        
        
        vista.btnAvanzar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
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
        
        //BOTON AVANZAR AL RESUMEN DEL PEDIDO
        vista.btnSig.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				vista.PanelLocal2.setVisible(false);
				vista.PanelResumen.setVisible(true);
				
				vista.lblBurgerElegido.setText(nombreBurger);
				vista.lblBebidaElegida.setText(nombreBebida);
				vista.lblPatataElegida.setText(nombrePatata);
				vista.lblComplementoElegido.setText(nombreComplemento);
				
			}
		});
        
        //BOTON RETROCEDER DESDE EL RESUMEN DEL PEDIDO
        vista.btnVolver3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				vista.PanelResumen.setVisible(false);
				vista.PanelLocal2.setVisible(true);
			}
		});
        
        
        
        
        
        
    }
}

