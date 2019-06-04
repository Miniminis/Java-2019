package w04FileInputOutput;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileInputOutputStream2 {

	public static void main(String[] args) throws IOException {
		
		
		//BufferedStream&DataStream 
		OutputStream out2 = new FileOutputStream("output2.txt");
		BufferedOutputStream bout = new BufferedOutputStream(out2);
		DataOutputStream dout = new DataOutputStream(bout);
		dout.writeInt(7); //writeInt: 결과값이 제대로 나오지 않음 --> why?
		dout.writeUTF("string");
		dout.writeChar('f');
		dout.writeChars("this is string");
		dout.close(); //dout만 close 해주어도 나머지 스트림들이 자동으로 닫힌다. 
		System.out.println("저장완료");
		
		
		  InputStream in2 = new FileInputStream("output2.txt"); 
		  BufferedInputStream bin = new BufferedInputStream(in2); 
		  DataInputStream din = new DataInputStream(bin);
		  
		  int num = din.readInt(); 
		  String str = din.readUTF(); 
		  char ch = din.readChar(); 
		  String str2 = din.readUTF(); 
		  
		  din.close();
		  
		  System.out.println(num); 
		  System.out.println(str); 
		  System.out.println(ch);
		  System.out.println(str2);
		 
		
		

	}

}
