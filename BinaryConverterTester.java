import java.util.Scanner;

public class BinaryConverterTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner (System.in);
		System.out.println ("Binary to decimal (BTD) or decimal to binary (DTB)?");
		String ans = keyboard.next();
		BinaryConverter bc = new BinaryConverter ();
		if (ans.equals ("BTD"))
		System.out.println(bc.convertBTD("1010001011101110001011010010110101"));
		else if (ans.equals ("DTB"))
		System.out.println(bc.convertDTB(100000000001L));
	}

}
