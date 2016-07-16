public class Principal {

	public static void main(String[] args) {

		Caminhao veiculo1 = new Caminhao();
		veiculo1.nome = "Daily";
		veiculo1.cabine = "Cabine Curta";
		veiculo1.eixo = 2;
		veiculo1.numchassi = 123456789;

		Caminhao veiculo2 = new Caminhao();
		veiculo2.nome = "Vertis";
		veiculo2.cabine = "Cabine Longa";
		veiculo2.eixo = 2;
		veiculo2.numchassi = 987654321;
		
		Iveco empresa1 = new Iveco();
		empresa1.caminhao = veiculo1;
		empresa1.numFuncionario = 3000;
		empresa1.concorrente = new Caminhao();
		empresa1.concorrente.nome = "Ford Cargo";
		empresa1.caminhao.cabine = "Cabine Longa";
		empresa1.caminhao.eixo = 3;
		
		
		Iveco empresa2 = new Iveco();
		empresa2.caminhao = veiculo2;
		empresa2.numFuncionario = 3000;
		empresa2.concorrente = new Caminhao();
		
		
		System.out.println(empresa1.caminhao.nome + " - " + empresa1.caminhao.cabine + " - Eixos: " + empresa1.caminhao.eixo + " - Chasi: " +  empresa1.caminhao.numchassi);
		
		System.out.println(empresa2.caminhao.nome + " - " + empresa2.caminhao.cabine + " - Eixos: " + empresa2.caminhao.eixo + " - Chasi: " +  empresa2.caminhao.numchassi);
		
		empresa1.caminhao.nome = empresa1.concorrente.nome;
		System.out.println(veiculo1.nome);
		System.out.println(empresa1.caminhao.nome);
		
		veiculo2.nome = empresa2.concorrente.nome;
		System.out.println(empresa2.caminhao.nome);
		
		System.out.println(veiculo1.cabine);
	}
}	
