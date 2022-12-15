import java.util.HashMap;
import java.util.Scanner;

public class Program {

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
