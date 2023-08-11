//www.patika.dev
//@author Tufan ERDOĞAN

/* 
			Ödev
		Java döngüler ile girilen sayıya kadar olan 4 ve 5'in kuvvetlerini ekrana yazdıran programı yazıyoruz.
*/

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		int sinir,result1=1,result2=1, number1=4,number2=5;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Sınır Sayısını Giriniz : ");
		sinir = input.nextInt();
		
		for(int i=0; i<sinir; i++) {
			result1 *= number1;
			result2 *= number2;
		}
		
		System.out.println(number1 +" sayısının girilen sayı kuvveti : "+ result1);
		System.out.println(number2 +" sayısının girilen sayı kuvveti : "+ result2);
		
	}

}
