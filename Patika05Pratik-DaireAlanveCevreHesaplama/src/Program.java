//www.patika.dev
//@author Tufan ERDOĞAN

/* Problem
 
	Dairenin Alanını ve Çevresini Hesaplayan Program
	
  Java ile yarı çapını kullanıcıdan aldığınız dairenin alanını ve çevresini hesaplayan programı yazın.

  Alan Formülü : π * r * r;

  Çevre Formülü : 2 * π * r;

	Ödev
	
  Yarıçapı r, merkez açısının ölçüsü 𝛼 olan daire diliminin alanı bulan programı yazınız.

  𝜋 sayısını = 3.14 alınız.

  Formül : (𝜋 * (r*r) * 𝛼) / 360
 
*/

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		//Pratik
		Scanner scanner = new Scanner(System.in);
		System.out.print("Lütfen dairenizin çevre ve alanını hesaplamak için dairenizin yarıçapını giriniz: ");
		
		double r = scanner.nextDouble();
		System.out.println("Dairenizin Çevresi: "+ 2*Math.PI*r);
		System.out.println("Dairenizin Alanı: " + Math.PI*Math.pow(r, 2) );	
		System.out.println("-----------------------------");
		//Ödev
		System.out.print("Daire Dilimi Alanı hesaplamak için Daire Merkez Açı Ölçüsü giriniz: ");
		double aci = scanner.nextDouble();
		System.out.print("Daire Dilimi Alanı hesaplamak için Daire Yarıçapı giriniz: ");
		r=scanner.nextDouble();
		System.out.println("Daire Dilimi Alanı: " + (Math.PI*Math.pow(r, 2)*aci)/360 );
		scanner.close();
	}

}
