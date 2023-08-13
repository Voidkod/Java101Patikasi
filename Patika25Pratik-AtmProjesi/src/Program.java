//www.patika.dev
//@author Tufan ERDOĞAN

/* 
	Java döngüler ile kullanıcının banka hesabını yönetebildiği bir ATM projesi yapıyoruz.
	Aynı projedeki ATM işlemlerini "Switch-Case" kullanarak yapınız.
	link: https://www.youtube.com/watch?v=UN5xIYKFCfA&t=118s
*/

import java.util.Scanner;

public class Program {
	
	public static void main(String[] args) {
		
		String userName,password;
		Scanner input = new Scanner(System.in);
		int count=3;
		int select;
		int balance = 1500;
		
		while(count>0) {
			System.out.print("Kullanıcı Adınız : ");
			userName = input.nextLine();
			System.out.print("Şifreniz : ");
			password = input.nextLine();
			
			if(userName.equals("patika") && password.equals("java101")) {
				System.out.println("Merhaba "+userName+" X Bankasına Hoşgeldiniz! \n");
				do {
					System.out.println("1-Para Yatırma\n"+"2-Para Çekme\n"+"3-Bakiye Sorgulama\n"+"4-Çıkış Yap");
					System.out.print("Lütfen Yapmak istediğiniz işlemi seçiniz : ");
					select= input.nextInt();
					System.out.print("\n");
					
					switch (select) {
                    case 1:
                        System.out.print("Yatırmak istediğiniz para miktarını giriniz: ");
                        int deposit = input.nextInt();
                        balance += deposit;
                        System.out.print("\n");
                        break;
                    case 2:
                        System.out.print("Çekmek istediğiniz para miktarını giriniz : ");
                        int withdraw = input.nextInt();
                        if (withdraw > balance) {
                            System.out.println("Bakiye yetersiz. \n");
                        } else {
                            balance -= withdraw;
                            System.out.print("\n");
                        }
                        break;
                    case 3:
                        System.out.println("Bakiyeniz: " + balance + "\n");

                        break;
                    case 4:
                        System.out.println("Tekrar görüşmek üzere.");
                        break;
                    default:
                        System.out.println("Geçersiz işlem, lütfen yapmak istediğiniz işlemi kontrol ediniz.");
                        break;
					}
					
				}while(select != 4);
				break;
			}
			else {
				count--;

				if(count==0) {
					System.out.println("Hesabınız bloke olmuştur.Lütfen banka ile iletişime geçiniz.");
				}
				else {
					System.out.println("Kullanıcı adınız veya şifreniz hatalı! Lütfen Tekrar Deneyiniz.");
					System.out.println("Kalan giriş hakkınız : "+count);
				}
				
			}
		}
		
		input.close();
		
		
	
	}

}
