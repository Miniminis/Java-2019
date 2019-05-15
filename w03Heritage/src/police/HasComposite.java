package police;

public class HasComposite {

	public static void main(String[] args) {
		Police p1 = new Police(4, 9);
		Police p2 = new Police(0,10); 
		
		p1.putHandcuff();
		p1.shut();
		
		p2.putHandcuff();
		p2.shut();

	}

}

class Police {
	int handcuffs;
	Gun pistol;
	Police (int num, int cuff) {
		if(num!=0) {
			pistol = new Gun(num);
		}else {
			pistol=null;
		}
	}
	
	public void putHandcuff() {
		handcuffs--;
	}
	public void shut() {
		if(pistol==null) {
			System.out.println("hut BBANG");
		} else {
			pistol.shut();
		}
	}
}
class Gun {
	int bullet;
	
	public Gun(int num) {
		bullet = num;
	}
	
	public void shut() {
		System.out.println("BBANG");
		bullet--;
	}
}