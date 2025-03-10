package Controlador;

import Logica.Playlist;
import Logica.Cancion;
import java.util.Scanner;

public class SaltarCancion {
    private Playlist playlist;

    public SaltarCancion(Playlist playlist) {
        this.playlist = playlist;
    }

    public void saltar() {
        if (playlist.estaVacia()) {
            System.out.println("La playlist está vacía, no hay canciones para saltar.");
            return;
        }

        Cancion nuevaCancion = playlist.obtenerSiguienteCancion();
        if (nuevaCancion != null) {
            System.out.println("Saltando a la siguiente canción: " + nuevaCancion.getTitulo());
        } else {
            System.out.println("No hay más canciones en la playlist.");
        }
    }

    // Método ejecutar() agregado
    public void ejecutar() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("¿Deseas saltar a la siguiente canción? (1 = Sí, 2 = No)");
        int opcion = scanner.nextInt();

        if (opcion == 1) {
            saltar();
        } else {
            System.out.println("Acción cancelada.");
        }
    }
}
