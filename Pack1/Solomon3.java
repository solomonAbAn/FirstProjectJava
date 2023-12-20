package Pack1;

public class Solomon3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double x = 3.5;
		double y = 49.2;

		double sub = x - y;
		double add = x + y;
		double mult = x * y;
		double div = x / y;
		
		double mod = y % x; //the mod is a remainder (le reste de qlqch)

		System.out.println("the addition of x and y is " + add);
		System.out.println("the substraction of x and y is " + sub);
		System.out.println("the multiplication of x and y is " + mult);
		System.out.println("the division of x and y is " + div);
		System.out.println("the mod of x and y is " + mod);
		
		int myvalue = 20;
		System.out.println("my value now is " + myvalue);
		myvalue++;
		System.out.println("afterincrementing");
		System.out.println("my value is now " + myvalue);
		
		myvalue += 7;
		
		System.out.println("my value is now " + myvalue);
		
		System.out.println(++myvalue);
	
		
	}

}
