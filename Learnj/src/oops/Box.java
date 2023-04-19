package oops;
class Box1{
	int length;
	int breadth;
	int height;
}
public class Box {

	public static void main(String[] args) {
		Box1 blackBox=new Box1();
		blackBox.length=10;
		blackBox.breadth=20;
		blackBox.height=30;
		Box1 woodBox=new Box1();
		woodBox.height=20;
		System.out.println(blackBox.length);
		System.out.println(blackBox.breadth);
		System.out.println(blackBox.height);
		System.out.println(woodBox.height);
				
	}

}