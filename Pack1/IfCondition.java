package Pack1;

import java.util.Scanner;

public class IfCondition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		System.out.println("please give me your age ");
		int age = kb.nextInt();
		
		if(age > 18) {
			System.out.println("you can drink ");
		}else {
			System.out.println("Nope you are still not eligible");
		}
		
		
		
	}

}
