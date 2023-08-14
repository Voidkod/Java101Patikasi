//www.patika.dev
//@author Tufan ERDOĞAN

/* 
	Java ile klavyeden girilen N tane sayma sayısından en büyük ve en küçük sayıları bulan ve bu sayıları ekrana yazan programı yazın.

	Senaryo
		Kaç tane sayı gireceksiniz: 4
		1. Sayıyı giriniz: 16
		2. Sayıyı giriniz: -22
		3. Sayıyı giriniz: -15
		4. Sayıyı giriniz: 100
		En büyük sayı: 100
		En küçük sayı: -22
*/

import java.util.Scanner;

public class Program {
	
	public static void main(String[] args) {
		
		int lenght,minNumber=0,maxNumber=0,temp;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Kaç tane sayı gireceksiniz : ");
		lenght=input.nextInt();
		
		for(int i=1; i<=lenght; i++) {
			System.out.print(i +". Sayıyı giriniz : ");
			temp=input.nextInt();
			if(temp>minNumber) maxNumber=temp;
			else minNumber=temp;
		}
		System.out.print("En büyük sayı : "+maxNumber+"\nEn küçük sayı : "+minNumber);
		input.close();
	}
}
