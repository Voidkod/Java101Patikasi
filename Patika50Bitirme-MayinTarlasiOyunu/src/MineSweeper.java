import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


public class MineSweeper {
	Random random=new Random();	
	Scanner input=new Scanner(System.in);
	
	String [][] mineField;
	String [][] choosenAreas;
	int[][] mines;
	int rowSize,colSize;
	int mineFreeArea;
	int mineFreeAreaCount=0;
	int mineSize;
	int row,col;
	int selectRow,selectCol;
	int inputNumber;
	int intelligenceSize;
	int flagSize;
	boolean isTurn=true;
	boolean isSelectedMod;
	boolean isIntelligenceMod;
	boolean isTrackerMode;
	boolean isFlagMode;
	String name;
	String selectMod;
	String flag="";
	String intelligence="";
	String gameInfo="\nKlasik mayın tarlasına birkaç dokunuş yaptık ve hikaye ekledik."
			+ "\nOyunumuz metin tabanlı, 4 zorluk seviyesi ve 3 mod bulunmaktadır."
			+ "\nKolay seviyede 3 mod, Orta seviyede 2 mod, Zor seviyede 1 mod, Çok zor seviyede modsuz oynabiliyorsunuz."
			+ "\nİstihbarat modu : Haritada açılmayan bölgelerden rastgele bir bölge hakkında bilgi verir. Sınırlı Kullanım."
			+ "\nİzci modu: Klasik mayın tarlasında boş alanı seçtiğinizde çevresini tarama."
			+ "\nStrateji Uzmanı modu: Klasik mayın tarlasındaki bayrak ekleme ve kaldırma. Sınırlı Kullanım.\n"
			+ "\nOYNANIŞ"
			+ "\n Oyunun amacı hikaye anlatımıyla verilmiştir."
			+ "\n İstihbarat modu açıksa parsel seçmeden önce istihbarat isteyip istemediğini soracaktır."
			+ "\n Büyük küçük harf farketmeksizin \"e\" harfi ile kabul edebilirsiniz. Diğer herşey reddedilecektir. "
			+ "\n Strateji uzmanı modu açıksa parsel numaralarını girdikten sonra \"e\" ile bayrak durumunu değiştirebilirsiniz."
			+ "\n Bayrakları kullanırken dikkatli olun. Bayrağı kaldırırken altında mayın olabilir :)\n"
			+ "\nPatika Java101 bitirme projesi olarak yazdığım mayın tarlası oyununu keyifle oynamanız dileğiyle..";
	String startNameMessage="\nOyuna başlamak için isminizi girin : ";
	String startNameWarning="İsminizi girmediniz. Lütfen İsminizi giriniz : ";	
	String [] levels= {"Kolay","Orta","Zor","Çok Zor"};
	String [] modNames= {"İstihbarat Birimi","İz sürücüler","Strateji Uzmanı"};
	Boolean[] modBooleans = {isIntelligenceMod,isTrackerMode,isFlagMode};
	String levelSelectMessage="Görevin zorluk seviyesini seçin : ";
	String levelSelectWarning="\nBir zorluk seviyesi seçmelisiniz!. Seçiminiz: ";
	String modSelectMessage="Ekibine katılmasına istediğin bir birim seçin : ";
	String modSelectWarning="Ekibine birim seçmelisiniz. Seçimiz : ";
	String winMessage="Tüm mayınsız alanları buldun. Mayınlar uzmanlar tarafından sessizce temizlendi. Görevin Tamamlandı!..";
	String loseMessage="Askerlerin bölgedeki mayını farketmedi ve mayın patladı. Düşman sesi duydu. Görev başarısız.";
	
