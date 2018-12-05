import java.lang.Math; 
import java.util.*;

public class TestClass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner s = new Scanner(System.in);
         int n = s.nextInt();
		 int[] ar = new int[n+1];
		 ar[1]=1;
		 ar[0]=1;
		 System.out.println(n);
         int root = (int)Math.sqrt(n); 
         System.out.println(root);
		 
		 for (int i=2;i<=root;i++ )
		 {
			 for(int j = (2*i);j<n+1;j+=i)
			 {
				 ar[j]=1;
				  System.out.println(j+" = 1 ");
			 }
		 }
		 
		 for(int i =0;i<n+1;i++)
		 {
			 if(ar[i]!=1)
			 {
				  System.out.print(i+" ");
			 }
		 }
		  s.close();
	}

}
