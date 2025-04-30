import java.util.Scanner;
public class Level1q4{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		int num1=input.nextInt();
		if (num1<0){
			System.out.println("Not a Natural Number");
		}
		else{
			System.out.println(num1*(num1+1)/2);
		}
	}
}
			