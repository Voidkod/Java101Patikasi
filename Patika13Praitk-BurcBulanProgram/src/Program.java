//www.patika.dev
//@author Tufan ERDOĞAN

/* Problem

Koç Burcu : 21 Mart - 20 Nisan

Boğa Burcu : 21 Nisan - 21 Mayıs

İkizler Burcu : 22 Mayıs - 22 Haziran

Yengeç Burcu : 23 Haziran - 22 Temmuz

Aslan Burcu : 23 Temmuz - 22 Ağustos

Başak Burcu : 23 Ağustos - 22 Eylül

Terazi Burcu : 23 Eylül - 22 Ekim

Akrep Burcu : 23 Ekim - 21 Kasım

Yay Burcu : 22 Kasım - 21 Aralık

Oğlak Burcu : 22 Aralık - 21 Ocak

Kova Burcu : 22 Ocak - 19 Şubat

Balık Burcu : 20 Şubat - 20 Mart

Ödev
Aynı örneği switch-case kullanmadan yapınız.

link: https://www.youtube.com/watch?v=poUWt30wSC0&t=276s
 
*/

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		int monthDay;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Doğduğunuz ay(Sayı olarak) : ");
		monthDay=(input.nextInt()*100);
		System.out.print("Doğduğunuz gün : ");
		monthDay += input.nextInt();
		
		if(monthDay<=1231 && monthDay>=101) {
			
			if(monthDay>=1222 || monthDay<=121) {
				System.out.println("Burcunuz Oğlak");
			}
			if(monthDay>=122 && monthDay<=219) {
				System.out.println("Burcunuz Kova");
			}
			if(monthDay>=220 && monthDay<=320) {
				System.out.println("Burcunuz Balık");
			}
			if(monthDay>=321 && monthDay<=420) {
				System.out.println("Burcunuz Koç");
			}
			if(monthDay>=421 && monthDay<=521) {
				System.out.println("Burcunuz Boğa");
			}
			if(monthDay>=522 && monthDay<=622) {
				System.out.println("Burcunuz İkizler");
			}
			if(monthDay>=623 && monthDay<=722) {
				System.out.println("Burcunuz Yengeç");
			}
			if(monthDay>=723 && monthDay<=822) {
				System.out.println("Burcunuz Aslan");
			}
			if(monthDay>=823 && monthDay<=922) {
				System.out.println("Burcunuz Başak");
			}
			if(monthDay>=923 && monthDay<=1022) {
				System.out.println("Burcunuz Terazi");
			}
			if(monthDay>=1023 && monthDay<=1121) {
				System.out.println("Burcunuz Akrep");
			}
			if(monthDay>=1122 && monthDay<=1221) {
				System.out.println("Burcunuz Yay");
			}
			
		}
		else System.out.println("Girdiğiniz Ay veya gün yanlıştır. Lütfen kontrol ederek tekrar deneyiniz. ");

		
		
	}
}
