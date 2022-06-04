package week1;

public class ConstructorDemo {
	
	ConstructorDemo(){
		System.out.println("Inside default constructor");
	}
	
	ConstructorDemo(String toBePrinted){
		System.out.println(toBePrinted);
	}
	
	public static void main(String[] args) {
		
		ConstructorDemo c1 = new ConstructorDemo();
		ConstructorDemo c2 = new ConstructorDemo("Calling parameterised constructor");
		
	}

}

