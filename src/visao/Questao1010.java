package visao;

import java.util.Scanner;

public class Questao1010 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int produto1 = sc.nextInt();
        int unitario1 = sc.nextInt();
        double preco = sc.nextDouble();
        int produto2 = sc.nextInt();
        int unitario2 = sc.nextInt();
        double preco2 = sc.nextDouble();
        double total = (unitario1 * preco) + (unitario2 * preco2);
        System.out.printf("VALOR A PAGAR: R$ %.2f\n", total);
    }
}
