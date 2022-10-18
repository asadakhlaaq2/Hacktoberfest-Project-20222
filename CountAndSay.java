//This is the medium difficulty problem number 38 from LeetCode && as a daily problem for Oct 18 2022
//Inout should be any integer between 1 and 30 and should return either "1" if n = 1 or say n and then countAndSay(n-1)
//More on this project on https://leetcode.com/problems/count-and-say/

//Imports
import java.util.Map;
import java.util.HashMap;

public class CountAndSay {
    //Main method
    public static void main(String[] args){
        //n can be any number from 1 to 30
        int n = 4;
        System.out.println(countAndSay(n));
    }

    public static String countAndSay(int n) {
        
    //Map holding the int n and the string it should return
    Map<Integer, String> map = new HashMap<>();
        
        //Base case
        if(n==1)
            return "1";

        //Check if n is already computed
        if(map.containsKey(n))
            return map.get(n);
        
        //If the value is not present in the map we should compute it and than add it for future use
        String result = say(countAndSay(n-1));
        map.put(n, result);
        
        return result;
        
    }
    
    private static String say(String s){
        
        //Strings are immutable so using a StringBuilder is necessary
        StringBuilder sb = new StringBuilder();
        
        //Method to get each characters' frequency and then the character in the string
        char currentChar = s.charAt(0);
        int count = 1;
        
        for(int i = 1; i<s.length(); i++){
            
            //if the current character is equal to the one we are counting its frequency we increment the said frequency
            if(s.charAt(i) == currentChar){
                count++;
                
            //if we encounter a new character:
            }else{
                
                //1. Append the previous characters frequency
                sb.append(count);
                //2. Append the previous character
                sb.append(currentChar);
                //3. Update the character
                currentChar = s.charAt(i);
                //4. Reset The count
                count = 1;
                
            }
        }
        
        //Taking care of the last character & its frequency
        sb.append(count);
        sb.append(currentChar);
        
        return sb.toString();
    }
} 
