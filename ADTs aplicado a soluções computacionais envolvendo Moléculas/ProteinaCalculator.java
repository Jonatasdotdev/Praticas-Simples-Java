
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class ProteinaCalculator {

    private static final Map<Character, Double> aminoAcidMasses = new HashMap<>();

    static {

        aminoAcidMasses.put('A', 71.03711);
        aminoAcidMasses.put('C', 103.00919);
        aminoAcidMasses.put('D', 115.02694);
        aminoAcidMasses.put('E', 129.04259);
        aminoAcidMasses.put('F', 147.06841);
        aminoAcidMasses.put('G', 57.02146);
        aminoAcidMasses.put('H', 137.05891);
        aminoAcidMasses.put('I', 113.08406);
        aminoAcidMasses.put('K', 128.09496);
        aminoAcidMasses.put('L', 113.08406);
        aminoAcidMasses.put('M', 131.04049);
        aminoAcidMasses.put('N', 114.04293);
        aminoAcidMasses.put('P', 97.05276);
        aminoAcidMasses.put('Q', 128.05858);
        aminoAcidMasses.put('R', 156.10111);
        aminoAcidMasses.put('S', 87.03203);
        aminoAcidMasses.put('T', 101.04768);
        aminoAcidMasses.put('V', 99.06841);
        aminoAcidMasses.put('W', 186.07931);
        aminoAcidMasses.put('Y', 163.06333);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do arquivo que contém a sequência da proteína:");
        String filename = scanner.nextLine();

        // Calcula a massa da proteína usando Stack
        try {
            double totalMassStack = calculateProteinMassUsingStack(filename);
            System.out.printf("Massa total da proteína (usando Stack): %.3f%n", totalMassStack);
        } catch (IOException e) {
            System.err.println("Erro ao ler o arquivo: " + e.getMessage());
        }

        // Calcula a massa da proteína usando Queue
        try {
            double totalMassQueue = calculateProteinMassUsingQueue(filename);
            System.out.printf("Massa total da proteína (usando Queue): %.3f%n", totalMassQueue);
        } catch (IOException e) {
            System.err.println("Erro ao ler o arquivo: " + e.getMessage());
        }

        scanner.close();
    }

    /**
     * Calcula a massa total da proteína usando a estrutura de dados Stack.
     *
     * @param filename Nome do arquivo que contém a sequência da proteína.
     * @return Massa total da proteína.
     * @throws IOException Se ocorrer um erro ao ler o arquivo.
     */
    private static double calculateProteinMassUsingStack(String filename) throws IOException {
        Stack<Character> stack = new Stack<>();
        double totalMass = 0.0;

        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                for (char aminoAcid : line.toCharArray()) {
                    if (aminoAcidMasses.containsKey(aminoAcid)) {
                        stack.push(aminoAcid);
                    } else {
                        System.err.printf("Aminoácido inválido encontrado: %c%n", aminoAcid);
                        return 0.0;
                    }
                }
            }
        }

        while (!stack.isEmpty()) {
            char aminoAcid = stack.pop();
            totalMass += aminoAcidMasses.get(aminoAcid);
        }

        return totalMass;
    }

    /**
     * Calcula a massa total da proteína usando a estrutura de dados Queue.
     *
     * @param filename Nome do arquivo que contém a sequência da proteína.
     * @return Massa total da proteína.
     * @throws IOException Se ocorrer um erro ao ler o arquivo.
     */
    private static double calculateProteinMassUsingQueue(String filename) throws IOException {
        Queue<Character> queue = new LinkedList<>();
        double totalMass = 0.0;

        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                for (char aminoAcid : line.toCharArray()) {
                    if (aminoAcidMasses.containsKey(aminoAcid)) {
                        queue.add(aminoAcid);
                    } else {
                        System.err.printf("Aminoácido inválido encontrado: %c%n", aminoAcid);
                        return 0.0;
                    }
                }
            }
        }

        while (!queue.isEmpty()) {
            char aminoAcid = queue.poll();
            totalMass += aminoAcidMasses.get(aminoAcid);
        }

        return totalMass;
    }
}
