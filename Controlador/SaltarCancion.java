package Controlador;

import Logica.Playlist;

public class SaltarCancion {
    private Playlist playlist;

    public SaltarCancion(Playlist playlist) {
        this.playlist = playlist;
    }

    public void ejecutar() {
        playlist.saltar();
    }
}
