//www.patika.dev
//@author Tufan ERDOĞAN

/* 
	Ödev
	Dizideki elemanların girilen sayıdan küçük en yakın sayıyı ve en büyük en yakın sayıyı bulan programı yazınız.
	
	Dizi : {15,12,788,1,-1,-778,2,0}
	Girilen Sayı : 5
	Girilen sayıdan küçük en yakın sayı : 2
	Girilen sayıdan büyük en yakın sayı : 12
*/

import java.util.Scanner;
import java.util.Arrays;

public class Program{
	 public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);
		 int number;
		 int[] arr = {15,12,788,1,-1,-778,2,0};
		 
		 System.out.print("Bir sayı giriniz : ");
		 number=input.nextInt();
		 
		 System.out.print("Dizi : ");
		 System.out.println(ArrayHelper.arrayPrint(arr)); //Alternatif System.out.println(Arrays.toString(arr));
		 ArrayHelper.arraySort(arr);                      // Alternatif Arrays.sort(arr);
		 ArrayHelper.closestNumbers(arr, number);
	    }
}