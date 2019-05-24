package w04Thread;

import javax.swing.JOptionPane;

public class ThreadEx6 {

	public static boolean inputCheck=false;

	public static void main(String[] args) {
				
		CountdownThread t1 = new CountdownThread();
		//Thread t1 = new CountdownThread(); 가능 
		//- 다형성 이용하여 상위클래스 Thread에서 컨트롤 
		
		//Thread t1 실행 
		t1.start();
		
		String str = JOptionPane.showInputDialog("아무 값이나 입력하세요. ");
		
		System.out.println("입력완료: "+str);
		inputCheck=true;
		
	}

}

class CountdownThread extends Thread {
	public void run() {
		for(int i=10; i>0; i--) {
			System.out.println(i);
			try {
				Thread.sleep(1000); //1초마다 한번씩 반복 
				if(ThreadEx6.inputCheck) {
					System.out.println("카운트다운을 종료합니다. ");
					return;
				}
			}catch(Exception e) {}
		}
	
		System.out.println("10초가 지나서 프로그램을 종료합니다. ");
		
	}
}


