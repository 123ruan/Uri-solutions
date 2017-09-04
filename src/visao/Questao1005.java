package visao;

import java.util.Scanner;

public class Questao1005 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        float med = (float) (((a * 3.5) + (b * 7.5)) / (3.5 + 7.5));
        String media = String.format("MEDIA = %,.5f", med);
        System.out.print(media + "\n");
    }
}
