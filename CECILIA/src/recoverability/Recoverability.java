package recoverability;

import java.util.List;

public class Recoverability {
	
	List<Long> ultimateRecoveryInstant;
	List<Long> initialRecoveryTime;
	
	//Xi=instante final da recuperação
	//Yi= instante inicial da recuperação
	//i=iésima falha, vari-ando de 0 atéN 
	//N=número de falhas reparada
	//Somatorio (Xi-Yi)/N
	public static void meanRecoveryTime(List<Long> ultimateRecoveryInstant, List<Long> initialRecoveryTime, int numberOfRecoveredFaults, int TimeDivision) {
		
		
		System.out.println("Mean Recovery Time");
		System.out.println("Calculating...");
			
		
		long sommation = 0;

		//verificando se as listas não estão vazias
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
	
	
	//A=número de features ou regras ativas no modelo interno
	//B=número de features ou regras ativas no sistema
	public static void internalSystemKnowledgeResynchronizationRate(int numberOfActivatedFeaturesOnModel, int numberOfActivatedFeaturesOnSystem) {
		System.out.println("Internal System Knowledge Resynchronization Rate");
		System.out.println("Calculating...");
		System.out.println(((double)numberOfActivatedFeaturesOnSystem/(double)numberOfActivatedFeaturesOnModel)*100 + "%");
	}
	
	//A=número de falhasrecuperadas
	//B=número  total  de falhas ocorridas
	public static void operatingDisasterRecoveryRate(int numberOfRecoveredFaults, int totalNumberOfOcurredFaults) {
		System.out.println("Operating Disaster Recovery Rate");
		System.out.println("Calculating...");
		System.out.println(((double)numberOfRecoveredFaults/(double)totalNumberOfOcurredFaults)*100 + "%");	
	}
	
	//A=número de falhas recuperadas
	//B=número total de falhas ocorridas
	public static void adaptationFailureRecoveryRate(int numberOfRecoveredFaults, int totalNumberOfOcurredFaults) {
		System.out.println("Adaptation Failure Recovery Rate");
		System.out.println("Calculating...");
		System.out.println(((double)numberOfRecoveredFaults/(double)totalNumberOfOcurredFaults)*100 + "%");		
	}
}
