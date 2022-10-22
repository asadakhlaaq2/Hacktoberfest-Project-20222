
public class LargestPrime {
    // write your code here
	public static void main(String[] args) {
		getLargestPrime(21);
	}
    public static int  getLargestPrime(int number){
        boolean flag= false;
    if(number<0)
    	return -1;
       for( int i=number;i>=2;i--){
    	   if(number%i==0) {
    	       if(i==2)
    	       return 2;
    		   for(int j=2;j<=i-1;j++) {
    			   if(i%j==0){flag=true;
    				   break;}
    			   else {
    				   flag=false;
    			   }
    		   }
    		   if(flag){ 
    		
    		   }
    		   else{
    		   return i;}
    	   }
       }return -1;
    }
}