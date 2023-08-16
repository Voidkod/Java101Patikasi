//www.patika.dev
//@author Tufan ERDOĞAN

/* 
	Java ile bir sayının "Palindrom Sayı" olup olmadığını bulan bir program yapıyoruz.
	
	Palindrom Sayı Nedir ?
	Palindromik sayı, iki taraftan okunduğu zaman okunuş yönüyle aynı olan sayılardır.
	
	Örnek: 1, 4, 8, 99, 101, 363, 4004, 9889....
*/

import java.util.Scanner;

public class Program {
	
	//int-String ve String-int dönüşümleriyle Palindrom sayı bulma.
	
	static void  isPalindrom(int number) {
		
		String numString=Integer.toString(number);
		String temp="";
		
		for(int i=numString.length()-1; i>=0; i--) {
			temp += numString.charAt(i);
		}
		
		int reverse = Integer.parseInt(temp);
		
		if(number==reverse) System.out.println(number + " Palindrom bir sayıdır.");
		else System.out.println(number + " Palindrom bir sayı değildir.");
	}
	
    
	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		System.out.print("Bir sayı giriniz : ");
		int number= input.nextInt();
		
		isPalindrom(number);
		  
	}
}
