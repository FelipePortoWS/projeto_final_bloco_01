package model;

public abstract class Produto {

	private int numero;
	private String nome;
	private String classificacao;
	private float valor;
	private String descricao;
	
	public Produto(int numero, String nome, String classificacao, float valor, String descricaoProduto) {
		super();
		this.nome = nome;
		this.classificacao = classificacao;
		this.valor = valor;
		this.descricao = descricaoProduto;
	}	
	
	public void visualizar() {
	System.out.println("\n\n***********************************************************");
			System.out.println("Dados do produto:");
			System.out.println("***********************************************************");
			System.out.println("Numero do produto: " + this.numero);
			System.out.println("Nome do produto: " + this.nome);
			System.out.println("Classificação do produto: " + this.classificacao);
			System.out.println("Valor: " + this.valor);
			System.out.println("Descrição: " + this.descricao);
		}
		
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getClassificacao() {
		return classificacao;
	}

	public void setClassificacao(String classificacao) {
		this.classificacao = classificacao;
	}

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getNumero() {
		return numero;
	}
	
}
