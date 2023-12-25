package Generics;

public class Demo<T> {

	T obj;
	
	public void m1(T arg)
	{
		System.out.println("Arg ::: "+arg);
	}
	public static void main(String[] args) {
		
		Demo demo = new Demo();
		
		demo.m1(101);  //integer
		demo.m1("Hello"); //String
		demo.m1(120.1245); //double
		demo.m1(true); //boolean
		
		
	}
}
