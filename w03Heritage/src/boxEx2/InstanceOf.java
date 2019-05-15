package boxEx2;

public class InstanceOf {
	public static void wrapBox(Box box) {
		box.wrap();
	}
	
	public static void main(String[] args) {
		Box box = new Box();
		PaperBox paperbox = new PaperBox();
		GoldPaperBox goldpaperbox = new GoldPaperBox();
		
		wrapBox(box);
		wrapBox(paperbox);
		wrapBox(goldpaperbox);
	}
	
}

class Box {	
	public void wrap() {
		System.out.println("simple wrap");
	}
}
class PaperBox extends Box {
	public void wrap() {
		System.out.println("paper wrap");
	}
	
}
class GoldPaperBox extends PaperBox{
	public void wrap() {
		System.out.println("gold wrap");
	}
}