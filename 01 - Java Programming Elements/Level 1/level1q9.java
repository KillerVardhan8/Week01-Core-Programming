import java.util.Scanner;
public class level1q9{
	public static void main(String[] args){
		double fee;
		double discountPercent;
		Scanner input=new Scanner(System.in);
		fee=input.nextInt();
		discountPercent=input.nextInt();
		System.out.println("The discount amount is INR "+((fee*discountPercent)/100)+" and final discounted fee is INR "+(fee-((fee*discountPercent)/100)));
	}
}
		