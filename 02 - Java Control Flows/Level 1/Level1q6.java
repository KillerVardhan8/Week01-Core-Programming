import java.util.Scanner;
public class Level1q6{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		int num=input.nextInt();
		if(num>0){
			System.out.println("Positive number");
		}
		else if(num==0){
			System.out.println("Zero");
		}
		else{
			System.out.println("Negative number");
		}
	}
}