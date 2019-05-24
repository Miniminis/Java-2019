package w04Thread;

public class ThreadTest {

	public static void main(String[] args) {
		
		throwException();
		
		//방법1) Thread class를 상속하는 thread 객체 생성 
		ThreadEx1 thread1 = new ThreadEx1();
		
		//방법2) Runnable 인터페이스를 구현한 클래스 생성
		Runnable r1 = new ThreadRunnable();
		//Runnable class 를 기반으로 thread 객체 생성 
		Thread thread2 = new Thread(r1);
		
		//start() 를 통해 thread를 시작해준다. 
		//run(): 메소드 추가 --> start(): 시작 
		thread1.start();
		thread2.start();

	}

}

//1) Thread Class 상속 
class ThreadEx1 extends Thread {

	@Override
	public void run() {
		
		throwException();

		for(int i=0; i<5; i++) {
			System.out.println(getName() +"|"+getId());
		}
	}
	
	public void throwException() throws Exception {
		throwException();
	}
	
}

//2) Runnable interface 구현 
class ThreadRunnable implements Runnable {

	@Override
	public void run() {
		for(int i=0; i<5; i++) {
			System.out.println(Thread.currentThread().getName()+"|"+Thread.currentThread().getId() );
		}
	}
}