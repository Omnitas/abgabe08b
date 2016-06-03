package at.fhj.itm;

public class Test {

	public static void main(String[] args) {
		
		StringQueue test1= new StringQueue();
		test1.offer("asdf");
		test1.offer("qwert");
		test1.offer("jklö");
		test1.offer("zuio");
		test1.peek();
		test1.poll();
		test1.peek();
		test1.poll();
		test1.remove();
	}

}
