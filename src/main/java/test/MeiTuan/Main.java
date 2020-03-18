package test.MeiTuan;

import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int length = Integer.parseInt(in.nextLine());
        int[][] arr = new int[length][2];
        for(int i = 0; i < length; ++i){
            arr[i][0] = in.nextInt();
        }

        for(int i = 0; i < length; ++i){
            arr[i][1] = in.nextInt();
        }
        Arrays.sort(arr, (a, b) -> b[1] - a[1]);
        int sum = 0;
        for(int i = 0; i < length; ++i){
            sum += arr[i][0];
        }
        int k = 0;
        // int i = 0;
        int sum1 = sum;
        int isIn = 0;
        while(sum > 0 ){
            sum -= arr[k][1];
            isIn += arr[k][0];
            ++k;
        }
        int t = sum1 - isIn;
        System.out.println(k + " " + t);
    }
}