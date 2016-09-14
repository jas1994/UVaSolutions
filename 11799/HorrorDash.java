import java.util.*;
class Main
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int cases=sc.nextInt();
		for(int i=0;i<cases;i++)
		{
			int students=sc.nextInt();
			int max=0;
			for(int j=0;j<students;j++)
			{
				int speed=sc.nextInt();
				if(speed>max)
				{
					max=speed;
				}
				else continue;
			}
			System.out.println("Case "+(i+1)+": "+max);
			
		}
	}
}