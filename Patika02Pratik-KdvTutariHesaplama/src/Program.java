//www.patika.dev
//@author Tufan ERDOĞAN

/* Problem
 
	KDV Tutarı Hesaplayan Program

  Java ile kullanıcıdan alınan para değerinin KDV'li fiyatını ve KDV tutarını 
  hesaplayıp ekrana bastıran programı yazın.

  (Not : KDV tutarını 18% olarak alın)

  KDV'siz Fiyat = 10;

  KDV'li Fiyat = 11.8;

  KDV tutarı = 1.8;

	Ödev
	
  Eğer girilen tutar 0 ve 1000 TL arasında ise KDV oranı %18 , tutar 1000 TL'den 
  büyük ise KDV oranını %8 olarak KDV tutarı hesaplayan programı yazınız.
 
*/

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Lütfen Ücret Tutarını Giriniz: ");
		double tutar = scanner.nextInt();
		double kdv =(tutar<1000 && tutar>0) ? 1.18 : 1.08;
		double kdvli = tutar*kdv;
		
		scanner.close();
		
		System.out.println("KDV'siz Fiyat: "+ tutar);
		System.out.println("KDV'li Fiyat: "+ kdvli);
		System.out.println("KDV tutarı: " + (kdvli -tutar));

	}

}
