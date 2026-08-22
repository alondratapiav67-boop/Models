
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
public class Agencia {

    private Model[] modelos;
    private Evento[] eventos;

    private int contadorModelos;
    private int contadorEventos;

    public Agencia() {

        modelos = new Model[10];
        eventos = new Evento[10];

        contadorModelos = 0;
        contadorEventos = 0;
    }

    public void agregarModelo(Model modelo) {

        if (contadorModelos < modelos.length) {

            modelos[contadorModelos] = modelo;
            contadorModelos++;

            System.out.println("Modelo registrada correctamente.");

        } else {

            System.out.println("La agencia tiene el cupo lleno.");
        }
    }

    public void mostrarModelos() {

        if (contadorModelos == 0) {

            System.out.println("No hay modelos registradas.");
            return;
        }

        for (int i = 0; i < contadorModelos; i++) {

            modelos[i].mostrarDatos();
        }
    }

    public void agregarEvento(Evento evento) {

        if (contadorEventos < eventos.length) {

            eventos[contadorEventos] = evento;
            contadorEventos++;

        } else {

            System.out.println("No hay espacio para más eventos.");
        }
    }

    public void mostrarEventos() {

        if (contadorEventos == 0) {

            System.out.println("No hay eventos registrados.");
            return;
        }

        for (int i = 0; i < contadorEventos; i++) {

            eventos[i].mostrarEvento();
        }
    }

    public Evento obtenerEvento(int posicion) {

        if (posicion >= 1 && posicion <= contadorEventos) {

            return eventos[posicion - 1];

        }

        return null;
    }
}