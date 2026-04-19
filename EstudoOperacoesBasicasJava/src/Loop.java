import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        int [] numeros = {1,2,3,4,5};
        int soma = 0;
        double media;

        for (int i = 0; i < numeros.length ; i++) {
            soma += numeros[i];
        }
        media = (double) soma / numeros.length;

        System.out.println("A media de valores descritos foi " + media);
    }
}