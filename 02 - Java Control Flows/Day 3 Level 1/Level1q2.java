import java.util.Scanner;
public class Level1q2{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		double num1,num2,num3;
		num1=input.nextDouble();
		num2=input.nextDouble();
		num3=input.nextDouble();
		if (num1<num2 && num1<num3){
			System.out.println(num1+" is the smallest number" );
		}
		else if (num2<num1 && num2<num3){
			System.out.println(num2+" is the smallest number" );
		}
		else{
			System.out.println(num3+" is the smallest number" );
		}
	}
}