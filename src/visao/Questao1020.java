package visao;

import java.util.*;

public class Questao1020 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ano = 0, mes = 0;
        int tempo = sc.nextInt();
        while (tempo >= 365) {
            tempo = tempo - 365;
            ano++;
        }
        while (tempo >= 30) {
            tempo = tempo - 30;
            mes++;
        }
        int dias = tempo;
        System.out.printf("%d ano(s)\n%d mes(es)\n%d dia(s)\n", ano, mes, dias);
    }    
}