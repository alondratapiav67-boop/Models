/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import model.ModeloPasarela;

/**
 *
 * @author alond
*/
public class Evento {

    private String nombre;
    private String lugar;
    private String fecha;
    private ModeloPasarela modelo;

    public Evento(String nombre, String lugar, String fecha) {

        this.nombre = nombre;
        this.lugar = lugar;
        this.fecha = fecha;
        this.modelo = null; //todavia no tengo una modelo asignada
    }

    public String getNombre() {
        return nombre;
    }

    public String getLugar() {
        return lugar;
    }

    public String getFecha() {
        return fecha;
    }

    public ModeloPasarela getModelo() {
        return modelo;
    }

    public void setModelo(ModeloPasarela modelo) {
        this.modelo = modelo;
    }

    public void mostrarEvento() {

        System.out.println("\n--- Evento ---");
        System.out.println("Evento: " + nombre);
        System.out.println("Lugar: " + lugar);
        System.out.println("Fecha: " + fecha);

        if (modelo != null) {
            System.out.println("Modelo asignada: "
                    + modelo.getNombre());
        } else {
            System.out.println("Modelo: PENDIENTE");
        }
    }
}