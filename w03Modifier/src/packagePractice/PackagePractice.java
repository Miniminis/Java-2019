package packagePractice;

import java.text.SimpleDateFormat;
import java.util.Date; //제대로 된 라이브러리를 import 하는 것이 중요 

public class PackagePractice {

	public static void main(String[] args) {
		
		Date today = new Date();
		System.out.println(today);

		//Date 
		SimpleDateFormat date = new SimpleDateFormat("yyyy.MM.dd");
		System.out.println(date.format(today));
		String dateStr = date.format(today);
		System.out.println(dateStr);

		//Time 
		SimpleDateFormat time = new SimpleDateFormat("hh:mm:ss a");
		System.out.println(time.format(today));
		String timeStr = time.format(today);
		System.out.println(timeStr);
	}

}
