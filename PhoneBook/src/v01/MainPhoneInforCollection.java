package v01;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class MainPhoneInforCollection {

	public static void main(String[] args) {

		// 친구의 데이터를 저장하고 출력하는 프로그램 (phoneInfor 클래스 이용)
		 PhoneInfor_v01 info1 = new PhoneInfor_v01("명탐정코난", "01030005000");
		 PhoneInfor_v01 info2 = new PhoneInfor_v01("카드캡터체리", "010-2000-6000","20001225"); 
		 PhoneInfor_v01 info3 = new PhoneInfor_v01("뽀로로", "01012345678", "1999년 8월 17일");
		 
		 info1.getInfo(); 
		 info2.getInfo(); 
		 info3.getInfo();
		 
		ArrayList<PhoneInfor_v01> plist = new ArrayList<PhoneInfor_v01>();
		
		//요소추가 
		plist.add(info1);
		plist.add(info2);
		plist.add(info3);
		
		//요소불러오기 
		for(int i=0; i<plist.size(); i++) {
			System.out.println(plist.get(i));
		}
		
				
	}
	
	static void testHashSet() {
		HashSet<PhoneInfor_v01> pset = new HashSet<PhoneInfor_v01>();
		PhoneInfor_v01 info1 = new PhoneInfor_v01("명탐정코난", "01030005000");
		PhoneInfor_v01 info2 = new PhoneInfor_v01("카드캡터체리", "010-2000-6000","20001225"); 
		
		pset.add(info2);
		pset.add(info1);
		
		System.out.println(pset.size());
		
		Iterator<PhoneInfor_v01> itr = pset.iterator();
		while(itr.hasNext()) {
			itr.next().getInfo();
		}
	}
}

hashCode()