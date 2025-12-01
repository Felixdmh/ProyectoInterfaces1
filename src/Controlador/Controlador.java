package Controlador;

import java.util.ArrayList;
import Modelo.Usuarios;
import Vista.Vista;

public class Controlador {

    private ArrayList<Usuarios> listaUsuarios = new ArrayList<>();

    public Controlador() {
        // Registrar usuarios dentro del constructor
        listaUsuarios.add(new Usuarios("david", "david"));
        listaUsuarios.add(new Usuarios("felix", "felix"));
    }
        
        public void agregarUsuario(Usuarios u) {
            listaUsuarios.add(u);
        }

        public ArrayList<Usuarios> getListaUsuarios() {
            return listaUsuarios;
        }
        

        
    }
    
    

