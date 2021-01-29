package assignments;

import java.util.Scanner;

public class Cube
{
	public static void main(String[] args)
	{
		Scanner t=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=t.nextInt();
		for(int i=1;i<=n;i++)
		{
			System.out.println(i*i*i);	
		}
	}

}
