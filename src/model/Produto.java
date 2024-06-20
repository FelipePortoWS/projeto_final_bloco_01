package model;

public abstract class Produto {
	
	private String nome;
	private int classificacao;
	private float valor;
	private int descricao;
	
	public Produto(String nome, int classificacao, float valor, int descricao) {
		super();
		this.nome = nome;
		this.classificacao = classificacao;
		this.valor = valor;
		this.descricao = descricao;
	}
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getClassificacao() {
		return classificacao;
	}

	public void setClassificacao(int classificacao) {
		this.classificacao = classificacao;
	}

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}

	public int getDescricao() {
		return descricao;
	}

	public void setDescricao(int descricao) {
		this.descricao = descricao;
	}
	
}
