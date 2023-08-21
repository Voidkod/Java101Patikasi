//www.patika.dev
//@author Tufan ERDOĞAN

/* 
	Ödev
	Şimdi sıra sende! Bir sayı dizisindeki tekrar eden çift sayıları belirten bir program yazarak 
	GitHub reposunu bizimle paylaşmalısın. Kolay gelsin.
*/

import java.util.Arrays;

public class Program{
	 public static void main(String[] args) {
		int[] list = {1,2,23,6,2,5,5,8,9,8,4,2,10};
		 int count=0;
		 
		Arrays.sort(list);
		for(int i=0; i<list.length-1; i++) {
			if(list[i]==list[i+1] && list[i]%2==0) {
				count++;
			}
			else if(count!=0) {
				System.out.println(list[i]+" çift sayısı dizide "+(count+1)+" adet bulundu ve "+count+" kez tekrar etmiştir.");
				count=0;
			}
			
		}
		 
	 
	 }
}