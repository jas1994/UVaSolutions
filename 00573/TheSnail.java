import java.util.*;
class Main
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		while(true)
		{
			int height=sc.nextInt();
			if(height==0)
			{
				return;
			}
			float climb=sc.nextFloat();
			float slide=sc.nextFloat();
			float fatigue=(sc.nextFloat())/100;
			float dynamic_height=0;
			float dynamic_height_before_slide=0;
			int day=0;
			float climbed_distance=0;
			while(dynamic_height>=0 && dynamic_height<=height && dynamic_height_before_slide>=0 && dynamic_height_before_slide<=height)
			{
								
				climbed_distance=(climb-(day*fatigue*climb));
				if(climbed_distance<0)
				{
					dynamic_height_before_slide=dynamic_height+0;
				}
				else
				{
					dynamic_height_before_slide=dynamic_height+((climb-(day*fatigue*climb)));
				}
				dynamic_height=dynamic_height_before_slide-slide;
				day++;
							
			}
			if(dynamic_height<0)
			{ 
				System.out.println("failure on day "+(day));
			}
			else
			{
				 
				 System.out.println("success on day "+(day));
			}
		}




	}
		
}