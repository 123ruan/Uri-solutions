package visao;

import java.util.Scanner;

public class Questao1007 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c, d, menos;
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        d = sc.nextInt();
        menos = a * b - c * d;
        System.out.print("DIFERENCA = " + menos + "\n");
    }
}
