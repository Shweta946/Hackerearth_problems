#include <math.h>
#include <stdio.h>

int main(){
	int n, i=0, j=0;
	 int root ;
	scanf("%d", &n);
int ar[n];	
root = (int)sqrt(n);	

	   
		 ar[1]=1;
		 ar[0]=1;
		
		 for ( i=2;i<=root;i++ )
		 {
			 for( j = (2*i);j<n+1;j+=i)
			 {
				 ar[j]=1;
			 }
		 }
		printf("2");
		 for( i =3;i<n+1;i++)
		 {
			 if(ar[i]!=1)
			 {
				  printf(" %d",i);
			 }
		 }
		 return 0;
}
