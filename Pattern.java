package assignments;

import java.util.Scanner;

public class Pattern
{

	public static void main(String[] args)
	{
		Scanner t=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=t.nextInt();
			for(int i=1;i<=n;i++)
			{
				for(int j=1;j<=i;j++)
				{
					System.out.print("*"+" ");
				}
				System.out.println();
			}
	}

}
