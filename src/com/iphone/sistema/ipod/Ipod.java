package com.iphone.sistema.ipod;

import java.util.Scanner;

public class Ipod implements Metodos {
	Scanner scan = new Scanner(System.in);		
	
	@Override
	public void selecionarMusica() {
		System.out.println("Lista de Musicas, escolha o número da faixa:");
		System.out.println("Faixa 1");
		System.out.println("Faixa 2");
		System.out.println("Faixa 3");
		String musica = scan.nextLine();
		tocar(musica);
	}
	
	@Override
	public void tocar(String musica) {
		System.out.printf("Tocando faixa %s %n%n", musica);		
	}

	@Override
	public void pausar() {
		System.out.println("Musica pausada");	
	}
}
