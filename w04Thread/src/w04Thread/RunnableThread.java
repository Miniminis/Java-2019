package w04Thread;

public class RunnableThread {

	public static void main(String[] args) {
		//Runnable interface를 구현하는 클래스의 객체생성 
		AdderThread at1 = new AdderThread(1, 50);
		AdderThread at2 = new AdderThread(51, 100);
		//Thread 인스턴스 생성 
		//직원 2명 채용 
		Thread t1 = new Thread(at1); 
		Thread t2 = new Thread(at2);
		
		//Thread 실행 
		t1.start();
		t2.start();
		
		try {
			t1.join(); //t1의 연산이 완료될 때까지 main에서 시간을 벌어준다. 
			t2.join(); //t2의 연산이 완료될 때까지 main에서 시간을 벌어준다. 
		}catch (InterruptedException e){
			e.printStackTrace(); //printStackTrace는 가장 자세한 예외 정보를 제공. 리턴값이 없음.
		}
		
		//CPU를 할당받는 속도가 매 실행마다 달라지기 때문에 
		//매 실행의 결과가 다르게 출력될 수 있다. 
		System.out.println(at1.getNum()+"|"+at2.getNum());
		System.out.println(at1.getNum()+at2.getNum());
		
		

	}

}

class Sum {
	int num; 
	public Sum() {
		num=0; 
	}
	void addNum(int n) {
		num = num+n;
	}
	public int getNum() {
		return num;
	}
}

class AdderThread extends Sum implements Runnable {
	
	int start;
	int end;
	
	public AdderThread(int s, int e) {
		start=s;
		end=e;
	}

	@Override
	public void run() {
		for(int i=start; i<=end; i++) {
			addNum(i);
		}
	}
	
}
