package Controlador;

import Logica.Playlist;

public class Pausar {
    private Playlist playlist;

    public Pausar(Playlist playlist) {
        this.playlist = playlist;
    }

    public void ejecutar() {
        playlist.pausar();
    }
}
