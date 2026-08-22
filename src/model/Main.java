/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import model.Evento;
import model.ModeloPasarela;
import model.Agencia;
import java.util.Scanner;

/**
 *
 * @author alond
 */
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Agencia agencia = new Agencia();

        // Eventos registrados previamente

        agencia.agregarEvento(new Evento(
                "Paris Fashion Week",
                "Paris, Francia",
                "10/09/2027"
        ));

        agencia.agregarEvento(new Evento(
                "Met Gala",
                "Nueva York, Estados Unidos",
                "04/05/2027"
        ));

        agencia.agregarEvento(new Evento(
                "Victoria's Secret Fashion Show",
                "Nueva York, Estados Unidos",
                "15/10/2027"
        ));

        agencia.agregarEvento(new Evento(
                "Pitti Uomo",
                "Florencia, Italia",
                "13/01/2027"
        ));

        agencia.agregarEvento(new Evento(
                "Intermoda",
                "Guadalajara, México",
                "20/01/2027"
        ));

        int opcion;

        do {

            System.out.println("\n===== Bienvenido a Nova Models Agency =====");
            System.out.println("1. Registrar modelo");
            System.out.println("2. Mostrar modelos");
            System.out.println("3. Mostrar eventos");
            System.out.println("4. Salir");
            System.out.print("Opcion: ");

            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {

                case 1:

                    System.out.print("Nombre: ");
                    String nombre = sc.nextLine();

                    System.out.print("Edad: ");
                    int edad = sc.nextInt();

                    System.out.print("Altura: ");
                    double altura = sc.nextDouble();
                    sc.nextLine();

                    // Nacionalidad

                    System.out.println("\nSeleccione la nacionalidad de la modelo:");
                    System.out.println("1. Mexicana");
                    System.out.println("2. Colombiana");
                    System.out.println("3. Argentina");
                    System.out.println("4. Estadounidense");
                    System.out.print("Opcion: ");

                    int opNac = sc.nextInt();
                    sc.nextLine();

                    String nacionalidad;

                    switch (opNac) {

                        case 1:
                            nacionalidad = "Mexicana";
                            break;

                        case 2:
                            nacionalidad = "Colombiana";
                            break;

                        case 3:
                            nacionalidad = "Argentina";
                            break;

                        case 4:
                            nacionalidad = "Estadounidense";
                            break;

                        default:
                            nacionalidad = "Nacionalidad no valida";
                    }

                    // Talla

                    System.out.println("\nSeleccione la talla de la modelo:");
                    System.out.println("1. XXS");
                    System.out.println("2. XS");
                    System.out.println("3. S");
                    System.out.println("4. M");
                    System.out.print("Opcion: ");

                    int opTalla = sc.nextInt();
                    sc.nextLine();

                    String talla;

                    switch (opTalla) {

                        case 1:
                            talla = "XXS";
                            break;

                        case 2:
                            talla = "XS";
                            break;

                        case 3:
                            talla = "S";
                            break;

                        case 4:
                            talla = "M";
                            break;

                        default:
                            talla = "No valida";
                    }

                    // Crear modelo

                    ModeloPasarela modelo = new ModeloPasarela(
                            nombre,
                            edad,
                            altura,
                            nacionalidad,
                            talla
                    );

                    agencia.agregarModelo(modelo);

                    // Si es apta, seleccionar evento

                    if (modelo.isAptaPasarela()) {

                        System.out.println("\n===== Seleccione el evento =====");

                        System.out.println("1. Paris Fashion Week");
                        System.out.println("   Paris, Francia - 10/09/2027");

                        System.out.println("2. Met Gala");
                        System.out.println("   Nueva York, Estados Unidos - 04/05/2027");

                        System.out.println("3. Victoria's Secret Fashion Show");
                        System.out.println("   Nueva York, Estados Unidos - 15/10/2027");

                        System.out.println("4. Pitti Uomo");
                        System.out.println("   Florencia, Italia - 13/01/2027");

                        System.out.println("5. Intermoda");
                        System.out.println("   Guadalajara, México - 20/01/2027");

                        System.out.print("\nSeleccione un evento: ");

                        int opEvento = sc.nextInt();
                        sc.nextLine();

                        Evento eventoSeleccionado =
                                agencia.obtenerEvento(opEvento);

                        if (eventoSeleccionado != null) {

                            modelo.setEvento(eventoSeleccionado);
                            eventoSeleccionado.setModelo(modelo);

                            System.out.println(
                                    "\nModelo asignada al evento: "
                                    + eventoSeleccionado.getNombre()
                            );

                        } else {

                            System.out.println("Evento no valido.");
                        }

                    } else {

                        System.out.println(
                                "Lo sentimos, estamos buscando un perfil especifico."
                        );
                    }

                    break;

                case 2:

                    agencia.mostrarModelos();

                    break;

                case 3:

                    agencia.mostrarEventos();

                    break;

                case 4:

                    System.out.println("Programa finalizado.");

                    break;

                default:

                    System.out.println("Opcion incorrecta.");
            }

        } while (opcion != 4);

        sc.close();
    }
}