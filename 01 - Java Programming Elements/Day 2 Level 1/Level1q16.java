import java.util.Scanner;
public class Level1q16{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		int numberofstudents;
		numberofstudents=input.nextInt();
		System.out.println("the maximum number of possible handshakes are"+((numberofstudents*(numberofstudents-1))/2));
	}
}