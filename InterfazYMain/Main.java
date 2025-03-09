package InterfazYMain;

import Logica.Playlist;
import Controlador.AgregarNuevas;
import Controlador.Reproducir;
import Controlador.Pausar;
import Controlador.SaltarCancion;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Playlist playlist = new Playlist();
        AgregarNuevas agregar = new AgregarNuevas(playlist);
        Reproducir reproducir = new Reproducir(playlist);
        Pausar pausar = new Pausar(playlist);
        SaltarCancion saltar = new SaltarCancion(playlist);
        Scanner scanner = new Scanner(System.in);

        // Agregar algunas canciones por defecto
        agregar.ejecutar("Canción 1");
        agregar.ejecutar("Canción 2");
        agregar.ejecutar("Canción 3");

        boolean ejecutando = true;
        while (ejecutando) {
            System.out.println("\nSeleccione una opción:");
            System.out.println("1. Reproducir");
            System.out.println("2. Pausar");
            System.out.println("3. Saltar canción");
            System.out.println("4. Agregar canción");
            System.out.println("5. Salir");
            
            int opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar buffer
            
            switch (opcion) {
                case 1:
                    reproducir.ejecutar();
                    for (int i = 1; i <= 5; i++) {
                        try {
                            System.out.println("Tiempo: " + i);
                            Thread.sleep(1000); // Espera 1 segundo
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    break;
                case 2:
                    pausar.ejecutar();
                    break;
                case 3:
                    saltar.ejecutar();
                    break;
                case 4:
                    System.out.println("Ingrese el nombre de la nueva canción:");
                    String nuevaCancion = scanner.nextLine();
                    agregar.ejecutar(nuevaCancion);
                    break;
                case 5:
                    System.out.println("Saliendo del reproductor...");
                    ejecutando = false;
                    break;
                default:
                    System.out.println("Opción no válida, intente de nuevo.");
            }
        }
        scanner.close();
    }
}
