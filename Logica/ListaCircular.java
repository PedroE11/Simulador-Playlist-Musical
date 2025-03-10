package Logica;

public class ListaCircular {
    private NodoCancion cabeza;
    private int tamaño;

    public ListaCircular() {
        this.cabeza = null;
        this.tamaño = 0;
    }

    public boolean estaVacia() {
        return cabeza == null;
    }

    public void agregarCancion(Cancion nuevaCancion) {
        NodoCancion nuevoNodo = new NodoCancion(nuevaCancion);
        if (estaVacia()) {
            cabeza = nuevoNodo;
            cabeza.setSiguiente(cabeza);
        } else {
            NodoCancion actual = cabeza;
            while (actual.getSiguiente() != cabeza) {
                actual = actual.getSiguiente();
            }
            actual.setSiguiente(nuevoNodo);
            nuevoNodo.setSiguiente(cabeza);
        }
        tamaño++;
    }

    public Cancion obtenerPrimeraCancion() {
        return estaVacia() ? null : cabeza.getCancion();
    }

    public Cancion obtenerSiguienteCancion(Cancion actual) {
        if (estaVacia()) return null;
        NodoCancion nodoActual = cabeza;
        do {
            if (nodoActual.getCancion().equals(actual)) {
                return nodoActual.getSiguiente().getCancion();
            }
            nodoActual = nodoActual.getSiguiente();
        } while (nodoActual != cabeza);
        return null;
    }

    public void eliminarCancion(String titulo) {
        if (estaVacia()) return;
        NodoCancion actual = cabeza;
        NodoCancion previo = null;
        do {
            if (actual.getCancion().getTitulo().equalsIgnoreCase(titulo)) {
                if (previo != null) {
                    previo.setSiguiente(actual.getSiguiente());
                } else {
                    cabeza = actual.getSiguiente();
                }
                tamaño--;
                return;
            }
            previo = actual;
            actual = actual.getSiguiente();
        } while (actual != cabeza);
    }

    public Cancion buscarCancion(String titulo) {
        if (estaVacia()) return null;
        NodoCancion actual = cabeza;
        do {
            if (actual.getCancion().getTitulo().equalsIgnoreCase(titulo)) {
                return actual.getCancion();
            }
            actual = actual.getSiguiente();
        } while (actual != cabeza);
        return null;
    }

    public void mostrarPlaylist() {
        if (estaVacia()) {
            System.out.println("La playlist está vacía.");
            return;
        }
        NodoCancion actual = cabeza;
        do {
            System.out.println(actual.getCancion());
            actual = actual.getSiguiente();
        } while (actual != cabeza);
    }

    public int tamaño() {
        return tamaño;
    }

    public void reiniciarLista() {
        cabeza = null;
        tamaño = 0;
    }
}
