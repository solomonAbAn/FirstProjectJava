package Day4;

import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int sz1, sz2, i;
Scanner kb = new Scanner(System.in);

System.out.println("please give me a the size ar 1 and ar 2 ");

int[] ar1 = new int [sz1];
int[] ar2 = new int [sz1];

for (i=0; i< ar1.length; i++) {
	ar1[i] = i * 5;
}
ar1[2] = -44;

for (i=0; i<ar1.length; i++) {
	ar2[i] = ar1[i];
}
	}

}
