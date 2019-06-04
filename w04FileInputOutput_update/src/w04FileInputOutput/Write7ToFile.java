package w04FileInputOutput;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Write7ToFile {

	public static void main(String[] args) {
		try(OutputStream out = new FileOutputStream("C:\\Users\\user\\eclipse-workspace\\JavaTest\\src\\dataWrite.txt")) {
			out.write(7);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("데이터가 저장 완료되었습니다. ");

	}

}
