package com.yeon.sorting;

/*
[수 정렬하기]
N개의 수가 주어졌을 때, 이를 오름차순으로 정렬하는 프로그램을 작성하시오.

[입력] 첫째 줄에 수의 개수 N(1 ≤ N ≤ 1,000)이 주어진다. 둘째 줄부터 N개의 줄에는 숫자가 주어진다. 이 수는 절댓값이 1,000보다 작거나 같은 정수이다. 수는 중복되지 않는다.
5
5
2
3
4
1

[출력] 첫째 줄부터 N개의 줄에 오름차순으로 정렬한 결과를 한 줄에 하나씩 출력한다.
1
2
3
4
5
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Ex2750 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        if(count<1 || count >1000) return;
        int[] list = new int[count];
        for (int i=0; i<count; i++){
            list[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(list);
        StringBuilder sb = new StringBuilder();
        for (int a:list
             ) {
            sb.append(a);
        }
        System.out.println(sb);
    }
}
