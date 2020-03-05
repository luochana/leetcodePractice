package test;

import java.util.Scanner;

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
    }
}
