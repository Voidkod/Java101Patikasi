//www.patika.dev
//@author Tufan ERDOĞAN

/* 
				Ödev
			Java döngüler ile tek bir sayı girilene kadar kullanıcıdan girişleri kabul eden ve girilen değerlerden
			Çift ve 4'ün katları olan sayıları toplayıp ekrana basan programı yazıyoruz.
*/

import java.util.Scanner;

public class Program {

	//Bu ödevde farketmemiz gereken bir durum var. "Çift ve 4 ün katı". 
	//4 aslında 2x2 olduğundan her katı çifttir. sadece 4'e bölünebilme koşulu yeterlidir.
	
	public static void main(String[] args) {
			int sayi,total=0;
			
			Scanner input = new Scanner(System.in);
	
			do {		
				System.out.print("Sayı Giriniz: ");
				sayi=input.nextInt();
				if(sayi%4==0) {
					total += sayi;
				}
			}
			while(sayi%2 == 0);
			
			System.out.println("Toplam : "+ total);
		
	}

}
