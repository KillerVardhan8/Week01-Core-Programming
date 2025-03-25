import java.util.Scanner;
public class level1q11{
public static void main(String[] args){
	double num1,num2;
	Scanner input=new Scanner(System.in);
	num1=input.nextDouble();
	num2=input.nextDouble();
	System.out.println( "The addition, subtraction, multiplication and division value of 2 numbers "+num1+" and "+num2+" is "+(num1+num2)+","+(num1-num2)+","+(num1*num2)+","+(num1/num2));
	}
}