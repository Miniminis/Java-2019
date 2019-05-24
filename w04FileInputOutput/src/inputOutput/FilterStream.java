package inputOutput;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FilterStream {
	
	public static void main(String[] args) throws IOException {
		
		//data.bin 있으면 덮어쓰기, 없으면 새로생성의 과정 
		OutputStream out = new FileOutputStream("data.bin"); 
		//기본형 데이터 형식으로 저장: DataOutputStream 
		DataOutputStream filterOut = new DataOutputStream(out);
		
		filterOut.writeInt(275);
		filterOut.writeDouble(45.79);
		filterOut.writeBoolean(true);
		
		filterOut.close();
		
		System.out.println("파일저장완료");
		
		//저장된 데이터를 읽는 과정 
		InputStream in = new FileInputStream("data.bin");
		DataInputStream filterIn = new DataInputStream(in);
		
		int num1 = filterIn.readInt();
		double num2 = filterIn.readDouble();
		boolean check = filterIn.readBoolean();
		
		filterIn.close();
		
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(check);
		
	}

}
