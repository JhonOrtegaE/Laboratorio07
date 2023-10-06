/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author diego
 */
public class Medico {

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the CMP
     */
    public String getCMP() {
        return CMP;
    }

    /**
     * @param CMP the CMP to set
     */
    public void setCMP(String CMP) {
        this.CMP = CMP;
    }
   
    public List<Especialidad> getEspecialidades() {
        return especialidades;
    }

    public void setEspecialidades(List<Especialidad> especialidades) {
        this.especialidades = especialidades;
    }
    /**
     * Las especialidades del Medico
     */
     private List<Especialidad> especialidades;
     private String nombre;
    private String CMP;

    public Medico(String nombre, String CMP,List<Especialidad> especialidades) throws Exception {
        this.nombre = nombre;
        this.CMP = CMP;
        this.especialidades = especialidades;
       if(especialidades == null){
           throw new Exception("No se puede crear");
       }
    }
    public void agregarEspecialidad(Especialidad especialidad){
        this.especialidades.add(especialidad);
        
    }
     
    public String getMostrarDatos(){
        return this.nombre + " | CMP: " + this.CMP;
    }
}
