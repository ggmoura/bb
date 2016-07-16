
public class PrimeiraClasse {

	public static void main(String[] args) {
		Funcionario gerente = null;
		Funcionario supervisor = null;
		System.out.println("gerente e supervisor ainda nao sao objetos");
		
		gerente = new Funcionario ();
		supervisor = new Funcionario ();
		
		System.out.println("gerente e supervisor agora sao objetos");
		
		gerente.salario = 3890.99F;
		supervisor.salario = 1890.97F;
		
		gerente.diaPagamento = 15;
		supervisor.diaPagamento = 30;
		
		System.out.println("O salário do Gerente é: R$" + gerente.salario);
		System.out.println("O salário do Supervisor é R$:" + supervisor.salario);
		System.out.println("O Dia de Pagamento do Gerente é dia :" + gerente.diaPagamento);
		System.out.println("O Dia de Pagamento do Supervisor é dia :" + supervisor.diaPagamento);
		

		
	}
	
}
