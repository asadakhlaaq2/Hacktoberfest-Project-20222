import java.util.*;


public class Puzzels {
	public static void main(String[] args)  {
		
		
		Scanner sc=new Scanner(System.in);
				int n =sc.nextInt();
				int m =sc.nextInt();
				
int a[]=new int[m];
	
for(int i=0;i<m;i++)
{
	a[i]=sc.nextInt();
}
Arrays.sort(a);


int leastdifference=a[n-1]-a[0];
//three m-n is beacuse to gopo through all the no. in array 
//if n=4 so we have to makee sure that we have to find b/w any four no. in the array

for(int i=0;i<=m-n;i++)
{
if(leastdifference>a[n+i-1]-a[i])
	//a[n+i-1]-a[i] this is to mentain the n number difference in ehich we have to find least 
{
	leastdifference=a[n+i-1]-a[i];
}
}

System.out.println(leastdifference);
sc.close();
	}
	
	
	}
