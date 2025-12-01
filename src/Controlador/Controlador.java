package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import Modelo.Usuarios;
import Vista.Vista;
import java.util.ArrayList;

public class Controlador {

    private Vista vista;
    private ArrayList<Usuarios> listaUsuarios;

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

        // ------------ LISTENER INICIO SESIÓN ------------
        vista.btnInSes.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                String nombre = vista.txtUsuario.getText().trim();
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

                } else {
                    JOptionPane.showMessageDialog(vista, "Usuario inexistente o contraseña incorrecta");
                }
            }
        });

        // Listener de Registro si quieres usarlo en el futuro:
        vista.btnReg.addActionListener(e -> {
            JOptionPane.showMessageDialog(vista, "Aquí iría el registro");
        });
    }
}

