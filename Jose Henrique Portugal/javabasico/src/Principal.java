
public class Principal {

	public static void main(String[] args) {
		Pessoa aluno = null;
		aluno = new Pessoa();
		System.out.println(aluno);
		
		byte idadePessoa = aluno.idade;
		System.out.println("Idade antes de atualizar " +idadePessoa);
		aluno.idade = 35;
		System.out.println("Idade depois de atualizar" + idadePessoa);
		System.out.println("Idade depois de atualizar no proprio aluno " + aluno.idade);
		
	}
	
}
