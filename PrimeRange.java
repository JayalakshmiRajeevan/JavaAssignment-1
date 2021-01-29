package assignments;

public class PrimeRange {

	public static void main(String[] args) {
		for(int i=10;i<=99;i++)
		{
			int count=0;
			for(int j=1;j<=99;j++)
			{
				if(i%j==0)
				{
					count++;
				}
			}
			if(count==2)
			{
				System.out.println(i);
			}
		}

	}

}
