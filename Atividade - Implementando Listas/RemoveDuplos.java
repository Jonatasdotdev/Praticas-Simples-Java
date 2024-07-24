import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class RemoveDuplos {
    private Lista listaPrincipal;
    private ArrayList<Object> elementosUnicos;
    private ArrayList<Object> elementosDuplicados;

    public RemoveDuplos() {
        listaPrincipal = new Lista();
        elementosUnicos = new ArrayList<>();
        elementosDuplicados = new ArrayList<>();
    }

    public void adicionarElemento(Object elemento) {
        listaPrincipal.adicionarElemento(elemento);
    }


    public void removerDuplicados() {
        Set<Object> elementosVistos = new HashSet<>();
        LinkedList<Object> elementos = listaPrincipal.obterElementos();

        for (Object elemento : elementos) {
            if (elementosVistos.contains(elemento)) {
                if (!elementosDuplicados.contains(elemento)) {
                    elementosDuplicados.add(elemento);
                }
            } else {
                elementosUnicos.add(elemento);
                elementosVistos.add(elemento);
            }
        }
    }

    public void imprimirResultados() {
        System.out.print("Resultado (Lista 1): ");
        for (Object elemento : elementosUnicos) {
            System.out.print(elemento + " ");
        }
        System.out.println();

        System.out.print("Filtrados (Lista 2): ");
        for (Object elemento : elementosDuplicados) {
            System.out.print(elemento + " ");
        }
        System.out.println();
    }
}
