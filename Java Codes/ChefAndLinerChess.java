import java.util.Scanner;

public class ChefAndLinerChess {

	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		 Scanner sc = new Scanner(System.in);
        
        int t = sc.nextInt();
        
        for(int z=0;z<t;z++)
        {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int min=1000000;
            int min2=-1;
            int pi[] = new int[10000];
            
            for(int i=0;i<n;i++)
            {
                pi[i] = sc.nextInt();
            }
            for(int i=0;i<n-1;i++)
            {
                
       
            	if(k%pi[i]==0)
                {
            		int temp=k/pi[i]-1;
            		if(temp<min)
            		{
            			min=temp;
            			min2=pi[i];
            		}
                }
            } 
            System.out.println(min2);
            
        sc.close();
	}
	}
	
}
