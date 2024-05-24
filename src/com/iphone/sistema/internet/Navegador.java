package com.iphone.sistema.internet;

import java.util.Scanner;

public class Navegador implements Metodos {
	Scanner scan = new Scanner(System.in);
	String resposta = "";

	@Override
	public void url() {
		do {
			System.out.println("Digite uma url");
			resposta = scan.nextLine();			
			
			System.out.printf("Acessando %s %n", resposta);
			
			System.out.println("Deseja voltar? Sim [S] Não [N]");
			System.out.println("Atualizar página? [A]");
			resposta = scan.nextLine();

			if (resposta.equalsIgnoreCase("S")) {
				System.out.println("Tela inicial");
			} else if(resposta.equalsIgnoreCase("A")) {
				atualizarAba();
			} else {
				System.out.println("Não entedi oque disse");
			}
			
		} while (!resposta.equalsIgnoreCase("S"));
	}

	@Override
	public void adicionarAba() {
		System.out.println("Adicionando uma aba");
		url();
	}

	@Override
	public void atualizarAba() {
		System.out.println("Atualizando página");
	}

}
