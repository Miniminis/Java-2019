package inputOutput;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class ByteFileCopy {

	public static void main(String[] args) throws IOException {
		InputStream in = new FileInputStream("penguine.jpg");
		OutputStream out = new FileOutputStream("copy.jpg");
		
		int copyByte=0; //전송된 사이즈카운트 
		int bData=0; //스트림을 통해 전송되는 데이터: byte 
		
		int readLen=0; //byte 배열의 사이즈를 받음 
		byte[] buf = new byte[1024]; //임시로 byte 데이터를 담아주는 바구니 
		
		
		while(true) {
			//bData= in.read(); //byte size의 데이터, 모두 전송된 후에는 -1가져오기
			
			readLen = in.read(buf); //담긴 byte의 개수를 받음 
			if(readLen==-1) {
				break;
			}			
			/*
			 * if(bData<0) { //파일의 사이즈는 0이상의 양의정수이므로 다른 가능성을 사전에 차단시켜 주기 위해 //음수로 표현한다.
			 * break; }
			 */
			
			out.write(buf, 0, readLen);  //out.write시에 기존 데이터가 없다면 생성하고, 전의 데이터가 있다면 이를 덮어씌운다. 
			copyByte+=readLen;			//따라서 readLen size만큼만 적어주어야 이전 데이터의 남은 기록이 같이 출력되지 않고 덮어씌워짐
			/*
			 * out.write(bData); copyByte++;
			 */
		}
		in.close(); //input과 output 스트림을 닫아주어야한다. 
		out.close();
		System.out.println("복사가 완료되었습니다. ");
		System.out.println("복사된 바이트의 크기: "+copyByte);
		

	}

}


