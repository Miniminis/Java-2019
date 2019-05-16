package boxEx2;

/* 문제2.
교안의 예제 InstanceOf.java를 instanceof 연산자를 사용하지 않는 형태로 
변경하고자 한다. 즉 클래스의 상속관계를 그대로 유지하면서,
 instanceof 연산자를 사용하지 않고도 동일한 실행결과를 보일 수 있어야 한다.
 변경되어야 할 wrapBox 메소드를 아래에 제시.

Public static void wrapBox(Boxbox)
{
box.wrap();
}

HINT. 메소드 오버라이딩
*/

public class InstanceOf {
	
	public static void wrapBox(Box box) {
		box.wrap();
	}
	
	public static void main(String[] args) {
		Box box = new Box();
		PaperBox paperbox = new PaperBox();
		GoldPaperBox goldpaperbox = new GoldPaperBox();
		
		Box box1 = box;
		Box box2 = paperbox;
		Box box3 = goldpaperbox;
		
		wrapBox(box1);
		wrapBox(box2);
		wrapBox(box3);
	}
	
}

class Box {
	
	private void simpleWrap() {
		System.out.println("simple wrap");
	}
	
	public void wrap() {
		simpleWrap();
	}
}
class PaperBox extends Box {
	
	private void paperWrap() {
		System.out.println("paper wrap");
	}

	public void wrap() {
		paperWrap();
	}
	
}

class GoldPaperBox extends PaperBox{
	
	private void goldPaperBox() {
		System.out.println("gold paper wrap");
	}
	
	public void wrap() {
		goldPaperBox();
	}
}
