/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.util.Date;

/**
 *
 * @author FAMILIA
 */
public class Curso {
    private Integer capacidad;
    private String nombre;
    private Float precio;
    private String fecha_inicio;
    private String fecha_fin;

    public Curso() {
    }

    public Curso(Integer capacidad, String nombre, Float precio, String fecha_inicio, String fecha_fin) {
        this.capacidad = capacidad;
        this.nombre = nombre;
        this.precio = precio;
        this.fecha_inicio = fecha_inicio;
        this.fecha_fin = fecha_fin;
    }

    public Integer getCapacidad() {
        return capacidad;
    }

    /**
     * @param numero the numero to set
     */
    public void setCapacidad(Integer capacidad) {
        this.capacidad = capacidad;
    }

   

    /**
     * @return the tipo
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the precio
     */
    public Float getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(Float precio) {
        this.precio = precio;
    }

    /**
     * @return the fecha_entrada
     */
    public String getFecha_Inicio() {
        return fecha_inicio;
    }

    /**
     * @param fecha_entrada the fecha_entrada to set
     */
    public void setFecha_Inicio(String fecha_inicio) {
        this.fecha_inicio = fecha_inicio;
    }

    /**
     * @return the fecha_salida
     */
    public String getFecha_Fin() {
        return fecha_fin;
    }

    /**
     * @param fecha_salida the fecha_salida to set
     */
    public void setFecha_Fin(String fecha_fin) {
        this.fecha_fin = fecha_fin;
    }
}
