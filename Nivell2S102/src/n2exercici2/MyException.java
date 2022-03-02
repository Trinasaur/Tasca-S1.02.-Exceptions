package n2exercici2;

public class MyException extends Exception {
	
	private static final long serialVersionUID = 1L;

	public MyException(String errorMessage, Exception ex) {
        super(errorMessage, ex);
    }
	
	public MyException(String errorMessage) {
        super(errorMessage);
    }

}
