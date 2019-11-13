package fault_tolerance;

public class Fault_Tolerance {
	
	
	//A=n�mero de requisi��es respondidas enquanto o sistema se recupera de uma falha
	//B=n�mero  total  de requisi��es
	public static void rateOfRequestsAnsweredInThePresenceOfSystemFailure(int numberOfRequestsAnswered, int totalNumberOfRequests) {
		
		System.out.println("Rate Of Requests Answered In The Presence Of System Failure");
		System.out.println("Calculating...");
		System.out.println(((double)numberOfRequestsAnswered/(double)totalNumberOfRequests)*100 + "%");	
	}
	
	//A=n�mero de falhas de adapta��o toleradas
	//B=n�mero total de falhas de adapta��o
	public static void adaptationFaultsTolerated(int numberOfToleratedFaults, int totalNumberOfAdaptationFaults) {
		
		System.out.println("Adaptation Faults Tolerated");
		System.out.println("Calculating...");
		System.out.println(((double)numberOfToleratedFaults/(double)totalNumberOfAdaptationFaults)*100 + "%");	
	}
	
	
	//A=n�mero de falhas toleradas
	//B=n�mero  total  de falhas
	public static void faultToleranceLevel(int numberOfToleratedFaults, int totalNumberOfFaults) {
		System.out.println("Fault Tolerance Level");
		System.out.println("Calculating...");
		System.out.println(((double)numberOfToleratedFaults/(double)totalNumberOfFaults)*100 + "%");	
	}

}
