package Codes;


/**
 * Reverse_Word_In_a_String_III
 * Given a string s, reverse the order of characters in each word within a sentence while still preserving whitespace and initial word order.

 

Example 1:

Input: s = "Let's take LeetCode contest"
Output: "s'teL ekat edoCteeL tsetnoc"

Example 2:

Input: s = "God Ding"
Output: "doG gniD"

 

Constraints:

    1 <= s.length <= 5 * 104
    s contains printable ASCII characters.
    s does not contain any leading or trailing spaces.
    There is at least one word in s.
    All the words in s are separated by a single space.


 */
public class Reverse_Word_In_a_String_III {

    public String reverseWords(String s) {
        int i=0;
        int j=0;
        String ret="";
        int len=s.length();
        for(i=0;i<len;i++){
            if(s.charAt(i)==' ' && i<len){
               String temp="";
                temp=reverse(s.substring(j,i));

                    
                    ret=ret+temp+" ";
                
                j=i+1;
            }
            else if(i==len-1){
                String temp="";
                temp=reverse(s.substring(j,i+1));
                ret=ret+temp;
            }
            
        }
        return ret;
    }
    
    public String reverse(String str){
        int l=0;
        int len=str.length();
        int r=len-1;
        char[] arr=str.toCharArray();
        while(l<r){
            char temp =arr[l];
            arr[l]=arr[r];
            arr[r]=temp;
            l++;r--;
        }
 str=String.valueOf(arr);
        
      
        return str;
    } 
}




/**
 * Reverse Word In a String III
 * using split methods
 */

class Solution {
    public String reverseWords(String s) {
        String[] sArr = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for(String str : sArr) {
            sb.append(reverse(str.toCharArray(), 0, str.length() - 1));
            sb.append(" ");
        }
        
         
        return  sb.toString().substring(0, s.length());
    }
    
    public char[] reverse(char[] c, int start, int end) {
        if(start >= end) {
            return c;
        }
        char temp = c[start];
        c[start] = c[end];
        c[end] = temp;
        return reverse(c, ++start, --end);
    }
}