	MineSweeper(){
		System.out.println("Mayın Tarlası Oyununa Hoşgeldiniz.");
		inputStart();
		mineField=new String [rowSize][colSize];
		choosenAreas=new String [rowSize][colSize];
		mineSize=rowSize*colSize/4;
		mineFreeArea=mineSize*3;
		intelligenceSize=mineSize/2;
		flagSize=mineSize;
	}
	//Oyuncuya gösterilecek haritayı ve cevap haritasını oluşturur.
	public void createMap() {
		for(int i=0; i<choosenAreas.length; i++) {
			Arrays.fill(choosenAreas[i],"-");
		}
		createMine();
		addMapValues();
	}
	//Cevap Haritasındaki mayınsız bir alanın çevresindeki mayın ipucunu oluşturur.
	public int mineFreeAreaValue(int row,int col) {
		int count=0;
		for(int i=-1; i<2; i++) {
			for(int j=-1; j<2;j++) {
				if(isSelectInRange(row+i,col+j)&&isSelectMine(row+i,col+j)) {
					count++;
				}
			}
		}
		return count;
	}
	//Cevap Haritasına mayınları ve ipuçlarını ekler.
	public void addMapValues() {
		for(int i=0;i<mineField.length;i++) {
			for(int j=0; j<mineField[i].length; j++) {
				if(isSelectMine(i, j)) mineField[i][j]="*";
				else mineField[i][j]=Integer.toString(mineFreeAreaValue(i,j));
			}
		}
	}
	//Cevap haritası içindeki rastgele mayın koordinatların listesi oluşturur.
	public void createMine() {
		mines= new int [mineSize][2];
		/*
		 * Diziler int tipi kurulduğunda tüm değerlerini "0" olarak ayarlar.
		 * Mayın koordinatlarını rastgele belirleyip listemizi kontrol edip ekleme tercihinde bulunduğumuz için 
		 	başlangıç değerlerinden dolayı {0,0} olasılığı diğer sayı olasılıklarına göre çok düşüktür.
		 	Bu durumu ortadan kaldırmak için tüm değerleri -1 olarak ayarlamak sorunumuzu çözecektir.
		 */
		for(int i=0; i<mines.length; i++) {
			Arrays.fill(mines[i], -1);
		}

		 // (Recursive)Listede aynı koordinatı bulursa rastgele yeni koordinat oluştur.
		 // Yeni koordinatı kontrol eder ve buna listede olmayan koordinatı bulana kadar devam eder.
	
		for(int i=0; i<mines.length; i++) {
			row=random.nextInt(rowSize);
			col=random.nextInt(colSize);
			
			if(isDublicateMine(row,col)){
				mines[i][0]=row;
				mines[i][1]=col;
			}
		}
		
	}
	//(Rescursive)Oluşturulan mayın koordinatlarını kontrol eder ve tekrarlamasını engeller.
	public boolean isDublicateMine(int row,int col) {
		if(isSelectMine(row,col)) {
			this.row=random.nextInt(rowSize);
			this.col=random.nextInt(colSize);
			return isDublicateMine(this.row,this.col);
		}
		return true;
	}
	//Seçilen alanda mayın olup olmadığını kontrol eder.
	public boolean isSelectMine(int selectRow, int selectCol) {
		for(int i=0; i<mines.length;i++) {
			if(mines[i][0]==selectRow && mines[i][1]==selectCol) {
				return true;
			}
		}	
		return false;
	}
	
	////////////////////////////////////////////
	
	//Tur bitiminde oyunun bitip bitmediğini kontrol eder.
	public void finishControl() {
		if(mineFreeAreaCount==mineFreeArea) {
			choosenAreas[selectRow][selectCol]=mineField[selectRow][selectCol];
			addMinesMap(choosenAreas,"#");
			System.out.println(winMessage);
			isTurn=false;
		}
		else if(mineField[selectRow][selectCol].equals("*")&&choosenAreas[selectRow][selectCol].equals("-")) {
			System.out.println(loseMessage);
			addMinesMap(choosenAreas, "*");
			choosenAreas[selectRow][selectCol]="X";
			isTurn=false;
		}
	}
	
	//Seçilen alanın kontrollerini ve oyuncu haritası ile cevap haritası karşılaştırmasını yapar.
	public void checkSelectedInMap() {
		
		if((choosenAreas[selectRow][selectCol].equals("-"))) {
			if(flag.equalsIgnoreCase("e")&&isFlagMode) {
				if(flagSize>0) {
					choosenAreas[selectRow][selectCol]="!";
				flagSize--;
				}
				else System.out.println("Strateji uzmanı daha fazla işaretlemenin mayınları gözden kaçırabileceğimizi düşünüyor."
						+ "\n");
				
			}
			else {
				if(mineField[selectRow][selectCol].equals("0") &&isTrackerMode) {
					choosenAreas[selectRow][selectCol]=mineField[selectRow][selectCol];
					mineFreeAreaCount++;
					scanEmptyFields(selectRow,selectCol);
				}
				else {
					choosenAreas[selectRow][selectCol]=mineField[selectRow][selectCol];
					mineFreeAreaCount++;
				}
			}
		}
		else if(choosenAreas[selectRow][selectCol].equals("!")) {
			if(flag.equalsIgnoreCase("e")) {
				System.out.println("("+(selectRow+1)+","+(selectCol+1)+") parseline koyduğun işareti kaldırdın.");
				flagSize++;
				choosenAreas[selectRow][selectCol]="-";
			}
			else System.out.println("Parsel için herhangi bir değişiklik yapılmadı.");
		}
		else {
			System.out.println("Bu bölge zaten tarandı ve mayın bulunamadı.\n"
					+ "İpuçlarını takip et ve mayınsız bölgelerden ilerlemeye çalış..");
			choosenAreas[selectRow][selectCol]="("+choosenAreas[selectRow][selectCol]+")";
		}
		finishControl();
	}
	//Oyuncu haritası veya cevap haritasındaki mayın alanlarını işaretler.
	public void addMinesMap(String[][]map,String mine) {
		for(int i=0; i<mines.length;i++) {
			map[mines[i][0]][mines[i][1]]=mine;
		}
	}
	//Oyuncu haritasını günceller ve gösterir.
	public void showMap() {
		for(int i=0; i<choosenAreas.length; i++) {
			for(int j=0; j<choosenAreas[i].length; j++) {
				System.out.print(choosenAreas[i][j]+" ");
			}
			System.out.println();
		}
		if(isSelectInRange(selectRow,selectCol)) {
			if(choosenAreas[selectRow][selectCol].contains("(")) {
				choosenAreas[selectRow][selectCol]=mineField[selectRow][selectCol];
			}
		}
		System.out.println("===========================");
	}
	//Seçilen alanın haritanın içinde olup olmadığını kontrol eder.
	public boolean isSelectInRange(int selectRow,int selectCol) {
		if(selectRow>=rowSize || selectRow<0 || selectCol>=colSize || selectCol<0) {
			return false;
		}
		return true;
	}
	//(Recursive)Seçilen alanın haritanın içinde olmaması durumunda oyuncuyu bilgilendirir ve alan seçmesini ister.
	public void checkRange() {
		if(!isSelectInRange(selectRow,selectCol)) {
			System.out.println("Seçtiğiniz Alan Bulunamadı! Tekrar Deneyiniz..");
			showMap();
			inputSelect();
			checkRange();
		}
	}
	
