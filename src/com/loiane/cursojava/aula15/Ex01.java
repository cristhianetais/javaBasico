package com.loiane.cursojava.aula15;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Entre com o primeiro numero:");
		int primeiroNumero = scan.nextInt();

		System.out.println("Entre com o segundo numero:");
		int segundoNumero = scan.nextInt();

		if (primeiroNumero > segundoNumero) {
			System.out.println("O primeiro número é maior");
		} else {
			System.out.println("O segundo número é maior");
		}

	}

}
