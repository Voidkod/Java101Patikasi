//www.patika.dev
//@author Tufan ERDOĞAN

/* Problem

Koşullar :

Sıcaklık 5'dan küçük ise "Kayak" yapmayı öner.
Sıcaklık 5 ve 15 arasında ise "Sinema" etkinliğini öner.
Sıcaklık 15 ve 25 arasında ise "Piknik" etkinliğini öner.
Sıcaklık 25'ten büyük ise "Yüzme" etkinliğini öner.

Ödev
Aynı örnek üzerinden if koşulları başka hangi şekilde oluşturulabilirdi farklı çözüm yolları bulunuz.

link:https://www.youtube.com/watch?v=FGYoUQLMpT8&t=540s
 
*/

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
 
		int heat;
		
		Scanner  input= new Scanner(System.in);
		System.out.print("Sıcaklık Giriniz: ");
		heat=input.nextInt();
		
		if(heat<5) {
			System.out.println("Kayak yapabilirsiniz.");
		}
		if(heat>=5 && heat<=15) {
			System.out.println("Sinemaya gidebilirsiniz.");
		}
		if(heat>=10 && heat<=25) {
			System.out.println("Pikniğe gidebilirsiniz.");
		}
		if(heat>25) {
			System.out.println("Yüzmeye gidebilirsiniz.");
		}

		
	}

}
