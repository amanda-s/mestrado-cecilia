package fault_tolerance;

public class Fault_Tolerance {
	
	
	//A=número de requisições respondidas enquanto o sistema se recupera de uma falha
	//B=número  total  de requisições
	public static void rateOfRequestsAnsweredInThePresenceOfSystemFailure(int numberOfRequestsAnswered, int totalNumberOfRequests) {
		
		System.out.println("Rate Of Requests Answered In The Presence Of System Failure");
		System.out.println("Calculating...");
		System.out.println(((double)numberOfRequestsAnswered/(double)totalNumberOfRequests)*100 + "%");	
	}
	
	//A=número de falhas de adaptação toleradas
	//B=número total de falhas de adaptação
	public static void adaptationFaultsTolerated(int numberOfToleratedFaults, int totalNumberOfAdaptationFaults) {
		
		System.out.println("Adaptation Faults Tolerated");
		System.out.println("Calculating...");
		System.out.println(((double)numberOfToleratedFaults/(double)totalNumberOfAdaptationFaults)*100 + "%");	
	}
	
	
	//A=número de falhas toleradas
	//B=número  total  de falhas
	public static void faultToleranceLevel(int numberOfToleratedFaults, int totalNumberOfFaults) {
		System.out.println("Fault Tolerance Level");
		System.out.println("Calculating...");
		System.out.println(((double)numberOfToleratedFaults/(double)totalNumberOfFaults)*100 + "%");	
	}

}
