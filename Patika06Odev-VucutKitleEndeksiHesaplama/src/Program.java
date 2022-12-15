//www.patika.dev
//@author Tufan ERDOĞAN

/* Problem
 
	Vücut Kitle İndeksi Hesaplama
	
  Java ile kullanıcıdan boy ve kilo değerlerini alıp bir değişkene atayın. Aşağıdaki formüle göre kullanıcının "Vücut Kitle İndeks" değerini hesaplayıp ekrana yazdırın.

	Formül
	
  Kilo (kg) / Boy(m) * Boy(m)

	Çıktısı
	
  Lütfen boyunuzu (metre cinsinde) giriniz : 1,72
  Lütfen kilonuzu giriniz : 105
  Vücut Kitle İndeksiniz : 35.49215792320173
 
*/

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Lütfen boyunuzu (metre cinsinde) giriniz : ");
		double boy = scanner.nextDouble();
		System.out.print("Lütfen kilonuzu giriniz : ");
		double kilo = scanner.nextDouble();
		System.out.println("Vücut Kitle İndeksiniz : " + kilo/Math.pow(boy,2));
		scanner.close();
	}

}
