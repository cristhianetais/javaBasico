package com.loiane.cursojava.aula15;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Entre com o número:");
		double numero = scan.nextDouble();

		if (numero >= 0) {
			System.out.println("Número positivo.");
		} else {
			System.out.println("Número negativo.");
		}
	}

}
