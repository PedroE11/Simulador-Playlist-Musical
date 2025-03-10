package Logica;

public class NodoCancion {
    private Cancion cancion;
    private NodoCancion siguiente;

    public NodoCancion(Cancion cancion) {
        this.cancion = cancion;
        this.siguiente = null;
    }

    public Cancion getCancion() {
        return cancion;
    }

    public NodoCancion getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoCancion siguiente) {
        this.siguiente = siguiente;
    }
}