package w04FileInputOutput;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class StringWriter {

	public static void main(String[] args) throws IOException {
		BufferedWriter out = new BufferedWriter(new FileWriter("C:\\Users\\1027\\Documents\\String.txt"));
		
		out.write("손흥민 - 리버풀전에 골을 넣는데 집중하겠다.");
		out.newLine();
		out.write("올 시즌은 나에게 있어 최고의 시즌이다. ");
		out.newLine();
		out.write("팀이 승리하는 것을 돕기 위해 최선을 다하겠다. ");
		out.newLine();
		
		out.close();
		
		System.out.println("기사입력완료!");
		
		BufferedReader in = new BufferedReader(new FileReader("C:\\Users\\1027\\Documents\\String.txt"));
		
		String str=null;
		while(true) {
			str = in.readLine();
			if(str==null) {
				break;
			}
			System.out.println(str);
		}
		in.close();
		
		System.out.println("기사 복사 완료!");
	}

}
