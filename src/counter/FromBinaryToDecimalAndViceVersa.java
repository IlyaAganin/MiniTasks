package counter;

public class FromBinaryToDecimalAndViceVersa {
	
	public static void main(String[] args) {
		String num = "1110";//"16";
		//System.out.println(num + " converts to " + fromBinaryToDecimal(num));
		System.out.println(num + " converts to " + fromDecimalToBinary(num));
	}
	
	public static String fromBinaryToDecimal(String number) {
		StringBuilder converetedNumber = new StringBuilder(); 
		int num = Integer.parseInt(number);
		while (num > 0) {
			if (num % 2 == 0)
				converetedNumber.append("0");
			else
				converetedNumber.append("1");
			num /= 2;
		}
		return converetedNumber.reverse().toString();
	}
	
	public static String fromDecimalToBinary(String number) {
		int converetedNumber = 0;
		for (int i = 0; i < number.length(); i++)
			if	(number.charAt(i) == '1')
				converetedNumber += sqPow(number.length() - i - 1);
		return String.valueOf(converetedNumber);
	}
	
	public static int sqPow(int x) {
		int y = 1;
		for (int i = 0; i < x; i++)
			y*=2;
		return y;
	}
}
