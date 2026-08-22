/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package model;

/**
 *
 * @author alond
 */
public class Model {
    private String nombre;
    private int edad;
    private double altura;
    private String nacionalidad;

    public Model(String nombre, int edad, double altura, String nacionalidad) {

        this.nombre = nombre;

        if (edad >= 18 && edad <= 35) {
            this.edad = edad;
        } else {
            System.out.println("Edad no válida para modelo");
            this.edad = 0;
        }

        this.altura = altura;
        this.nacionalidad = nacionalidad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public double getAltura() {
        return altura;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void mostrarDatos() {

        System.out.println("\n--- Datos de la modelo ---");
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Altura: " + altura + " m");
        System.out.println("Nacionalidad: " + nacionalidad);
   
    }
    
}
