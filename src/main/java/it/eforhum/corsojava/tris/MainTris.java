package it.eforhum.corsojava.tris;

import java.util.Arrays;
import java.util.Scanner;

public class MainTris {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int check;
		char[][] mapMatrix = new char[3][3];
		mapMatrix[0][0] = '1';
		mapMatrix[0][1] = '2';
		mapMatrix[0][2] = '3';
		mapMatrix[1][0] = '4';
		mapMatrix[1][1] = '5';
		mapMatrix[1][2] = '6';
		mapMatrix[2][0] = '7';
		mapMatrix[2][1] = '8';
		mapMatrix[2][2] = '9';
		//test
		int[] c1= {1,2,3};
		int[] c2= {1,2,3};
		
		System.out.println(Arrays.equals(c1, c2));
		

		//
		Giocatore gg1 = new Giocatore();
		Giocatore gg2 = new Giocatore();
		boolean endGioco = false;

		Gioco g1 = new Gioco();
		gg1.setTurno(true);
		char c = '0';

		gg1.setNome("Cat");
		gg2.setNome("Dog");

		System.out.println("Partita iniziata");
		g1.startGame();

		do {

			if (gg1.getTurno()) {
				System.out.println("Il turno e' di: " + gg1.getNome());
			} else {
				System.out.println("Il turno e' di: " + gg2.getNome());
			}

			System.out.println("Inserire un numero da 1 a 9");

			c = in.next().charAt(0);
			check = g1.scelta(c);

			for (int i = 0; i < mapMatrix.length; i++) {

				char[] row = mapMatrix[i];
				for (int j = 0; j < row.length; j++) {
					System.out.print("|");
					if (gg1.getTurno()) {
						if (Character.getNumericValue(mapMatrix[i][j]) == check) {
							mapMatrix[i][j] = 'X';
							gg1.setTurno(false);
							gg2.setTurno(true);

						}
					}

					if (gg2.getTurno()) {
						if (Character.getNumericValue(mapMatrix[i][j]) == check) {
							mapMatrix[i][j] = 'O';
							gg1.setTurno(true);
							gg2.setTurno(false);
						}

					}
					System.out.print(mapMatrix[i][j]);

				}

				System.out.println();
			}

			g1.incrNumGiocate();

			System.out.println("Il tempo passato dall'inizio di partita: " + g1.currentTime());
			if (g1.getNumGiocate() > 9) {
				endGioco = true;
			}
			System.out.println("Numero delle giocate: " + g1.getNumGiocate());

		} while (endGioco != true);

	}
}
