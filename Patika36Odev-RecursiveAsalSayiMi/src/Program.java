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
	
	static int isPrime(int number) {
			 
		 int count=0;
		 if(number<2) return count=1;
		 if(number==divisor) return count;
		 else {
			 
			 if(number%divisor==0) ++count;
			 divisor++;
			 return isPrime(number)+count;
		 }
		
	}
	
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		int number;
		System.out.print("Sayı giriniz : ");
		number=input.nextInt();
		input.close();
		
		String isPrime = (isPrime(number)==0) ? "ASALDIR !" : "ASAL değildir !";
		System.out.println(number +" sayısı "+ isPrime);
		
	}
}
