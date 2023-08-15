//www.patika.dev
//@author Tufan ERDOĞAN

/* 
	Java ile 1 - 100 arasındaki asal sayıları ekrana yazdıran programı yazınız.
	
	Senaryo
	2 3 5 7 11 13 17 19 23 29 31 37 41 43 47 53 59 61 67 71 73 79 83 89 97 
*/

import java.util.Scanner;

public class Program {
	
	public static void main(String[] args) {
		
		int number1,number2,count=0,temp;
		Scanner input = new Scanner(System.in);
		
		System.out.print("İki doğal sayı arasındaki asal sayılar bulunacaktır. \nİlk sayıyı giriniz : ");
		number1=input.nextInt();
		System.out.print("İkici sayıyı giriniz : ");
		number2=input.nextInt();
		
		if(number1>number2) {
			temp=number2;
			number2=number1;
			number1=temp;
		}
		if(number1<2) number1=2;
		
		
		for(int numbers=number1; numbers<number2; numbers++) {
			for(int divisor=2; divisor<numbers; divisor++ ) {
				if(numbers % divisor == 0) count++;
			}
			if(count==0) System.out.print(numbers+" ");
			count=0;
		}
		
		
		
	}
}

