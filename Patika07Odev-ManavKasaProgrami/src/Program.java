//www.patika.dev
//@author Tufan ERDOĞAN

/* Problem
 
	Manav Kasa Programı
	
  Java ile kullanıcıların manavdan almış oldukları ürünlerin kilogram değerlerine göre 
  toplam tutarını ekrana yazdıran programı yazın.

	Meyveler ve KG Fiyatları

  Armut : 2,14 TL
  Elma : 3,67 TL
  Domates : 1,11 TL
  Muz: 0,95 TL
  Patlıcan : 5,00 TL
  
	Örnek Çıktı;

  Armut Kaç Kilo ? :0
  Elma Kaç Kilo ? :1
  Domates Kaç Kilo ? :1
  Muz Kaç Kilo ? :2
  Patlıcan Kaç Kilo ? :3
  
	Toplam Tutar : 21.68 TL
 
*/

import java.util.HashMap;
import java.util.Scanner;

public class Program {
	
	/* Bu problem 2 Dizi ve bir for döngüsüyle yapılabilir. Ancak bir veritabanından veri geldiğini düşünürsek,
	 dizilerin birbirine eşit olmama durumu ve bu problemi ortadan kaldırmak için kontrol kodu yazmaktansa,
	 Hashmap kullanmanın daha güvenli ve hızlı olabileceğini düşündüm.
	 */

	public static void main(String[] args) {
		
		Scanner oku = new Scanner(System.in);
		
		HashMap<String, Double> manav = new HashMap<String, Double>();
		manav.put("Armut", 2.14);
		manav.put("Patlıcan", 5.0);
		manav.put("Muz", 0.95);
		manav.put("Elma", 3.67);
		manav.put("Domates", 1.11);
		
		double tutar = 0;
		
		for (String meyve : manav.keySet()) {
			System.out.print(meyve + " Kaç kilo ? :");
			tutar += manav.get(meyve) * oku.nextDouble();
		}
		System.out.println("Toplam Tutar : " + tutar + " TL");
	}
}
