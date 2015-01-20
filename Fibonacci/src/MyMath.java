
public class MyMath {
	public static int fibonacci(int n){
		if (n <= 1)    //1st
			return n;
		else
			return fibonacci(n-1) + fibonacci(n-2);
	}		//end fibonacci
}		//end MyMath

