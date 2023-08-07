//www.patika.dev
//@author Tufan ERDOĞAN

/* Problem

Dersler : Matematik, Fizik, Türkçe, Kimya, Müzik
Geçme Notu : 55

Ödev

Eğer girilen ders notları 0 veya 100 arasında değil ise ortalamaya katılmasın.

link: https://www.youtube.com/watch?v=sDKXvkKZbJM
   
 */

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
 
		String[] dersler = { "Matematik", "Fizik", "Kimya", "Türkçe", "Müzik" };
		Scanner input = new Scanner(System.in);
		
		int sum=0;
		int temp;
		
		for(int i=0; i<dersler.length; i++) {
			System.out.print(dersler[i] + " Notunuzu giriniz: ");
			temp=input.nextInt();
			if(temp>0 && temp<100) {
				sum += temp;
			}
			else System.out.println("Ortalamaya katılmaz");
		}
		
		sum = sum /dersler.length;
		
		if(sum >= 55) {
			System.out.println("Ortalamanız: "+sum+"\nTebrikler, sınıfı geçtiniz!");
		}
		else {
			System.out.println("Ortalamanız: "+sum+"\nÜzgünüm, sınıfta kaldınız.");
		}
		
		
	}

}
