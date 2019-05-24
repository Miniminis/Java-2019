package httpTest;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

//main method: 두 클라이언트가 서버와 연결되어 동시에 채팅할 수 있도록 
//Sender class 
//Receiver class 

public class TcpIpServer5 {

	public static void main(String[] args) throws IOException {
		ServerSocket serverSocket = null;
		Socket socket = null;
		
		serverSocket = new ServerSocket(7777);
		System.out.println("서버가 준비되었습니다. ");
		
		socket = serverSocket.accept();
		
		Sender sender = new Sender(socket);
		Receiver receiver = new Receiver(socket);
		
		sender.start();
		receiver.start();
		
		

	}

}

class Sender extends Thread {
	Socket socket;
	DataOutputStream out;
	String name;
	
	public Sender(Socket socket) throws IOException {
		
		this.socket=socket;
		
		out = new DataOutputStream(socket.getOutputStream());
		name = "["+socket.getInetAddress()+ "."+ socket.getPort()+ "]";
	}
	
	public void run() {
		
		Scanner sc = new Scanner(System.in);
		
		while(out !=null ) { //out 값이 null 이면 아예 while 문 실행 안함 
			try {
				out.writeUTF(name+ sc.nextLine());
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
	
}

class Receiver extends Thread {
	
	Socket socket; 
	DataInputStream in;
	
	public Receiver(Socket s) throws IOException {
		
		in = new DataInputStream(s.getInputStream());
		
	}
	
	public void run() {
		
		while(in !=null) {
			try {
				System.out.println(in.readUTF());
			} catch (IOException e) {
				e.printStackTrace();
			}
		}	
		
	}
	
}
