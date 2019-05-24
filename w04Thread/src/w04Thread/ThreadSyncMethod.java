package w04Thread;

public class ThreadSyncMethod {

	public static void main(String[] args) {
		Calculator cal = new Calculator();
		
		AddThread at = new AddThread(cal);
		MinThread mt = new MinThread(cal);
		
		at.start();
		mt.start();
		
		try {
			at.join(); //연산시간확보 
			mt.join();
		} catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		cal.showOpCnt();

	}

}

class Calculator {
	int opCnt=0; 
	
	public int add(int n1, int n2) { 
		synchronized(this) { 
			opCnt++;
		}
		
		return n1+n2;
	}
	
	public int min(int n1, int n2) {
		synchronized(this) { 
			opCnt++;
		}
		return n1-n2;
	}
	
	public void showOpCnt() {
		System.out.println("총 연산의 횟수: "+opCnt);
	}
}

class AddThread extends Thread {
	
	Calculator cal;
	public AddThread (Calculator cal) {
		this.cal = cal;
	}
	public void run() {
		System.out.println("10+40= "+cal.add(10, 40));
		System.out.println("2+4= "+cal.add(2, 4));
	}
}

class MinThread extends Thread {
	Calculator cal;
	public MinThread (Calculator cal) {
		this.cal=cal;
	}
	
	public void run() {
		System.out.println("40-10= "+cal.min(40, 10));
		System.out.println("4-2= "+cal.min(4, 2));
	}
}
