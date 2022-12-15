import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner oku = new Scanner(System.in);
		
		System.out.print("Lütfen boyunuzu (metre cinsinde) giriniz : ");
		double boy = oku.nextDouble();
		System.out.print("Lütfen kilonuzu giriniz : ");
		double kilo = oku.nextDouble();
		System.out.println("Vücut Kitle İndeksiniz : " + kilo/Math.pow(boy,2));
	}

}
