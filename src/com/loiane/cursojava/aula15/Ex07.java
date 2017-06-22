package com.loiane.cursojava.aula15;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Entre com o primeiro número: ");
		double primeiroNumero = scan.nextDouble();

		System.out.println("Entre com o segundo número: ");
		double segundoNumero = scan.nextDouble();

		System.out.println("Entre com o terceiro número: ");
		double terceiroNumero = scan.nextDouble();


		if (primeiroNumero > segundoNumero && primeiroNumero > terceiroNumero) {
			System.out.println("Primeiro número é o maior: " + primeiroNumero);
		} else if (segundoNumero > primeiroNumero && segundoNumero > terceiroNumero) {
			System.out.println("Segundo número é o maior: " + segundoNumero);
		} else if (terceiroNumero > primeiroNumero && terceiroNumero > segundoNumero) {
			System.out.println("Terceiro número é o maior: " + terceiroNumero);
		} else {
			System.out.println("Números iguais");
		}

		if (primeiroNumero < segundoNumero && primeiroNumero < terceiroNumero) {
			System.out.println("Primeiro número é o menor: " + primeiroNumero);
		} else if (segundoNumero < primeiroNumero && segundoNumero < terceiroNumero) {
			System.out.println("Segundo número é o menor: " + segundoNumero);
		} else if (terceiroNumero < primeiroNumero && terceiroNumero < segundoNumero) {
			System.out.println("Terceiro número é o menor: " + terceiroNumero);
		} else {
			System.out.println("Números iguais");
		}

	}

}
