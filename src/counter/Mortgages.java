package counter;

public class Mortgages {
	
	public static void main(String[] args) {
		System.out.println("Your monthly payment is " + contributionEveryMonth(2100000, 120, 12));
	}

	public static double contributionEveryMonth(int sum, int months, int intRate) {
		return sum/months * (1 + intRate/100);
	}
}
