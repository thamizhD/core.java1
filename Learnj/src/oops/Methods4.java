package oops;
class Box3{
	int length;
	int breadth;
	int height;

       int volume() {
    	  return length*breadth*height;
      }
}
public class Methods4 {

	public static void main(String[] args) {
		Box3 b= new Box3();
		b.length=10;
		b.breadth=20;
		b.height=30;
		System.out.println("volume is " + b.volume()); // Method invoking with object
		Box3 w= new Box3();
		w.length=1;
		w.breadth=2;
		w.height=3;
		System.out.println("volume is " + w.volume()); // Method invoking with object
			}
}
