import java.util.Scanner;

public class Leitura {
    public static void main (String [] args) {
        //O Scanner é uma classe que permite ler dados do teclado, arquivos, etc.
        //O System.in verifica se fiz alguma entrada no teclado
        Scanner leitura = new Scanner(System.in);
        String nome;
        int idade;
        double dinheiro;

        System.out.println("Digite seu nome: ");
        //Ler a linha digitada
        nome = leitura.nextLine();

        System.out.println("Digite sua idade: ");
        //Ler o numero inteiro digitado
        idade = leitura.nextInt();

        System.out.println("Digite o preco: ");
        //Ler o numero double digitado
        dinheiro = leitura.nextDouble();

        System.out.println(nome);
        System.out.println(idade);
        System.out.println(dinheiro);

    }

}