/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gestorcita;
import Entidades.Cita;
import Entidades.Medico;
import Entidades.Paciente;
import gestordecitas.pantallas.JFrameGestorCitas;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author diego
 */
public class GestordeCitas {
    
    public static List<Cita> citasEnelsistema;
    public static List<Paciente> listadePacientes;
    public static List<Medico> listadeMedicos;
    public static List<String> horasDisponibles = new ArrayList<>();
public static List<String> fechasDisponibles = new ArrayList<>();
    /**
     * 
     * @param args 
     */
    
    public static void main(String[] args){
        //Genero las listas en blanco para todo el sistema hasta que se cierre
        citasEnelsistema = new ArrayList<>();
        listadePacientes = new ArrayList<>();
        listadeMedicos = new ArrayList<>();
        horasDisponibles.add("9:00 am");
        horasDisponibles.add("9:15 am");
        horasDisponibles.add("10:45 am");
        horasDisponibles.add("11:25 am");
        horasDisponibles.add("11:30 am");
       
        
        fechasDisponibles.add("11/05/23");
        fechasDisponibles.add("12/05/23");
        fechasDisponibles.add("13/05/23");
        fechasDisponibles.add("14/05/23");
        fechasDisponibles.add("15/05/23");
        
        
        //Inicio de la ventana de gestor de citas
        JFrameGestorCitas frameprincipal = new JFrameGestorCitas();
        frameprincipal.setLocationRelativeTo(null);
        frameprincipal.setVisible(true);
        
    }
}

