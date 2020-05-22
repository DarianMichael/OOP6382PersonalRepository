public class HelloWord{
	public static void main (String[] args){
		double number1 = 24.0;
		double number2 = 12.0;
		double totalSum;
		double totalPercent;
		
		totalSum = calculateSum(number1, number2);
		totalPercent = calculatePercent(number1, number2);
		
		System.out.println("Hello Word Martinez Alfonso, Darian Michael");
																		
		System.out.println("The sum of " + number1 + "+" + number2 + " is --> " +totalSum);
		
		System.out.println(number2 + "is the" + totalPercent + " porcient of " + number1);
	}
	
	public static double calculateSum(double number1, double number2){
		double total;
		total = number1 + number2;
		return total;
	}
	
	public static double calculatePercent(double number1, double number2){
		double total;
		total = (number2 * 100)/ number1;
		return total;
	}
	
}