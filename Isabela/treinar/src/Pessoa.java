
public class Pessoa {

	//Características (Atributos)
	byte idade;
	String nome;
	
	//Funcionalidades (Métodos)
	public void ler(String livro, int numPaginas){
		System.out.println(nome + " está lendo " + livro + " - Paginas " + numPaginas); //nome está em azul pois está no escopo da classe, livro está vinho pq está no escopo do método
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
