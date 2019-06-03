import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Read7ToFile {

	public static void main(String[] args) {
		try(InputStream in = new FileInputStream("C:\\Users\\user\\eclipse-workspace\\JavaTest\\src\\dataWrite.txt")) {
			int bData = in.read();
			System.out.println(bData);
		} catch(IOException e) {
			e.printStackTrace();
		}

	}

}
