package Controlador;

import Logica.Playlist;
import Logica.Cancion;
import java.util.Scanner;

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

    // Método ejecutar() agregado
    public void ejecutar() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese el título de la canción:");
        String titulo = scanner.nextLine();
        
        System.out.println("Ingrese el artista de la canción:");
        String artista = scanner.nextLine();
        
        System.out.println("Ingrese la duración de la canción (en minutos):");
        double duracion = scanner.nextDouble();
        
        agregarCancion(titulo, artista, duracion);
    }
}
