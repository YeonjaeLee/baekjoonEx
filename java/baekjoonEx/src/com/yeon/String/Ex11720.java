package com.yeon.String;

/*
[숫자의 합]
N개의 숫자가 공백 없이 쓰여있다. 이 숫자를 모두 합해서 출력하는 프로그램을 작성하시오.

[입력] 첫째 줄에 숫자의 개수 N (1 ≤ N ≤ 100)이 주어진다. 둘째 줄에 숫자 N개가 공백없이 주어진다.
25
7000000000000000000000000

[출력] 입력으로 주어진 숫자 N개의 합을 출력한다.
7
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex11720 {
    public static void main(String[] args) throws IOException {
        int result = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int length = Integer.parseInt(br.readLine());
        String input = br.readLine();
        if(input.length() != length)
            return;

        for(int i=0; i<length; i++){
            result += (input.charAt(i) - '0');
        }

        System.out.println(result);
    }
}
