public class Caixa {
	public static void main(String[] args) {
		Venda v1 = new Venda();

		Cliente c1 = new Cliente();
		c1.nome = "Daniel";

		Produto p1 = new Produto();
		p1.nomeProduto = "Notebook";

		v1.cliente = c1;
		v1.produto = p1;

		v1.comprarProduto(p1);
		v1.comprarProduto(p1, c1);
		v1.comprarProduto(p1, c1, 123);
		
		Venda v2 = new Venda();
		Cliente c2 = new Cliente();
		c2.nome = "Carol";
		v2.cliente = c2;
		v2.produto = p1;
		
		v2.comprarProduto(p1,c2);
		v2.comprarProduto(p1,c2, 456);
		
		Venda v3 = new Venda();
		Produto p2 = new Produto();
		p2.nomeProduto = "Impressora";
		v3.produto = p2;
		v3.cliente = c1;
		v3.comprarProduto(p2,c1,789);
		
		
		
		
		
		
		

	}
}
