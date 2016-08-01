package br.com.rubs.jogodasenha.collection.ordenacao;

class Pessoa implements Comparable<Pessoa> {
	
	String nome;
	Integer idade;
	Integer peso;
	
	@Override
	public int compareTo(Pessoa o) {
		return this.idade.compareTo(o.idade);
	}

	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", idade=" + idade + "]";
	}
	
}