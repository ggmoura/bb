public class EstudoMetodo {

	public static void main(String[] args) {

		Pessoa pessoaUm = new Pessoa(); // pessoaUm � um Objeto ap�s new, antes
										// pessoaUm era um atributo
		pessoaUm.nome = "Sophia"; // O objeto chamando o atributo nome - ap�s
									// ler o nome escreve no espa�o reservado na
									// mem�ria o nome
		pessoaUm.idade = 3;
		String livroUm = "Patati Patata";

		pessoaUm.ler(livroUm, 10);

		Pessoa pessoaDois = new Pessoa();// Objeto
		pessoaDois.nome = "Amanda";
		pessoaDois.idade = 3;
		String livroDois = "Quem mexeu no meu queijo";

		pessoaDois.ler(livroDois, 6);

		String provaAlunoDois = pessoaDois.fazerProva("Matem�tica");
		System.out.println(provaAlunoDois);
		
		String provaDoisAlunoDois = pessoaDois.fazerProva("java", 30);
		System.out.println(provaDoisAlunoDois);

		//vou chamar o m�todo "corrigirProva" da classe professor
		Professor professor = new Professor();
		professor.corrigirProva(provaAlunoDois, pessoaDois);

	}
}
