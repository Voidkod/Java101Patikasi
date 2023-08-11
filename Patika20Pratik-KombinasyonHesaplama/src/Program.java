//www.patika.dev
//@author Tufan ERDOĞAN

/* 
	Ödev
	N elemanlı bir kümenin elemanları ile oluşturulacak r elemanlı farklı grupların sayısı n’in r’li kombinasyonu olarak adlandırılır. N’in r’li kombinasyonu C(n,r) şeklinde gösterilir.
	
	Java ile kombinasyon hesaplayan program yazınız.
	
	Kombinasyon formülü
	C(n,r) = n! / (r! * (n-r)!)
*/

import java.util.Scanner;

public class Program {
	
	/* 
	   Yazacağımız kodu azaltmak için kombinasyon formülümüzü inceleyelim.
	   Kombinasyonu açarsak eğer n*n-1*..*r! / r!*(n-r)! olur ve r! ler sadeleşir.
	   Elimizde (n den r ye kadar olan sayıların çarpımı / (n-r)!)
	   Örnek Verecek olursak C(5,3) = 5*4/2*1, C(10,4) (10*9*8*7*6*5) / (3*2*1) 
	   Yani Kodumuzu yazarken n elemanlı faktöriyeli r yi çıkararak 2 parçaya ayırmalıyız.
	   N den r+1 kadar olan çarpım bölüm / r-1 den 1 e kadar olan bölüm
	   Bu şekilde problemimizi ve kodlarımızı sadeleştirmiş olacağız.
	 */

	public static void main(String[] args) {
		
		int n,r;
		int nR=1,r0=1;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Kombinasyon için toplam eleman sayısını giriniz : ");
		n = input.nextInt();
		System.out.print("Kombinasyon için istenilen eleman sayısını giriniz : ");
		r = input.nextInt();
		input.close();

		if(n>r){
			for(int i=1; i<=n; i++) {
				if(i<r) {
					r0 *= i;	
				}
				else if(i>r) {
					nR *=i;
				}
			}
		System.out.println("C("+n+","+r+") = " + nR/r0);
		}
		else System.out.println("Girilen toplam eleman sayısı, istenilen eleman sayısından büyük olmalıdır.");

	}

}
