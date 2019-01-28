package ppj.git;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		System.out.print("Podaj ilosc przepracownanych godzin:  ");
		double godziny1 = Double.parseDouble(in.next());

		if (godziny1 > 60) {

			throw new IllegalArgumentException("Maxymalnie 60 godziny pracy na tydzien: " + godziny1);
		}

		System.out.print("Podaj stawke za godzine pracy:  ");
		double stawka1 = Double.parseDouble(in.next());

		if (stawka1 <= 0) {

			throw new IllegalArgumentException("Stawka za godzine musi byc wieksza od 0: " + stawka1);
		}

		if (godziny1 <= 40) {
			System.out.printf("Wynagrodzenie =%8.2f", godziny1 * stawka1);
		}

		else if (godziny1 >= 60) {
			System.out.printf("Wynagrodzenie =%8.2f", ((40 * stawka1) + (20 * (stawka1 * 1.5))));
		}
	}
}
