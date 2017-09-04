package visao;

import java.util.*;

public class Questao1040_ {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double N1 = sc.nextDouble();
        double N2 = sc.nextDouble();
        double N3 = sc.nextDouble();
        double N4 = sc.nextDouble();
        double a = ((N1 * 2) + (N2 * 3) + (N3 * 4) + N4) / 10;
        System.out.printf("Media: %.1f\n", a);
        if (a >= 7) {
            System.out.println("Aluno aprovado.");
        } else if (a < 5) {
            System.out.println("Aluno reprovado.");
        } else if (a >= 5 && a <= 6.9) {
            System.out.println("Aluno em exame.");
            double N5 = sc.nextDouble();
            System.out.printf("Nota do exame: %.1f\n", N5);
            double b = (N5 + a) / 2;
            if (b >= 5) {
                System.out.println("Aluno aprovado.");
            } else if (b <= 4.9) {
                System.out.println("Aluno reprovado.");
            }
            System.out.printf("Media final: %.1f\n", b);

        }
    }
}
