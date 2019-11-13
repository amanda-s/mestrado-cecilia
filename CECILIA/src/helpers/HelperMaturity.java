package helpers;

import java.util.ArrayList;
import java.util.List;

public class HelperMaturity {

private static List<Long> ultimateRecoveryInstant = new ArrayList<Long>();
	
	private	 static List<Long> initialRecoveryTime = new ArrayList<Long>();
	
	
	public static void setUltimateRecoveryInstant(long recoveryInstant) {
		ultimateRecoveryInstant.add(recoveryInstant);
	}
	
	public static void setInitialRecoveryInstant(long recoveryInstant) {
		ultimateRecoveryInstant.add(recoveryInstant);
	}
	
	public static List<Long> getUltimateRecoveryInstants(){
		return ultimateRecoveryInstant;
	}
	
	public static List<Long> getInitialRecoveryInstants(){
		return initialRecoveryTime;
	}
	
	public static void cleanRecoveryInstantsLists(){
		ultimateRecoveryInstant.clear();
		initialRecoveryTime.clear();
	}
	
}
