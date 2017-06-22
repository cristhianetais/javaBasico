package com.loiane.cursojava.aula15;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Entre com preço do Produto 1: ");
		double produto1 = scan.nextDouble();

		System.out.println("Entre com preço do Produto 2: ");
		double produto2 = scan.nextDouble();

		System.out.println("Entre com preço do Produto 3: ");
		double produto3 = scan.nextDouble();

		if (produto1 < produto2 && produto1 < produto3) {
			System.out.println("Produto 1 mais barato indicado para compra: " + produto1);
		} else if (produto2 < produto1 && produto2 < produto3) {
			System.out.println("Produto 2 mais barato indicado para compra: " + produto2);
		} else {
			System.out.println("Produto 3 mais barato indicado para compra: " + produto3);
		}

	}

}
