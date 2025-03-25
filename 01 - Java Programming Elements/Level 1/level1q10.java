import java.util.Scanner;
public class level1q10{
	public static void main(String[] args){
		double height,feet,inches;
		Scanner input=new Scanner(System.in);
		height=input.nextInt();
		feet=height/(12*2.54);
		inches=height/2.54;
		System.out.println("Your Height in cm is"+height+" while in feet is "+ feet+" and inches is"+inches);
	}
}	