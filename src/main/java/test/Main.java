package test;

import javafx.util.Pair;

import java.io.*;
import java.util.*;
import java.util.concurrent.BlockingQueue;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n <= 4) {
            System.out.println(1);
            return;
        }

        int res = 0;
        int[] arr = new int[n];

        arr[0] = 1;
        int temp = 0;
        for(int i = 4; i < n; ++i){
            //i代新增
            arr[i] = arr[i - 4] + temp;
            //i代前累计新增
            temp += arr[i - 4];

            res += temp;
        }
        System.out.println(res + 1);


     //   System.out.println("ab".substring(0,1));


        ArrayList<Integer> arr1 = new ArrayList<>();
        arr1.add(1);
        arr1.add(5);
        arr1.add(10);
        arr1.add(4);

        arr1.sort((a, b) -> b - a);
        System.out.println(arr1);

        Integer[] arr2={9,8,7,6,5,4,3,2,1};
        Arrays.sort(arr2, (a, b) ->b -a);
        for(int i:arr){
            System.out.println(i);
            
        }
        
    }
}
