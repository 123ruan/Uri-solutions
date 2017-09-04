package visao;

import java.util.Scanner;

public class Questao1021 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double E;
        double valor = sc.nextDouble();
        double B;
        double N = valor;
        int a = (int) (N / 100);
        int b = (int) (N % 100);
        int c = b / 50;
        int d = b % 50;
        int e = d / 20;
        int f = d % 20;
        int g = f / 10;
        int h = f % 10;
        int i = h / 5;
        int j = h % 5;
        int k = j / 2;
        int l = j % 2;
        E = valor * 100;
        B = (int) E;
        int m = (int) (B % 100);
        int n = m / 50;
        int o = m % 50;
        int p = o / 25;
        int q = o % 25;
        int r = q / 10;
        int s = q % 10;
        int t = s / 5;
        int u = s % 5;
        System.out.printf("NOTAS:\n");
        System.out.printf("%d nota(s) de R$ 100.00\n", a);
        System.out.printf("%d nota(s) de R$ 50.00\n", c);
        System.out.printf("%d nota(s) de R$ 20.00\n", e);
        System.out.printf("%d nota(s) de R$ 10.00\n", g);
        System.out.printf("%d nota(s) de R$ 5.00\n", i);
        System.out.printf("%d nota(s) de R$ 2.00\n", k);
        System.out.printf("MOEDAS:\n");
        System.out.printf("%d moeda(s) de R$ 1.00\n", l);
        System.out.printf("%d moeda(s) de R$ 0.50\n", n);
        System.out.printf("%d moeda(s) de R$ 0.25\n", p);
        System.out.printf("%d moeda(s) de R$ 0.10\n", r);
        System.out.printf("%d moeda(s) de R$ 0.05\n", t);
        System.out.printf("%d moeda(s) de R$ 0.01\n", u);

    }
}
