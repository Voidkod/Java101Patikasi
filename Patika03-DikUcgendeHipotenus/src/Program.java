package Patika03DikUcgendeHipotenus;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		UcgenHesaplamalari ucgenHesapla= new UcgenHesaplamalari();
		Scanner read = new Scanner(System.in);
		boolean isTrue = true;
		
		while(isTrue){
			
		System.out.println("Üçgen hipotenüs Hesaplamak için 0, Üçgen Çevre ve Alan hesaplamak için lütfen 1 giriniz:  ");
		int num= read.nextInt();
		
		if(num==0) {
			System.out.println("Lütfen birbirine dik olan 2 kenarı yazınız: ");
			double a = read.nextDouble();
			double b = read.nextDouble();
			System.out.println("Dik kenarları girilen üçgenin hipotenüsü: "+ ucgenHesapla.ucgenHipotenusHesapla(a, b));	
			isTrue=false;
		}
		
		else if(num == 1 ) {
			System.out.println("Lütfen Çevresi ve Alanı Hesaplanacak Üçgenin kenarlarını giriniz: ");
			double a = read.nextDouble();
			double b = read.nextDouble();
			double c = read.nextDouble();
			
			System.out.println("Kenarları girilen üçgenin Çevresi: "+ ucgenHesapla.ucgenCevreHesapla(a, b, c));
			System.out.println("Kenarları girilen üçgenin Alanı: "+ ucgenHesapla.ucgenAlanHesapla(a, b, c));
			isTrue=false;
		}
		
		else {
			System.out.println("Belirtilen aralık dışında bir numara girdiniz. Lütfen yapmak istediğiniz hesaplamanın numarasını giriniz.");
			}
		}
	}

}
