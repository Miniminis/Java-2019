package instanceOf;

public class Box {
	
	public void simpleWarp() {
		System.out.println("simple wrap");
	}
	
	public static void main(String[] args) {
		Box box = new Box();
		PaperBox paperbox = new PaperBox();
		GoldPaperBox goldpaperbox = new GoldPaperBox();
		wrapBox(box);
		wrapBox(paperbox);
		wrapBox(goldpaperbox);
	}
	
	public static void wrapBox(Box box) {
		//어떤 박스이냐에 따라서 다른 포장지를 사용해야한다. 
		//1) Box box = new Box();
		//2) Box box = new PaperBox();
		//3) Box box = new GoldPaperBox();
		if(box instanceof GoldPaperBox) {
			((GoldPaperBox)box).goldpaperWrap();
		}else if (box instanceof PaperBox) {
			((PaperBox)box).paperWarp();
		}else {
			box.simpleWarp();
		}
	}
}

class PaperBox extends Box{
	public void paperWarp() {
		System.out.println("paper wrap");
	}
}

class GoldPaperBox extends PaperBox {
	public void goldpaperWrap() {
		System.out.println("gold paper wrap");
	}
}
