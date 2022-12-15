//www.patika.dev
//@author Tufan ERDOĞAN

/* Problem
 
	Taksimetre Programı
	
  Java ile gidilen mesafeye (KM) göre taksimetre tutarını ekrana yazdıran programı yazın.

  1.) Taksimetre KM başına 2.20 TL tutmaktadır.
  2.)Minimum ödenecek tutar 20 TL'dir. 20 TL altında ki ücretlerde yine 20 TL alınacaktır.
  3.)Taksimetre açılış ücreti 10 TL'dir.
 
*/

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// Değişebilir değerler değişkenlere bağlandı ve minimum kod satırı kullanmaya özen gösterildi.
		
		double minTutar = 20,kmTutar =2.2,acilis=10;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Lütfen KM cinsinden mesafeyi giriniz: ");
		double tutar=acilis+(kmTutar*scanner.nextDouble());
		tutar = (tutar>minTutar) ? tutar : minTutar;
		System.out.println("Toplam tutar "+tutar);
		scanner.close();
	}

}
