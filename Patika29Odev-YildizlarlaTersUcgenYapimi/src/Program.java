//www.patika.dev
//@author Tufan ERDOĞAN

/* 
	Java ile basamak sayısının kullanıcıdan alınan ve döngüler kullanılarak, yıldızlar(*) ile ekrana ters üçgen çizen programı yazın.

	Örnek
	Basamak Sayısı : 10
	
	 ******************* 
	  ***************** 
	   *************** 
	    *************
	     *********** 
	      *********
	       ******* 
	        ***** 
	         *** 
	          *
*/

import java.util.Scanner;

public class Program {
	
	public static void main(String[] args) {
		
		int number;
		String star="*",space=" ";
		Scanner input = new Scanner(System.in);
		
		System.out.print("Bir sayı giriniz : ");
		number=input.nextInt();
		input.close();
		
		int triangleBase = (2 * number) - 1;
		for (int column = 1; column <= number; column++) {
		    for (int line = 1; line <= triangleBase; line++) {
		        if (column <= line ) {
		            System.out.print(star);
		        } else {
		            System.out.print(space);
		        }	        
		        
		    }
		    triangleBase --;
		    System.out.println();
		}
		
	}
}

