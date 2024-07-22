import java.lang.reflect.Array;


abstract class Arranjo<T extends Comparable<T>> {
    protected T[] elements;
    protected int size;
    private Class<T> type;

    public Arranjo(Class<T> type, int capacity) {
        this.type = type;
        this.elements = (T[]) Array.newInstance(type, capacity);
        this.size = 0;
    }

    public void inserir(T value) {
        if (size < elements.length) {
            elements[size++] = value;
        } else {
            System.out.println("Capacidade máxima atingida.");
        }
    }

    public void listar() {
        for (int i = 0; i < size; i++) {
            System.out.print(elements[i] + " ");
        }
        System.out.println();
    }

    public void remover(T value) {
        int index = -1;
        for (int i = 0; i < size; i++) {
            if (elements[i].equals(value)) {
                index = i;
                break;
            }
        }

        if (index != -1) {
            for (int i = index; i < size - 1; i++) {
                elements[i] = elements[i + 1];
            }
            elements[--size] = null;
        } else {
            System.out.println("Elemento não encontrado.");
        }
    }

    public abstract void classificar();
}
