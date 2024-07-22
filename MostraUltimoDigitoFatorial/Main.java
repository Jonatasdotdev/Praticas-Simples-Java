import java.util.Scanner;

public class Main {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Digite o numero");
    int n = sc.nextInt();

    if(n<0){
        System.out.println("Digitar um numero positivo!");
    }else{
        long fatorial = calculodefatorial(n);
        System.out.println(fatorial);

    }}

public static long calculodefatorial(int n){
    long fatorial = 1;
    for(int i=1;i<=n;i++){
        fatorial *= i;
    }
    return (int) (fatorial % 10);
}
}

