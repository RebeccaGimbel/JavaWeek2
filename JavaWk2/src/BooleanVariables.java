
public class BooleanVariables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean isHotOutside = true;
		boolean isWeekDay = true;
		boolean hasMoneyInPocket = true;
		double costOfMilk = 3.25, moneyInWallet = 15.75;
		int thirstLevel = 5; //scale of 1-10
		
		boolean shouldByIcecream = (isHotOutside && hasMoneyInPocket); 
		boolean willGoSwimming = (isHotOutside && !isWeekDay); 
		boolean isAGoodDay = (isHotOutside && hasMoneyInPocket && !isWeekDay); 
		boolean willBuyMilk = (isHotOutside && thirstLevel >= 3 && moneyInWallet >= costOfMilk*2);
		
		System.out.println("It is hot outside: " + isHotOutside);
		System.out.println("It is a week day: " + isWeekDay);
		System.out.println("There is money in my pocket: " + hasMoneyInPocket);
		
		System.out.println();
				
		System.out.println("The cost of milk is " + costOfMilk);
		System.out.println("The amount of money in my wallet is " + moneyInWallet);
		
		System.out.println();
		System.out.println("I should buy icecream: " + shouldByIcecream);
		System.out.println("I will go swimming: " + willGoSwimming);
		System.out.println("It is a good day: " + isAGoodDay);			
		System.out.println("I will buy milk: " + willBuyMilk);
	
		
	}

}
