public class Pessoa {

	byte idade;
	String nome;
	Endereco endereco;

	public void ler(String livro, int numPaginas) {
		System.out.println(nome + " est� lendo o livro " + livro + " p�ginas "
				+ numPaginas);
	}

	public String fazerProva(String prova) {
		System.out.println("fazendo prova ...");
		return prova;
	}

	public String fazerProva(String prova, int tempo) {
		System.out.println("fazendo prova ... " + tempo + " tempo ");
		return prova;
	}
	
	public void cadastrarEndereco (Endereco novoEndereco){
		
		System.out.println("...");
		endereco = novoEndereco;
		endereco.complemento = "Apartamento 102 ";
		System.out.println("end");
	}
	
}
