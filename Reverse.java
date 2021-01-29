package assignments;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		Scanner t=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=t.nextInt();
		int r=0;
		while(num!=0)
		{
			int n=num%10;
			r=r*10+n;
			num/=10;
		}
			System.out.println("Reverse digit is "+r);
	}

}
