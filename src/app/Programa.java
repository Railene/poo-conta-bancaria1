package app;

import java.util.Locale;
import java.util.Scanner;

import entities.Conta;
import exceptions.ExcecaoNegocios;

public class Programa {
	/*Fazer um programa para ler os dados de uma reserva de hotel (número do quarto, data
de entrada e data de saída) e mostrar os dados da reserva, inclusive sua duração em
dias. Em seguida, ler novas datas de entrada e saída, atualizar a reserva, e mostrar
novamente a reserva com os dados atualizados. O programa não deve aceitar dados
inválidos para a reserva, conforme as seguintes regras:
- Alterações de reserva só podem ocorrer para datas futuras
- A data de saída deve ser maior que a data de entrada*/

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Informe os dados da conta: ");
		System.out.print("Numero: ");
		int numero = sc.nextInt();
		System.out.print("Titular: ");
		sc.nextLine();
		String titular = sc.nextLine();
		System.out.print("Saldo inicial: ");
		double saldo = sc.nextDouble();
		System.out.print("Limite de saque: ");
		double retirarLimite = sc.nextDouble();

		Conta acc = new Conta(numero, titular, saldo, retirarLimite);
		
		System.out.println();
		System.out.print("Informe uma quantia para sacar: ");
		double quantidade = sc.nextDouble();
		
		try {
			acc.retirar(quantidade);
			System.out.printf("Novo saldo: %.2f%n", acc.getSaldo());
		}
		catch (ExcecaoNegocios e) {
			System.out.println(e.getMessage());
		}
		
		sc.close();

	}

}
