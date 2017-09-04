package visao;

import java.util.*;

public class Questao1042 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        if (A < B && A < C) {
            if (B < C) {
                System.out.printf("%d\n%d\n%d\n", A, B, C);
            } else {
                System.out.printf("%d\n%d\n%d\n", A, C, B);
            }
        }
        if (B < A && B < C) {
            if (A < C) {
                System.out.printf("%d\n%d\n%d\n", B, A, C);
            } else {
                System.out.printf("%d\n%d\n%d\n", B, C, A);
            }
        }
        if (C < B && C < A) {
            if (B < A) {
                System.out.printf("%d\n%d\n%d\n", C, B, A);
            } else {
                System.out.printf("%d\n%d\n%d\n", C, A, B);
            }
        }
        System.out.printf("\n%d\n%d\n%d\n", A, B, C);
    }
}
