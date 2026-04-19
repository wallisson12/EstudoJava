import java.util.Scanner;

public class SistemaContaBancaria {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        String nome = "Wallisson de jesus campos";
        String tipoConta = "Corrente";
        double saldoDaConta = 2500;
        String opcaoEscolhida = "0";

        System.out.println("Bem vindo ao sistema de conta bancaria");
        System.out.println("****** MENU ********");
        System.out.println("Dados do cliente: ");
        System.out.println();

        System.out.println("Nome: " + nome);
        System.out.println("Tipo conta: " + tipoConta);
        System.out.println("Saldo: R$ " + saldoDaConta);

        System.out.println();
        System.out.println();

        while (!opcaoEscolhida.equals("4")) {
            System.out.println();
            System.out.println("****** OPERACOES ********");
            System.out.println();

            System.out.println("1 - Consultar Saldo");
            System.out.println("2 - Receber Valor");
            System.out.println("3 - Transferir Valor");
            System.out.println("4 - Sair");

            System.out.println("Digite a opcao desejada: ");
            opcaoEscolhida = leitura.nextLine();

            switch (opcaoEscolhida){
                case "1":
                    consultarSaldo(saldoDaConta);
                    break;
                case "2":
                    saldoDaConta = receberValor(leitura,saldoDaConta);
                    break;

                case "3":
                    saldoDaConta = transferirValor(leitura,saldoDaConta);
                    break;

                case "4":
                    System.out.println("Saindo do sistema...");
                    break;

                default:
                    System.out.println("Opcao invalida");
            }
        }
    }

    public static void consultarSaldo(double saldoAtual){
        System.out.println("Seu saldo atual eh de: R$ " + saldoAtual);
    }

    public static double receberValor(Scanner leitura,double saldoAtual){
        double valor = 0;
        double saldoAtualizado = saldoAtual;
        System.out.println("Digite o valor a ser recebido: ");
        valor = leitura.nextDouble();
        leitura.nextLine();
        if(valor < 0){
            System.out.println("Nao eh possivel receber um valor negativo");
            return saldoAtual;
        }
        saldoAtualizado += valor;
        System.out.println("Valor recebido com sucesso! Seu novo saldo eh de: R$ " + saldoAtualizado);
        return saldoAtualizado;
    }

    public static double transferirValor(Scanner leitura,double saldoAtual){
        double valor = 0;
        double saldoAtualizado = saldoAtual;

        System.out.println("Digite o valor da transferencia");
        valor = leitura.nextDouble();
        leitura.nextLine();

        if(valor > saldoAtual){
            System.out.println("Não há saldo suficiente para realizar essa transferência");
            return saldoAtual;
        }

        if(valor < 0){
            System.out.println("Nao eh possivel receber um valor negativo");
            return saldoAtual;
        }

        saldoAtualizado -= valor;
        System.out.println("Valor transferido com sucesso! Seu novo saldo eh de: R$ " + saldoAtualizado);
        return saldoAtualizado;
    }
}