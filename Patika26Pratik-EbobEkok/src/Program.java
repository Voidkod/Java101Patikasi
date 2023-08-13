//www.patika.dev
//@author Tufan ERDOĞAN

/* 
	Java ile iki sayının EBOB ve EKOK değerlerini bulan program yazıyoruz.
	
	EBOB : İki ya da daha fazla doğal sayının ortak bölenlerinin en büyüğüne bu sayıların en büyük ortak böleni, kısaca EBOB‘u denir.
	
	ÖRNEK: 18 ve 24 sayılarının en büyük ortak bölenini adım adım bulalım.
	
	18’in bölenleri : 1, 2, 3, 6, 9, 18
	
	24’ün bölenleri : 1, 2, 3, 4, 6, 8, 12, 24
	
	Bu ortak bölenlerin en büyüğü 6 sayısı EBOB’tur.
	
	EKOK : İki ya da daha fazla doğal sayının ortak katlarının en küçüğüne bu sayıların en küçük ortak katı, kısaca EKOK‘u denir.
	
	ÖRNEK: 6 ve 8 sayılarının en küçük ortak katını adım adım bulalım.
	
	6’nın katları : 6, 12, 18, 24, 30, 36, 42, 48, …
	
	8’in katları : 8, 16, 24, 32, 40, 48, 56, 64, …
	
	Bu ortak katlardan en küçüğü 24 sayısı EKOK’tur.
	
	EKOK = (n1*n2) / EBOB
	
	Ödev
	Java ile iki sayının EBOB ve EKOK değerlerini "While Döngüsü" kullanarak yazınız.
*/

import java.util.Scanner;

public class Program {
	
	public static void main(String[] args) {
		
		int number1,number2,ebob=0;
		Scanner input = new Scanner(System.in);
		
		System.out.print("EBOB ve EKOK unu bulmak istediğiniz ilk sayıyı giriniz : ");
		number1=input.nextInt();
		System.out.print("EBOB ve EKOK unu bulmak istediğiniz ikinci sayıyı giriniz : ");
		number2=input.nextInt();
		input.close();
		
		int i = (number1<number2) ? number1 : number2;
		
		while(i>0) {
			if((number1 % i ==0) && (number2%i==0)) {
				ebob=i;
				break;
			}
			i--;
		}
		
		System.out.println("Girilen Sayıların Ebob u : "+ebob+", Ekok u : "+ (number1*number2)/ebob);

	
	}

}
