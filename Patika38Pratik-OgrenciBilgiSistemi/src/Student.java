public class Student {
    String name,stuNo;
    int classes;
    Course mat;
    Course fizik;
    Course kimya;
    double avarage;
    boolean isPass;


    Student(String name, int classes, String stuNo, Course mat,Course fizik,Course kimya) {
        this.name = name;
        this.classes = classes;
        this.stuNo = stuNo;
        this.mat = mat;
        this.fizik = fizik;
        this.kimya = kimya;
        calcAvarage();
        this.isPass = false;
    }


    public void addBulkExamNote(int mat,int verbalMat,int fizik,int verbalFizik, int kimya,int verbalKimya) {

        if (mat >= 0 && mat <= 100) {
            this.mat.note = mat;
        }
        if (verbalMat >= 0 && verbalMat <= 100) {
            this.mat.verbal = verbalMat;
        }
        if (fizik >= 0 && fizik <= 100) {
            this.fizik.note = fizik;
        }
        if (verbalFizik >= 0 && verbalFizik <= 100) {
            this.fizik.verbal = verbalFizik;
        }
        if (kimya >= 0 && kimya <= 100) {
            this.kimya.note = kimya;
        }
        if (verbalKimya >= 0 && verbalKimya <= 100) {
            this.kimya.verbal = verbalKimya;
        }

    }

    public void isPass() {
        if (this.mat.note == 0 || this.fizik.note == 0 || this.kimya.note == 0 || this.mat.verbal==0 || this.fizik.verbal==0 || this.kimya.verbal==0 ) {
            System.out.println("Notlar ve sözlüler tam olarak girilmemiş");
        } else {
            this.isPass = isCheckPass();
            printNote();
            System.out.println("Ortalama : " + this.avarage);
            if (this.isPass) {
                System.out.println("Sınıfı Geçti. ");
            } else {
                System.out.println("Sınıfta Kaldı.");
            }
        }
    }

    public void calcAvarage() {
    	
    	// Dersin not ve sözlü etkileri
    	
    	fizik.percentEffect=0.2;
    	mat.percentEffect=0.3;
    	kimya.percentEffect=0.15;
    	
        this.avarage = ((this.fizik.note*(1-fizik.percentEffect)+this.fizik.verbal*fizik.percentEffect) + 
        				(this.kimya.note*(1-kimya.percentEffect)+this.kimya.verbal*kimya.percentEffect) + 
        				(this.mat.note*(1-mat.percentEffect)+this.mat.verbal*mat.percentEffect)) /3;
    }

    public boolean isCheckPass() {
        calcAvarage();
        return this.avarage > 55;
    }

    public void printNote(){
        System.out.println("=========================");
        System.out.println("Öğrenci : " + this.name);
        System.out.println("Matematik Notu : " + this.mat.note);
        System.out.println("Matematik Sözlü Notu : " + this.mat.verbal);
        System.out.println("Fizik Notu : " + this.fizik.note);
        System.out.println("Fizik Sözlü Notu : " + this.fizik.verbal);
        System.out.println("Kimya Notu : " + this.kimya.note);
        System.out.println("Kimya Sözlü Notu : " + this.kimya.verbal);
    }

}