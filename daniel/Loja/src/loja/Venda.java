package loja;
public class Venda {

	Cliente cliente;
	Produto produto;
	Produto preco;
	int numVenda;
	
	public void comprarProduto (Produto produto) {
		System.out.println("O produto " + produto.nomeProduto + " foi vendido");
	}
	public void comprarProduto (Produto produto, Produto preco) {
		System.out.println("O produto " + produto.nomeProduto + " foi vendido por R$" + preco.preco);
	}
	public void comprarProduto (Produto produto, Cliente cliente) {
		System.out.println("O produto " + produto.nomeProduto + " foi vendido para o cliente " + cliente.nome);
	}
	public void comprarProduto (Produto produto, Cliente cliente, int numVenda) {
		System.out.println("O produto " + produto.nomeProduto + " foi vendido para o cliente " + cliente.nome + " com a nota de nº " + numVenda);
	}
}
