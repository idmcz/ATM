import java.util.HashMap;

public class ATM {
	HashMap<Integer, Double> hashie;
	
	public ATM () {
		hashie = new HashMap<Integer, Double>();
	}
	
	public void openAccount (int accountNum) {
		hashie.put(accountNum, 0.0);
	}
	
	public void openAccount (int accountNum, double deposit) {
		hashie.put(accountNum, deposit);
	}
	
	public void closeAccount (int accountNum) {
		if (hashie.get(accountNum)==0) {
			hashie.remove(accountNum);
		}
	}
	
	public double checkBalance (int accountNum) { 
		if (hashie.containsKey(accountNum))
		return hashie.get (accountNum);
		return 0.0;
	}
	
	public boolean depositMoney (int accountNum, double deposit) {
		if (hashie.containsKey(accountNum)) {
			double cur = hashie.get(accountNum); 
			hashie.put (accountNum, cur + deposit);
			return true;
		}
		return false;
	}
	
	public boolean withdrawMoney (int accountNum, double withdraw) {
		if (hashie.containsKey(accountNum)&& withdraw<hashie.get(accountNum)) {
			double cur = hashie.get(accountNum); 
			hashie.put (accountNum, cur - withdraw);
			return true;
		}
		return false;
	}
	
}
