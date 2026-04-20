//Serve para organizar o diretorio, separando em pacotes, e para evitar conflitos de nomes entre classes.
package pacote.teste.estudopoojava.modelo;

/**
 * Classe pacote.teste.estudopoojava.modelo.Filme
 */
public class Filme extends Titulo implements ClassificacaoInterface {

	private String diretor;

	/**
	 * Construtor
	 *
	 * @param nome
	 * @param genero
	 * @param duracaoEmMinutos
	 */
	public Filme(String nome, String genero, int duracaoEmMinutos, String diretor) {
		//Chamando o construtor da classe pai
		super(nome, genero, duracaoEmMinutos);
		this.diretor = diretor;
	}

	/**
	 * Retorna o diretor
	 *
	 * @return String
	 */
	public String getDiretor() {
		return diretor;
	}

	/**
	 * Define o diretor
	 *
	 * @param diretor
	 */
	public void setDiretor(String diretor) {
		this.diretor = diretor;
	}

	/**
	 * Exibe a classificacao do filme
	 */
	@Override
	public void exibirClassificacao() {
		System.out.println("Classificação do filme: " + this.getNome() + " é para maiores de 18 anos.");
	}
}
