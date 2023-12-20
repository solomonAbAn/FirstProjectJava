package Pack1;

import java.util.Scanner;

public class Solomon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("I am Solomon Abou Antoun");
		System.out.println ("what is your age?");
		int age = 18;
		System.out.println(age);
		
		double grades = 67.5;
		boolean ispass = false;
		char mychar = 'p';
		
		System.out.println (ispass);
		System.out.println(67.5);
		System.out.println(mychar);
		
		//primitive
		String myname = "Solomon";
		
		System.out.println("Hello " + myname);
		System.out.println("your age is " + age);
		
		//scanner
		System.out.println("please give me your age ");
				//create the object
		Scanner kb = new Scanner(System.in);
		int yourage = kb.nextInt();
		
		System.out.println("your age is" + yourage);
	
		System.out.println("Please give me your name ");
		String yourname = kb.next();
		
		System.out.println("Hello " + yourname);
		
		System.out.println("please give me the length");
		double x= kb.nextDouble();
		System.out.println("please give me the width");
		double y = kb.nextDouble();
		
		double area = x * y;
		
		System.out.println("the area is " + area);
		
		
		
		
		
		
		
	}

}
