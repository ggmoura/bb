public class Localiza {

	public static void main(String[] args) {

		Locacao aluguel = new Locacao();
		Cliente cli = new Cliente();// nesse momento eu aloquei um espaço na
									// memória para as variáveis do objeto
									// cliente
		Veiculo veiculo = new Veiculo();

		cli.nome = "João";

		veiculo.nomeVeiculo = "Uno";
		aluguel.valor = 1000.00;

		aluguel.cliente = cli; // cli contem todas as informações das variáveis
								// de cliente (nome, cpf), nesse momento estou
								// apontando cli para o mesmo espaço de memória
								// do objeto Cliente lá do comentário de cima do
								// new
		aluguel.veiculo = veiculo;
		aluguel.cliente.cpf = "11111";

		System.out.println(aluguel.cliente.nome); // imprimir
													// 'aluguel.cliente.nome' é
													// a mesma coisa de imprimir
													// 'cli.nome
		System.out.println(cli.cpf);

		cli = new Cliente(); // aqui estou alocando um novo espaço de memória
								// vazio que não contem as informações
								// anteriores que estão no espaço de memoria lá
								// de cima
		cli.nome = "teste";
		System.out.println(aluguel.cliente.nome);// aqui vai continuar
													// imprimindo o nome de João
													// pois é o mesmo espaço de
													// memoria de
													// 'aluguel.cliente = cli'

		System.out.println(cli.nome);// aqui vai imprimir 'teste', que é o
										// conteúdo do novo espaço de memória de
										// 'cli = new Cliente();'

	}
}
