package com.iphone.sistema;

import java.util.Scanner;

import com.iphone.sistema.internet.Navegador;
import com.iphone.sistema.ipod.Ipod;
import com.iphone.sistema.telefone.Telefone;

public class Sistema {
	Scanner scan = new Scanner(System.in);
	Ipod ipod = new Ipod();
	Telefone telefone = new Telefone();
	Navegador navegador = new Navegador();

	String resposta = "";

	public void ipod() {
		do {
			System.out.println("Deseja escolher uma nova musica? [N]");
			System.out.println("Deseja pausar a música? [P]");
			System.out.println("Deseja voltar? [V]");
			resposta = scan.nextLine();

			if (resposta.equalsIgnoreCase("N")) {
				ipod.selecionarMusica();
			} else if (resposta.equalsIgnoreCase("P")) {
				ipod.pausar();
			} else if (resposta.equalsIgnoreCase("V")) {
				System.out.println("Tela inicial");
			} else {
				System.out.println("Não entedi oque disse");
			}
		} while (!resposta.equalsIgnoreCase("V"));
	}

	public void telefone() {
		do {
			System.out.println("Deseja realizar uma ligação? [N]");
			System.out.println("Deseja atender a ligação? [A]");
			System.out.println("Deseja abrir o correio de voz? [C]");
			System.out.println("Deseja voltar? [V]");
			resposta = scan.nextLine();

			if (resposta.equalsIgnoreCase("N")) {
				System.out.println("Digite o número:");
				resposta = scan.nextLine();
				telefone.ligar(resposta);
			} else if (resposta.equalsIgnoreCase("A")) {
				telefone.atender();
			} else if (resposta.equalsIgnoreCase("C")) {
				telefone.correioVoz();
			} else if (resposta.equalsIgnoreCase("V")) {
				System.out.println("Tela inicial");
			} else {
				System.out.println("Não entedi oque disse");
			}
		} while (!resposta.equalsIgnoreCase("V"));
	}

	public void navegador() {
		do {
			System.out.println("Entrar em um página? [P]");
			System.out.println("Adicionar uma nova aba? [A]");
			System.out.println("Atualizar a página? [Z]");
			System.out.println("Deseja voltar? [V]");
			resposta = scan.nextLine();

			if (resposta.equalsIgnoreCase("P")) {
				navegador.url();
			} else if (resposta.equalsIgnoreCase("A")) {
				navegador.adicionarAba();
			} else if (resposta.equalsIgnoreCase("Z")) {
				navegador.atualizarAba();
			} else if (resposta.equalsIgnoreCase("V")) {
				System.out.println("Tela inicial");
			} else {
				System.out.println("Não entedi oque disse");
			}
		} while (!resposta.equalsIgnoreCase("V"));
	}

}
