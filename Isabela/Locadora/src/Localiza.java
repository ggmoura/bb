public class Localiza {

	public static void main(String[] args) {

		Locacao aluguel = new Locacao();
		Cliente cli = new Cliente();// nesse momento eu aloquei um espa�o na
									// mem�ria para as vari�veis do objeto
									// cliente
		Veiculo veiculo = new Veiculo();

		cli.nome = "Jo�o";

		veiculo.nomeVeiculo = "Uno";
		aluguel.valor = 1000.00;

		aluguel.cliente = cli; // cli contem todas as informa��es das vari�veis
								// de cliente (nome, cpf), nesse momento estou
								// apontando cli para o mesmo espa�o de mem�ria
								// do objeto Cliente l� do coment�rio de cima do
								// new
		aluguel.veiculo = veiculo;
		aluguel.cliente.cpf = "11111";

		System.out.println(aluguel.cliente.nome); // imprimir
													// 'aluguel.cliente.nome' �
													// a mesma coisa de imprimir
													// 'cli.nome
		System.out.println(cli.cpf);

		cli = new Cliente(); // aqui estou alocando um novo espa�o de mem�ria
								// vazio que n�o contem as informa��es
								// anteriores que est�o no espa�o de memoria l�
								// de cima
		cli.nome = "teste";
		System.out.println(aluguel.cliente.nome);// aqui vai continuar
													// imprimindo o nome de Jo�o
													// pois � o mesmo espa�o de
													// memoria de
													// 'aluguel.cliente = cli'

		System.out.println(cli.nome);// aqui vai imprimir 'teste', que � o
										// conte�do do novo espa�o de mem�ria de
										// 'cli = new Cliente();'

	}
}
