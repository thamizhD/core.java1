package oops;
class Boxes{
	int length;
	int breadth;
	int height; 
	Boxes(int l, int b, int h){ //constructor it is written by its class name there is no return type for cons
		length=l;
		breadth=b;
		height=h;
	}
	void setDim(int l,int b,int h){ // this pointer
		this.length=l; //using this is the best practice
		this.breadth=b;
		this.height=h; //controlling values using method
	}
	int volume() {
		return length*breadth*height;
	}
}

public class Constructor {

	public static void main(String[] args) {
		Boxes s=new Boxes(5,4,3);//constructor only for object creation like initialization
		s.setDim(10, 20, 30); // we can change the parameters using this separate method
		System.out.println(s.volume());
	}

}
