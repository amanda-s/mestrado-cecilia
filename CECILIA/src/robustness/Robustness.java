package robustness;

import java.text.DecimalFormat;

public class Robustness {
	
	private static DecimalFormat df = new DecimalFormat("#,###.00");
	//Representa a porcentagem de adaptações que o 
	//SAS é capaz realizar corretamente mesmo com inconsistências de contexto
	
	//Represents the percentage of adaptations that SAS is able to perform 
	//correctly with context inconsistencies
	
	public static void correctContextMismatchRate(double numberOfCorrectAdaptations, double totalNumberOfAdaptations){

		System.out.println("Correct Context Mismatch Rate Starting");
		double correctContextMismatchRatePorcentage = numberOfCorrectAdaptations/totalNumberOfAdaptations;		
		System.out.println("Calculating...");
		System.out.println((df.format(correctContextMismatchRatePorcentage*100)) + "%");
		
	}
}
