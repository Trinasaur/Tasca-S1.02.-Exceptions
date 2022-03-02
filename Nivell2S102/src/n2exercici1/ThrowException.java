package n2exercici1;

public class ThrowException {
	
	//METODES
	public static void f() throws Exception {
		
		try{
			 
			 g();
			 
			 }
			  
			 catch(Exception ex){
				 
			 System.out.println(ex.getMessage());//explica el que ha causat l'excepcio
			 
			 ex.printStackTrace();//printa el tipus de exccepcio amb la explicacio
			 
			 System.out.println(ex.getClass().getName());//printa el tipus de excepcio
			 
			 //CHAINED EXCEPTION
			 throw new MyException("Found a MyException", ex);
			 
			 }
			 
			 finally {
			 System.out.println("The f() 'try catch' is finished.");
			 
			 }
		
	}
	
	public static void g() throws MyException {
		throw new MyException("Soc una nova excepcio!");
	}
}
