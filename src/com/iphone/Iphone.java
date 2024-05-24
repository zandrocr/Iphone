package com.iphone;

import java.util.Scanner;

import com.iphone.sistema.Sistema;

public class Iphone {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String resposta;

		Sistema sistema = new Sistema();

		do {
			System.out.println("Oque deseja fazer?");
			System.out.println("Escutar musica [M]");
			System.out.println("Fazer uma ligação [L]");
			System.out.println("Navegar na internet [N]");
			System.out.println("Fechar o aparelho [F]");
			resposta = scan.nextLine();

			if (resposta.equalsIgnoreCase("M")) {
				sistema.ipod();
			} else if (resposta.equalsIgnoreCase("L")) {
				sistema.telefone();
			} else if (resposta.equalsIgnoreCase("N")) {
				sistema.navegador();
			} else if (resposta.equalsIgnoreCase("F")) {
				System.out.printf("Fechando");
				scan.close();
			} else {
				System.out.printf("Não entedi oque disse %n%n");
			}

		} while (!resposta.equalsIgnoreCase("F"));
	}
}
