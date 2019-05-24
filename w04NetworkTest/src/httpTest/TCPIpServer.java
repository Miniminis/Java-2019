package httpTest;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TCPIpServer {

	public static void main(String[] args) throws IOException {
		
		int cnt = 0; //접속자수를 기록해주기위한 count 
		ServerSocket serverSocket = null; //서버소켓 생성 
		
		serverSocket = new ServerSocket(7777); //생성된 소켓을 7777번 포트와 결합 
		System.out.println(getTime()+"서버가 준비되었습니다. ");
		
		while(true) {
			System.out.println(getTime()+"연결요청을 기다립니다. "); 
			//서버소켓은 클라이언트의 연결요청이 들어올때까지 실행을 멈추고 기다리고 있음 
			//클라이언트의 연결 요청이 들어오면 소켓과 통신할 새로운 소켓을 생성한다. 
			Socket socket = serverSocket.accept(); //서버소켓의 대기상태 
			//클라이언트로부터 연결요청 받음 
			System.out.println(getTime()+ socket.getInetAddress()+ "로부터 연결요청이 들어왔습니다. ");
			
			//클라이언트에게 보낼 수 있는 output stream 통로를  생성 
			OutputStream out = socket.getOutputStream();
			DataOutputStream dOut = new DataOutputStream(out);
			
			dOut.writeUTF("안녕하세요, from Server ("+ cnt++ +")");
			System.out.println(getTime()+"메시지 전송완료");
			
			dOut.close();
			socket.close();	
		}

	}

	public static String getTime() {
		
		SimpleDateFormat format = new SimpleDateFormat("[hh:mm:ss]");
		
		return format.format(new Date());
	}

}
