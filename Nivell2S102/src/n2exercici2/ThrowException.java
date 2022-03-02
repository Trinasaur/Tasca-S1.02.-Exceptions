package n2exercici2;

public class ThrowException {
	
	//METODES
	public static void f() throws Exception {
		
		try{
			 
			throw new RuntimeException("Envolico la nova excepcio en un RunTimeException", g());
			 
		}
			  
		catch(Exception ex){
				 
			System.out.println(ex.getMessage());//explica el que ha causat l'excepcio
			
			ex.printStackTrace();//printa el tipus de exccepcio amb la explicacio
			
			//CHAINED EXCEPTION
			throw new MyException("Found a " + ex.getClass().getName(), ex);
			 
		}
			 
		finally {
			
			System.out.println("The f() 'try catch' is finished.");
			 
		}
		
	}
	
	public static Exception g() {
		return new MyException("Soc una nova excepcio!");
	}
	
}
