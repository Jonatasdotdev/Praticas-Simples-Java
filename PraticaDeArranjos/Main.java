public class Main {
    public static void main(String[] args) {

        IntArranjo intArranjo = new IntArranjo(10);
        intArranjo.inserir(3);
        intArranjo.inserir(1);
        intArranjo.inserir(4);
        intArranjo.inserir(1);
        intArranjo.inserir(5);

        System.out.println("Lista de inteiros antes da classificação:");
        intArranjo.listar();

        intArranjo.classificar();

        System.out.println("Lista de inteiros depois da classificação:");
        intArranjo.listar();


        CharArranjo charArranjo = new CharArranjo(10);
        charArranjo.inserir('n');
        charArranjo.inserir('v');
        charArranjo.inserir('d');
        charArranjo.inserir('a');

        System.out.println("Lista de caracteres antes da classificação:");
        charArranjo.listar();

        charArranjo.classificar();

        System.out.println("Lista de caracteres depois da classificação:");
        charArranjo.listar();
    }
}
