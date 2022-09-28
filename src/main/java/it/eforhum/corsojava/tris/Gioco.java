package it.eforhum.corsojava.tris;

import java.util.Arrays;

//====================================================
//	ESERCITAZIONE IN AUTONOMIA
//	Sviluppare il gioco del tris
//	| X |   |   |
//	| O | X | O |
//	| O | O | X |
//	2 giocatori, un turno ciascuno, il primo usa la 'X' il secondo usa 'O'
//	per posizionare il proprio segno indicare un numero da 1 a 9
//	| 1 | 2 | 3 |
//	| 4 | 5 | 6 |
//	| 7 | 8 | 9 |	
//=====================================================

public class Gioco {
	
	char[][] mapMatrix=new char[3][3];
	//mettere timer
	private static int vittoria;
	private int perdita;
	int[] victoryArr;
	private static long inizio = System.currentTimeMillis();
	private static int numGiocate;
	public Gioco() {
		
	}
	
	public long currentTime() {
		long inizio=Gioco.inizio;
		long fine = System.currentTimeMillis();
		return ((fine-inizio)/1000);
	}
	
	public static int getNumGiocate() {
		return numGiocate;
	}
	
	public static void incrNumGiocate() {
		numGiocate++;
	}
	
	public String startGame() {
		
		return  "inizio";
	}
	
	public boolean endGame() {
		
		return true;
	}
	
	public static int vittoria(Giocatore g1) {
		vittoria++;
		g1.setVittorie(vittoria);
		return 0;
	}
	
	public int perdita(Giocatore g1) {
		perdita++;
		g1.setPerdite(perdita);
		return 0;
	}
	
	public String statistica(Giocatore g1, Giocatore g2) {
		
		return g1.getNome()+"Vinto: "+g1.getVittorie()+" Perso: "+g1.getPerdite()+"\n"+g2.getNome()+"Vinto: "+g2.getVittorie()+" Perso: "+g2.getPerdite();
	}
	
	//da rivedere
//	public void map(){
//		
//		for(int i=0;i<mapMatrix.length;i++) {
//			
//			char[] row=mapMatrix[i];
//			for(int j=0;j<row.length;j++) {
//				System.out.print("|");
//				System.out.print(mapMatrix[i][j]);
//				
//				
//			}
//			
//		}
//		
//	}
	
	public void turnChanger(Giocatore g1) {
		g1.setTurno(true);
	}
	
	public int scelta(char c) {
		
		switch(c) {
			case '1':
				return 1;
			case '2':
				return 2;
			case '3':
				return 3;
			case '4':
				return 4;
			case '5':
				return 5;
			case '6':
				return 6;
			case '7':
				return 7;
			case '8':
				return 8;
			case '9':
				return 9;
			default:
				return -1;

							
		}
		
		
	}
	
	
	
	public void condVittoria(Giocatore g1) {
		int[] arr=g1.getNumbContainer();
		int[] c1= {1,2,3};
		int[] c2= {4,5,6};
		int[] c3= {7,8,9};
		int[] c4= {1,4,7};
		int[] c5= {2,5,8};
		int[] c6= {3,6,9};
		int[] c7= {3,6,9};
		int[] c8= {1,5,9};
		int[] c9= {3,5,7};
		
		if(Arrays.equals(arr, c1) ||Arrays.equals(arr, c2) || Arrays.equals(arr, c3) ||Arrays.equals(arr, c4) || Arrays.equals(arr, c5) ||Arrays.equals(arr, c6)|| Arrays.equals(arr, c7) ||Arrays.equals(arr, c8) || Arrays.equals(arr, c9)) {
			Gioco.vittoria(g1);
		}
		
	
				
		
	}
	
	
	
	
	
}
