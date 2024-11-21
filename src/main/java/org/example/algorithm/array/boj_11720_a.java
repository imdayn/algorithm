package org.example.algorithm.array;

import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj_11720_a {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    // 첫번째 줄에는 숫자의 개수, 두번째 줄에는 숫자 N개가 공백 없이 주어진다.
    // 입력으로 주어진 숫자 N개의 합을 출력한다.
    public static void main(String[] args) throws IOException {
        // 1. Scanner 사용
        /*Scanner sc = new Scanner(System.in);
        // 첫번째
        int n = sc.nextInt();
        sc.nextLine();
        // 두번째
        String str = sc.nextLine();*/

        // 2. BufferReader 사용
        int n = Integer.parseInt(br.readLine());
        String str = br.readLine();

        // 2. char[]에 담아서
        char[] charArr = str.toCharArray();
        int sum = 0;
        for (char c : charArr) {
            // sum += Character.getNumericValue(c);
            sum += c - '0';
            System.out.println(sum);
        }
        System.out.println("총합 : " + sum);

        // bufferedRead를 사용하면 문제 풀이가 더 빠르고 Character.getNumericValue()를 사용하지 않고 유니코드인 상태에서 -48을 하는 것으로 값을 얻어낼 수 있다.
    }
}
