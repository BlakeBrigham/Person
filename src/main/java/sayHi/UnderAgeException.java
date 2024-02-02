package sayHi;

public class UnderAgeException extends Exception
{

	/**
	 * 
	 */
	public UnderAgeException()
	{
		super("Parent is too Young");
		// TODO Auto-generated constructor stub
	}


	/**
	 * @param message
	 */
	public UnderAgeException(String message)
	{
		super(message);
		// TODO Auto-generated constructor stub
	}

	private static final long serialVersionUID = 1L;
	
	
}
