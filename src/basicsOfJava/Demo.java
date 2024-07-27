package basicsOfJava;

public class Demo {

	public static void main(String[] args) {
		System.out.println("I am the main method");
		method1(); // Static method called to main method with in the class
		Demo dd = new Demo(); // creating the object the to call a non static method within the class
		dd.method2(); // non static method within the class
		dd.method3(); // non static method with in the class
		Practice new1 = new Practice(); // creating the object to call a non static method outside of class
		new1.method4(); // non static method outside of class
		Practice.method5(); // calling the static method of outside class using class name . static method
		// name

	}

	public static void method1() {
		System.out.println("I am the Static method");

	}

	public void method2() {
		System.out.println("I am non-static Method");

	}

	public void method3() {
		System.out.println("I am Method3 and I am notn-static");
		method1();
		Demo dd = new Demo();
		dd.method2();

	}

}

class Practice {
	public void method4() {
		System.out.println("I am a non-static method from another class");
	}

	static public void method5() {
		System.out.println("I am a static method from anothe class");
	}
}