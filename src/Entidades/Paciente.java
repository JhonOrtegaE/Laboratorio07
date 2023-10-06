/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author diego
 */
public class Paciente {

    /**
     * @return the dni
     */
    public String getDni() {
        return dni;
    }

    /**
     * @param dni the dni to set
     */
    public void setDni(String dni) {
        this.dni = dni;
    }

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
     * @return the telefono
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * @param telefono the telefono to set
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    /**
     * @return the sexoBiologico
     */
    public int getSexoBiologico() {
        return sexoBiologico;
    }

    /**
     * @param sexoBiologico the sexoBiologico to set
     */
    public void setSexoBiologico(int sexoBiologico) {
        this.sexoBiologico = sexoBiologico;
    }
    private String dni;
    private String nombre;
    private String telefono;
    private int sexoBiologico;
    
    public final static int MASCULINO = 0;
     public final static int FEMENINO = 1;
     
     public String getMostrarDatos(){
         return this.nombre + "- DNI : " + this.dni;
     }
     
}
