//www.patika.dev
//@author Tufan ERDOĞAN

/* 
	Ödev
	Java ile kullanıcının girdiği değerler ile üslü sayı hesaplayan programı "For Döngüsü" kullanarak yapınız.
*/

import java.util.Scanner;

public class Program {
	
	public static void main(String[] args) {
		
		int n,k;
		int result=1;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Üssü alınacak sayı : ");
		n = input.nextInt();
		System.out.print("Üs olacak sayı : ");
		k = input.nextInt();
		input.close();
		
		for(int i=1; i<=k; i++) {
			result *= n;;
		}
		
		System.out.println("Cevap : "+ result );
		
		
	}

}
