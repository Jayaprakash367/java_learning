

public class Multilevel_Inheritance {

	public static void main(String[] args) {
		new1 obj=new new1();
		obj.Example1();

	}

}
class new1{
	void Example1() {
		System.out.println("hello");
	}
}
class new2 extends new1{
	void Example2() {
		
	}
}
class new3 extends new2{
	void Example3() {
		
	}
}
class new4 extends new3{
	void Example4() {
		
	}
}

