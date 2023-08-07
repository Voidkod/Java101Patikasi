//www.patika.dev
//@author Tufan ERDOĞAN

/* Problem

Ödev
Girilen 3 sayıyı "küçükten büyüğe" sıralayan programı yazınız.

link:https://www.youtube.com/watch?v=_0o08B0XxZM&t=2s
 
*/

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int[]  num = {0,0,0}; 
		String info= "Girdiğiniz numaraların kücükten büyüğe sıralaması: ";
		
		for(int i=0; i<3; i++) {
			System.out.print("Küçükten büyüğe sıralamak için "+(i+1)+". sayıyı giriniz: ");
			num[i]=input.nextInt();
		}
		
		// For ile yapılsaydı 3 farklı sayı; küçükten büyüğe veya büyükten kücüğe max n-1 kez çalışarak sıralama yapabilirdi.
		// For ile sayı sıralaması yapmak daha mantıklı ancak konumuz if-else olduğu için if-else ile yapılacaktır.
		// 3 farklı sayı 3! yani 3*2=6 farklı şekilde yazılabilir. Yani 6 tane if-else olmalıdır.
		
		if(num[0]<num[1] && num[1]<num[2]) {
			System.out.println(info+num[0]+ "<"+ num[1]+"<"+num[2]);
		}
		if(num[0]<num[2] && num[2]<num[1]) {
			System.out.println(info+num[0]+ "<"+ num[2]+"<"+num[1]);
		}
		if(num[1]<num[0] && num[0]<num[2]) {
			System.out.println(info+num[1]+ "<"+ num[0]+"<"+num[2]);
		}
		if(num[1]<num[2] && num[2]<num[0]) {
			System.out.println(info+num[1]+ "<"+ num[2]+"<"+num[0]);
		}
		if(num[2]<num[0] && num[0]<num[1]) {
			System.out.println(info+num[2]+ "<"+ num[0]+"<"+num[1]);
		}
		if(num[2]<num[1] && num[1]<num[0]) {
			System.out.println(info+num[2]+ "<"+ num[1]+"<"+num[0]);
		}
		
		

		
	}

}
