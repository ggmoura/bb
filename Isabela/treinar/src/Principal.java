
public class Principal {
	
	public static void main(String[] args) {
		Pessoa aluno = null;
		
		System.out.println("Aluno ainda não eh um objeto");
		
		//new é um operador de criação de um objeto.
		aluno = new Pessoa();
		
		System.out.println("Aluno já eh um objeto");
		
		byte idadePessoa = aluno.idade;
		System.out.println("idade antes de atualizar: " + idadePessoa);
		
		aluno.idade = 35;
		
		System.out.println("idade antes de atualizar: " + idadePessoa);
		System.out.println("idade antes de atualizar: " + aluno.idade);
	}
}
