package assignments;

import java.util.Scanner;

public class AddDigits {

	public static void main(String[] args) {
		Scanner t=new Scanner(System.in);
		System.out.println("Enter a Number");
		int number=t.nextInt();
		int sum=0;
		while(number!=0)
		{
			int n=number%10;
			sum=sum+n;
			number=number/10;
		}
			System.out.println("Sum is "+sum);
	}

}
