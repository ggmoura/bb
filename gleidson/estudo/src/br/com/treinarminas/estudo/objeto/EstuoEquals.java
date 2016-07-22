package br.com.treinarminas.estudo.objeto;

public class EstuoEquals {

	
	public static void main(String[] args) {
		Pessoa p1 = new Pessoa();
		p1.nome = "Maria Sophia";
		p1.cpf = 1111L;
		p1.email = "fulano@gmail.com";
		
		Pessoa p2 = p1;

		Pessoa p3 = new Pessoa();
		p3.nome = "Maria Sophia";
		p3.cpf = 1111L;
		p3.email = "fulano@gmail.com";
		
		
		System.out.println(p1 == p2);
		System.out.println(p1.equals(p2));
		System.out.println(p1.equals(p3));
		System.out.println(p1.equals("Isabela"));
		
	}
	
	static class Pessoa {
		String nome;
		Long cpf;
		String email;
		
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((cpf == null) ? 0 : cpf.hashCode());
			result = prime * result + ((email == null) ? 0 : email.hashCode());
			return result;
		}
		
		
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Pessoa other = (Pessoa) obj;
			if (cpf == null) {
				if (other.cpf != null)
					return false;
			} else if (!cpf.equals(other.cpf))
				return false;
			if (email == null) {
				if (other.email != null)
					return false;
			} else if (!email.equals(other.email))
				return false;
			return true;
		}
		
	}
	
}
