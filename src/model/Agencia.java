
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import java.util.ArrayList;
import java.util.List;
public class Agencia {
    private List<Model> listaModelos;
    private Model[] modelos;
    private Evento[] eventos;

    private int contadorModelos;
    private int contadorEventos;

    public Agencia() {
        this.listaModelos = new ArrayList<>();
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
    public void buscarModeloPorNombre(String nombreBuscar) {
        System.out.println("\n--- Buscando a: " + nombreBuscar + " ---");
        boolean encontrada = false;
        for (int i =0; i < contadorModelos; i++) {
            Model m = modelos[i];
            if (m.getNombre() != null && m.getNombre().equalsIgnoreCase(nombreBuscar)) {
                m.mostrarDatos();
                encontrada = true;
                break; 
            }
        }
        
        if (!encontrada) {
            System.out.println("La modelo '" + nombreBuscar + "' no está registrada.");
        }}
    public void mostrarEstadisticas() {
        //validacion de seguridad, si el id o contador es igual a cero no hay modelos registradas
        if (contadorModelos == 0) {
            System.out.println("No hay modelos registradas.");
            return; //return para cortar la ejecucion del metodo
        }

        double sumaAlturas = 0; //acumulador para el promedio de edad de modelos
        //del tipo model creamos modeloMasJoven
        Model modeloMasJoven = null; //inicializacion "limpia" null

        //recorrer a todas las modelos registradas en arreglo modelos
        for (int i = 0; i < contadorModelos; i++) {
            Model m = modelos[i];
            //suma de alturas
            sumaAlturas += m.getAltura(); // Usamos método getAltura()
            
            //filtro de edad valida edad mayor a 0
            if (m.getEdad() > 0) {
                if (modeloMasJoven == null || m.getEdad() < modeloMasJoven.getEdad()) {
                modeloMasJoven = m; //aqui se guardara la modelo mas joven actual
            }
        }
            //calculo del promedio de altura 
        double promedioAltura = sumaAlturas / contadorModelos;

        System.out.println("\n=========================================");
        System.out.println("        ESTADÍSTICAS DE LA AGENCIA       ");
        System.out.println("=========================================");
        System.out.println(" Total de modelos registradas:        " + contadorModelos);
        System.out.println(" Altura promedio del staff:         " + String.format("%.2f", promedioAltura) + " m");
        if (modeloMasJoven != null) {
        System.out.println(" Modelo más joven:        " + modeloMasJoven.getNombre() 
                + " (" + modeloMasJoven.getEdad() + " años - " + modeloMasJoven.getNacionalidad() + ")");
        } else {
            System.out.println("Modelo mas joven:     No hay modelos con edad valida registrada. ");
        }
        System.out.println("=========================================");
    }}}
    
