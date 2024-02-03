package br.com.controlefluxo;

import java.util.Scanner;

public class ControleFluxo {

	public static void main(String args[]) {

		java.util.Scanner nota = new Scanner(System.in);

		float n1, n2, n3, n4, mf;

		System.out.print("Entre com a primeira nota: ");
		n1 = nota.nextFloat();
		System.out.print("Entre com a segunda nota: ");
		n2 = nota.nextFloat();
		System.out.print("Entre com a terceia nota: ");
		n3 = nota.nextFloat();
		System.out.print("Entre com a quarta nota: ");
		n4 = nota.nextFloat();
		mf = (n1 + n2 + n3 + n4) / 4;

		if ((mf <= 10.0) && (mf >= 0.0)) {

			if (mf >= 7.0) {
				System.out.println("APROVADO");
			} else {

				if (mf >= 5.0) {
					System.out.println("RECUPERAÇÃO");
				} else {
					System.out.println("REPROVADO");
				}
			
			}

		}

	}

}
