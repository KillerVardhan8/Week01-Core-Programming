import java.util.Scanner;
public class Level1q12{
	public static void main(String[] args){
		double base,height;
		Scanner input=new Scanner(System.in);
		base=input.nextDouble();
		height=input.nextDouble();
		double area=0.5*base*height;
		System.out.println("Your Height in cm is "+area+"while in feet is"+(area/(12*2.54))+"and inches is"+(area/2.54));
	}
}