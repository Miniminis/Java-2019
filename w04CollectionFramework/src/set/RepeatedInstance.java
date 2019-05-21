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
		//arraylist���� �ߺ��� �ν��Ͻ��� �����ϱ� ���� hashset ������ �Űܼ� ����
		HashSet<String> hSet = new HashSet<>(lst);
		
		//�ߺ��� ���ŵ� �ڷ���� �ٽ� arraylist �ν��Ͻ��� ���幰�� �ű�
		lst = new ArrayList<>(hSet);
		
		for(int i=0; i<lst.size(); i++) {
			System.out.println(lst.get(i));
		}
		

	}

}
