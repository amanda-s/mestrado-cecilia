package maturity;

import java.text.DecimalFormat;
import java.util.List;

public class Maturity {
	
	private static DecimalFormat df = new DecimalFormat("#,###.00");
	
	//Tempo m�dio entre falhas
	//Representa a frequ�ncia  com  a  qual  o  sistema falha durante a sua opera��o
	//A=tempo  de  opera��o
	//B=n�mero  total  de falhas detectadas
	public static void meanTimeBetweenFailure(long timeOfOperation, int numberOfDetectedFaults, int timeDivision) {

		System.out.println("Mean Time Between Failures");
		System.out.println("Calculating...");
		double meanTimeBetweenFailure = ((double)timeOfOperation/timeDivision)/numberOfDetectedFaults;		
		
		switch(timeDivision) {
		
		case 1000:
			System.out.println( meanTimeBetweenFailure + " Seconds Between Faults");
			break;
			
		case 60*1000:
			System.out.println( meanTimeBetweenFailure + " Minutes Between Faults");
			break;
			
		case 60*60*1000:
			System.out.println( meanTimeBetweenFailure + " Hours Between Faults");
			break;
			
		case 24*60*60*1000:
			System.out.println( meanTimeBetweenFailure + " Days Between Faults");
			break;
		}
	}
	
	
	public static void meanTimeWithoutFailure(Long totalTimeOfOperation, List<Long> ultimateRecoveryInstant, List<Long> momentOfFailure) {
		
		System.out.println("Mean Time Withoure Failure");
		System.out.println("Calculating...");		
		long sommation = 0;

			//verificando se as listas n�o est�o vazias
			if(!ultimateRecoveryInstant.equals(null) && !momentOfFailure.equals(null)){
				for(int i = 0; i < ultimateRecoveryInstant.size(); i++){
					sommation += ultimateRecoveryInstant.get(i) - momentOfFailure.get(i);
					System.out.println("Itera��o" + i);
					System.err.println("sub " + (ultimateRecoveryInstant.get(i) - momentOfFailure.get(i)));
					System.err.println("soma " + sommation);
					
				}
			}else{
				System.out.println("0 failures recovered");
			}
		
		double meanTimeWithoutFailure = (((double)totalTimeOfOperation - (sommation))/(double)totalTimeOfOperation);
		System.out.println((meanTimeWithoutFailure)*100 + "%"); 
	}
	
	
	//A=tempo  de  opera��o  com  o desempenho requerido
	//B=tempo  total  de opera��o
	public static void operatingTimeWithProperPerformance(double timeOfOperationnWithPerformance, double totalTimeOfOperation) {
		System.out.println("Operating Time With Proper Performance");
		double operatingTimeWithProperPerformance = timeOfOperationnWithPerformance/totalTimeOfOperation;		
		System.out.println("Calculating...");
		System.out.println((df.format(operatingTimeWithProperPerformance*100)) + "%");	
	}
	
	

}
