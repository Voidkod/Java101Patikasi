//www.patika.dev
//@author Tufan ERDOĞAN

/* 
	Klavyeden girilen bir sayının mükemmel sayı olup/olmadığını bulan ve sayı mükemmel sayı ise ekrana “mükemmel sayıdır.” değilse “mükemmel sayı değildir.” ifadelerini ekrana yazan programı Java dilinde yazınız.
	
	Mükemmel Sayı Nedir ?
	Bir sayının kendisi hariç pozitif tam sayı çarpanları (kalansız bölen sayıların) toplamı kendisine eşit olan sayıya mükemmel sayı denir.
	
	Senaryolar
		Bir sayı giriniz: 28
		28 Mükemmel sayıdır
		Bir sayı giriniz: 1
		1 Mükemmel sayı değildir.
		Bir sayı giriniz: 496
		496 Mükemmel sayıdır
*/

import java.util.Scanner;

public class Program {
	
	public static void main(String[] args) {
		
		int number,temp=0;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Bir sayı giriniz : ");
		number=input.nextInt();
		
		for(int i=1; i<number; i++) {
			if(number%i==0) temp += i;
		}
		String isPerfectNumber = (number==temp) ? "Mükemmel Sayıdır." : "Mükemmel Sayı Değildir.";
		System.out.println(number+" "+isPerfectNumber);
		input.close();
	}
}
