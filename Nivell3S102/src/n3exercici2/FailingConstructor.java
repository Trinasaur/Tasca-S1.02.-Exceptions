package n3exercici2;

import java.util.ArrayList;

public class FailingConstructor {
	
//VARIABLES
	int number1;
	
	int number2;
	
//CONSTRUCTOR
	public FailingConstructor(ArrayList<Integer> misNumeros){
		
		number1 = misNumeros.get(0);
		
		number2 = misNumeros.get(1);//EL CONSTRUCTOR FALLA PERQUE misNumeros NOMES TE UNA ENTRADA
       
		
		
		
    }

}
