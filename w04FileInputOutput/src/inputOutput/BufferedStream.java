package inputOutput;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class BufferedStream {

	public static void main(String[] args) throws IOException {
		
		//기본스트림 생성
		InputStream in = new FileInputStream("Hydrangeas.jpg");
		//필터스트림 생성
		BufferedInputStream bIn = new BufferedInputStream(in);
		
		//기본스트림 생성
		OutputStream out = new FileOutputStream("copy1.jpg");
		//필터스트림 생성 
		BufferedOutputStream bOut = new BufferedOutputStream(out);
		
		int copyByte=0;
		int BData = 0;
		
		while(true) {
			BData = in.read();
			if(BData==-1) {
				break;
			}
			out.write(BData);
			copyByte++;
			
		}
		bIn.close();
		bOut.close();
		
		System.out.println("복사가 완료되었습니다. ");
		System.out.println("복사된 사이즈: "+copyByte);

	}

}
