import java.util.*;
class Solution {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        long[] a= new long[n];
        long min= 0;
        for (int i = 0; i < n; i++) {
            int v = in.nextInt();
            a[i]= v;
        }
        for(int i =0;i < n;i++){
            for(int j= i; j>=0; j--){
                if(i!=j){
                    if(min > a[i]-a[j]){
                        min = a[i]-a[j];
                    }
                }
            }
        }

        System.out.println(min);
    }
}
