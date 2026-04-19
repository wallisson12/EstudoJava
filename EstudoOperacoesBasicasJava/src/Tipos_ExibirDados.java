public class Tipos_ExibirDados {
    //Funcao principal do sistema, onde tudo vai comecar
    public static void main(String[] args) {

        ///// Variaveis /////
        int ano = 2022;
        float numeroQualquer = 3.223f;
        String nome = "Wallisson de jesus campos";
        boolean coisa = false;
        int[] numeros = new int[5];

        //Isso é text blocks
        String aa = """
                Testando %s a questao da interpolacao
                teste legal
                """.formatted(nome);

        numeros[0] =2;

        //// Exibir conteudo no terminal ////
        System.out.println(numeros[0]);
        System.out.println();
        System.out.println(ano);
        System.out.println(numeroQualquer);
        System.out.println(nome);
        System.out.println(aa);
        System.out.println(calcularMedia(10,3));

        //Uma forma de interpolar a string com variaveis
        System.out.println(String.format("Meu nome eh %s e eu tenho R$: %.2f",nome,numeroQualquer));

        //////Conversao/////

        int n1 = (int) 1.2;
        System.out.println(n1);

    }

    /**
     * Funcao para calcular a meida de duas notas
     * @return double
     */
    public static double calcularMedia(double v1,double v2){
        return (v1 + v2)/2;
    }
}