//www.patika.dev
//@author Tufan ERDOĞAN

/* 
	Java dilinde, dizideki elemanları küçükten büyüğe sıralayan programı yazınız. 
	Dizinin boyutunu ve dizinin elemanlarını kullanıcıdan alınız.

	Senaryo
	Dizinin boyutu n : 5
	Dizinin elemanlarını giriniz :
	1. Elemanı : 99
	2. Elemanı : -2
	3. Elemanı : -2121
	4. Elemanı : 1
	5. Elemanı : 0
	Sıralama : -2121 -2 0 1 99
	
	
	Dizinin boyutu n : 6
	Dizinin elemanlarını giriniz :
	1. Elemanı : 1000221
	2. Elemanı : 22
	3. Elemanı : -1
	4. Elemanı : 999
	5. Elemanı : 0
	6. Elemanı : 254
	Sıralama : -1 0 22 254 999 1000221 
*/

import java.util.Scanner;

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
		
		
		Scanner input= new Scanner(System.in);
		System.out.print("Dizinin boyutunu giriniz : ");
		int [] list= new int [input.nextInt()];
		
		System.out.println("Dizzinin elemanlarını giriniz : ");
		for(int i=0; i<list.length; i++) {
			System.out.print((i+1)+". Elemanı : ");
			list[i]=input.nextInt();
		}
		
		arraySort(list); // alternatif Arrays.sort(list)
		
		System.out.print("Sıralama : ");
		
		for(int i : list) {
			System.out.print(i+" ");
		}

	 
	 }
}