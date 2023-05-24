package class5;

public class childB extends Parent {
	void name() {
		System.out.println("Child B name");
	}
	public static void main(String[] args) {
		childB b = new childB();
		b.name();
		b.address();
		b.phno();
}

}
