import java.util.Locale;
import java.util.Scanner;

import entities.Notas;

public class ValidacaoNotas {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Notas notas = new Notas();
		
		notas.aluno = sc.nextLine();
		
		
		
		notas.nota1 = sc.nextDouble();
		
		while (notas.nota1 > 30) {
			
			System.out.println("Valor maior que o permitido, digite novamente.");
			notas.nota1 = sc.nextDouble();
		}
		
		notas.nota2 = sc.nextDouble();
		
		
		while (notas.nota2 > 35) {
			
			System.out.println("Valor maior que o permitido, digite novamente.");
			notas.nota2 = sc.nextDouble();
		}
		
		notas.nota3 = sc.nextDouble();
		
		while (notas.nota3 > 35) {
			
			System.out.println("Valor maior que o permitido, digite novamente.");
			notas.nota3 = sc.nextDouble();
		}
		
		System.out.printf("Nota Final: %.2f%n", notas.notaFinal());		
		
		if (notas.notaFinal() >= 60.0) {
			
			System.out.println("Parabéns, aluno Aprovado!!!");
		}
		else {
			
			System.out.println("Se fodeu, não foi dessa vez, faltou "+ notas.notaRestante());
		}
		sc.close();
	}

}
