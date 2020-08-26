package com.yeon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        String[] str = br.readLine().trim().split(" ");
        int[] arr = new int[count];
        int result_time = 0;

        for(int i=0; i<count; i++){
            arr[i] = Integer.parseInt(str[i]);
        }
        Arrays.sort(arr);
        for (int i:arr) {
            result_time += i * (count--);
        }
        System.out.println(result_time);
    }
}
