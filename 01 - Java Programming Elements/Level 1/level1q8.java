import java.util.Scanner; 
public class level1q8{
	public static void main(String[] args){
		double km;
		Scanner input= new Scanner(System.in);
		km=input.nextInt();
		System.out.println("The total miles is" +(km*1.6 )+"mile for the given"+km+ "km");
	}
}