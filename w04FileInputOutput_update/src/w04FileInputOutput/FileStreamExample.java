package w04FileInputOutput;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileStreamExample {
	
	public static void main(String[] args) throws IOException  {
		File file = new File("C:\\Users\\1027\\Documents\\fileInput.txt");
		InputStream in = new FileInputStream(file);
		OutputStream out = new FileOutputStream("C:\\Users\\1027\\Documents\\fileOutput.txt");
		int copyByte=0; 
		//반복 처리 횟수를 기록 = 바이트 단위로 읽어오기 때문에 
		//for 반복문을 통해 증가한 횟수가 곧 바이트 데이터의 크기가 된다. 
		
		//데이터를 바이트 단위로 읽어올때 
		int bData; 
				
		while(true) {
			//파일을 읽어들이는 작업 
			bData = in.read();
			out.write(bData);
			if(bData==-1)	{
				break;
			}
			copyByte++;
		}
		
		//사용된 inputstream 닫기 
		in.close();
		//사용된 outputstream 닫기 
		out.close();
		
		System.out.println("복사된 바이트의 크기:"+copyByte);
		
	}

}

/* 전체구조 
 * 1. InputStream, OutputStream
 * 2. FileInputStream
 * - byte 단위로 파일 읽기 
 * - byte [] 단위로 파일 읽기 
 * 3. ByteArrayInputStream
 * 4. PipedInputStream
 * 5. AudioInputStream
 * ------------------------
 * 
 * */
