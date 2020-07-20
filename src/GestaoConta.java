

import java.util.Locale;
import java.util.Scanner;
import entities.Conta;

public class GestaoConta {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Conta conta;
		
		System.out.print("Enter Account Number: ");
		int nConta = sc.nextInt();
		System.out.print("Enter Account Holder: ");
		sc.nextLine();
		String nome = sc.nextLine();
		System.out.print("Is there an initial deposit (y/n)? ");
		char resposta = sc.next().charAt(0);
		if (resposta == 'y') {
			System.out.print("Entrer initial deposit value: ");
			double valorInicial = sc.nextDouble();
			conta = new Conta(nConta, nome, valorInicial);
		}
		
		else {
			conta = new Conta(nConta, nome);
		}
		
		System.out.println();
		System.out.println("Dados da Conta: ");
		System.out.println(conta);	
		
		System.out.println();
		System.out.print("Entre com o valor a ser depositado: ");
		double depositoValor = sc.nextDouble();
		conta.deposito(depositoValor);		
		
		System.out.print("Valor atualizado para: ");
		System.out.println(conta);
		
		System.out.println();
		System.out.print("Entre com o valor a ser sacado: ");
		double saqueValor = sc.nextDouble();
		conta.saque(saqueValor);
		System.out.print("Valor atualizado para: ");
		System.out.println(conta);
		
		sc.close();

	}

}
