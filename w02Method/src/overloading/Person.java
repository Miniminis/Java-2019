package overloading;

public class Person {

	public static void main(String[] args) {
		PersonInfo ps1 = new PersonInfo(940811, 1994, 8, 11);
		PersonInfo ps2 = new PersonInfo(940811, 111111, 1994, 8, 11);
		
		System.out.println(ps1.IDNum);
		System.out.println(ps1.mNum);
		System.out.println(ps1.year);
		System.out.println(ps1.month);
		System.out.println(ps1.day);
		System.out.println("---------------------------");
		System.out.println(ps2.IDNum);
		System.out.println(ps2.mNum);
		System.out.println(ps2.year);
		System.out.println(ps2.month);
		System.out.println(ps2.day);
		
	}
}

class PersonInfo {
	int IDNum;
	int mNum;
	int year;
	int month;
	int day;
	
	PersonInfo(int IDNum, int mNum, int year, int month, int day) {
		this.IDNum = IDNum;
		this.mNum = mNum;
		this.year = year;
		this.month = month;
		this.day = day;
	}
	
	PersonInfo(int IDNum, int year, int month, int day) {
		this(IDNum, 0, year, month, day);
	}
}
