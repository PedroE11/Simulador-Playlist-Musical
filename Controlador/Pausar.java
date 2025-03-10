package Controlador;

import Logica.Playlist;
import Logica.Cancion;

public class Pausar {
    private Playlist playlist;
    private Cancion cancionActual;
    private boolean enReproduccion;
    private boolean enPausa;

    public Pausar(Playlist playlist) {
        this.playlist = playlist;
        this.cancionActual = null;
        this.enReproduccion = false;
        this.enPausa = false;
    }

    public void pausarReproduccion() {
        if (!enReproduccion) {
            System.out.println("No hay música en reproducción para pausar.");
            return;
        }
        
        if (!enPausa) {
            enPausa = true;
            System.out.println("Reproducción pausada: " + cancionActual.getTitulo() + " - " + cancionActual.getArtista());
        } else {
            System.out.println("La música ya está pausada.");
        }
    }

    public void reanudarReproduccion() {
        if (enPausa) {
            enPausa = false;
            System.out.println("Reproducción reanudada: " + cancionActual.getTitulo() + " - " + cancionActual.getArtista());
        } else {
            System.out.println("No hay música en pausa para reanudar.");
        }
    }

    public boolean isEnPausa() {
        return enPausa;
    }
}
