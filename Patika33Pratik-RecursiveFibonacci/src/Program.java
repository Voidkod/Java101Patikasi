//www.patika.dev
//@author Tufan ERDOĞAN

/* 
	Java'da recursive metotlar ile fibonacci serisi bulan program yapıyoruz.
*/

import java.util.Scanner;

public class Program {
	
	static int fib(int number) {
		
		if(number==1 || number==2) {
			return 1;
		}
		return fib(number-1)+fib(number-2);
		
	}
	
    
	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		System.out.print("Bir sayı giriniz : ");
		int number= input.nextInt();
		
		for(int i=0; i<number; i++) {
			if(i==0) System.out.println("Fibonacci "+(i+1)+". eleman :" + 0);
			else System.out.println("Fibonacci "+(i+1)+". eleman :" + fib(i) );
		}
	
		
		  
	}
}
