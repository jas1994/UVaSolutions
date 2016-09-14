import java.util.*;
class Main
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String final_name="placeholder";
		int count=0;
		
		while(true)
		{
			int max_requirements=0;
			float min_price=Float.MAX_VALUE;
			int requirements=sc.nextInt();
			if(requirements==0)
			{
				return;
			}
			int proposals=sc.nextInt();
			sc.nextLine();
			for(int i=0;i<requirements;i++)
			{
				sc.nextLine();
			}
			for(int i=0;i<proposals;i++)
			{
				
				String name=sc.nextLine();
				float price=sc.nextFloat();
				int met_requirements=sc.nextInt();
				sc.nextLine();
				for(int j=0;j<met_requirements;j++)
				{
					sc.nextLine();
				}
				
				
				if(met_requirements>max_requirements)
				{
					max_requirements=met_requirements;
					min_price=price;
					final_name=name;
				
				}
				if(met_requirements==max_requirements)
				{
					if(min_price>price)
					{
						min_price=price;
						final_name=name;
					}
				
				}
			
			}
			count++;
			if(count>1)//Leave a blank line between the output for each pair of RFPs. Don't print an extra blank line at the end.
			{
			System.out.println("");
			}
			System.out.println("RFP #"+count);
			System.out.println(final_name);
			
		
		}	
	}
}