//www.patika.dev
//@author Tufan ERDOĞAN

/* 
Java'da döngüler kullanarak yıldızlar ile elmas yapınız.

    *
   *** 
  ***** 
 ******* 
*********
 ******* 
  ***** 
   ***
    *
     
*/

import java.util.Scanner;

public class Program {
	
	public static void main(String[] args) {
		
		int number,diamondColumn,underDiamond,diamondSize;
		String space=" ",star="*";
		Scanner input = new Scanner(System.in);
		
		System.out.print("Çizilecek elmasın büyüklüğü için sayı giriniz : ");
		number = input.nextInt();
		input.close();
		
		diamondSize=(number*2)-1;
		underDiamond=diamondSize-number;
		
		for(int i=1; i<=diamondSize; i++) {
			
			if(i<=number) {
				diamondColumn=i;
			}
			else diamondColumn=underDiamond--;
			
			for(int j=1; j<=(number-diamondColumn); j++) {
				System.out.print(space);
			}
			for(int k=1; k<=((diamondColumn*2)-1); k++) {
				System.out.print(star);
			}
			System.out.println(space);
		}

	
	}

}
