package Controlador;

import Logica.Playlist;
import Logica.Cancion;

public class AgregarNuevas {
    private Playlist playlist;

    public AgregarNuevas(Playlist playlist) {
        this.playlist = playlist;
    }

    public void agregarCancion(String titulo, String artista, double duracion) {
        Cancion nuevaCancion = new Cancion(titulo, artista, duracion);
        playlist.agregarCancion(nuevaCancion);
        System.out.println("Canción agregada: " + nuevaCancion.getTitulo() + " - " + nuevaCancion.getArtista());
    }
}
