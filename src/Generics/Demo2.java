package Generics;

public class Demo2<T> {

	T obj;
	
	
	public T getObj() {
		return obj;
	}


	public void setObj(T obj) {
		this.obj = obj;
	}


	public static void main(String[] args) {
		
		Demo2<Integer> demo1 = new Demo2<>();
		demo1.setObj(101);
		System.out.println(demo1.getObj());
		
		Demo2<String> demo2 = new Demo2<>();
		demo2.setObj("HELLO");
		System.out.println(demo2.getObj());
		
	}
}
