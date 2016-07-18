
public class Cadastro {
	
	public static void main(String[] args) {
		
		Livro livroUm = new Livro();
		livroUm.nomedoLivro = "Escrava Isaura";
		livroUm.genero = "Romance";
		
		Autor a = new Autor();
		a.nome = "Bernardo Guimarães";
		a.idade = 71; 
		
		livroUm.autor = a;
		
		System.out.println("O Nome do Autor é: " + livroUm.autor.nome);
		System.out.println("A idade do Autor é: " + livroUm.autor.idade);
		System.out.println("O Gênero é: " + livroUm.genero);
	
		
		
	}

}
