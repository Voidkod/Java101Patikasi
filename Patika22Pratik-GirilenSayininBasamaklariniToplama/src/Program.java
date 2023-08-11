//www.patika.dev
//@author Tufan ERDOĞAN

/* 
	Ödev
	Bir sayının basamak sayılarının toplamını hesaplayan program yazınız.
	
	Örnek : 1643 = 1 + 6 + 4 + 3 = 14
*/

import java.util.Scanner;

public class Program {
	
	public static void main(String[] args) {
		
		int number,result=0,digit;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Basamak sayıları toplanacak sayıyı giriniz : ");
		number = input.nextInt();
		input.close();
		
		while(number>0) {
			digit = number %10;
			number -= digit;
			number/=10;
			result += digit;
		}

		System.out.println("Cevap : "+ result );
	
	}

}
