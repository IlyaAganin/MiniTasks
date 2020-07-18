package counter;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Calculator!");
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		String readString = "";
	    while (!readString.equalsIgnoreCase("cancel")) {
			System.out.println("Enter your expression:");
			Double previousResult = 0d;
		    readString = scanner.nextLine();    	
		    while (!readString.isEmpty() && !readString.equalsIgnoreCase("cancel")) {
		    	System.out.print(previousResult == 0 ? "" : previousResult.toString());
			    previousResult = calculator(readString, previousResult);
			    System.out.println(readString.replaceAll("\\s+", "") + "=" + previousResult);
			    System.out.println("Calculate result and press enter to continue or press enter to restart.");
			    //System.out.print(previousResult);
			    readString = scanner.nextLine();
		    }
		    System.out.println();
	    }
	    
	    System.out.println("Bye-bye!");
	}
        
	
	public static Double calculator(String inputString, Double previousResult) {
		String str = inputString.replaceAll("(\\s+)", "");
		String[] vars = str.split("(\\+)|(\\-)|(\\*)|(\\/)|(\\^)");
		
		String opers = str.replaceAll("(\\d+)|(\\d+\\.\\d+)", "");
		
		Double result = previousResult;
		if (previousResult == 0)
			result = Double.parseDouble(vars[0]);
		
		for (int i = 0; i < opers.length(); i++) 
			switch (opers.charAt(i)) {
				case '+':
					result += Double.parseDouble(vars[i+1]);
					break;
				case '-':
					result -= Double.parseDouble(vars[i+1]);
					break;
				case '*':
					result *= Double.parseDouble(vars[i+1]);
					break;
				case '/':
					result /= Double.parseDouble(vars[i+1]);
					break;
				case '^':
					result = exponentiation(result, Double.parseDouble(vars[i+1]));
					break;
				default:
					System.out.println("Incorrect symbol - " + opers.charAt(i) + ".");
					System.out.println("This undefined operator and next value(" + vars[i+1] + ")will be ignored.");
					break;
			}
		return result;
	}
		
	public static Double exponentiation (Double number, Double exponent) {
		Double result = 1d;
		for (int i = 0; i < exponent; i++)
			result *= number;
		return exponent > 0 ? result : 1/result;
	}

}
