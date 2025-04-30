import java.util.Scanner;
public class Level1q13{
	public static void main(String[] args){
		double perimeter;
		Scanner input=new Scanner(System.in);
		perimeter=input.nextDouble();
		System.out.println("The length of the side is "+(perimeter/4)+" whose perimeter is "+perimeter);
	}
}