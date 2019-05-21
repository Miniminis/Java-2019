import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class RepeatedInstance {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("boy", "toy", "boy", "toy");
		ArrayList lst = new ArrayList<>(list);
		
		for(int i=0; i<lst.size(); i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println("===============================");
		//arraylist에서 중복된 인스턴스를 제거하기 위해 hashset 구조로 옮겨서 저장
		HashSet<String> hSet = new HashSet<>(lst);
		
		//중복이 제거된 자료들을 다시 arraylist 인스턴스로 저장물을 옮김
		lst = new ArrayList<>(hSet);
		
		for(int i=0; i<lst.size(); i++) {
			System.out.println(lst.get(i));
		}
		

	}

}
