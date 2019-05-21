package map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

public class MapTest {

	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<>();
		
		//key-value 기반 데이터 저장 
		//학교의 학생부와 비슷한 원리 
		//출석번호는 절대 중복될 수 없지만, 이름이 같은 학생을 존재할 수 있다.
		//key 값은 중복될 수 없지만, value 값은 중복될 수 있다. 
		map.put(30, "mike");
		map.put(21, "jin");
		map.put(36, "jackson");
		map.put(4, "clement");
		
		//데이터 탐색 
		System.out.println(map.get(30));
		System.out.println(map.get(21));
		System.out.println(map.get(36));
		
		System.out.println("==================================");
		
		//데이터 삭제
		map.remove(30);
		//삭제확인
		System.out.println(map.get(30));
		
		System.out.println("=================================");
		//HashMap의 순차적인 접근 방법 예
		Set<Integer> set = map.keySet();
		
		//반복자를 이용한 value값 출력 
		Iterator<Integer> itr = set.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		//for 문을 이용한 key 값 출력 
		System.out.println("=================================");
		for(Integer n: set) {
			System.out.println(n.toString());
		}
		
		//for 문을 이용한 value 값 출력 
		System.out.println("=================================");		
		for(Integer n: set) {
			System.out.println(map.get(n).toString());
		}
		
		System.out.println("=================================");		
		//TreeMap
		TreeMap<Integer, String> tmap = new TreeMap<>();
		tmap.put(11, "mike");
		tmap.put(23, "jin");
		tmap.put(20, "jackson");
		tmap.put(500, "clement");
		
		Set<Integer> set2 = tmap.keySet();
		
		//반복자 사용 출력
		//Tree 자료구조의 특성상 반복자가 정렬된 순서대로 key 들에 접근을 함. 
		Iterator<Integer> itr2 = set2.iterator();
		while(itr2.hasNext()) {
			System.out.println(itr2.next());
		}
		System.out.println("----");
		
		//for-each 이용 
		for(Integer n: set2) {
			System.out.println(n.toString());
		}
		
		System.out.println("----");
		
		for(Integer n: set2) {
			System.out.println(tmap.get(n).toString());
		}
		
	}

}
