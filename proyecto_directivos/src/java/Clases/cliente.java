/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.util.Date;
import java.util.List;
import javax.xml.bind.annotation.XmlRootElement;
/**
 *
 * @author FAMILIA
 */
@XmlRootElement
public class cliente {
    private String cedula;
    private String nombre;
    private String apellido;
    private List<Curso> curso;
    private String fecha_reserva;

    public cliente() {
    }

    public cliente(String cedula, String nombre, String apellido, List<Curso> curso, String fecha_reserva) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.apellido = apellido;
        this.curso = curso;
        this.fecha_reserva = fecha_reserva;
    }

   
    
    /**
     * @return the cedula
     */
    public String getCedula() {
        return cedula;
    }

    /**
     * @param cedula the cedula to set
     */
    public void setCedula(String cedula) {
        this.cedula = cedula;
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
     * @return the apellido
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * @param apellido the apellido to set
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    
    public List<Curso> getCurso() {
        return curso;
    }

   
    public void setHabitaciones(List<Curso> curso) {
        this.curso = curso;
    }

    
}
