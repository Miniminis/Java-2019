package httpTest;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class TCPIpClient {

	public static void main(String[] args) throws UnknownHostException, IOException {
		//UnknownHostException: 알 수 없는 호스트 
		//IOException: 소켓생성시 IO예외 발생 경우 
		
		//서버와 연결을 위한 소켓 생성 
		Socket socket = new Socket("127.0.0.1", 7777);
		
		//서버 소켓으로부터 전달된 데이터를 받기 위한 inputstream 통로 생성
		InputStream in = socket.getInputStream();
		DataInputStream dIn = new DataInputStream(in);
		
		System.out.println("[Server]"+dIn.readUTF());
				
		dIn.close();
		socket.close();
		System.out.println("연결을 종료합니다. ");
		
		
	

	}

}
