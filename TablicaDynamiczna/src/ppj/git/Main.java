package ppj.git;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner in = new Scanner (System.in);
    		System.out.print("Podaj wartosc n: ");
    			int num1= (int) Double.parseDouble(in.next());
	int i,j;
	
		for (i=1; i<=num1; i++)
		{
			for (j=0; j<i; j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
	}
}
