package Generics;

public class Demo3<T1,T2> {

	T1 obj1;
	
	T2 obj2;
	

	public Demo3(T1 obj1, T2 obj2) {
		super();
		this.obj1 = obj1;
		this.obj2 = obj2;
	}

	void print() {
		
		System.out.println(this.obj1+"   :::   "+this.obj2);
	}

	public static void main(String[] args) {
		
		Demo3<Integer,String> demo1 = new Demo3<>(101,"Rahul");
		demo1.print();
		
		Demo3<String,Long> demo2 = new Demo3<>("Rahul Pandey",5465645454l);
		demo2.print();
		
		Demo3<Double,Boolean> demo3 = new Demo3<>(101.12012,false);
		demo3.print();
	}
}
