package Logica;

import java.util.ArrayList;
import java.util.List;

public class Playlist {
    private List<String> canciones;
    private int indiceActual;
    private boolean reproduciendo;

    public Playlist() {
        this.canciones = new ArrayList<>();
        this.indiceActual = 0;
        this.reproduciendo = false;
    }

    public void agregarCancion(String cancion) {
        canciones.add(cancion);
        System.out.println("Canción agregada: " + cancion);
    }

    public void reproducir() {
        if (!canciones.isEmpty()) {
            reproduciendo = true;
            System.out.println("Reproduciendo: " + canciones.get(indiceActual));
        } else {
            System.out.println("La playlist está vacía.");
        }
    }

    public void pausar() {
        if (reproduciendo) {
            reproduciendo = false;
            System.out.println("Reproducción pausada.");
        } else {
            System.out.println("No hay música reproduciéndose.");
        }
    }

    public void saltar() {
        if (indiceActual < canciones.size() - 1) {
            indiceActual++;
            System.out.println("Saltando a: " + canciones.get(indiceActual));
        } else {
            System.out.println("No hay más canciones en la playlist.");
        }
    }
}
