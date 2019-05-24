package httpTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class URLconnectionTest {

	public static void main(String[] args) throws IOException {
		
		//Url connection: Http 기반의 통신연결해주는 추상클래스 
		//URL class의 openConnection() 매서드로 URLConnection 객체 반환
		URL url = null;
		String urlStr = "http://www.ctware.net"; //index.html 을 호출 
		
		url = new URL(urlStr); //MalformedURLException 처리 
		
		URLConnection conn = url.openConnection(); //IOException 처리 
		
		BufferedReader in = null;
		//in = new BufferedReader(new InputStreamReader(url.openStream()));
		in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
		
		String str = null;
		
		while(true) {
			
			str = in.readLine();
			
			if(str == null) {
				break;
			}
			
			System.out.println(str);
		}
		
	}

}
