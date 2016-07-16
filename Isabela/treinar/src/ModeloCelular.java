
public class ModeloCelular {
	public static void main(String[] args) {
		
		Celular motorola = null;
		
		Celular samsung = new Celular();
		
		motorola = new Celular();
		
		motorola.saldo = 40;
		
		samsung.saldo = 50;
		
		motorola.usabilidade = true;
		
		samsung.usabilidade = false;
		
		System.out.println("Saldo: " + motorola.saldo);
		
		System.out.println("A usabilidade é boa: " + motorola.usabilidade);
		
		System.out.println("Saldo: " + samsung.saldo);
	
		System.out.println("A usabilidade é boa: " + samsung.usabilidade);
	}
}
