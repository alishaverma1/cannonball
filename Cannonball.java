import java.util.Scanner;

public class Cannonball 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter the velocity of the cannonball: ");
		double velocity = sc.nextDouble();
		System.out.println("Please enter the angle the cannonball will be shot at: ");
		double angle = sc.nextDouble();
		System.out.println("Please enter the distance to the target: ");
		double distance = sc.nextDouble();
		System.out.println("Please enter the elevation of the bottom of the target: ");
		double elevation = sc.nextDouble();
		System.out.println("Please enter the size of the target: ");
		double size = sc.nextDouble();
		
		if(velocity*(Math.cos(angle))==0)
		{
			System.out.println("The distance cannot be calculated with that input");
		}
		else
		{
			double time = (distance/(velocity*Math.cos(angle)));
			double height = (velocity * time * Math.sin(angle)- ((32.17*Math.pow(time, 2)))/2);
			
			if(height<0)
			{
				System.out.println("The cannonball did not reach the target.");
			}
			else if(height>0 && height<elevation)
			{
				System.out.println("The cannonball went under the target. The height at the target is: "+height);
			}
			else if(height>elevation && height<(elevation+size))
			{
				System.out.println("The cannonball hit the target!");
			}
			else if(height>(elevation+size))
			{
				System.out.println("The cannonball went over the top of target. The height at the target is: "+height);
			}
		}
			
	}
}
