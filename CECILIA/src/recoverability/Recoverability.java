package recoverability;

import java.util.List;

public class Recoverability {
	
	List<Long> ultimateRecoveryInstant;
	List<Long> initialRecoveryTime;
	
	//Xi=instante final da recupera��o
	//Yi= instante inicial da recupera��o
	//i=i�sima falha, vari-ando de 0 at�N 
	//N=n�mero de falhas reparada
	//Somatorio (Xi-Yi)/N
	public static void meanRecoveryTime(List<Long> ultimateRecoveryInstant, List<Long> initialRecoveryTime, int numberOfRecoveredFaults, int TimeDivision) {
		
		
		System.out.println("Mean Recovery Time");
		System.out.println("Calculating...");
			
		
		long sommation = 0;

		//verificando se as listas n�o est�o vazias
		if(!ultimateRecoveryInstant.equals(null) && !initialRecoveryTime.equals(null)){
			for(int i = 0; i < ultimateRecoveryInstant.size(); i++){
				sommation += ultimateRecoveryInstant.get(i) - initialRecoveryTime.get(i);
			}
		}else{
			System.out.println("0 failures recovered");
		}
		
	
	double meanRecoveryT = ((sommation)/(double)numberOfRecoveredFaults);
	
	switch(TimeDivision) {
	
	case 1000:
		System.out.println((meanRecoveryT/1000) + " of average recovery in seconds");
		break;
		
	case 60*1000:
		System.out.println((meanRecoveryT/1000/60) + " of average recovery in minutes");
		break;
		
	case 60*60*1000:
		System.out.println((meanRecoveryT/1000/60/60) + " of average recovery in hours");
		break;
		
	case 24*60*60*1000:
		System.out.println((meanRecoveryT/1000/60/60/24) + " of average recovery in days");
		break;
	}

		
	}
	
	
	//A=n�mero de features ou regras ativas no modelo interno
	//B=n�mero de features ou regras ativas no sistema
	public static void internalSystemKnowledgeResynchronizationRate(int numberOfActivatedFeaturesOnModel, int numberOfActivatedFeaturesOnSystem) {
		System.out.println("Internal System Knowledge Resynchronization Rate");
		System.out.println("Calculating...");
		System.out.println(((double)numberOfActivatedFeaturesOnSystem/(double)numberOfActivatedFeaturesOnModel)*100 + "%");
	}
	
	//A=n�mero de falhasrecuperadas
	//B=n�mero  total  de falhas ocorridas
	public static void operatingDisasterRecoveryRate(int numberOfRecoveredFaults, int totalNumberOfOcurredFaults) {
		System.out.println("Operating Disaster Recovery Rate");
		System.out.println("Calculating...");
		System.out.println(((double)numberOfRecoveredFaults/(double)totalNumberOfOcurredFaults)*100 + "%");	
	}
	
	//A=n�mero de falhas recuperadas
	//B=n�mero total de falhas ocorridas
	public static void adaptationFailureRecoveryRate(int numberOfRecoveredFaults, int totalNumberOfOcurredFaults) {
		System.out.println("Adaptation Failure Recovery Rate");
		System.out.println("Calculating...");
		System.out.println(((double)numberOfRecoveredFaults/(double)totalNumberOfOcurredFaults)*100 + "%");		
	}
}
