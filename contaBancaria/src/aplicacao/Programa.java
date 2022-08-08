package aplicacao;

import java.util.Scanner;

import entidades.Conta;

public class Programa {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe seu nome para cricao da conta: ");
		System.out.print("Nome: ");
		String nome = sc.nextLine();
		
		Conta conta = new Conta(nome);
		int numero = 1234;
		
		System.out.print("Voce deseja realizar algum depósito inicial (Y/N)? ");
		char resp = sc.next().charAt(0);
		if (resp == 'y'){
			System.out.print("Valor a ser depositado: ");
			double deposito = sc.nextDouble();
			conta = new Conta(numero, nome, deposito);
		} 
		else {
			conta = new Conta(numero, nome);
		}
		System.out.println(conta);	
		
		System.out.print("Voce deseja fazer algum deposito (Y/N)? ");
		resp = sc.next().charAt(0);
		if (resp=='y') {
			System.out.print("Valor a ser depositado: ");
			double deposito = sc.nextDouble();
			conta.aumentarSaldo(deposito);
		}
		System.out.print("Voce deseja fazer algum saque (Y/N)? ");
		char resp2 = sc.next().charAt(0);
		if (resp2=='y') {
			System.out.print("Valor a ser retirado: ");
			double saque = sc.nextDouble();
			conta.diminuirSaldo(saque);
		}
		
		System.out.println(conta);	
		
		sc.close();
	}

}
