package basicsOfJava;

public class VariableOfClass {
	int a = 10;
	private int b = 20;
	protected int c = 30;
	public int d;
	
	
	
	public static void main(String[] args) {

		VariableOfClass obj1 = new VariableOfClass();

		System.out.println("I am within a Class I am able to use default a="+obj1.a);
		System.out.println("I am within a Class I am able to use private b ="+obj1.b);
		System.out.println("I am within a Class I am able to use protected c="+obj1.c);
		System.out.println("I am within a Class I am able to use Public d="+obj1.d);
		Abc obj2=new Abc();
		obj2.main1();
		Abc1 obj3= new Abc1();
		obj3.main2();

	}
	
		

}

// Sub class of VariableOfClass

class Abc extends VariableOfClass {
	
	public void main1() {
		
		VariableOfClass obj1 = new VariableOfClass();
		System.out.println("I am a SubClass of variableOfClass I am able to use default a variable a="+obj1.a);
//		System.out.println(obj1.b); // Showing Error because private AM variable cannot use on sub class of a same package
		System.out.println("I am a SubClass of variableOfClass I am able to use Protected Variable c="+obj1.c);
		System.out.println("I am a SubClass of variableOfClass I am able to use Public variable d="+obj1.d);
		
		
		
	}
}

class Abc1{
	public void main2() {
		VariableOfClass obj1 = new VariableOfClass();
		System.out.println("I am a SubClass of variableOfClass I am able to use default a variable a="+obj1.a);
//		System.out.println(obj1.b); // Showing Error because private AM variable cannot use on non subclass of a same package
		System.out.println("I am a SubClass of variableOfClass I am able to use Protected Variable c="+obj1.c);
		System.out.println("I am a SubClass of variableOfClass I am able to use Public variable d="+obj1.d);
		
		
	}
	
	
}