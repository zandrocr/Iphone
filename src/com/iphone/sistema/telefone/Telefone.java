package com.iphone.sistema.telefone;

import java.util.Scanner;

public class Telefone implements Metodos {
	Scanner scan = new Scanner(System.in);
	String resposta = "";

	@Override
	public void ligar(String numero) {
		System.out.printf("Ligando para %s %n", numero);	
		System.out.printf("Desligar [D] ");		
		resposta = scan.nextLine();
		
		if(resposta.equalsIgnoreCase("D")) {
			desligar();
		}			
	}

	@Override
	public void atender() {
		System.out.printf("Ligação atendida");
		System.out.printf("Desligar [D]");		
		resposta = scan.nextLine();
		
		if(resposta.equalsIgnoreCase("D")) {
			desligar();
		}
	}

	@Override
	public void desligar() {
		System.out.printf("Chamada encerrada %n%n");			
	}

	@Override
	public void correioVoz() {
		System.out.printf("Você tem 10 mensagens %n%n");		
	}

}
