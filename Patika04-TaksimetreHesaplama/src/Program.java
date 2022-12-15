import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// Değişebilir değerler değişkenlere bağlandı ve minimum kod satırı kullanmaya özen gösterildi.
		
		double minTutar = 20,kmTutar =2.2,acilis=10;
		
		Scanner oku = new Scanner(System.in);
		
		System.out.print("Lütfen KM cinsinden mesafeyi giriniz: ");
		double tutar=acilis+(kmTutar*oku.nextDouble());
		tutar = (tutar>minTutar) ? tutar : minTutar;
		System.out.println("Toplam tutar "+tutar);

	}

}
