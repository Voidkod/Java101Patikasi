
public class Employee {
	String name;
	double salary;
	int workHours;
	int hireYear;
	
	public Employee(String name,double salary,int workHours,int hireYear){
		this.name=name;
		this.salary=salary;
		this.workHours=workHours;
		this.hireYear=hireYear;
	}
	
	public double tax() {
		if(this.salary>1000) return this.salary*0.03;
		return 0;
	}
	public double bonus() {
		int bonusHours=this.workHours-40;
		if(bonusHours>0) return bonusHours*30;
		return 0;
	}
	public double raiseSalary() {
		int year= 2021;
		int workedYear= year-this.hireYear;
		
		if(workedYear<10) return this.salary*0.05;
		if(workedYear>9 && workedYear<20) return this.salary*0.1;
		if(workedYear>19) return this.salary*0.15;
		return 0;
	}
	public String toString1() {
		return "Adı : "+this.name+
				"\nMaaşı : "+this.salary+
				"\nÇalışma Saati : "+this.workHours+
				"\nBaşlangıç Yılı : "+this.hireYear+
				"\nVergi : "+tax()+
				"\nBonus : "+bonus()+
				"\nMaaş Artışı : "+raiseSalary()+
				"\nVergi ve Bonuslar ile birlikte maaş : "+(this.salary+(bonus()-tax()))+
				"\nToplam Maaş : "+(this.salary+raiseSalary());
	}

		
	
	
	
}
