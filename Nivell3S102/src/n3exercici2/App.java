package n3exercici2;

import java.util.ArrayList;

public class App {

	public static void main(String[] args) {
		
		ArrayList<Integer> misNumeros = new ArrayList<Integer>();
		
		misNumeros.add(3);
		
		try {
			
		FailingConstructor fail = new FailingConstructor(misNumeros);
		
		} catch (Exception ex) {
			
			ex.printStackTrace();
			
		} finally {
			
			System.out.println("The main 'try catch' is finished.");
			
		}
		
		System.out.println("Seguimos adelante con nuestro codigo.");

	}

}
