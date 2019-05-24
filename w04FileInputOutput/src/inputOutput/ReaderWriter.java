package inputOutput;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class ReaderWriter {

	public static void main(String[] args) throws IOException {
		
		char c1 = 'A';
		char c2 = 'B';
		
		//쓰고자 하는 것 
		Writer writer = new FileWriter("test.txt");  //없으면 만들고 있으면 덮어쓰기 
		writer.write(c1);
		writer.write(c2);
		writer.write(c1);
		writer.write(c2);
		writer.write(c1);
		writer.write(c2);
		writer.write(c1);
		writer.write(c2);
		writer.write(c1);
		writer.write(c2);
		
		
		writer.close();
		
		System.out.println("파일이 작성/생성되었습니다. ");
		
		Reader reader = new FileReader("test.txt");
		char[] chBuff = new char[10];
		int readCnt = 0;
		
		readCnt = reader.read(chBuff, 0, chBuff.length);
		for(int i=0; i<readCnt; i++	 ) {
			System.out.println(chBuff[i]);
		}
		
		reader.close();
		
		//file을 쓰는 이유: 데이터를 오래 유지시키기 위하여 
		//동기화 문제: 

	}

}
