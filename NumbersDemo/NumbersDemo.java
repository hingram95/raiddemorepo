package NumbersDemo;

public class NumbersDemo {

	public static void main(String[] args) {

		Integer intA = 46; 
		Integer intB = 55;
		
		NumbersDemo.displayTwiceTheNumber(intA);
		NumbersDemo.displayTwiceTheNumber(intB);
		
		NumbersDemo.displayNumberPlusFive(intA);
		NumbersDemo.displayNumberPlusFive(intB);
		
		NumbersDemo.displayNumberSquared(intA);
		NumbersDemo.displayNumberSquared(intB);

	}
	
	public static void displayTwiceTheNumber(Integer number){
		Integer twiceTheNumber; 
		twiceTheNumber = number * 2; 
		System.out.println(twiceTheNumber); 
	}
	
	public static void displayNumberPlusFive(Integer number) {
		Integer numberPlusFive;
		numberPlusFive = number + 5;
		System.out.println(numberPlusFive); 
	}
	
	public static void displayNumberSquared(Integer number) {
		Integer numberSquared;
		numberSquared = number * number; 
		System.out.println(numberSquared); 
	}

}
