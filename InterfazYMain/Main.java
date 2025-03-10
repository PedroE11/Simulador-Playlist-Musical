package InterfazYMain;

import Logica.Playlist;
import Controlador.Reproducir;
import Controlador.Pausar;
import Controlador.SaltarCancion;
import Controlador.AgregarNuevas;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Playlist miPlaylist = new Playlist();
        
        // Controladores
        Reproducir controladorReproducir = new Reproducir(miPlaylist);
        Pausar controladorPausar = new Pausar(miPlaylist);
        SaltarCancion controladorSaltar = new SaltarCancion(miPlaylist);
        AgregarNuevas controladorAgregar = new AgregarNuevas(miPlaylist);

        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n--- Simulador de Playlist Musical ---");
            System.out.println("1. Reproducir canción");
            System.out.println("2. Saltar canción");
            System.out.println("3. Pausar canción");
            System.out.println("4. Mostrar playlist");
            System.out.println("5. Agregar nueva canción");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar buffer

            switch (opcion) {
                case 1:
                    controladorReproducir.ejecutar();
                    break;
                case 2:
                    controladorSaltar.ejecutar();
                    break;
                case 3:
                    controladorPausar.ejecutar();
                    break;
                case 4:
                    miPlaylist.mostrarPlaylist();
                    break;
                case 5:
                    controladorAgregar.ejecutar();
                    break;
                case 6:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        } while (opcion != 6);

        scanner.close();
    }
}
