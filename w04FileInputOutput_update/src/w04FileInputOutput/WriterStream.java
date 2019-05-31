package w04FileInputOutput;

import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;

public class WriterStream {

	public static void main(String[] args) throws IOException {
		
		OutputStream out = new FileOutputStream("C:\\Users\\1027\\Documents\\05filterOutput.txt");
		out.write(65);
		out.write(66);
		
		out.flush();
		out.close();
		
		System.out.println("첫번째 저장");
		
		String str1 = "water";
		String str2 = "phone";
		
		Writer outWriter = new FileWriter("C:\\\\Users\\\\1027\\\\Documents\\\\05filterInput.txt");
		
		outWriter.write(str1);
		outWriter.write(str2);
		
		outWriter.close();
		
		System.out.println("두번째 저장 ");
		
		char[] cbuf = new char[10];
		
		int readCnt=0;
		Reader inReader = new FileReader("C:\\\\\\\\Users\\\\\\\\1027\\\\\\\\Documents\\\\\\\\05filterInput.txt");
		
		for(int i=0; i<cbuf.length; i++) {
			System.out.println(cbuf[i]);
		}
		
		inReader.close();
	}

}

/* 실행결과 
 * AB*/
