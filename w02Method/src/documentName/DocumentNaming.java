package documentName;
public class DocumentNaming {
	public static void main(String[] args) {
		System.out.println(Document.count); //static{} 실행 
		Document doc = new Document(); //인스턴스 생성시에 바로 클래스 내용 실행 {} 및 생성자 내용 실행 
		Document doc2 = new Document();
		Document doc3 = new Document();
		Document doc4 = new Document("java class"); 	
	}
}

class Document {
	static int count = 0; // 클래스 변수 명시적 초기화 
	String name = "filename"; //인스턴스 변수 명시적 초기화
	
	//클래스 변수 블럭 초기화 
	//인스턴스 변수 호출불가
	static {
		count = count+2;
//		System.out.println(count);
	}
	//인스턴스 변수 블럭 초기화
	{ 
		name = "JAVACLASS";
		count = count +3;
		System.out.println(name);
		System.out.println(count);
	}
	
	//생성자를 통한 변수 초기화 
	Document() {
		this("random"+ ++count);
	}
	
	Document (String name) {
		this.name = name;
		System.out.println(name);
		System.out.println(count);
	}
}