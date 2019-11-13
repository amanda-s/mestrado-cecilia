package availability;

public class Availability {
	
	//A=tempo total de indisponibilidade
	//B=n�mero  de  interrup��es  ou  falhas  observadas
	public static void averageDowntime(long totalDownTime, int numberOfInterruptionsOrFaults, int timeDivision) {
		System.out.println("Average Downtime");
		System.out.println("Calculating...");
		double averageDowntime = ((double)totalDownTime/timeDivision)/numberOfInterruptionsOrFaults;		
		
		switch(timeDivision) {
		
		case 1000:
			System.out.println(averageDowntime + " of average downtime seconds");
			break;
			
		case 60*1000:
			System.out.println(averageDowntime + " of average downtime minutes");
			break;
			
		case 60*60*1000:
			System.out.println(averageDowntime + " of average downtime hours");
			break;
			
		case 24*60*60*1000:
			System.out.println(averageDowntime + " of average downtime days");
			break;
		}
	}
	
	//A=instante  de  resposta da requisi��o B=instante de envio da requisi��o
	public static void responseTimeOfARequestGivenTheOccurrenceOfAParallelAdaptation(long responseTime, long requestTime) {
		
		System.out.println("Response Time Of a Request Given The Occurrence of a Parallel Adaptation");
		System.out.println("Calculating...");
		double responseTimeOfARequestGivenTheOccurrenceOfAParallelAdaptation = 
				responseTime - requestTime;
		
		System.out.println("Calculated Time: " + responseTimeOfARequestGivenTheOccurrenceOfAParallelAdaptation);
	}
	
	//A=n�mero de requisi��es respondidas
	//B=n�mero  total  de requisi��es
	public static void requestRequestsRate(int numberOfRequestsAnswered, int totalNumberOfRequests) {
		System.out.println("Request Requests Rate");
		System.out.println("Calculating...");
		System.out.println(((double)numberOfRequestsAnswered/(double)totalNumberOfRequests)*100 + "%");	
	}
	
	//A = n�mero interrup��es por adapta��o
	//B = n�mero total de interrup��es
	public static void adaptationInterruptionRate(int numberOfInterruptionsForAdaptations, int totalNumberOfInterruptions) {
		System.out.println("Adaptation Interruption Rate");
		System.out.println("Calculating...");
		System.out.println(((double)numberOfInterruptionsForAdaptations/(double)totalNumberOfInterruptions)*100 + "%");	
	}
	
	//A=n�mero de adapta��es sem falha
	//B=n�mero total de adapta��es
	public static void correctAdaptationRate(int numberOfAdaptationsWithoutFaults, int totalNumberOfAdaptations) {
		
		System.out.println("Correct Adaptation Rate");
		System.out.println("Calculating...");
		System.out.println(((double)numberOfAdaptationsWithoutFaults/(double)totalNumberOfAdaptations)*100 + "%");	
	}

}
