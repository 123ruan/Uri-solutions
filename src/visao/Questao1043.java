package visao;

import java.util.*;

public class Questao1043 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double A = sc.nextDouble();
        double B = sc.nextDouble();
        double C = sc.nextDouble();
        if (A < B + C && B < A + C && C < A + B) {
            System.out.printf("Perimetro = %.1f\n", A + B + C);
        } else {
            double D = .5 * (A + B) * C;
            System.out.printf("Area = %.1f\n", D);
        }
    }
}
