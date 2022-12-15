

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		UcgenHesaplamalari ucgenHesapla= new UcgenHesaplamalari();
		Scanner read = new Scanner(System.in);
		
			
		System.out.print("Dik üçgenin Hipotenüsünü, Çevre ve Alanını hesaplamak için birbirine dik olan 2 kenarı girmelisiniz.Lütfen ilk kenar uzunluğunu giriniz:  ");
			double a = read.nextDouble();
		System.out.print("İkinci kenar uzunluğunu giriniz: ");
			double b = read.nextDouble();
			double c = ucgenHesapla.ucgenHipotenusHesapla(a, b);
			System.out.println("Dik kenarları girilen üçgenin hipotenüsü: " + c);	
			System.out.println("Dik Üçgenin Çevresi: "+ ucgenHesapla.ucgenCevreHesapla(a, b, c));
			System.out.println("Dik Üçgenin Alanı: "+ ucgenHesapla.ucgenAlanHesapla(a, b, c));
		}	
	}

