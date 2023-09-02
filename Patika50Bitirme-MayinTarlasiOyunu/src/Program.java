//www.patika.dev
//@author Tufan ERDOĞAN

/* 
	Java dilinde Mayın Tarlası oyunu yapmanızı bekliyoruz.

		Oyun Kuralları :
		Oyun metin tabanlıdır.
		Çift boyutlu diziler üzerinden oynanmalı ve MineSweeper sınıfı içerisinde tasarlanmalı.
		Matris boyutunu yani satır ve sütun sayısını kullanıcı belirlemeli.
		Diziye ait eleman sayısının çeyreği (elemanSayisi / 4) kadar rastgele mayın yerleştirilmeli. Örneğin dizi 4x3 boyutunda ise eleman sayısı (satırSayısı * sütunSayısı) formülü ile hesaplanmalı ve boyutu 12 olmalı. Bu durumda mayın sayısı 12 / 4 = 3 adet olmalıdır. (ipucu : bu mayınların konumlarını tutacak ikinci bir dizi oluşturabilirsiniz.)
		Kullanıcı matris üzerinden bir nokta seçmeli. Nokta seçimi için satır ve sütun değerlerini girmeli.
		Seçilen noktanın dizinin sınırları içerisinde olup olmadığını kontrol edilmeli ve koşul sağlanmazsa tekrar nokta istenmeli.
		Kullanıcının girdiği noktada mayın var ise oyunu kaybetmeli.
		Mayın yok ise, ilgili noktaya değen tüm konumlarına bakılmalı (sağı, solu, yukarısı, aşağısı, sol üst çapraz, sağ üst çapraz, sağ alt çapraz, sol alt çapraz) ve etrafındaki mayınların sayısının toplamı ilgili noktaya yazılmalı. Noktaya değen herhangi bir mayın yok ise "0" değeri atanmalı.
		Kullanıcı hiç bir mayına basmadan tüm noktaları seçebilirse oyunu kazanmalı.
		
	Eklenen özellikler
		
		1.  İstenen mayın tarlasına, klasik mayın tarlası özellikleri eklendi ve birkaç farklı dokunuş yapıldı.
		2.  Hikaye eklendi.
		3.  4 seviye eklendi. Kolay/Orta/Zor/Çok zor
		4.  3 mod eklendi. Strateji uzmanı/iz sürücüler/İstihbarat birimi
		5.  Kolay seviyede 3 mod, Orta seviyede seçilen 2 mod, Zor seviyede seçilen 1 mod ve Çok zor seviyede modsuz başlanır.
		6.  Strateji uzmanı : Klasik mayın tarlasında bayrak ekleme/çıkarma özelliğine dokunuş yaptık.
			 Mayın sayısı kadar işaretleme yapılabilir. Dikkat bayrağı kaldırırken mayın çıkabilir :))
		7.  İstihbarat birimi : Açılmamış alanlardan rastgele bir bölgenin bilgisini verir.
			 Mayın sayısının yarısı kadar kullanım hakkı var. İstihbarat önemli :)
		8.  İz Sürücüler : Klasik mayın tarlasının boş alanları tarama modu eklendi.
			 Şanslı bir dokunuşunuzda haritanız bir anda aydınlanabilir :)
		9.  Açılan alan kontrolü eklendi. Açılan alan tekrar seçilirse parseli "()" içinde gösterir ve uyarır.
		10. Extra harita işaretlemeleri eklendi.
			 a. Basılan mayın haritada "X"
			 b. Bayrak işareti "!"
			 c. Seçilen alan tekrar seçilirse "()"
			 d. Temizlenen mayın "#"
		11. Minumum harita 4x4
*/



public class Program{
	 public static void main(String[] args) {
		MineSweeper a = new MineSweeper();
		
		a.run();

	 }
}