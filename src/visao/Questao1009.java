package visao;

import java.util.Scanner;

public class Questao1009 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        double salario = sc.nextDouble();
        double des = sc.nextDouble();
        double total = ((des * 15) / 100) + salario;
        System.out.printf("TOTAL = R$ %.2f\n", total);
    }
}
