package visao;

import java.util.*;

public class Questao1038 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int Y = sc.nextInt();
        double A;
        switch (X) {
            case 1:
                A = Y * 4.00;
                System.out.printf("Total: R$ %.2f\n", A);
                break;
            case 2:
                A = Y * 4.50;
                System.out.printf("Total: R$ %.2f\n", A);
                break;
            case 3:
                A = Y * 5.00;
                System.out.printf("Total: R$ %.2f\n", A);
                break;
            case 4:
                A = Y * 2.00;
                System.out.printf("Total: R$ %.2f\n", A);
                break;
            case 5:
                A = Y * 1.50;
                System.out.printf("Total: R$ %.2f\n", A);
                break;
            default:
                break;
        }

    }
}
