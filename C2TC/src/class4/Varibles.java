package class4;

public class Varibles {
	int varDefault = 10;				//default
	public int varPublic = 20;			//public
	private int varPrivate = 30;		//private
	protected int varProtected = 40;	//protected
	
	void methodDefault() {
		System.out.println("Default access base class");
		System.out.println("Default variable: "+varDefault);
	}
	public void methodPublic() {
		System.out.println("Public access base class");
		System.out.println("Public variable: "+varPublic);
	}
	protected void methodProtected1() {
		System.out.println("Protected access base class");;
		System.out.println("Private variable: "+varPrivate);
	}
	protected void methodProtected() {
		System.out.println("Protected access base class");
		System.out.println("Protected variable: "+varProtected);
	}

}



	