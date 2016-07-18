
public class Pessoa {

	byte idade;
	String nome;
	Endereco endereco
	
	
	public void ler(String livro, int numPaginas) {
		System.out.println(nome + " está lendo " + numPaginas + " paginas do livro " + livro);
	}
	
		public String fazerProva(String prova) {
		return "[prova do aluno " + nome +"]";
	}
	public String fazerProva(String Prova, int tempo) {
		return "[prova do aluno " + nome + "] de" + Prova + " em " + tempo + minutos";
	}
	
}
