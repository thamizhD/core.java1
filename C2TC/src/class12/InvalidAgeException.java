package class12;
public class InvalidAgeException extends Exception{
	public InvalidAgeException()
	{
		super("Invalid Age");
	}
	InvalidAgeException(String message){
		super("U cant vote");
	}
}
