
public class TesteObjeto {
	public static void main(String[] args) {
		Pessoa p = null;
		p = new Pessoa();
		p.nome  = "Fariman";
		
		Pessoa f = p;
		System.out.println(p.nome);
		
		f.nome = "João";
		System.out.println(f.nome);
	}

}
