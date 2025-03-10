package Controlador;

import Logica.Playlist;
import Logica.Cancion;

public class Reproducir {
    private Playlist playlist;
    private Cancion cancionActual;
    private boolean enReproduccion;

    public Reproducir(Playlist playlist) {
        this.playlist = playlist;
        this.cancionActual = null;
        this.enReproduccion = false;
    }

    public void iniciarReproduccion() {
        if (playlist.estaVacia()) {
            System.out.println("La playlist está vacía. Agrega canciones para reproducir.");
            return;
        }
        
        if (!enReproduccion) {
            if (cancionActual == null) {
                cancionActual = playlist.obtenerPrimeraCancion();
            }
            enReproduccion = true;
            System.out.println("Reproduciendo: " + cancionActual.getTitulo() + " - " + cancionActual.getArtista());
        } else {
            System.out.println("La música ya está en reproducción.");
        }
    }

    public void detenerReproduccion() {
        if (enReproduccion) {
            enReproduccion = false;
            System.out.println("Reproducción detenida.");
        } else {
            System.out.println("No hay música en reproducción.");
        }
    }

    public Cancion getCancionActual() {
        return cancionActual;
    }

    public boolean isEnReproduccion() {
        return enReproduccion;
    }
}