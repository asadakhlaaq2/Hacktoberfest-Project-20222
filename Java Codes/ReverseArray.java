import java.util.Arrays;

public class ReverseArray {	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	

	    private static void reverse(int [] array)
	    {
	        int temp=0;
	        int length=array.length;
	        System.out.println("Array = "+Arrays.toString(array));
	        for(int i=0;i<(length/2)+1;i++){
	            temp=array[i];
	            array[i]=array[length-1];
	            array[length-1]=temp;
	            length--;
	        }
	          System.out.println("Reversed array = "+Arrays.toString(array));
	    }
	}

