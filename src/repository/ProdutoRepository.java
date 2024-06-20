package repository;

import model.Produto;

public interface ProdutoRepository {

	public void BuscarProduto(int numero);
	public void ListarProduto();
	public void VerificarCarrinho();
	public void RegistrarProduto(Produto Produto);
	public void AtualizarProduto(Produto produto);
	public void DeletarProduto(int numero);
	
}
