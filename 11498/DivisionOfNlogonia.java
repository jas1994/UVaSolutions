import java.util.*;
class Main
{
	public static void main(String args[])
		{
			Scanner sc=new Scanner(System.in);
			
			while(true)
				{
					int i=sc.nextInt();
						if(i==0)
							{
								break;
							}
						int division1=sc.nextInt();
						int division2=sc.nextInt();
					for(int j=0;j<i;j++)
						{
					
							int point1=sc.nextInt();
							int point2=sc.nextInt();
							if(point1>division1 && point2>division2)
								{
									System.out.println("NE");
							
								}
							if(point1<division1 && point2<division2)
								{
									System.out.println("SO");
								}
							if(point1>division1 && point2<division2)
								{
									System.out.println("SE");
								}
							if(point1<division1 && point2>division2)
								{
									System.out.println("NO");
								}
							if(point1==division1 || point2==division2)
								{
									System.out.println("divisa");
								}
						}
				}
		}
}