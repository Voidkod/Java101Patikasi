//www.patika.dev
//@author Tufan ERDOĞAN

/* 
	Dizideki Elemanların Ortalamasını Hesaplayan Program
	public class Main {
	    public static void main(String[] args) {
	        int[] numbers = {1, 2, 3, 4, 5};
	        int sum = 0;
	        for (int i = 0; i < numbers.length; i++) {
	            sum += numbers[i];
	        }
	
	        System.out.println(sum / numbers.length);
	    }
	}
	
	Ödev
	Dizideki sayıların harmonik ortalamasını hesaplayan programı yazınız.
	
	Harmonik Ortalama formülü : n (eleman sayısı) / elemanların harmonik serisi
	
	Harmonik Seri Formülü :  https://raw.githubusercontent.com/Kodluyoruz/taskforce/main/java101/pratik-harmonic/figures/harmonic_series.gif
	
*/

public class Program{
	 public static void main(String[] args) {
		 int[] harmonicSeries = {1,2,3,4,5};
		 
		 System.out.println(harmonicMean(harmonicSeries));
	       
	    }
	 
	 static double harmonicMean(int[] arr) {
		 double harmonicSeries=0;
		 for(double i : arr ) {
			 harmonicSeries += 1/i;
		 }
		 
		 return arr.length/harmonicSeries;
		 
	 }
}