//www.patika.dev
//@author Tufan ERDOĞAN

/* 
	Recursive Metotlar ile Üslü Sayı Hesaplama
	Java dilinde, taban ve üs değerleri kullanıcıdan alınan üs alma işlemini "Recursive" metot kullanarak yapan programı yazınız.
	
	Senaryo
	
	Taban değeri giriniz :2 Üs değerini giriniz : 0
	Sonuç : 1
	Taban değeri giriniz : 2
	Üs değerini giriniz : 3
	Sonuç : 8
	Taban değeri giriniz : 5
	Üs değerini giriniz : 3
	Sonuç : 125
*/

import java.util.Scanner;

public class Program {
	
	static int power(int base, int power) {	
		
		if(power==0) return 1;
		
		else return power(base,power-1)*base;

	}
	
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		int base,power;
		System.out.print("Taban değeri giriniz : ");
		base=input.nextInt();
		System.out.print("Üs değerini giriniz :");
		power=input.nextInt();
		input.close();
		
		System.out.println("Sonuç : "+power(base,power));
		
	}
}
