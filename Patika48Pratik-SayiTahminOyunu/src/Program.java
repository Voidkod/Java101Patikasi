//www.patika.dev
//@author Tufan ERDOĞAN

/* 
	Java dilinde programın 0-100 arasında rastgele seçtiği bir sayıyı kullanıcının tahmin etmesini istediğimiz bir 
	"Sayı Tahmin Oyunu" yapıyoruz.
	link: https://www.youtube.com/watch?time_continue=1290&v=rg4hTMzAlu8&embeds_referring_euri=https%3A%2F%2Facademy.patika.dev%2F&embeds_referring_origin=https%3A%2F%2Facademy.patika.dev&source_ve_path=MTM5MTE3LDEzOTExNywyMzg1MQ&feature=emb_title
	Yeniden yazıldı.
		EKLENENLER
	1- Tahminlere Aralık dışı tahminleri ekleme veya eklememe
	2- Tahminleri gösterme veya göstermeme
	3- Son girilen tahmini, tahminlere ekleme veya eklememe
	4- Girilen tahmin daha önce girilmiş ise önce uyarma sonra haktan düşme
*/

import java.util.Arrays;
import java.util.Scanner;

public class Program{
	static int health=5;
	static int numberPrediction;
	static int [] predictions = new int [6];
	static int count=0;
	static boolean isValid=true;
	static int number = (int) (Math.random()*100);
	
	static boolean dublicateControl(int[]predictions, int prediction) {
		
		if(predictions.length>=2) {
			for(int i=0; i<predictions.length; i++) {
				if(predictions[i]==prediction) {
					return true;
				}
			}
		}
		return false;
	}
	
	static void addPrediction(boolean isAddOutOfRange) {
		if(!isAddOutOfRange) {
			if(numberPrediction<100) {
				predictions[count]=numberPrediction;
				count++;
			}
		}
		else {
			predictions[count]=numberPrediction;
			count++;
		}
		
	}
	
	static void healthDecline(String state,String result,boolean isShowPredictions,boolean isAddLastPrediction) {
		 health--;
		 if(health!=0) {
			System.out.println(state+(health));
		 }
		 else {
			 result(result,isShowPredictions,isAddLastPrediction);
		 }
	}
	
	static void result(String result,boolean isShowPredictions,boolean isAddLastPrediction) {
		 System.out.println(result +number);
			if(isAddLastPrediction) count++;
			if(isShowPredictions) {
				System.out.println("Tahminleriniz : " + Arrays.toString(Arrays.copyOf(predictions, count-1)));
			}
		
	}	
		
	 public static void main(String[] args) {
		 Scanner input= new Scanner(System.in);
		 String numberIsBig="Tahmininiz Gizli Sayıdan küçüktür. Kalan Hakkınız : ";
		 String numberOutRange="Belirtilen(0-100) aralık dışında tahmin yaptınız. Kalan Hakkınız : ";
		 String numberIsSmall="Tahmininiz Gizli Sayıdan büyüktür. Kalan Hakkınız : ";
		 String lose="Kaybettiniz!.. Gizli sayı : ";
		 String win="Tebrikler! Gizlediğimiz sayıyı buldunuz. Gizli Sayı : ";
		 String dublicate="Daha önceki tahminlerinizden birini girdiniz. Kalan Hakkınız : ";
		 String dublicateLose="Son hakkınızda daha önceki tahminlerinizden birini girdiniz. "+lose;
		 String outRangeLose="Son hakkınızda belirtilen aralık dışında bir tahmin yaptınız : "+lose;
		 boolean isNumberAgain=true;
		 boolean isAddOutOfRange=false; //Tahminler kısmına Aralık dışı tahminleri Ekle/Ekleme
		 boolean isShowPredictionDublicate=false; // Tekrarlanan tahmin ile biten sonuçta tahminleri Göster/Gösterme
		 boolean isAddLastPredictionDublicate=false; //Tekrarlanan tahmin ile biten sonuçta son tahmini Ekle/Ekleme
		 boolean isShowPredictionOutOfRange=true; // İstenen aralık dışı ile biten sonuçta tahminleri Göster/Gösterme
		 boolean isAddLastPredictionOutOfRange=true; //İstenen aralık dışı ile biten sonuçta son tahmini Ekle/Ekleme
		 boolean isShowPredictionWin=true; // Kazanma durumunda tahminleri Göster/Gösterme
		 boolean isAddLastPredictionWin=false; // Kazanma durumunda son tahmini Ekle/Ekleme
		 boolean isShowPredictionLose=true; // Kurallar içinde kaybetme durumunda tahminleri Göster/Gösterme
		 boolean isAddLastPredictionLose=true; // Kurallar içinde kaybetme durumunda son tahmini Ekle/Ekleme
		 
		 
		 
		 System.out.println("Sayı Tahmin Oyununa hoşgeldiniz! "
		 		+ "\nAklımızda 0-100 arasında bir sayı tutacaz ve tahmin etmeye çalışacaksınız:) Bol Şans!");
		 while(health>0) {
			// System.out.println("Gizli Sayı : "+ number);
			 System.out.print("Bir sayı girin : ");
			 numberPrediction=input.nextInt();
			 
			 if(dublicateControl(predictions,numberPrediction) && isNumberAgain) {
				 System.out.println("Bu tahmini daha önce girdiniz : "+numberPrediction+
						 "\nÖnceki tahminlerinizi girmeniz durumunda hakkınızdan düşülecektir.");
				 isNumberAgain=false;
				 continue;
			 }
			 else if(dublicateControl(predictions,numberPrediction) && !isNumberAgain) {
				 healthDecline(dublicate,dublicateLose,isShowPredictionDublicate,isAddLastPredictionDublicate);
				 continue;
			 }
			 
			 addPrediction(isAddOutOfRange);
			 
			 if((numberPrediction>100 || numberPrediction<0) && isValid) {
				  System.out.println("Lütfen 0-100 arasında bir tahmin yapın. "
					 + "Belirtilen aralıkta tahmin yapmadığınızda hakkınızdan düşülecektir.");
				  isValid=false;
				  continue;
			 }
			 else if((numberPrediction>100 || numberPrediction<0) && !isValid) {
				 healthDecline(numberOutRange,outRangeLose,isShowPredictionOutOfRange,isAddLastPredictionOutOfRange);
				 continue;
			 }
			 
			 
			  if(numberPrediction==number) {
				  result(win,isShowPredictionWin,isAddLastPredictionWin);
				  break;
			  }
			  if(numberPrediction<number) {
				 healthDecline(numberIsBig,lose,isShowPredictionLose,isAddLastPredictionLose);
			  }
			  else {
				healthDecline(numberIsSmall,lose,isShowPredictionLose,isAddLastPredictionLose);
			  }
				  
		 }
	 }
}