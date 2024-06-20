package model;
import model.Produto;

public class ProdutoHortifruti extends Produto {

	private int diasPosColheita;
	
	public ProdutoHortifruti(int numero, String nome, String classificacao, float valor, String descricaoProduto) {
		super(numero, nome, classificacao, valor, descricaoProduto);

	}

	public int getDiasPosColheita() {
		return diasPosColheita;
	}

	public void setDiasPosColheita(int diasPosColheita) {
		this.diasPosColheita = diasPosColheita;
	}

	public boolean VerificarEstado(int diasPosColheita) {
		if(diasPosColheita > 8) {
			return false;
		}else {
			return true;
		}

		
	}
	
}
