package n1exercici1;

public class App {

	public static void main(String[] args) {
		
		 try{
			 throw new Exception("Exception message");
			 }
			  
			 catch(Exception ex){
			 System.out.println(ex.getMessage());
			 }
			 
			 finally {
			 System.out.println("The 'try catch' is finished.");
			 }
		
	}
}
