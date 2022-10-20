import java.util.PriorityQueue;
import java.util.Scanner;

public class Passenger {
	static Scanner sc=new Scanner (System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Enter Total No of seats");
		int totalnoofseats=sc.nextInt();
		System.out.println("Enter Total No of Passenger");
		int totalnoofpassenger=sc.nextInt();

		perority(totalnoofseats,totalnoofpassenger);
		
		
	}
	
	static void perority(int s,int p)
	{
	    PriorityQueue<Integer> q = new PriorityQueue<Integer>(p);
	    for(int i=0;i<p;i++)
	    {
			System.out.println("Enter perority");
int p1=sc.nextInt();
	    	
	    	q.offer(p1);

	    }
	    int count=0;
	    int arr[]=new int[q.size()];
while(!q.isEmpty())
{
	
//	if(q.peek()==3)
//	{
//		count++;
//		System.out.println("Assistance Passenger "+count);
//		q.poll();
//
//	}
//	else if(q.peek()==2)
//	{
//		count++;
//		System.out.println("Extra Amount Passenger "+count);
//		q.poll();
//	}
//	else if(q.peek()==1)
//	{
//		count++;
//		System.out.println("Children Passenger "+count);
//		q.poll();
//	}
//	else if(q.peek()==0)
//	{
//		count++;
//		System.out.println("Common Passenger "+count);
//		q.poll();
//	}
arr[count++]=q.peek();
q.poll();

}
int c=0;
System.out.println("Passengers list");

for(int i=arr.length-1;i>=0;i--)
{
	if(arr[i]==3)
		{
		c++;
		System.out.println("Assistance Passenger "+c);
		
	
		}
		else if(arr[i]==2)
		{
			c++;
			System.out.println("Extra Amount Passenger "+c);
			
			
		}
		else if(arr[i]==1)
		{
			c++;
			System.out.println("Children Passenger "+c);
			
		}
		else if(arr[i]==0)
		{
//			count++;
			c++;
			System.out.println("Common Passenger "+c);
		
		}
}

System.out.println("seats occupied = 1 to "+c );
c++;
System.out.println("seats vacant "+ c +" to " + s );



	}
	
	
	

}