	//Alan seçimi kontrollerini gerçekleştirir.
	public void inputSelect() {
		if(isIntelligenceMod&&intelligenceSize>0) {
			System.out.print("İstihbarat ("+intelligenceSize+") (E/H) : ");
			intelligence=input.next();
			if(intelligence.equalsIgnoreCase("e")) {
				intelligenceMod();
			}
		}
		System.out.print("Parselin X sayısı giriniz : ");
		selectRow=input.nextInt()-1;
		System.out.print("Parselin Y sayısı giriniz : ");
		selectCol=input.nextInt()-1;
		if(isFlagMode&&flagSize>=0) {
			System.out.print("Strateji("+flagSize+") (E/H) : ");
			flag=input.next();
		}
		System.out.println("===========================");
	}
	
	//İstihbarat modu fonksiyonu
	public void intelligenceMod() {
		if(intelligenceSize>0) {
			while (true) {
				selectRow=random.nextInt(rowSize);
				selectCol=random.nextInt(colSize);
				if(choosenAreas[selectRow][selectCol].equals("-")) {
					if(isSelectMine(selectRow, selectCol)) {
						System.out.println("Uzun uğraşlar sonucunda "+(selectRow+1)+","+(selectCol+1)
								+ " bölgesinde mayın olabileceği bilgisi edinildi.");
					}
					else System.out.println((selectRow+1)+","+(selectCol+1)
							+" bölgesinin araştırmaya uygun olduğu bilgisini aldık.");
					break;
				}
			}
			intelligenceSize--;
		}
	};
	
	//Seçilen modları ayarlar
	public void setMods() {
		isIntelligenceMod=modBooleans[0];
		isTrackerMode=modBooleans[1];
		isFlagMode=modBooleans[2];
	}
	//Mod seçme 
	public void mods() {
		selectMod=inputControl(levels,levelSelectMessage,levelSelectWarning);
		
		switch (selectMod) {
		case "kolay": {
			System.out.println("Ekibine "+modNames[0]+","+modNames[1]+" ve "+modNames[2]+" katıldı.");
			Arrays.fill(modBooleans, true);
			setMods();
			
			isSelectedMod=true;
			break;
		}
		case "orta": {
			System.out.println("\nEkibine 2 birim seçebilirsin.");
			for(int i=0; i<2; i++) {
				selectMod=inputControl(modNames, modSelectMessage, modSelectWarning);
				if (modBooleans[inputNumber]==false) {
					modBooleans[inputNumber]=true; 
					System.out.println(modNames[inputNumber]+" ekibine katıldı.");
				}
				else {
					System.out.println("Aynı birim tekrar seçilemez. Lütfen başka birim seçiniz.");
					i--;
				}
			}
			setMods();
			
			isSelectedMod=true;
			break;
		}
		case "zor": {
			System.out.println("Ekibine 1 birim seçebilirsin.");
			selectMod=inputControl(modNames, modSelectMessage, modSelectWarning);
			modBooleans[inputNumber]=true; 
			System.out.println(modNames[inputNumber]+" ekibine katıldı.");
			
			setMods();
			
			isSelectedMod=true;
			break;
		}
		case "çok zor": {
			System.out.println("Askerlerinle tek başınasın "+name+" Komutan. Kolay gelsin.");
			
			isSelectedMod=true;
			break;
		}
		default:
			System.out.println("Girdiğiniz zorluk seviyesi bulunamadı. "
					+ "Lütfen seçiminizi kontrol ederek tekrar giriniz.");
		}	
	}
	
