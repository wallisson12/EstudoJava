package pacote.teste.estudopoojava.principal;

import pacote.teste.estudopoojava.modelo.ClassificacaoInterface;
import pacote.teste.estudopoojava.modelo.Filme;
import pacote.teste.estudopoojava.modelo.Serie;
import pacote.teste.estudopoojava.modelo.Titulo;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Filme filme1 = new Filme("O Poderoso Chefão", "Crime", 175,"Um cara ai");
        Filme filme2 = new Filme("A Origem", "Ficção Científica", 148,"Outro cara ai");
        Serie serie1 = new Serie("Breaking Bad", "Drama", 47, 5);

        System.out.println("Filme 1:");
        System.out.println("Nome: " + filme1.getNome());
        System.out.println("Gênero: " + filme1.getGenero());
        System.out.println("Duração: " + filme1.getDuracaoEmMinutos() + " minutos");

        System.out.println("\nFilme 2:");
        System.out.println("Nome: " + filme2.getNome());
        System.out.println("Gênero: " + filme2.getGenero());
        System.out.println("Duração: " + filme2.getDuracaoEmMinutos() + " minutos");

        System.out.println("\nSerie 1: ");
        System.out.println("Nome: " + serie1.getNome());
        System.out.println("Gênero: " + serie1.getGenero());
        System.out.println("Duração: " + serie1.getDuracaoEmMinutos() + " minutos");
        System.out.println("Temporadas: " + serie1.getTemporadas());

        ClassificacaoInterface classificacaoFilme1 = filme1;
        ClassificacaoInterface classificacaoSerie1 = serie1;

        System.out.println("\nClassificação:");
        classificacaoFilme1.exibirClassificacao();
        classificacaoSerie1.exibirClassificacao();

        //Lista de objetos
        ArrayList<Filme> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(filme1);
        listaDeFilmes.add(filme2);

        //For para listas
        for(Filme filme : listaDeFilmes){
            System.out.println("\nFilme: " + filme.getNome());
        }

    }
}
