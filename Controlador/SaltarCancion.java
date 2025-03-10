package Controlador;

import Logica.Playlist;
import Logica.Cancion;

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
}
