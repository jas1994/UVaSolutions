import java.util.*;
class Main{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int i=sc.nextInt();
		for(int l=0;l<i;l++)
			{
				int a=sc.nextInt();
				int b=sc.nextInt();
				if(a>b)
					{
						System.out.println(">");
					
					}
				if(a<b)
					{
						System.out.println("<");
					}
				if(a==b)
					{
						System.out.println("=");
					}
			}
		
		
	}
}