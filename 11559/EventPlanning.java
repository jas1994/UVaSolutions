import java.util.*;
class Main
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		while(sc.hasNext())
		{
			int participants=sc.nextInt();
			int budget=sc.nextInt();
			int hotels=sc.nextInt();
			int weeks=sc.nextInt();
			int min=Integer.MAX_VALUE;
			for(int i=0;i<hotels;i++)
			{
				int price=sc.nextInt();
				for(int j=0;j<weeks;j++)
				{	
					int beds=sc.nextInt();
					if((budget-participants*price>=0) && (beds-participants>=0)&& (min-participants*price)>0)
					{
						min=participants*price;
					}
				}
			}
			if(min==Integer.MAX_VALUE)
			{
				System.out.println("stay home");
			}
			else
			{
				System.out.println(min);
			}
	
		}

	}
}