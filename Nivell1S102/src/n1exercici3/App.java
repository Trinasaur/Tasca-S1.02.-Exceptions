package n1exercici3;

public class App {

	public static void main(String[] args) {
		
		int[] intArray = new int[1];
		
		try{
			
			//La unica posicio valida al Array es 0, intentar entrar a la posicio 1 generara una excepcio.
			System.out.println(intArray[1]);
			 
			 
		}
			  
		catch(Exception ex){
				 
			System.out.println(ex.getMessage());//explica el que ha causat l'excepcio
			 
			ex.printStackTrace();//printa el tipus de exccepcio amb la explicacio
			 
			System.out.println(ex.getClass().getName());//printa el tipus de excepcio
			 
		}
			 
		finally {
			
			 System.out.println("The 'try catch' is finished.");
			 
		}
		
	}
}
