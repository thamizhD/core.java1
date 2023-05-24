package class8;

public class demo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		square s = new square();
		s.calArea();
		s.show();
		
		shape shape;
		shape = new square(21.5f);
		
		shape.calArea();
		shape.show();
	}
}
