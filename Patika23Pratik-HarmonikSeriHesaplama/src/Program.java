//www.patika.dev
//@author Tufan ERDOĞAN

/* 
	Java ile girilen sayının harmonik serisini bulan program yazacağız.
	
	Harmonik Seri Formülü :
	
	link: https://raw.githubusercontent.com/Kodluyoruz/taskforce/main/java101/pratik-harmonic/figures/harmonic_series.gif
*/

import java.util.Scanner;

public class Program {
	
	public static void main(String[] args) {
		
		int number;
		double result=0;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Harmonik seri için N sayısını giriniz : ");
		number = input.nextInt();
		input.close();
		
		for(double i=1; i<=number; i++) {
			result += 1/i;
		}

		System.out.println("Cevap : "+ result );
	
	}

}
