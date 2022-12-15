
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner oku = new Scanner(System.in);
		System.out.print("Lütfen Ücret Tutarını Giriniz: ");
		double tutar = oku.nextInt();
		double kdv =(tutar<1000 && tutar>0) ? 1.18 : 1.08;
		double kdvli = tutar*kdv;
		
		System.out.println("KDV'siz Fiyat: "+ tutar);
		System.out.println("KDV'li Fiyat: "+ kdvli);
		System.out.println("KDV tutarı: " + (kdvli -tutar));

	}

}
