//www.patika.dev
//@author Tufan ERDOĞAN

/* 
	Java dilinde, dizideki elemanların kaç kez tekrar edildiğini yani frekanslarını bulan programı yazınız.

	Senaryo
	Dizi : [10, 20, 20, 10, 10, 20, 5, 20]
	Tekrar Sayıları
	10 sayısı 3 kere tekrar edildi.
	20 sayısı 4 kere tekrar edildi.
	5 sayısı 1 kere tekrar edildi.
*/

import java.util.Arrays;

public class Program{
	
	static void arraySort (int [] arr) {
		int temp;
		boolean isTurn=true;
		int count=0;
		
		while(isTurn) {
			count=0;
			for(int i=0; i<arr.length-1; i++) {
				if(arr[i]>arr[i+1]) {
					temp=arr[i+1];
					arr[i+1]=arr[i];
					arr[i]=temp;
				}
				else count++;
			}
			if(count==arr.length-1) isTurn=false;
		}
	}
	
	
	 public static void main(String[] args) {
		
		 int [] list = {10, 20, 20, 10, 10, 20, 5, 20, 30};
		 int count=1;
		 
		 System.out.println("Dizi : "+Arrays.toString(list));
		 arraySort(list);
		 System.out.println("Tekrar Sayıları");
		
		 for(int i=0; i<list.length-1; i++) {
			 if(list[i]==list[i+1]) {
				count++; 
			 }
			 if(list[i]==list[i+1] && i==list.length-2) {
				 System.out.println(list[i]+" sayısı "+count+" kere tekrar etti." );
				 count=1;
			 }
			 if(list[i]!=list[i+1]) {
				 System.out.println(list[i]+" sayısı "+count+" kere tekrar etti." );
				 count=1;
			 }
			 if(list[i]!=list[i+1] && i==list.length-2) {
				 count=1;
				 System.out.println(list[i+1]+" sayısı "+count+" kere tekrar etti." );
			 }
			 
		 }
	 
	 }
}