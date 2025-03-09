package Controlador;

import Logica.Playlist;

public class AgregarNuevas {
    private Playlist playlist;

    public AgregarNuevas(Playlist playlist) {
        this.playlist = playlist;
    }

    public void ejecutar(String cancion) {
        playlist.agregarCancion(cancion);
    }
}
