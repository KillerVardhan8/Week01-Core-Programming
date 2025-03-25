import java.util.Scanner;
public class Level1q7{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		String month=input.nextLine();
		int day=input.nextInt();
		if (month.equals("March")){
			if (day>=20){
			System.out.println("Spring Season");}
			else{
				System.out.println("Not a Spring Season");
			}
		}
		else if (month.equals("April") || month.equals("May")){
			System.out.println("Spring Season");
		}
		else if (month.equals("June")){
			if (day<=20){
				System.out.println("Spring Season");
			}
			else{
				System.out.println("Not a Spring Season");
			}
		}
		else{
		System.out.println("Not a Spring Season");}
		}
	}