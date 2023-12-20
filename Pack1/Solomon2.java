package Pack1;

import java.util.Scanner;

public class Solomon2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner (System.in);
		
		System.out.println("please give me an integer value");
		int x = kb.nextInt ();
		
		int result = x * x * x;
		
		System.out.println("the cube power is " + result);
	}

}
