package visao;

import java.util.*;

public class Questao1018 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int valor = sc.nextInt();
        int N = valor;
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
        int m = l;     
        System.out.printf("%d\n",N);
        System.out.printf("%d nota(s) de R$ 100,00\n", a);
        System.out.printf("%d nota(s) de R$ 50,00\n", c);
        System.out.printf("%d nota(s) de R$ 20,00\n", e);
        System.out.printf("%d nota(s) de R$ 10,00\n", g);
        System.out.printf("%d nota(s) de R$ 5,00\n", i);
        System.out.printf("%d nota(s) de R$ 2,00\n", k);
        System.out.printf("%d nota(s) de R$ 1,00\n", m);
    }
}