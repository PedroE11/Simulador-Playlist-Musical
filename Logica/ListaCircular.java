package Logica;
public class ListaCircular {
    private NodoCancion actual;

    public ListaCircular() {
        this.actual = null;
    }

    // Método para agregar una canción a la lista
    public void agregarCancion(Cancion cancion) {
        NodoCancion nuevoNodo = new NodoCancion(cancion);
        if (actual == null) {
            actual = nuevoNodo;
            actual.setSiguiente(actual); // Se apunta a sí mismo para formar el ciclo
        } else {
            NodoCancion temp = actual;
            while (temp.getSiguiente() != actual) {
                temp = temp.getSiguiente();
            }
            temp.setSiguiente(nuevoNodo);
            nuevoNodo.setSiguiente(actual);
        }
    }

    // Método para mostrar todas las canciones en la lista
    public void mostrarPlaylist() {
        if (actual == null) {
            System.out.println("La playlist está vacía.");
            return;
        }
        NodoCancion temp = actual;
        do {
            System.out.println(temp.getCancion());
            temp = temp.getSiguiente();
        } while (temp != actual);
    }

    // Método para buscar una canción por título
    public Cancion buscarCancion(String titulo) {
        if (actual == null) return null;
        NodoCancion temp = actual;
        do {
            if (temp.getCancion().getTitulo().equalsIgnoreCase(titulo)) {
                return temp.getCancion();
            }
            temp = temp.getSiguiente();
        } while (temp != actual);
        return null;
    }

    // Método para eliminar una canción por título
    public void eliminarCancion(String titulo) {
        if (actual == null) {
            System.out.println("La playlist está vacía.");
            return;
        }
        NodoCancion temp = actual;
        NodoCancion anterior = null;
        do {
            if (temp.getCancion().getTitulo().equalsIgnoreCase(titulo)) {
                if (anterior != null) {
                    anterior.setSiguiente(temp.getSiguiente());
                } else { // Si es el primer nodo
                    if (temp.getSiguiente() == actual) {
                        actual = null; // Era el único nodo
                    } else {
                        actual = temp.getSiguiente();
                        NodoCancion aux = actual;
                        while (aux.getSiguiente() != temp) {
                            aux = aux.getSiguiente();
                        }
                        aux.setSiguiente(actual);
                    }
                }
                System.out.println("Canción eliminada: " + titulo);
                return;
            }
            anterior = temp;
            temp = temp.getSiguiente();
        } while (temp != actual);
        System.out.println("Canción no encontrada: " + titulo);
    }

    // Método para verificar si la playlist está vacía
    public boolean estaVacia() {
        return actual == null;
    }
}
