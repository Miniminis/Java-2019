package map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;

public class MapTest {

	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<>();
		
		//key-value ��� ������ ���� 
		//�б��� �л��ο� ����� ���� 
		//�⼮��ȣ�� ���� �ߺ��� �� ������, �̸��� ���� �л��� ������ �� �ִ�.
		//key ���� �ߺ��� �� ������, value ���� �ߺ��� �� �ִ�. 
		map.put(30, "mike");
		map.put(21, "jin");
		map.put(36, "jackson");
		map.put(4, "clement");
		
		//������ Ž�� 
		System.out.println(map.get(30));
		System.out.println(map.get(21));
		System.out.println(map.get(36));
		
		System.out.println("==================================");
		
		//������ ����
		map.remove(30);
		//����Ȯ��
		System.out.println(map.get(30));
		
		System.out.println("=================================");
		//HashMap�� �������� ���� ��� ��
		Set<Integer> set = map.keySet();
		
		//�ݺ��ڸ� �̿��� value�� ��� 
		Iterator<Integer> itr = set.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		//for ���� �̿��� key �� ��� 
		System.out.println("=================================");
		for(Integer n: set) {
			System.out.println(n.toString());
		}
		
		//for ���� �̿��� value �� ��� 
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
		
		//�ݺ��� ��� ���
		//Tree �ڷᱸ���� Ư���� �ݺ��ڰ� ���ĵ� ������� key �鿡 ������ ��. 
		Iterator<Integer> itr2 = set2.iterator();
		while(itr2.hasNext()) {
			System.out.println(itr2.next());
		}
		System.out.println("----");
		
		//for-each �̿� 
		for(Integer n: set2) {
			System.out.println(n.toString());
		}
		
		System.out.println("----");
		
		for(Integer n: set2) {
			System.out.println(tmap.get(n).toString());
		}
		
	}

}
