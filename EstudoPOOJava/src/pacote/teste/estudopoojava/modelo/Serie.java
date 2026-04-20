package pacote.teste.estudopoojava.modelo;

public class Serie extends Titulo implements ClassificacaoInterface {

	private int temporadas;

	/**
	 * Construtor
	 *
	 * @param nome
	 * @param genero
	 * @param duracaoEmMinutos
	 */
	public Serie(String nome, String genero, int duracaoEmMinutos,int temporadas) {
		super(nome, genero, duracaoEmMinutos);
		this.temporadas = temporadas;
	}

	/**
	 *  Retorna o numero de temporadas
	 *
	 * @return int
	 */
	public int getTemporadas() {
		return temporadas;
	}

	/**
	 * Define o numero de temporadas
	 *
	 * @param temporadas
	 */
	public void setTemporadas(int temporadas) {
		this.temporadas = temporadas;
	}

	//Essa marcacao indica que esse metodo esta sendo sobreescrito
	@Override
	public int getDuracaoEmMinutos() {
		return this.temporadas * 4;
	}

	/**
	 * Exibe a classificacao da serie
	 */
	@Override
	public void exibirClassificacao() {
		System.out.println("Classificação da série: " + this.getNome() + " é para maiores de 16 anos.");
	}
}
