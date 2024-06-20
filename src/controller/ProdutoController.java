package controller;

import java.util.ArrayList;

import model.Produto;
import repository.ProdutoRepository;

public class ProdutoController implements ProdutoRepository{
	
	public int numero = 0;
	
	private ArrayList<Produto> listaProdutos= new ArrayList<Produto>();
		
	@Override
	public void BuscarProduto(int numero) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void ListarProduto() {
		for (var produto : listaProdutos) {
			produto.visualizar();
		}
		
	}
	@Override
	public void VerificarCarrinho() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void RegistrarProduto(Produto Produto) {
		listaProdutos.add(Produto);
		
	}
	@Override
	public void AtualizarProduto(Produto produto) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void DeletarProduto(int numero) {
		// TODO Auto-generated method stub
		
	}
	
	public int gerarNumero(){
		return ++numero;
	}
	public Produto buscarNaColletion(int numero) {
		for (var produto: listaProdutos) {
			if(produto.getNumero()==numero) {
				return produto;
			}
		}
		return null;
	}
}
