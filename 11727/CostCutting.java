import java.util.*;
class Main
	{
		public static void main(String args[])
			{
				Scanner sc=new Scanner(System.in);
				int i=sc.nextInt();
				for(int j=0;j<i;j++)
					{
						int salary1=sc.nextInt();
						int salary2=sc.nextInt();
						int salary3=sc.nextInt();
						if((salary1>salary2 && salary1<salary3)||(salary1>salary3 && salary1<salary2))
							{
								System.out.println("Case "+(j+1)+": "+salary1);
							}
						if((salary2>salary3 && salary2<salary1)||(salary2>salary1 && salary2<salary3))
							{
								System.out.println("Case "+(j+1)+": "+salary2);
							}
						if((salary3>salary2 && salary3<salary1)||(salary3>salary1 && salary3<salary2))
							{
								System.out.println("Case "+(j+1)+": "+salary3);
							}
					}
			}
	}