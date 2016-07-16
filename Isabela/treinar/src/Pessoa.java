
public class Pessoa {

	//Caracter�sticas (Atributos)
	byte idade;
	String nome;
	
	//Funcionalidades (M�todos)
	public void ler(String livro, int numPaginas){
		System.out.println(nome + " est� lendo " + livro + " - Paginas " + numPaginas); //nome est� em azul pois est� no escopo da classe, livro est� vinho pq est� no escopo do m�todo
	}
	
	public String fazerProva(String prova){
		System.out.println("Fazendo prova...");
		return prova;
	} 

	public String fazerProva(String prova, int tempo){
		System.out.println("Fazendo prova em " + tempo + " tempo");
		return prova;
	} 
	
	
	
}
