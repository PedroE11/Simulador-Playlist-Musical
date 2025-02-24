package Logica;
public class Playlist {
    private ListaCircular lista;

    public Playlist() {
        this.lista = new ListaCircular();
    }

    // Método para agregar una canción a la playlist
    public void agregarCancion(Cancion cancion) {
        lista.agregarCancion(cancion);
    }

    // Método para mostrar todas las canciones de la playlist
    public void mostrarPlaylist() {
        lista.mostrarPlaylist();
    }

    // Método para buscar una canción por título
    public Cancion buscarCancion(String titulo) {
        return lista.buscarCancion(titulo);
    }

    // Método para eliminar una canción por título
    public void eliminarCancion(String titulo) {
        lista.eliminarCancion(titulo);
    }

    // Método para verificar si la playlist está vacía
    public boolean estaVacia() {
        return lista.estaVacia();
    }
}
