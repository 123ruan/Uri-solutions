package visao;

import java.util.*;

public class Questao1014 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int distancia = sc.nextInt();
        double tudo = sc.nextDouble();
        double media = distancia / tudo;
        System.out.printf("%.3f km/l\n", media);
    }
}
