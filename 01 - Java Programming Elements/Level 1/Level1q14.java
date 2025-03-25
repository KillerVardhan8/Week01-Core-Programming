import java.util.Scanner;
public class Level1q14{
	public static void main(String[] args){
		double distanceinfeet;
		Scanner input=new Scanner(System.in);
		distanceinfeet=input.nextDouble();
		System.out.println("Your distanceinfeet is"+distanceinfeet+"while in yards is"+(distanceinfeet/3)+"and in miles is "+(distanceinfeet/(3*1760)));
	}
}