//www.patika.dev
//@author Tufan ERDOĞAN

/* 
	Gelişmiş Hesap Makinesi
	Java ile kullanıcın seçtiği işlemleri yapan hesap makinesi yapıyoruz.
	
	Hesap makinesinin fonksiyonları :
	
	1- Toplama İşlemi
	2- Çıkarma İşlemi
	3- Çarpma İşlemi
	4- Bölme işlemi
	5- Üslü Sayı Hesaplama
	6- Faktoriyel Hesaplama
	7- Mod Alma
	8- Dikdörtgen Alan ve Çevre Hesabı
	
	Ödev
	Aynı projeye mod almak ve dikdörtgen alan çevre hesabını yapan metotları yazıp menüde işlevsel hale getiriniz.
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
