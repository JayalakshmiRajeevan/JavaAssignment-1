package assignments;

import java.util.Scanner;

public class NumberPattern
{
	public static void main(String[] args)
	{
		Scanner t=new Scanner(System.in);
		System.out.println("Enter size");
		int size=t.nextInt();
		for(int i=size;i>=1;i--)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
}
