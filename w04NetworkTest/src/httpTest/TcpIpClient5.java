package httpTest;

import java.io.IOException;
import java.net.Socket;


public class TcpIpClient5 {

	public static void main(String[] args) throws IOException {
		
		Socket socket = new Socket("127.0.0.1", 7777);
		System.out.println("서버 연결 성공!");
		
		Sender sender = new Sender(socket); 
		Receiver receiver = new Receiver(socket);
		
		sender.start();
		receiver.start();

	}

}
