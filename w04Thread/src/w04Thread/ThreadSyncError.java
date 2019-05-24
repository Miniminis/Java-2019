package w04Thread;

public class ThreadSyncError {

	public static void main(String[] args) {
		Increment increment = new Increment();
		
		IncThread t1 = new IncThread(increment); //
		IncThread t2 = new IncThread(increment);
		IncThread t3 = new IncThread(increment);
		
		t1.start();
		t2.start();
		t3.start();
		
		try {
			t1.join();
			t2.join();
			t3.join();
		}catch (InterruptedException e){
			e.printStackTrace();
		}
		
		System.out.println(increment.getNum());
		System.out.println("프로그램을 종료합니다. ");

	}

}

class Increment {
	int num=0; 
	
	//synchronized: 
	//해당 객체에 t1이 접근해서 계산을 처리할 때, 다른 t2 or t3의 접근 및 연산을 막아준다.
	public synchronized void increment() {
		num++;
	}
	
	public int getNum() {
		return num;
	}
}

class IncThread extends Thread {
	Increment inc; 
	
	public IncThread(Increment inc) {
		this.inc = inc;
	}
	
	public void run() {
		for(int i=0; i<1000; i++) {
			//for(int j=0; j<1000; j++) 
				inc.increment();
		}
	}
}