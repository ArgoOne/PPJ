package ppj.git;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner in = new Scanner (System.in);
		
		System.out.print("Podaj ilosc przepracownanych godzin:  ");
		double godziny1 = Double.parseDouble(in.next());
		
		System.out.print("Podaj stawke:  ");
		double stawka1 = Double.parseDouble(in.next());
		
		if (godziny1<=40)
		{
			System.out.printf("Wynagrodzenie =%8.2f",godziny1*stawka1);	
		}
		
		else if (godziny1>=60)
		{
			System.out.printf("Wynagrodzenie =%8.2f",((40*stawka1)+(20*(stawka1*1.5))));
			System.out.println(" Maksymalnie 60 godzin pracy na tydzien ");
			}
		
		else {
			System.out.printf("Wynagrodzenie =%8.2f",((40*stawka1)+((godziny1-40)*(stawka1*1.5))));
		}
	}
}
