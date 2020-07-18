package counter;

import java.util.Scanner;

public class NextPrimeNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int l = 1;
		System.out.println("Generator of nth prime numbers");
		System.out.println("Press enter to start.");
	    Scanner scanner = new Scanner(System.in);
	    String readString = scanner.nextLine();
	    while(readString!=null) {
	        System.out.println(readString);

	        if (readString.isEmpty()) {
	        	System.out.println(nextPrimeNum(l++) + "\n" );
	            System.out.println("Press enter to continue.");
	        }

	        if (scanner.hasNextLine()) {
	            readString = scanner.nextLine();
	        } else {
	            readString = null;
	        }
		
		
	    }
	
		/*for(int i = 1; i < 20; i++)
			System.out.println(nextPrimeNum(i));*/
	}
	
	public static int nextPrimeNum(int n) {
		int x = 2;
		if (n > 1) {
			int k = 2;
			int d = 3;
			x++;
			for(; k < n; k++) {
				x += 2;
				d = 3;
				//System.out.println(k);
				if (x % 3 == 0)
					k--;
				else
					outer: for(int l = 3; l < k/2 + 1; l++) {
						d += 2;
						if(x % d == 0) {
							k--;
							break outer;
						}
					}
			}
		}
					
		return x;
	}
}
