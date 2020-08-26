package com.yeon.String;

/*
[별찍기 - 1]
첫째 줄에는 별 1개, 둘째 줄에는 별 2개, N번째 줄에는 별 N개를 찍는 문제

[입력] 첫째 줄에 N(1 ≤ N ≤ 100)이 주어진다.
5

[출력] 첫째 줄부터 N번째 줄까지 차례대로 별을 출력한다.
*
**
***
****
*****
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex2438 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());

        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        for (int i = 0; i < num; i++){
            sb1.append("*");
            sb2.append(sb1+"\n");
        }
        System.out.println(sb2);
    }
}
