package counter;

public class SimpleNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long number = 805431l;
		System.out.println(SimNumsMultiplication(number) + " = " + number);
		//System.out.println();
	}
	
	public static String SimNumsMultiplication(long number) {
		String resStr = "";
		
		while(number % 2 == 0) {
			number /= 2;
			resStr += "2*";
		}
		
		for(int j = 3; number != 1; j+=2)
			while(number % j == 0) {
				number /= j;
				resStr += j + "*";
			}
		
		return resStr.substring(0, resStr.length() - 1);
	}

}