	//Giriş kontrol ve hikaye anlatımı
	public void inputStart() {
		System.out.print("Oyun hakkında bilgi almak ister misiniz? (E/H) :");
		if(input.nextLine().equalsIgnoreCase("e")) System.out.println(gameInfo);
		name=inputEmptyControl(startNameMessage, startNameWarning);
		System.out.println("  Merhaba "+name+" Komutan.\n Çok kritik bir bölgeyi ele geçirmek için öncü birliğin başına seni seçtik."
				+ "\n Bu kritik bölgenin rastgele mayınlandığı bilgisini aldık. Bölgeyi mayınlayan askerler bazı izler bırakmış olabilir."
				+ " \n Görevin ekibinle birlikte gizlice alanları taramak, ipuçlarını takip etmek ve bölgedeki tüm mayınsız alanı bize bildirmek."
				+ "\n Şimdi ekibini seçmelisin.");
		mods();
		System.out.println("\nEkibini seçtin "+name+" Komutan. Şimdi seni bölgeyi net gören, gizli bir yere bırakacağız."
				+ "\nGördüğün bölgeyi parsellere ayırmalı ve bizim için haritalandırmalısın.");
		while (true) {
			System.out.print("Bölgenin uzunluğu(X) kaç parsel olmalı ? : ");
			rowSize=input.nextInt();
			System.out.print("Bölgenin genişliği(Y) kaç parsel olmalı ? : ");
			colSize=input.nextInt();
			if(rowSize>3 && colSize>3) break;
			else System.out.println("Bölge çok büyük uzunluk ve genişliği en az 4 parsele bölmelisin.");
		}
		System.out.println("===========================");
	}
	//Yapılan giriş boş ise tekrar giriş ister.
	public String inputEmptyControl(String message,String returnMessage) {
		String inputString;
		System.out.print(message);
		while(true) {
			inputString=input.nextLine();
			if(!inputString.isEmpty()) {
				return inputString;
			}
			System.out.print(returnMessage);
		}
	}
	//Giriş kontrol : Listeden seçim için numara veya kelime kabul eder ve listedeki seçilen kelimeyi verir.
	public String inputControl(String [] arr,String message,String returnMessage) {
		String inputString = "";
		String optionList="";
		
		for(int i=0; i<arr.length; i++) {
			optionList += "\n"+(i+1)+". "+arr[i];
		}
		while(true) {
			System.out.println(optionList);
			inputString=inputEmptyControl(message, returnMessage);
			if(Character.isDigit(inputString.charAt(0))) {
				inputNumber=Integer.parseInt(inputString.substring(0,1));
				if(inputNumber>0&&inputNumber<arr.length+1) {
					inputNumber--;
					inputString=arr[inputNumber];
					return inputString.toLowerCase();
				}
			}
			else {
				for(int i=0; i<arr.length; i++) {
					if(arr[i].equalsIgnoreCase(inputString)) {
						inputNumber=i;
						return inputString.toLowerCase();
					}
				}
				System.out.println("Seçenek bulunamadı.Lütfen listeyi kontrol ederek tekrar seçiniz.");
			}
		}
	}
	
	//(Recursive)Boş alan tarama modu
	//Haritada boş alanları (İpucu değeri 0 olan) tarar ve ipucu olan alanlara kadar ilerler.
	public void scanEmptyFields(int selectRow,int selectCol) {
		for(int i=-1; i<2; i++) {
			for(int j=-1; j<2;j++) {
				if(isSelectInRange(selectRow+i,selectCol+j)&&choosenAreas[selectRow+i][selectCol+j].equals("-")) {
					choosenAreas[selectRow+i][selectCol+j]=mineField[selectRow+i][selectCol+j];
					mineFreeAreaCount++;
					if(choosenAreas[selectRow+i][selectCol+j].equals("0")) {
						scanEmptyFields(selectRow+i, selectCol+j);
					}
				}
			}
		}
	}


	//Çalıştırma fonksiyonu
	public void run() {
		System.out.println("\nSon aldığımız istihbarata göre bölgede "+this.mineSize+" adet mayın kullanılmış.\n");
		createMap();
		showMap();
		while(isTurn) {
			inputSelect();
			checkRange();
			checkSelectedInMap();
			showMap();	
		}
	}
}
