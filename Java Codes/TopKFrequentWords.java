//This is the medium difficulty problem number 692 from LeetCode && as a daily problem for Oct 19 2022
//
//Constraints:
//1 <= words.length <= 500
//1 <= words[i].length <= 10
//words[i] consists of lowercase English letters.
//k is in the range [1, The number of unique words[i]]
//
//More on this project on https://leetcode.com/problems/count-and-say/

//Imports
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;

public class TopKFrequentWords {
    //Main method
    public static void Main(String[] args) {

        String[] words = new String[] { "a", "b", "a", "b", "c"};
        System.out.println(topKFrequent(words, 2)); // Output: ["a", "b"]

    }
    
    private static List<String> topKFrequent(String[] words, int k) {
        //Top k frequent words implies the use of a priority queue of size k
        //Adding and removing n element from a priority queue in java is made in O(n log2(n))
        //Using a map holding all n elements: O(n)
        
        //Global Time Complexity: O(n log2(n))
        //Global Space Complexity: O(n)

        //Map holding words and their frequencies
        Map<String, Integer> map = new HashMap<>();
        
        //Populating the hashmap
        for(int i = 0; i<words.length; i++){
            if(map.containsKey(words[i])){
                map.replace(words[i], 1+map.get(words[i]));
            }else{
                map.put(words[i], 1);
            }
        }
        
        //Map that stores map entries by lowest frequency to highest and, at equal frequencies, in alphabetical order
        Queue<Map.Entry<String, Integer>> pq = new PriorityQueue<>((e1, e2) -> {
            if(e1.getValue() == e2.getValue()) return e2.getKey().compareTo(e1.getKey());
            else return e1.getValue() - e2.getValue();
        } );
        
        //Populating the Priority queue and keeping only k elements at any given moment
        for(Map.Entry<String, Integer> entry : map.entrySet()){
            pq.offer(entry);
            if(pq.size()>k) pq.poll();
        }
        
        //Output list
        LinkedList<String> list = new LinkedList<>();
        while(!pq.isEmpty()){
            list.addFirst(pq.poll().getKey());
        }
        
        return list;
    }
}
