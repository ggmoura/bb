public class EstudoMetodo {

	public static void main(String[] args) {

		Pessoa pessoaUm = new Pessoa();// Objeto
		pessoaUm.nome = "Sophia";// atribuir valores ao objeto
		pessoaUm.idade = 3;// atribuir valores ao objeto
		String livroUm = " Assassinato no Rio Nilo ";
		pessoaUm.ler(livroUm, 10);// Chamando a funcionalidade na classe Pessoa

		Pessoa pessoaDois = new Pessoa();// Objeto
		pessoaDois.nome = "Amanda";// atribuir valores ao objeto
		pessoaDois.idade = 12;// atribuir valores ao objeto
		pessoaDois.ler("Quem mexeu no meu queijo", 7);
		
		String provaAlunoDois = pessoaDois.fazerProva("Matemática");
		System.out.println(provaAlunoDois);
		
		String provaAlunoTres = pessoaDois.fazerProva("Java",30);
		System.out.println(provaAlunoTres);
		
		Professor professorUm = new Professor();
		professorUm.corrigirProva(provaAlunoDois, pessoaDois);
		
	}

}
