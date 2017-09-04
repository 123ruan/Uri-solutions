package visao;

import java.util.*;

public class Questao1017 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tempo = sc.nextInt();
        int velocidade = sc.nextInt();
        double tudo = (tempo * velocidade) / 12.0;
        System.out.printf("%.3f\n", tudo);
    }
}
