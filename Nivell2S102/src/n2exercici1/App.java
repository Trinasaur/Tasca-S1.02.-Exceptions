package n2exercici1;

public class App {

	public static void main(String[] args) throws Exception {
		
		try {
			
			ThrowException.f();
		
		} catch(Exception ex) {
			
			System.out.println(ex.getMessage());//explica el que ha causat l'excepcio
			 
			ex.printStackTrace();//printa el tipus de exccepcio amb la explicacio
			
		} finally {
			
			System.out.println("The main 'try catch' is finished.");
		}
		

	}

}
