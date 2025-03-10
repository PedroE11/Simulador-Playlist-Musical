package Logica;

public class Playlist {
    private ListaCircular listaCanciones;
    private Cancion cancionActual;

    public Playlist() {
        this.listaCanciones = new ListaCircular();
        this.cancionActual = null;
    }

    public void agregarCancion(Cancion nuevaCancion) {
        listaCanciones.agregarCancion(nuevaCancion);
    }

    public Cancion obtenerPrimeraCancion() {
        cancionActual = listaCanciones.obtenerPrimeraCancion();
        return cancionActual;
    }

    public Cancion obtenerSiguienteCancion() {
        if (cancionActual == null) {
            return obtenerPrimeraCancion();
        }
        cancionActual = listaCanciones.obtenerSiguienteCancion(cancionActual);
        return cancionActual;
    }

    public void eliminarCancion(String titulo) {
        listaCanciones.eliminarCancion(titulo);
    }

    public Cancion buscarCancion(String titulo) {
        return listaCanciones.buscarCancion(titulo);
    }

    public void mostrarPlaylist() {
        listaCanciones.mostrarPlaylist();
    }

    public boolean estaVacia() {
        return listaCanciones.estaVacia();
    }

    public int tamaño() {
        return listaCanciones.tamaño();
    }

    public void reiniciarPlaylist() {
        listaCanciones.reiniciarLista();
        cancionActual = null;
    }
}
