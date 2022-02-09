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
    
}


