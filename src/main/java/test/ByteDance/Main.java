package test.ByteDance;

import java.util.*;
//import java.util.Integer
public class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int length = Integer.parseInt(in.nextLine());
        int[] arr = new int[length];
        for(int i = 0; i < length; ++i){
            arr[i] = in.nextInt();
        }
        // Arrays.sort(arr);
        int[] tempSum = new int[length + 1];
        for(int i = 0; i < length; ++i){
            tempSum[i + 1] = arr[i] + tempSum[i];
        }
        // int res = Math.pow(arr[0], 2);
        int res = Integer.MIN_VALUE;
        for(int i = 0; i < length; ++i){
            for(int j = 0; j <= i; ++j){
                int sum =  tempSum[i + 1] - tempSum[j];
                int min = Integer.MAX_VALUE;
                for(int p = j; p <= i; ++p){
                    min = Math.min(min, arr[p]);
                }
                res = Math.max(res, sum * min);
            }
        }
        System.out.println(res);
    }
}