/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import model.Evento;
import model.Model;

public class ModeloPasarela extends Model {

    private String talla;
    private boolean aptaPasarela;
    private Evento evento;

    public ModeloPasarela(String nombre, int edad, double altura,
            String nacionalidad, String talla) {

        super(nombre, edad, altura, nacionalidad);

        this.talla = talla;

        if (altura >= 1.75) {
            aptaPasarela = true;
        } else {
            aptaPasarela = false;
        }

        if (talla.equals("XXS")
                || talla.equals("XS")
                || talla.equals("S")
                || talla.equals("M")) {

            this.talla = talla;

        } else {

            this.talla = "No valida";
        }

        evento = null;
    }

    public boolean isAptaPasarela() {
        return aptaPasarela;
    }

    public String getTalla() {
        return talla;
    }

    public Evento getEvento() {
        return evento;
    }

    public void setEvento(Evento evento) {
        this.evento = evento;
    }

    @Override
    public void mostrarDatos() {

        super.mostrarDatos();

        System.out.println("Talla: " + talla);

        if (aptaPasarela) {

            System.out.println("Tipo: Modelo de Pasarela");
            System.out.println("Estado: Apta para pasarela");
            System.out.println("Bienvenida a la agencia!!");

            if (evento != null) {
                System.out.println("Evento: " + evento.getNombre());
            } else {
                System.out.println("Evento: Sin asignar");
            }

        } else {

            System.out.println("Tipo: No apta para pasarela");
            System.out.println("Estado: No cumple la altura minima");
            System.out.println("Lo sentimos, estamos en busca de un perfil especifico.");
        }
    }
}