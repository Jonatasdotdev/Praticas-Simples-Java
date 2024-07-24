import java.util.LinkedList;

public class Lista {
    private LinkedList<Object> lista;

    public Lista() {
        lista = new LinkedList<>();
    }

    public void adicionarElemento(Object elemento) {
        lista.add(elemento);
    }

    public LinkedList<Object> obterElementos() {
        return lista;
    }

    public void imprimirLista() {
        System.out.print("Lista: ");
        for (Object elemento : lista) {
            System.out.print(elemento + " ");
        }
        System.out.println();
    }
}
