package Controlador;

import Logica.Playlist;

public class Reproducir {
    private Playlist playlist;

    public Reproducir(Playlist playlist) {
        this.playlist = playlist;
    }

    public void ejecutar() {
        playlist.reproducir();
    }
}
