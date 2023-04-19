package oops;
public class Methods2{
//Methods-Carries out a specific task
	//method input-parameters or arguments
	 static void boxVolume(int length,int breadth, int height){//method definition
		int vol;
		vol=length*breadth*height;
		System.out.println("the volume is " + vol);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hello");//method call
		// inbuilt method println is also a method that was written default in java.io.printstrem(class)
        boxVolume(2,2,2); //passing arguments
        boxVolume(4,4,4);
        boxVolume(3,3,3); // methods are reusable.....we can call the one method for different inputs
	}

}
