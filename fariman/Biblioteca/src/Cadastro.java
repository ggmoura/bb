
public class Cadastro {
	
	public static void main(String[] args) {
		
		Livro livroUm = new Livro();
		livroUm.nomedoLivro = "Escrava Isaura";
		livroUm.genero = "Romance";
		
		Autor a = new Autor();
		a.nome = "Bernardo Guimar�es";
		a.idade = 71; 
		
		livroUm.autor = a;
		
		System.out.println("O Nome do Autor �: " + livroUm.autor.nome);
		System.out.println("A idade do Autor �: " + livroUm.autor.idade);
		System.out.println("O G�nero �: " + livroUm.genero);
	
		
		
	}

}
