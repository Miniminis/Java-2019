package productTest;

public class ProductTest {
	public static void main(String[] args) {
		Product p1 = new Product();
		Product p2 = new Product();
		Product p3 = new Product();
		
		System.out.println(p1.serNo);
		System.out.println(p2.serNo);
		System.out.println(p3.serNo);
	}
	
}

class Product{
	static int count = 0;
	int serNo;
	
	//instance 매서드 초기화 
	{
		++count;
		serNo = count;
	}
	
	Product () {}
	
}