
public class EstudoMetodo {
			
	public static void main(String[] args) {
		
		Pessoa pessoaUm = new Pessoa();
		pessoaUm.nome = "Sophia";
		pessoaUm.idade = 3;
		String livroUm ="Patati patata";
		pessoaUm.ler(livroUm, 10);
		
		Pessoa pessoaDois = new Pessoa();
		pessoaDois.nome = "Amanda";
		pessoaDois.idade = 12;
		
		pessoaDois.ler("Quem mexeu no meu queijo", 6);
		
		String provaAlunoUm = pessoaUm.fazerProva();
		System.out.println(provaAlunoUm);
		
		Professor professorUm = new Professor();
		professorUm.corrigirProva (provaAlunoUm);
		
		String provaAlunoDois = pessoaDois.fazerProva("matematica");
		System.out.println(provaAlunoDois);
		
		professorUm.corrigirProva (provaAlunoDois);
	}	
	
}
