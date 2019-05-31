package w04FileInputOutput;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileStreamExample2 {
	
	public static void main(String[] args) throws IOException  {
		File file = new File("C:\\Users\\1027\\Documents\\fileInput_byteArr.txt");
		InputStream in = new FileInputStream(file);
		OutputStream out = new FileOutputStream("C:\\Users\\1027\\Documents\\fileOutput _byteArr.txt");
		
		//반복 처리 횟수를 기록 = 바이트 단위로 읽어오기 때문에 
		//for 반복문을 통해 증가한 바이트의 개수가 곧 바이트 데이터의 크기가 된다. 
		int copyByte=0; //총 읽어온 바이트의 개수 
		
		int readLen; //한번에 읽어오는 바이트의 개수 
		
		//데이터를 바이트 배열 단위로 읽어올때 저장할 공간 
		byte[] byteArr = new byte[528]; 
						
		while(true) {
			//파일을 읽어들이는 작업 
			readLen = in.read(byteArr);
			out.write(byteArr);
			//out.write(byteArr, 3, readLen);
			
			if(readLen==-1)	{
				break;
			}
			copyByte+=readLen;
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
