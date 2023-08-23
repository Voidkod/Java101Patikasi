//www.patika.dev
//@author Tufan ERDOĞAN

/* 
	Java dilinde kullanıcının girdiği kelimenin "Palindromik" olup olmadığı bulan bir program yazıyoruz.

	Eğer bir kelimenin tersten okunuşu yine aynı kelimeyi veriyorsa o kelime "Palindromik Kelime'dir".
	
	Örnek : abba , asa , kavak, kayak
	
	link:https://www.youtube.com/watch?v=4a5aijjHhfg&t=722s
	
	Video Örneğinden farklı şekilde ve videodaki while kadar hızlı çalışacak şekilde yazıldı.
	Karışık kelimelerle test edildi.
*/



public class Program{

	 static boolean isPalindrome(String str) {
		 int count=str.length()-1;
		 
		 for(int i=0; i<str.length()/2; i++) {
			 if(str.charAt(i)!=str.charAt(count)) {
				 return false;
			 }
			 else count--;
		 }
		 return true;
	 }
	 public static void main(String[] args) {
		
		 String[] words = {"aba","abba","abla","asa","asla","kavak","kavlak","kaypak","kaya","kayak"}; 
		 String result;
		 for(String word : words) {
			 result=(isPalindrome(word)) ? word +" kelimesi Palindoromik Kelimedir" : word +" kelimesi Palindoromik Kelime değildir";
			 System.out.println(result);
		 }
		 
	 }
}