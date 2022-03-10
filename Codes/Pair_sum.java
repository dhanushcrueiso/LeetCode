package Codes;
import java.util.*;
public class Pair_sum {
    public static int[][] pairSum(int[] arr, int s) {
        // Write your code here.
        int N=arr.length;
        Arrays.sort(arr);
        int[][] ans=new int[N][2];
        if(N>=Math.pow(10,5) || N<=1 )
            return ans;
        if(s>=2*Math.pow(10,5)||s<=-2*Math.pow(10,5))
            return ans;
        int i=0;
        int j=0;
        int c=0;
        for(i=0;i<N-1;i++){
            for(j=i+1;j<N;j++){
                if(arr[i]<=Math.pow(-10,5) || arr[i]>=Math.pow(10,5)){
                    return ans;
                }
                else{
                    if(arr[i]+arr[j]==s){
                        ans[c][0]=arr[i];
                        ans[c][1]=arr[j];
                        c++;
                    }
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int target=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        int[][] ret=pairSum(arr, target);

        for(int i=0;i<n;i++){
            for(int j=0;j<2;j++){
                System.out.println(ret[i][j]);
            }
        }
        
    }
    
}
