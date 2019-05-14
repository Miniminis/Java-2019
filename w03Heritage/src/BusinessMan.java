
public class BusinessMan extends Man {
	String company;
	String position;
	
	//하위 클래스 생성자는 반드시 상위클래스의 생성자를 호출해서 실행한다. 
	//상위 클래스에서 생성자를 통한 초기화 과정이 있다면, 
	//하위클래스에서 데이터를 받아서 상위 클래스의 생성자를 호출한다. 
	
	public BusinessMan (String name, String company, String position) {
		super(name);
		this.company=company; 
		this.position=position;
	}
	
	public void showInfo() {
		System.out.println(company);
		System.out.println(position);
	}
}
