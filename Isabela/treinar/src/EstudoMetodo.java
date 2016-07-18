public class EstudoMetodo {

	public static void main(String[] args) {

		Pessoa pessoaUm = new Pessoa(); // pessoaUm é um Objeto após new, antes
										// pessoaUm era um atributo
		pessoaUm.nome = "Sophia"; // O objeto chamando o atributo nome - após
									// ler o nome escreve no espaço reservado na
									// memória o nome
		pessoaUm.idade = 3;
		String livroUm = "Patati Patata";

		pessoaUm.ler(livroUm, 10);

		Pessoa pessoaDois = new Pessoa();// Objeto
		pessoaDois.nome = "Amanda";
		pessoaDois.idade = 3;
		String livroDois = "Quem mexeu no meu queijo";

		pessoaDois.ler(livroDois, 6);

		String provaAlunoDois = pessoaDois.fazerProva("Matemática");
		System.out.println(provaAlunoDois);
		
		String provaDoisAlunoDois = pessoaDois.fazerProva("java", 30);
		System.out.println(provaDoisAlunoDois);

		//vou chamar o método "corrigirProva" da classe professor
		Professor professor = new Professor();
		professor.corrigirProva(provaAlunoDois, pessoaDois);

	}
}
