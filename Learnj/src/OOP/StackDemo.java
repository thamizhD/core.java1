package OOP;
public class StackDemo {

	public static void main(String[] args) {
		Stack s1=new Stack();//object
		s1.push(1);
		s1.push(2);
		s1.push(3);
		
		System.out.println(s1.pop());
		
		Stack s2=new Stack();
		s2.push(1);
		s2.push(2);
		s2.push(3);
		System.out.println(s2.pop());
	}

}
