//www.patika.dev
//@author Tufan ERDOĞAN

/* 
	Java dilinde "Recursive" metot kullanarak, kullanıcıdan alınan sayının "Asal" sayı olup olmadığını bulan programı yazın.

	Senaryo
	Sayı Giriniz : 22
	22 sayısı ASAL değildir !
	
	
	Sayı Giriniz : 2
	2 sayısı ASALDIR !
	
	
	Sayı Giriniz : 39
	39 sayısı ASAL değildir !
	
	
	Sayı Giriniz : 17
	17 sayısı ASALDIR !
*/

import java.util.Scanner;

public class Program {
	
	static int divisor = 2;
	
	static boolean isPrime(int number) {

		 if(number<2) return false;

		 if(divisor*divisor>number) return true;
		 
		 else {

			if(number%divisor==0) return false;

			divisor++;
			return isPrime(number);
		 }

	}
	
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		int number;
		System.out.print("Sayı giriniz : ");
		number=input.nextInt();
		input.close();
		
		String isPrime = (isPrime(number)) ? "ASALDIR !" : "ASAL değildir !";
		System.out.println(number +" sayısı "+ isPrime);
		
	}
}
