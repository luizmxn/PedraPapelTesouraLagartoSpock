package LuizAV3;

import java.util.Scanner;
public class PedraPapelTesouraLagartoSpock {
	
static Scanner console = new Scanner (System.in);
	
	static final int [][] Regra = {
	
             {0, -1, 1, 1, -1},
	         {1, 0, -1, -1, 1 },
	         {-1, 1, 0, 1, -1},
	         {-1, 1, -1, 0, 1},
	         {1, -1, 1, -1, 0}
	  	 };	
	static final byte GANHOU = 1;
	static final byte EMPATOU = 0;
	static final byte PERDEU = -1;
	static final String[] opcoes = { "Pedra", "Papel", "Tesoura","Lagarto","Spock" };
	
	static final void regraJogo(int numeroJogador) {

		int jogador = Regra[numeroJogador].length-1; 
		int computador = (byte) (Math.random()*5);
		
		System.out.println("COMPUTADOR ESCOLHEU "+opcoes[computador]);
	
		if (Regra[jogador][computador] == EMPATOU)
			System.out.println("EMPATOU :/");
		else if
		(Regra[jogador][computador] == GANHOU)
			System.out.println("VOCÊ GANHOU:D");
		else
			System.out.println("VOCÊ PERDEU:C");
	
	}
	
	static void menuJogo(){
		
		System.out.println("\t ESCOLHA:");
		System.out.println("[1] Pedra");
		System.out.println("[2] Papel");
		System.out.println("[3] Tesoura");
		System.out.println("[4] Lagarto");
		System.out.println("[5] Spock");
		
		byte jogador = console.nextByte();
		
		switch (jogador) {
		case 1:
			System.out.println("VOCÊ ESCOLHEU PEDRA");
			regraJogo(jogador);
			break;
		case 2:
			System.out.println("VOCÊ ESCOLHEU PAPEL");
			regraJogo(jogador);
			break;
		case 3:
			System.out.println("VOCÊ ESCOLHEU TESOURA");
			regraJogo(jogador);
			break;
		case 4:
			System.out.println("VOCÊ ESCOLHEU LAGARTO");
			regraJogo(jogador);
			break;
		case 5:
			System.out.println("VOCÊ ESCOLHEU SPOCK");
			regraJogo(jogador);
			break;
			default:
				menuJogo();
				break;
		}
		menuJogo();
		
		
		
	}
	
	public static void main(String[] args) {
		
		menuJogo();
	}

}

	
