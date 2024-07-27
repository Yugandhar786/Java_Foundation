package packageX;

import basicsOfJava.VariableOfClass;

public class VariableOfClass2 {

	public static void main(String[] args) {
		New2 obj4=new New2();
		New1.new1();
		obj4.new2();
		

	}

}

class New1 {
	public static void new1() {
		VariableOfClass obj1 = new VariableOfClass();
//		System.out.println(obj1.a); // Showing Error because Default  variable cannot use on non sub class of a diff package
//		System.out.println(obj1.b); // Showing Error because private variable cannot use on sub class of a diff package
//		System.out.println(obj1.c);// Showing Error because Protected variable cannot use on sub class of a diff  package
		System.out.println("I am a non SubClass of variableOfClass2 I am able to use Public variable d="+obj1.d);
	}
}

class New2 extends VariableOfClass {
	public void new2() {
		VariableOfClass obj1 = new VariableOfClass();
//		System.out.println(obj1.a);// Showing Error because Default AM variable cannot used  on sub class of  VariableOfClass on diff package
//		System.out.println(obj1.b); // Showing Error because private Am variable cannot used  on sub class of  VariableOfClass on diff package
//		System.out.println(obj1.c); // Showing Error because Protected variable cannot used  on sub class of  VariableOfClass on diff package
		System.out.println("I am a SubClass of variableOfClass I am able to use Public variable d=" + obj1.d);
	}
}