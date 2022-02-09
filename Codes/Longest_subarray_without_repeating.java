package Codes;
import java.util.*;
public class Longest_subarray_without_repeating {
    
        public int lengthOfLongestSubstring(String s) {
            HashSet<Character> map= new HashSet<>();
            
            int max=0;
            int j=0;
            int i=0;
            while(j<s.length()){
                if(!map.contains(s.charAt(j))){
                    map.add(s.charAt(j));
                    j++;
                    max=Math.max(map.size(),max);
                }else{
                    map.remove(s.charAt(i));
                    i++;
                }
               
            }
          return max;  
        }



    



public int findPairs(int[] nums, int k) {
        
    //hashmap is more power tool for the this question instead of hashset
    //set the value,frequency pair in the hashmap
    HashMap<Integer, Integer> map = new HashMap<>();
    
    for(int n: nums) {
        map.put(n, map.getOrDefault(n, 0) + 1);
    }
    
    int cnt = 0;
    for(int n: map.keySet()) {
        if(k > 0 && map.containsKey(n + k) || k == 0 && map.get(n) > 1) {
            cnt++;
        }
    }
    return cnt;
}
}


