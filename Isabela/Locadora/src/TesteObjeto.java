public class TesteObjeto {
	
	public static void main(String[] args) {
		Cliente cli = new Cliente();
		cli.nome = "Isabela";
		cli.cpf = "123";
		
		Cliente c2 = cli;

		System.out.println(c2.nome);
		System.out.println(c2.cpf);
	
	}

}
