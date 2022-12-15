//www.patika.dev
//@author Tufan ERDOĞAN

/* Problem
 
	Dik Üçgende Hipotenüs Bulan Program
	
  Java ile kullanıcıdan dik kenarlarının uzunluğunu alan ve hipotenüsü hesaplayan programı yazın.

	Ödev
	
  Üç kenar uzunluğunu kullanıcıdan aldığınız üçgenin alanını hesaplayan programı yazınız.

	Formül
	
  Üç𝑔𝑒𝑛𝑖𝑛 ç𝑒𝑣𝑟𝑒𝑠𝑖 = 2𝑢

  𝑢 = (a+b+c) / 2

  Alan * Alan = 𝑢 * (𝑢 − 𝑎)* (𝑢 − 𝑏) * (𝑢 − 𝑐)
 
*/


import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		UcgenHesaplamalari ucgenHesapla= new UcgenHesaplamalari();
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Dik üçgenin Hipotenüsünü, Çevre ve Alanını hesaplamak için birbirine dik olan 2 kenarı girmelisiniz.Lütfen ilk kenar uzunluğunu giriniz:  ");
			double a = scanner.nextDouble();
		System.out.print("İkinci kenar uzunluğunu giriniz: ");
			double b = scanner.nextDouble();
			double c = ucgenHesapla.ucgenHipotenusHesapla(a, b);
			scanner.close();
			
			System.out.println("Dik kenarları girilen üçgenin hipotenüsü: " + c);	
			System.out.println("Dik Üçgenin Çevresi: "+ ucgenHesapla.ucgenCevreHesapla(a, b, c));
			System.out.println("Dik Üçgenin Alanı: "+ ucgenHesapla.ucgenAlanHesapla(a, b, c));
		}	
	}

