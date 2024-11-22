package org.example.algorithm.array;

import java.util.Scanner;

public class boj_11720 {
    // 첫번째 줄에는 숫자의 개수, 두번째 줄에는 숫자 N개가 공백 없이 주어진다.
    // 입력으로 주어진 숫자 N개의 합을 출력한다.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 첫번째
        int n = sc.nextInt();
        sc.nextLine();
        // 두번째
        String str = sc.nextLine();

        // 1. charAt() 사용
        /*int[] arr = new int[n];
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
            // charAt(i) : 문자열에서 i번째 값을 반환
            // 사용 시 주의할 점 : 문자가 정수형 배열인 arr에 저장될 때, 문자 자체의 유니코드 값이 저장되므로 유의해야 함
            arr[i] = Character.getNumericValue(str.charAt(i));
        }

        int sum = 0;
        for (int a : arr) {
            sum += a;
        }
        System.out.println("sum : " + sum);*/

        // 2. char[]에 담아서
        char[] charArr = str.toCharArray();
        int sum = 0;
        for (char c : charArr) {
            sum += Character.getNumericValue(c);
            System.out.println(sum);
        }
        System.out.println("총합 : " + sum);

        // 정리 : 한번에 toCharArray() 메소드를 사용해서 char[] 타입으로 만든 다음 향상된 for문을 사용해서 sum하는 것이 효율적이다.
    }
}
