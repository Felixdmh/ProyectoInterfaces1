package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JOptionPane;
import Modelo.Usuarios;
import Vista.Vista;
import java.util.ArrayList;

public class Controlador {

    private Vista vista;
    private ArrayList<Usuarios> listaUsuarios;
    static String nombre;

    public Controlador(Vista vista) {
        this.vista = vista;
        listaUsuarios = new ArrayList<>();

        // Usuarios de prueba
        listaUsuarios.add(new Usuarios("david", "david"));
        listaUsuarios.add(new Usuarios("felix", "felix"));

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
        
        
    }
}

