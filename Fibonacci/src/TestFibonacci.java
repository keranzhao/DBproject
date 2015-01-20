import java.util.Scanner;


public class TestFibonacci {
	public static void main(String [] args){
		Scanner n = new Scanner(System.in);
		int x = 0;	//sub script
		System.out.println("Enter number: ");
		if (n.hasNextInt())
			x = n.nextInt();
		int y = MyMath.fibonacci(x);
		System.out.println("Fibonacci number: "+ "F("+x+")" +" = "+y);
	}
}
