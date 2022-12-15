//www.patika.dev
//@author Tufan ERDOĞAN

/* Problem
 * 
 	Not Ortalaması Hesaplayan Program
  Java ile Matematik, Fizik, Kimya, Türkçe, Tarih, Müzik derslerinin sınav puanlarını 
  kullanıcıdan alan ve ortalamalarını hesaplayıp ekrana bastırılan programı yazın.

	Ödev
	
  Aynı program içerisinde koşullu ifadeler kullanılarak, eğer kullanıcının ortalaması 
  60'dan büyük ise ekrana "Sınıfı Geçti" , küçük ise "Sınıfta Kaldı" yazsın.

   Not : If ve Else kullanılmayacak...
   
 */

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		String[] dersler = { "Matematik", "Fizik", "Kimya", "Türkçe", "Tarih", "Müzik" };
		double sum = 0;
		int temp = 0;
		String info;
		Scanner scanner = new Scanner(System.in);

		for (int i = 0; i < dersler.length; i++) {
			System.out.print(dersler[i] + " Notunuzu giriniz: ");
			temp = scanner.nextInt();
			info = (temp <= 100 && temp >= 0) ? ""
					: "Girdiğiniz Not: " + temp + " ve not aralığında (0-100) değildir. Lütfen kontrol ederek tekrar ";
			System.out.print(info);
			sum += (temp <= 100 && temp >= 0) ? temp : 0;
			i = (temp <= 100 && temp >= 0) ? i : i - 1;
		}
		
		scanner.close();

		sum = sum / dersler.length;
		System.out.println("--------------------------------");
		System.out.println((sum > 60) ? "Sınıfı geçti" : "Sınıfta Kaldı");
	}
}
