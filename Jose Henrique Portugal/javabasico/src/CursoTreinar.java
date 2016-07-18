public class CursoTreinar {
	public static void main(String[] args) {
		
		SalaAula javaBasico = new SalaAula();
		javaBasico.arcondic = true;
		javaBasico.andardopredio = 7;
		javaBasico.numerosala = 4;
		javaBasico.nomedocurso = 'J';
		System.out.println(javaBasico.arcondic);
		System.out.println(javaBasico.andardopredio);
		System.out.println(javaBasico.numerosala);
		System.out.println(javaBasico.nomedocurso);
		
		SalaAula excelBasico = new SalaAula();
		excelBasico.arcondic = false;
		excelBasico.andardopredio = 7;
		excelBasico.numerosala = 2;
		excelBasico.nomedocurso = 'E';
		System.out.println(excelBasico.arcondic);
		System.out.println(excelBasico.andardopredio);
		System.out.println(excelBasico.numerosala);
		System.out.println(excelBasico.nomedocurso);
		
		SalaAula wordBasico = new SalaAula();
		wordBasico.arcondic = false;
		wordBasico.andardopredio = 7;
		wordBasico.numerosala = 3;
		wordBasico.nomedocurso = 'W';
		System.out.println(wordBasico.arcondic);
		System.out.println(wordBasico.andardopredio);
		System.out.println(wordBasico.numerosala);
		System.out.println(wordBasico.nomedocurso);

	}

}
