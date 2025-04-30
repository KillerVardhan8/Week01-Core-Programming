import java.util.Scanner;
public class Level1q5{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		int age=input.nextInt();
		if (age>=18){
			System.out.println("Yes you can vote");
		}
		else{
			System.out.println("No you cannot vote");
		}
	}
}