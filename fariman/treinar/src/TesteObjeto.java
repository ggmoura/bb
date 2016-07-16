
public class TesteObjeto {

	
	public static void main(String[] args) {
		
		Pessoa p = null;
		p = new Pessoa ();
		p.nome = "Fariman";
		//p.idade
		//p.nome
		Endereco e = new Endereco ();
		e.rua = "da Paz";
		p.cadastrarEndereco(e);
		e = null;
		System.out.println(p.endereco.complemento);
		
		System.out.println(p.endereco.rua);
		
		Pessoa f = p;
		System.out.println(f.nome);
		f.nome ="Gleidson";
		System.out.println(p.nome);
		
		f = new Pessoa();
		f.nome ="Igor";
		System.out.println(p.nome);
			
	}
	
	
}
