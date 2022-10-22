import java.util.Arrays;
import java.util.Scanner;

public class SortedArray {


public static int[] getIntegers(int capacity){
   Scanner scanner= new Scanner(System.in);
    System.out.println("Enter the "+capacity+" elements \r");
     int [] array = new int [capacity];
    for(int i=0; i<array.length ; i++) {
        array[i]=scanner.nextInt();
    }
    return array;
}    

public static void printArray(int [] array){
       for(int i=0;i<array.length;i++){
 System.out.println("Element "+i+" contents "+array[i]);
    }
}
public static int[] sortIntegers(int []array){
    
    int [] sortedArray=Arrays.copyOf(array,array.length);
    int temp;
    boolean flag=true;
    while(flag){
        flag=false;
        for(int i=0;i<sortedArray.length-1;i++){
            if(sortedArray[i] < sortedArray[i+1]){
                temp=sortedArray[i];
                sortedArray[i]=sortedArray[i+1];
                sortedArray[i+1]=temp;
                flag=true;
            } 
        }   
    }
    return sortedArray;
}

}
