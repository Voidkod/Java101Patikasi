//www.patika.dev
//@author Tufan ERDOĞAN

/* Problem

Ödev

Eğer şifre yanlış ise kullanıcıya şifresini sıfırlayıp sıfırlamayacağını sorun,
eğer kullanıcı sıfırlamak isterse yeni girdiği şifrenin hatalı girdiği ve unuttuğu
 şifre ile aynı olmaması gerektiğini kontrol edip , şifreler aynı ise ekrana 
 "Şifre oluşturulamadı, lütfen başka şifre giriniz." sorun yoksa "Şifre oluşturuldu" yazan programı yazınız.

 link: https://www.youtube.com/watch?v=_mFztFPmIQo
   
 */

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		String userName="patika";
		String password="Java101";
		String inputUserName,inputPassword,inputSetPassword;
		
		
		Scanner input = new Scanner(System.in);
		
		
		boolean isTrue=true;
		
		while(isTrue) {
			
			System.out.print("Kullanıcı Adınız: ");
			inputUserName=input.nextLine();
			System.out.print("Şifreniz: ");
			inputPassword=input.nextLine();
			
			if(userName.equals(inputUserName) && password.equals(inputPassword)){
				System.out.println("Giriş Başarılı");
				isTrue=false;
			}
			
			else {
				System.out.print("Kullanıcı adınız ve Şifreniz yanlıştır. Şifrenizi sıfırlamak isterseniz büyük harflerle 'EVET' yazın:");
				if(input.nextLine().equalsIgnoreCase("EVET")) {
					System.out.println("Kullanıcı Adınızı Giriniz: ");
					if(input.nextLine().equalsIgnoreCase(userName)) {
						System.out.println("Yeni Şifreniz eski şifrenizle aynı olmamalıdır.");
						System.out.print("Yeni Şifrenizi giriniz: ");
						inputSetPassword=input.nextLine();
						if(inputSetPassword.equals(password)) {
							System.out.println("Yeni Şifreniz eski şifrenizle aynı. Lütfen tekrar giriş yapınız.");
						}
						else {
							password = inputSetPassword;
							System.out.println("Şifreniz başarıyla oluşturuldu. Tekrar giriş yapabilirsiniz.");
						}
					}
					else {
						System.out.println("Kullanıcı bulunamadı. Lütfen daha sonra tekrar giriş yapmayı deneyiniz..");
						isTrue=false;
					}
				}
				else {
					System.out.println("Lütfen daha sonra tekrar giriş yapmayı deneyiniz..");
					isTrue=false;
				}
			}
		}
		
	}

}
