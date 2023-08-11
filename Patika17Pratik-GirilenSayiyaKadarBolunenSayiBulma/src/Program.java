//www.patika.dev
//@author Tufan ERDOĞAN

/* 
		   Ödev
		Java döngüler ile 0'dan girilen sayıya kadar olan sayılardan 3 ve 4'e tam bölünen sayıların
		 ortalamasını hesaplayan programı yazınız.
*/

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
			int sayi,sum=0,count=0;
			
			Scanner input = new Scanner(System.in);
			System.out.print("Sayı Giriniz: ");
			sayi=input.nextInt();
			
			for(int i=0; i<=sayi; i++) {
				if(i%3==0 && i%4==0 && i !=0) {
					sum +=i;
					count++;
				}
			}
			
			System.out.println(sayi+" sayısına kadar olan, 3 ve 4'e bölünen sayıların ortalaması : "+ (sum/count));
			
		
	}

}
