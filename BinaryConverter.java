
public class BinaryConverter {
	//public String ans = "";
	
	public BinaryConverter () {
	}
	
	public String convertDTB (long num) {
		String numStr = "";
		long rem = 1;
		long dividedNum = num;
		while (dividedNum != 0) {
			rem = dividedNum % 2;
			numStr = rem + numStr;
			dividedNum = dividedNum / 2;
		}
		return numStr;
	}
	
	public String convertBTD (String num) {
		String numm = num;
		int counter = numm.length()-1;
		long ret = 0;
		for (int i = 0; i < numm.length(); i ++) {
			long curr = Integer.parseInt(numm.charAt(i)+"");
			ret += curr * Math.pow(2, counter);
			counter --;
		}
		return Long.toString(ret);
	}
}
