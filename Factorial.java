import java.util.*;
public class Factorial {

	 public static void main(String args[] ) throws Exception {
		 Scanner s = new Scanner(System.in);
	      int i = Integer.parseInt(args[0]);
	      
	      System.out.println(" " + factorial(i));
	 }
	

private  static int factorial(int n){
	if (n== 0 || n == 1)
	{
		return 1;
	}
	else 
		return n * factorial(n-1);
}

}
