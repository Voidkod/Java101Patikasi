//www.patika.dev
//@author Tufan ERDOĞAN

/* 
	Boks Maçı
	Java Sınıflar ile boks maçını simüle eden programı yazıyoruz.
	
	Ödev
	Projeye ilk kimin dövüşe başlayacağını %50 olasılık ile hesaplayan sistemi entegre ediniz.
	
*/




public class Program{
	 public static void main(String[] args) {
	      Fighter marc = new Fighter("Marc" , 15 , 100, 90, 0);
	      Fighter alex = new Fighter("Alex" , 10 , 95, 100, 0);
	      Ring r = new Ring(marc,alex , 90 , 100);
	      r.run();
	    }
}