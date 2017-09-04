package visao;

import java.util.*;

public class Questao1019 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hora = 0, minuto = 0;
        int tempo = sc.nextInt();
        while (tempo >= 60) {
            tempo = tempo - 60;
            minuto++;
        }
        while (minuto >= 60) {
            minuto = minuto - 60;
            hora++;
        }
        int segundo = tempo;
        System.out.printf("%d:%d:%d\n", hora, minuto, segundo);
    }
  }
