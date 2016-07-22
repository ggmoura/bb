
public class TesteDebug {
	
	String nomeProspect;

	
	public static void main(String[] args) {
		Endereco e = new Endereco();
		e.rua = "Jabó";
		Endereco j = e;
		System.out.println(j.rua);
		
		
	}

}
