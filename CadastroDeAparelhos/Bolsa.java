import java.util.ArrayList;

public class Bolsa {
    private ArrayList<Eletronico> eletronicos;

    public Bolsa() {
        this.eletronicos = new ArrayList<>();
    }

    public void inserirEletronico(Eletronico eletronico) {
        eletronicos.add(eletronico);
        System.out.println("Eletrônico inserido na bolsa: " + eletronico);
    }
}
