package desafio.dominio;

//abstract significa que nao consegue instanciar o conteudo
public abstract class Conteudo {
	
	//final significa constante. Só os filhos da classe
	//terao acesso a protected
	protected static final double XP_PADRAO = 10d;
	
	private String titulo;
	private String descricao;
	
	public abstract double calcularXp();

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	

}
