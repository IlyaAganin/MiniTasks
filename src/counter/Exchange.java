package counter;

public class Exchange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Your odd money is " + exchange(1, 120) + "$");
		
	}
	
	public static int exchange(int itemNumber, int amountOfMoney) {
		int value = 0;
		switch(itemNumber) {
			case 1:
				System.out.println("Your chose \"Coca-Cola\" 0.5l");
				value = 60;
				break;
			case 2:
				System.out.println("Your chose \"Lays\" small packet");
				value = 45;
				break;
			case 3:
				System.out.println("Your chose \"Arhiz\" 0.5l");
				value = 20;
				break;
			case 4:
				System.out.println("Your chose \"Pringles\" big canister");
				value = 100;
				break;
			case 5:
				System.out.println("Your chose \"Twix\" standard");
				value = 40;
				break;
			default:
				System.out.println("No suitable product. Try again.");
				break;
				
		}
		return amountOfMoney-value;
	}

}
