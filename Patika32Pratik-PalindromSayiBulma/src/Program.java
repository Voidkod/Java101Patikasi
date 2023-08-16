//www.patika.dev
//@author Tufan ERDOĞAN

/* 
	Java döngüler ile fibonacci serisi bulan program yazıyoruz. Fibonacci serisinin eleman sayısını kullanıcıdan alın.
	
	Fibonacci Serisi Nedir ?
	Fibonacci serisi, her sayının kendinden önceki ile toplanması sonucu oluşan bir sayı dizisidir. Bu şekilde devam eden bu dizide sayılar birbirleriyle oranlandığında altın oran ortaya çıkar, yani bir sayı kendisinden önceki sayıya bölündüğünde altın orana gittikçe yaklaşan bir dizi elde edilir.
	
	Fibonacci dizisi, 0'dan başlar ve sonsuza kadar. Her rakam, bir önceki rakamla toplanır. Elde edilen sonuç rakamın sağ tarafına yazılır. Fibonacci dizisinin ilk on sayısı şu şekildedir:
	
	9 Elemanlı Fibonacci Serisi : 0 1 1 2 3 5 8 13 21 34
	
	 0 + 1 = 1
	
	 1 + 1 = 2
	
	 1 + 2 = 3
	
	 2 + 3 = 5
	
	 3 + 5 = 8
	
	 5 + 8 = 13
	
	 8 + 13 = 21
	
	 13 + 21 = 34
*/

import java.util.Scanner;

public class Program {
	
	//int-String ve String-int dönüşümleriyle Palindrom sayı bulma.
	
	static void  isPalindrom(int number) {
		
		String numString=Integer.toString(number);
		String temp="";
		
		for(int i=numString.length()-1; i>=0; i--) {
			temp += numString.charAt(i);
		}
		
		int reverse = Integer.parseInt(temp);
		
		if(number==reverse) System.out.println(number + " Palindrom bir sayıdır.");
		else System.out.println(number + " Palindrom bir sayı değildir.");
	}
	
    
	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		System.out.print("Bir sayı giriniz : ");
		int number= input.nextInt();
		
		isPalindrom(number);
		  
	}
}
