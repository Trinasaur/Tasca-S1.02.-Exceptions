package n1exercici4;

public class App {

	public static void main(String[] args) {
		
		
		 try{
			 throw new MyException("Hola");
			 
			 }
			  
			 catch(MyException ex){
				 
			 System.out.println(ex.getMessage());//explica el que ha causat l'excepcio
			 
			 ex.printStackTrace();//printa el tipus de exccepcio amb la explicacio
			 
			 System.out.println(ex.getClass().getName());//printa el tipus de excepcio
			 
			 }
			 
			 finally {
			 System.out.println("The 'try catch' is finished.");
			 }
		
	}
}
