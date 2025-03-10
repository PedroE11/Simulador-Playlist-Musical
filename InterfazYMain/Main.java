package InterfazYMain;
import Logica.*;
public class Main {
    public static void main(String[] args) {
        Playlist miPlaylist = new Playlist();

        // Agregar canciones
        miPlaylist.agregarCancion(new Cancion("Bohemian Rhapsody", "Queen", 5.55));
        miPlaylist.agregarCancion(new Cancion("Billie Jean", "Michael Jackson", 4.54));
        miPlaylist.agregarCancion(new Cancion("Hotel California", "Eagles", 6.30));

        // Mostrar playlist
        System.out.println("Playlist actual:");
        miPlaylist.mostrarPlaylist();

        // Buscar una canción
        System.out.println("\nBuscando 'Billie Jean'...");
        Cancion encontrada = miPlaylist.buscarCancion("Billie Jean");
        if (encontrada != null) {
            System.out.println("Canción encontrada: " + encontrada);
        } else {
            System.out.println("No encontrada.");
        }

        // Eliminar una canción
        System.out.println("\nEliminando 'Bohemian Rhapsody'...");
        miPlaylist.eliminarCancion("Bohemian Rhapsody");

        // Mostrar la playlist después de eliminar
        System.out.println("\nPlaylist después de eliminar:");
        miPlaylist.mostrarPlaylist();
    }
}
