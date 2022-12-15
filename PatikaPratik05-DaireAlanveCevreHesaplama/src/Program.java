import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		//Pratik
		Scanner oku = new Scanner(System.in);
		System.out.print("Lütfen dairenizin çevre ve alanını hesaplamak için dairenizin yarıçapını giriniz: ");
		
		double r = oku.nextDouble();
		System.out.println("Dairenizin Çevresi: "+ 2*Math.PI*r);
		System.out.println("Dairenizin Alanı: " + Math.PI*Math.pow(r, 2) );	
		System.out.println("-----------------------------");
		//Ödev
		System.out.print("Daire Dilimi Alanı hesaplamak için Daire Merkez Açı Ölçüsü giriniz: ");
		double aci = oku.nextDouble();
		System.out.print("Daire Dilimi Alanı hesaplamak için Daire Yarıçapı giriniz: ");
		r=oku.nextDouble();
		System.out.println("Daire Dilimi Alanı: " + (Math.PI*Math.pow(r, 2)*aci)/360 );
	}

}
