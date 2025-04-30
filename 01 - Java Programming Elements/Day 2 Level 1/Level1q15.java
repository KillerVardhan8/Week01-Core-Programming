import java.util.Scanner;
public class Level1q15{
	public static void main(String[] args){
		double unitprice;
		int quantity;
		Scanner input=new Scanner(System.in);
		unitprice=input.nextDouble();
		quantity=input.nextInt();
		System.out.println("The total price purchase is INR" + (unitprice*quantity)+"if the quantity is"+quantity+"and the unit price is"+unitprice);
	}
}