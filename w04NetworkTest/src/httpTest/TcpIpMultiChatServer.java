package httpTest;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ConnectException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;

public class TcpIpMultiChatServer {

	public static void main(String[] args) {
		
		//1. 접속한 사용자들을 Map에 저장 --> 모든 사용자에게 메시지 전송 
		//2. name, 사용자별 소켓을 이용한 쓰레드 (기능: 받고, 전체 사용자에게 전송) 
		//	Thread 생성시에 1. 전체 사용자에게 메시지 보내기  2. Map 저장 
		//3. 멀티 쳇: 누가, 언제 들어와도 채팅이 기능 - while(true), socket.accept(); //사용자들이 다 들어올때까지 서버가 대기 
		
		try {
			String serverIp = "127.0.0.1";
			// 소켓을 생성하여 연결을 요청한다.
			Socket socket = new Socket(serverIp, 7777);
			System.out.println("서버에 연결되었습니다.");
			Thread sender = new Thread(new ClientSender(socket, args[0]));
			Thread receiver = new Thread(new ClientReceiver(socket));
			sender.start();
			receiver.start();
		} catch(ConnectException ce) {
			ce.printStackTrace();
		} catch(Exception e) {}

	}
	
	HashMap clients; //접속된 사용자들 저장 	
	
	//서버 클래스 생성자 
	TcpIpMultiChatServer() {
		clients = new HashMap();
		Collections.synchronizedMap(clients);
	}
	
	//서버 시작 매서드 
	public void start() throws IOException {
		ServerSocket serverSocket = null; 
		Socket socket = null;
		
		serverSocket = new ServerSocket(7777);
		System.out.println("서버가 시작되었습니다. ");
		
		while(true) {
			socket = serverSocket.accept();
			System.out.println("["+socket.getInetAddress()+":"+socket.getPort()+"]");
		}
	}
	
	//서버: 모든 접속자에게 메시지 보내는 매서드 
	void sendToAll(String msg) throws IOException {
		Iterator itr = clients.keySet().iterator();
		while(itr.hasNext()) {
			DataOutputStream out = (DataOutputStream)clients.get(itr.next());
			out.writeUTF(msg);
		}
	}
	
	
	//서버 받기 클래스 
	class ServerReceiver extends Thread {
		Socket socket;
		DataInputStream in;
		DataOutputStream out;
		
		//서버 받기 생성자 
		public ServerReceiver (Socket s) throws IOException {
			socket = s; 
			in = new DataInputStream(s.getInputStream());
			out = new DataOutputStream(s.getOutputStream());
		}
		
		//서버 실행 
		public void run() {
			String name = "";
			
			try {
				name = in.readUTF();
				clients.put(name, out);
				
				//전체 사용자에게 접속 안내 메시지를 보내기 			
				while(in !=null) {
					sendToAll("###"+name+"님이 접속하셨습니다. ");
				}
			} catch (IOException e) {
				e.printStackTrace();
			} finally {
				System.out.println("님이 나가셨습니다. ");
				clients.remove(name);
			}
		}
	}
	

	

}
