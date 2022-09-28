package it.eforhum.corsojava;

import java.util.Arrays;

public class Main2Array {

	public static void main(String[] args) {

//		monodimensione();

//		ordinamento();

		ricerca();

//		multidimensione();
	}

	private static void monodimensione() {

//		char[] primoArr=null;
//		System.out.println(primoArr);
//		System.out.println(primoArr.length);

		int var = 10;
		char[] parola = new char[var];

		parola[0] = 'c';
		parola[1] = 'i';
		parola[2] = 'a';
		parola[3] = 'o';

		System.out.println("Lunghezza della variabile " + parola.length);

//		se proviamo a stampare in ouput l'array verr� visualizzato l'indirizzo di memoria a cui punta l'oggetto		
		System.out.println("[" + parola + "]");

		System.out.print("[");
		for (int i = 0; i < parola.length; i++) {
			System.out.print(parola[i]);
		}
		System.out.println("]");

		System.out.print("[");
		for (int i = 0; i < parola.length; i++) {
			System.out.print((int) parola[i]);
		}
		System.out.println("]");

		int[] array = { 1, 2, 3, 4, 5, 6, 7 };

		System.out.println("Lunghezza array " + array.length);

		int i = 0;
		while (i < array.length) {

			System.out.print(array[i] + ",");
			i++;
		}
		System.out.println();

//		altre dichiarazioni di array con una scrittura valida

		int[] intArr1 = { 1, 2, 3 };
		int intArr2[] = { 1, 2, 3 };
		int[] intArr3 = new int[5];

//		� possibile richiamare il metodo equals() sugli array perch� di fatto sono degli oggetti
//		viene verificata l'uguaglianza sul puntamento in memoria e non sul contenuto
		System.out.println("array uguali? " + intArr1.equals(intArr2));

//		usare il metodo di utilità java.util.Arrays.toString() se si vuole stampare in output il contenuto
		System.out.println(Arrays.toString(intArr1));
	}

	private static void ordinamento() {

//		la classe java.util.Arrays contiene una serie di funzioni di utilit� tra cui quella di ordinamento

		int[] numeri = { 99, 56, 106, 1, 48, 766 };
//		int numeri2[] = Arrays.copyOf(numeri, numeri.length);
		int[] numeri2 = new int[numeri.length];
		numeri2 = numeri;

		System.out.println("Array non ordinato: " + Arrays.toString(numeri));

		Arrays.sort(numeri);

		System.out.println("Array ordinato: " + Arrays.toString(numeri));
		System.out.println("Array originale: " + Arrays.toString(numeri2));

		String[] stringhe = { "100", "10", "9" };

//		ricordarsi che il carattere 1 viene prima del carattere 9
		Arrays.sort(stringhe);

		System.out.println("Array stringhe ordinato: " + Arrays.toString(stringhe));
	}

	private static void ricerca() {

		int numeri[] = { 1, 4, 7, 9, 10 };
		Arrays.sort(numeri);

//		ATTENZIONE: la ricerca binaria pu� essere usata solo su array gi� ordinati, altrimenti il risultato non � predicibile
		System.out.println(Arrays.binarySearch(numeri, 4));

		System.out.println(Arrays.binarySearch(numeri, 9));

		System.out.println(Arrays.binarySearch(numeri, 2));

		System.out.println(Arrays.binarySearch(numeri, 3));
	}

	private static void multidimensione() {

		char matrix[][] = new char[3][3];

		matrix[2][0] = '1';
		matrix[2][1] = '2';
		matrix[2][2] = '3';
		matrix[1][0] = '4';
		matrix[1][1] = '5';
		matrix[1][2] = '6';
		matrix[0][0] = '7';
		matrix[0][1] = '8';
		matrix[0][2] = '9';

		System.out.println("--------------");
		for (int i = 0; i < matrix.length; i++) {

			char row[] = matrix[i];
			System.out.println(row.length);
			for (int j = 0; j < row.length; j++) {

				System.out.print(matrix[i][j]);
				System.out.print(" | ");
			}
			System.out.println();
		}
		System.out.println("--------------");
	}
// ====================================================
//	ESERCITAZIONE IN AUTONOMIA
//	Sviluppare il gioco del tris
//  | X |   |   |
//	| O | X | O |
//	| O | O | X |
//	2 giocatori, un turno ciascuno, il primo usa la 'X' il secondo usa 'O'
//	per posizionare il proprio segno indicare un numero da 1 a 9
//  | 1 | 2 | 3 |
//	| 4 | 5 | 6 |
//	| 7 | 8 | 9 |	
// =====================================================	

}
