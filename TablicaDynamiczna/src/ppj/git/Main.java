package ppj.git;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.print("Podaj wartosc n: ");
		int num1 = (int) Double.parseDouble(in.next());

		int tab[][] = new int[num1][0];

		for (int i = 0; i < tab.length; i++) {
			tab[i] = new int[i + 1];
			for (int j = 0; j < tab[i].length; j++) {
				tab[i][j] = j;
			}
		}

		for (int i = 0; i < tab.length; i++) {
			for (int j = 0; j < tab[i].length; j++)
				System.out.print(tab[i][j] + " ");
			System.out.println();
		}
	}
}