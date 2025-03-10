package Controlador;

import Logica.Playlist;
import Logica.Cancion;
import java.util.Scanner;

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

    // Método ejecutar() agregado
    public void ejecutar() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Pausar reproducción");
        System.out.println("2. Reanudar reproducción");
        System.out.print("Elige una opción: ");
        int opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                pausarReproduccion();
                break;
            case 2:
                reanudarReproduccion();
                break;
            default:
                System.out.println("Opción no válida.");
        }
    }
}
