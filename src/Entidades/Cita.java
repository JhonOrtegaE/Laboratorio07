/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
/**
 *
 * @author diego
 */
public class Cita {
    

    /**
     * @return the hora
     */
    public int getHora() {
        return hora;
    }

    /**
     * @param hora the hora to set
     */
    public void setHora(int hora) {
        this.hora = hora;
    }

    /**
     * @return the fecha
     */
    public int getFecha() {
        return fecha;
    }

    /**
     * @param fecha the fecha to set
     */
    public void setFecha(int fecha) {
        this.fecha = fecha;
    }

    /**
     * @return the medico
     */
    public Medico getMedico() {
        return medico;
    }

    /**
     * @param medico the medico to set
     */
    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    /**
     * @return the paciente
     */
    public Paciente getPaciente() {
        return paciente;
    }

    /**
     * @param paciente the paciente to set
     */
    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    /**
     * @return the especialidad
     */
    public Especialidad getEspecialidad() {
        return especialidad;
    }

    /**
     * @param especialidad the especialidad to set
     */
    public void setEspecialidad(Especialidad especialidad) {
        this.especialidad = especialidad;
    }
    
    public String mostrarDatos(){
    
        return this.getPaciente().getNombre()+ " - " + gestorcita.GestordeCitas.fechasDisponibles.get(getFecha()) 
                + " - " +" | Medico: "+ this.getMedico().getNombre();
    
    }
    private int hora;
    private int fecha;
    private Medico medico;
    private Paciente paciente;
    private Especialidad especialidad;

    public Cita(Medico medico, Paciente paciente, Especialidad especialidad) {
        this.medico = medico;
        this.paciente = paciente;
        this.especialidad = especialidad;
        
    }
    
}