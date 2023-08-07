//www.patika.dev
//@author Tufan ERDOĞAN

/* Problem
 
 Videodaki hesap makinesini switch-case kullanarak yapınız.
   
 link: https://www.youtube.com/watch?v=XiXHRVm_hJY
 */



import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		int select = 0;
		double number1,number2;
		boolean isTrue=true;
		
		Scanner input = new Scanner(System.in);
		System.out.println("İlk Sayıyı Giriniz: ");
		number1 = input.nextDouble();
		
		while(isTrue) {
			
		System.out.println("İşlem seçiniz:\n1-Toplama\n2- Çıkarma\n3-Çarpma\n4-Bölme ");
		select= input.nextInt();
			if(select>4 || select <1) {
				System.out.println("Seçmek istediğiniz işlem listemizde bulunmamaktadır..\nLütfen listemizi inceleyip tekrar seçiniz.\n");
				isTrue=true;
			}
			else isTrue=false;
		}

		System.out.println("İkinci Sayıyı Giriniz: ");
		number2=input.nextDouble();
		
		switch(select) {
			case 1: System.out.println("Sonuç: " + (number1+number2)); break;
			case 2: System.out.println("Sonuç: " + (number1-number2)); break;
			case 3: System.out.println("Sonuç: " + (number1*number2)); break;
			case 4: System.out.println("Sonuç: " + (number1/number2)); break;
			
				default: System.out.println("Bilinmedik bir sorun oluştu..");
		}
		
		
	}

}
