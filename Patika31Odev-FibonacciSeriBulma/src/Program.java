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
	
	public static void main(String[] args) {
		
		int number,fibonacciSeri=0, fibonacci=1,result;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Fibonacci serisinin eleman sayısı giriniz : ");
		number=input.nextInt();
		System.out.println();
		//Fibonacci Seri Gösterimi
		
		System.out.print(number+" elemanlı Fibonacci Serisi : ");
		for(int i=0; i<number; i++) {
			
			result= fibonacciSeri+fibonacci;
			System.out.print(fibonacciSeri + " ");
			
			fibonacciSeri = fibonacci;
			fibonacci=result;
		}
		
		//Sıfırlama
		fibonacci=1;
		fibonacciSeri=0;
		result=0;
		System.out.println("\n");
		
		//Fibonacci toplama ile gösterimi
		for(int i=0; i<number; i++) {
			
			result= fibonacciSeri+fibonacci;
			System.out.println(fibonacciSeri + "+" + fibonacci + "=" +result );
			
			fibonacciSeri = fibonacci;
			fibonacci=result;
		}

		
		
	}
}

