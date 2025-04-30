import java.util.Scanner;

public class Level2q7 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("a: ");
        int a=scanner.nextInt();
        System.out.println("b: ");
        int b=scanner.nextInt();
        a=a^b;
		b=a^b;
		a=a^b;
        System.out.println("a:"+a);
        System.out.println("b:"+b);
    }
}
