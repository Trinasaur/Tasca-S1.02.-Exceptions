package n1exercici5;

public class App {

	public static void main(String[] args) {
		
		
		//ATRIBUTS
		int[] intArray = new int[1];
		
		boolean hayError = true;
		
		int i = 5;
		
		//BUCLE
		while (hayError) {
		
			try{
			 
				//La unica posicio valida al Array es 0, intentar entrar a la posicio 1 generara una excepcio.
				System.out.println(intArray[i]);
			 
				hayError = false;
			 
			}
			  
			catch(Exception ex) {
				 
				System.out.println(ex.getMessage());//explica el que ha causat l'excepcio
			 
				ex.printStackTrace();//printa el tipus de exccepcio amb la explicacio
			 
				System.out.println(ex.getClass().getName());//printa el tipus de excepcio
			 
				hayError = true;
			}
			 
			finally {
			
				System.out.println("The 'try catch' is finished.");
			 
			}
		 
			i--;
		 
		}
	}
}
