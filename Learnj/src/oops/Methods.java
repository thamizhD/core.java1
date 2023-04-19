package oops;
public class Methods {
//Methods-Carries out a specific task
	//method input-parameters or arguments
	 static int boxVolume(int length,int breadth, int height){//method definition
		int vol;
		vol=length*breadth*height;
		return vol; //returing only one value(int, str,float)in methods at a time
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hello");//method call
		// inbuilt method println is also a method that was written default in java.io.printstrem(class)
         int volume=boxVolume(2,2,2); //passing arguments
         System.out.println(volume);
         System.out.println( "the volume is " + boxVolume(2,2,2));
         boxVolume(2,2,2); //nothing prints 
         
	}

}
