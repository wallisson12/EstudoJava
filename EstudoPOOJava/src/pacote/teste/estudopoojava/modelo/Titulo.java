package pacote.teste.estudopoojava.modelo;

public class Titulo {

	private String nome;
	private String genero;
	private int duracaoEmMinutos;

	/**
	 * Construtor
	 *
	 * @param nome
	 * @param genero
	 * @param duracaoEmMinutos
	 */
	public Titulo(String nome, String genero, int duracaoEmMinutos) {
		this.nome = nome;
		this.genero = genero;
		this.duracaoEmMinutos = duracaoEmMinutos;
	}


	/**
	 * Retorna o nome
	 *
	 * @return String
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * Define o nome
	 *
	 * @param nome
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * Retorna o genero
	 *
	 * @return String
	 */
	public String getGenero() {
		return genero;
	}

	/**
	 * Define o genero
	 *
	 * @param genero
	 */
	public void setGenero(String genero) {
		this.genero = genero;
	}

	/**
	 * Retorna a duracao em minutos
	 *
	 * @return int
	 */
	public int getDuracaoEmMinutos() {
		return duracaoEmMinutos;
	}

	/**
	 * Define a duracao em minutos
	 *
	 * @param duracaoEmMinutos
	 */
	public void setDuracaoEmMinutos(int duracaoEmMinutos) {
		this.duracaoEmMinutos = duracaoEmMinutos;
	}
}
