package com.example.diosesfx;

public class ListaDoble<T> {

    Nodo<T> inicio;

    public void insertaInicio(T dato) {
        Nodo<T> n = new Nodo<>();

        n.setInfo(dato);
        n.setSig(inicio);
        n.setAnt(null);

        if (inicio != null)
            inicio.setAnt(n);

        inicio = n;
    }

    public void insertaFin(T dato) {
        Nodo<T> nodo = new Nodo<>();

        nodo.setInfo(dato);
        nodo.setSig(null);

        if (inicio == null) {
            nodo.setAnt(inicio);
            inicio = nodo;
        } else {
            Nodo<T> r = inicio;

            while (r.getSig() != null)
                r = r.getSig();

            r.setSig(nodo);
            nodo.setAnt(r);
        }
    }

    public T eliminaInicio() {
        Nodo<T> nodo = inicio;

        if (inicio == null) {
            return null;
        } else if (inicio.getSig() == null) {
            inicio = null;
        } else {
            inicio = inicio.getSig();
            inicio.setAnt(null);
        }

        return nodo.getInfo();
    }

    
}
