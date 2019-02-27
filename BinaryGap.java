import java.util.Scanner;
import java.util.ArrayList;

public class BinaryGap {

	static StringBuilder ans = new StringBuilder(" ");
	 public static void main(String args[] ) throws Exception {
		 Scanner s = new Scanner(System.in);
		 int i = s.nextInt();
		 for(int a=0;a<i;a++) {
			 long j = s.nextLong();		      
		     // System.out.println("Max Gap "+ Binary_Gap(j,0,0,0) );
			 // System.out.println(""+ Binary_Gap2(j,0,0,0) );
		//	 ans.setLength(0);
		//	  Binary_Gap2(j,0,0,0);
		//	  	  if(ans.length()==0){
		//			   System.out.println(" 0");
		//		  }
		//		  else
		//		  {
		//			  System.out.println(ans.reverse());
		//		  }
				  
				  printElements(Binary_Gap4(j));
			  
			  
		 }
	      
	      s.close();
	      //System.out.println(" "+ Binary_Gap(j,0,0,0) );
	 }
	
	 //Just to print the maximum of the BinaryGap
	 public static int Binary_Gap(Long N, int counter, int max, int index) {
		 
		 if (N==0)		 
		 return max;	
		 
		 if(N%2 == 0 && index == 0)
		 {
			 index=0;
		 }
		 else if (N%2 == 0)
			 counter++;
		 else
		 {
			 max =Math.max(counter, max);
			 counter=0;
			 index++;
		 }
		N/=2;	
		 return Binary_Gap(N,counter,max,index);
	 }
	 
	 	 //To print all of the BinaryGap
	 public static void Binary_Gap2(Long N, int counter, int max, int index) {
		 
		 if (N==0)		 
		 return;	
		 
		 if(N%2 == 0 && index == 0)
		 {
			 index=0;
		 }
		 else if (N%2 == 0)
			 counter++;
		 else
		 {
			 if (counter>0)
			 {
				 ans.append(" " +Integer.toString(counter));
				 //System.out.print(counter + " ");
			 }
			 
			 max =Math.max(counter, max);
			 counter=0;
			 index++;
		 }
		N/=2;	
		 Binary_Gap2(N,counter,max,index);
	 }
	 
	  	 //To print all of the BinaryGap
	 public static void Binary_Gap3(Long N, int counter, int max, int index) {
		 
		 
		 while(N>0)
		 {
			 if(N%2 == 0 && index == 0)
		 {
			 index=0;
		 }
		 else if (N%2 == 0)
			 counter++;
		 else
		 {
			 if (counter>0)
			 {
				 ans.append(" " +Integer.toString(counter));
				 //System.out.print(counter + " ");
			 }
			 
			 max =Math.max(counter, max);
			 counter=0;
			 index++;
		 }
		
		N/=2;	
		 }
	 }
	 
	   	 //To print all of the BinaryGap
 public static ArrayList<Integer> Binary_Gap4(Long N) {
	 
	 int counter =0, max=0,index=0;
	ArrayList<Integer> al = new ArrayList<>();
	 
	 while(N>0)
	 {
		 if(N%2 == 0 && index == 0)
	 {
		 index=0;
	 }
	 else if (N%2 == 0)
		 counter++;
	 else
	 {
		 if (counter>0)
		 {
			al.add(counter);
			 //System.out.print(counter + " ");
		 }
		 
		 max =Math.max(counter, max);
		 counter=0;
		 index++;
	 }
	
	N/=2;	
	 }
	 if(al.size()==0)
	 {
		 al.add(0);
	 }
	 return al;
    }
	
	  public static void printElements(ArrayList<Integer> alist) 
    { 
			 System.out.println();
        for (int i = alist.size()-1; i >=0; i--) { 
            System.out.print(alist.get(i) + " "); 
	}
	
    } 
 
}
