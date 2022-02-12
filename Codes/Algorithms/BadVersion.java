package Codes.Algorithms;

public class BadVersion {
        public int firstBadVersion(int n) {
        int left = 1, right = n;
          int curr;  
            while(left<right){
               curr = left + (right-left)/2;
                if(isBadVersion(curr)){
                    right = curr;
                }
                else{
                    left = curr+1;
                }
                
            }
            return left;
        }
    
    
}
