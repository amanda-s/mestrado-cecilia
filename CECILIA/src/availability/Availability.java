package availability;

public class Availability {
	
	//A=tempo total de indisponibilidade
	//B=número  de  interrupções  ou  falhas  observadas
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
	
	//A=instante  de  resposta da requisição B=instante de envio da requisição
	public static void responseTimeOfARequestGivenTheOccurrenceOfAParallelAdaptation(long responseTime, long requestTime) {
		
		System.out.println("Response Time Of a Request Given The Occurrence of a Parallel Adaptation");
		System.out.println("Calculating...");
		double responseTimeOfARequestGivenTheOccurrenceOfAParallelAdaptation = 
				responseTime - requestTime;
		
		System.out.println("Calculated Time: " + responseTimeOfARequestGivenTheOccurrenceOfAParallelAdaptation);
	}
	
	//A=número de requisições respondidas
	//B=número  total  de requisições
	public static void requestRequestsRate(int numberOfRequestsAnswered, int totalNumberOfRequests) {
		System.out.println("Request Requests Rate");
		System.out.println("Calculating...");
		System.out.println(((double)numberOfRequestsAnswered/(double)totalNumberOfRequests)*100 + "%");	
	}
	
	//A = número interrupções por adaptação
	//B = número total de interrupções
	public static void adaptationInterruptionRate(int numberOfInterruptionsForAdaptations, int totalNumberOfInterruptions) {
		System.out.println("Adaptation Interruption Rate");
		System.out.println("Calculating...");
		System.out.println(((double)numberOfInterruptionsForAdaptations/(double)totalNumberOfInterruptions)*100 + "%");	
	}
	
	//A=número de adaptações sem falha
	//B=número total de adaptações
	public static void correctAdaptationRate(int numberOfAdaptationsWithoutFaults, int totalNumberOfAdaptations) {
		
		System.out.println("Correct Adaptation Rate");
		System.out.println("Calculating...");
		System.out.println(((double)numberOfAdaptationsWithoutFaults/(double)totalNumberOfAdaptations)*100 + "%");	
	}

}
