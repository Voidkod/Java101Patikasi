//www.patika.dev
//@author Tufan ERDOĞAN

/* Problem
	
	Java ile mesafeye ve şartlara göre uçak bileti fiyatı hesaplayan programı yapın. 
	Kullanıcıdan Mesafe (KM), yaşı ve yolculuk tipi (Tek Yön, Gidiş-Dönüş) bilgilerini alın. 
	Mesafe başına ücret 0,10 TL / km olarak alın. 
	İlk olarak uçuşun toplam fiyatını hesaplayın ve sonrasında ki koşullara göre müşteriye aşağıdaki indirimleri uygulayın ;


	1. Kullanıcıdan alınan değerler geçerli (mesafe ve yaş değerleri pozitif sayı, yolculuk tipi ise 1 veya 2) olmalıdır.
	    Aksi takdirde kullanıcıya "Hatalı Veri Girdiniz !" şeklinde bir uyarı verilmelidir.
	2. Kişi 12 yaşından küçükse bilet fiyatı üzerinden %50 indirim uygulanır.
	3. Kişi 12-24 yaşları arasında ise bilet fiyatı üzerinden %10 indirim uygulanır.
	4. Kişi 65 yaşından büyük ise bilet fiyatı üzerinden %30 indirim uygulanır.
	5. Kişi "Yolculuk Tipini" gidiş dönüş seçmiş ise bilet fiyatı üzerinden %20 indirim uygulanır.
	
	İpucu
	Normal Tutar = Mesafe * 0.10 = 1500 * 0.10 = 150 TL
	Yaş İndirimi = Normal Tutar * Yaş İndirim Oranı = 150 * 0.10= 15 TL
	İndirimli Tutar = Normal Tutar – Yaş İndirimi = 150 – 15 = 135 TL
	Gidiş Dönüş Bilet İndirimi = İndirimli Tutar * 0.20 = 135 * 0.20 = 27 TL
	Toplam Tutar = (135-27)* 2 = 216 TL
	
	Senaryo 1
	Mesafeyi km türünden giriniz : 1500
	Yaşınızı giriniz : 20
	Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ): 2
	
	Toplam Tutar = 216 TL
	
	
	Senaryo 2
	Mesafeyi km türünden giriniz : -500
	Yaşınızı giriniz : 1
	Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ): 77
	
	Hatalı Veri Girdiniz !
	
	 
	Senaryo 3
	Mesafeyi km türünden giriniz : 200
	Yaşınızı giriniz : 35
	Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ): 1
	
	Toplam Tutar = 20.0 TL
*/

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		int km,age,journeyType;
		double price=0;
		Scanner input=new Scanner(System.in);
		
		System.out.print("Mesafeyi km türünden giriniz : ");
		km=input.nextInt();
		System.out.print("Yaşınızı giriniz : ");
		age=input.nextInt();
		System.out.print("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ) : ");
		journeyType=input.nextInt();
			

			
		if(journeyType==1 || journeyType==2) {
				
			price=  km*0.1;
			
			if(age>0 && age<12) {
				price -= price*0.5;
			}
			if(age>=12 && age<=24) {
				price -= price*0.1;
			}
			if(age>65) {
				price -= price*0.3;
			}
			
			price -= price*((journeyType-1)*0.2);
			price *= journeyType;

			
			System.out.println("Toplam Tutar : "+ price +" TL");
		}
		else System.out.println("Hatalı Veri Girdiniz !");		

	}

}
