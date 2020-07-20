package entities;

public class Notas {
		
		public String aluno;
		public double nota1, nota2, nota3;
		
		public double notaFinal( ) {
			return nota1 + nota2 + nota3;
		}
		
		public double notaRestante() {
			
			if (notaFinal() < 60.0){
				
				return 60.0 - notaFinal();
			}
			
			else {
				return (0.00);
			}
		}

}
