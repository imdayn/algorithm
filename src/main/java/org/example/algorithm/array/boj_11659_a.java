package org.example.algorithm.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj_11659_a {
    public static void main(String[] args) throws IOException {
        // 첫째 줄에 수의 개수 N과 합을 구해야 하는 횟수 M이 주어진다. 둘째 줄에는 N개의 수가 주어진다. 수는 1,000보다 작거나 같은 자연수이다. 셋째 줄부터 M개의 줄에는 합을 구해야 하는 구간 i와 j가 주어진다.

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        // String 변수에 담긴 데이터를 한번에  Stream API를 활용해 int[]에 담는 법
        //int[] arr = Arrays.stream(str.split(" ")).mapToInt(Integer::parseInt).toArray();

        // 구간 합 구하기 공식
        // S[i] = S[i-1] + A[i]
        int[] inSum = new int[n + 1];
        // 첫번째 배열부터 중간까지 계산이 필요할 때를 대비해 인덱스 0은 비워둬야 함
        // 반복문이 1부터 시작하므로 if 분기를 태워줄 필요가 없어짐
        st = new StringTokenizer(br.readLine()); /* 라인 한 줄 읽을 때마다 재정의 */
        for (int i=1; i<=n; i++) {
            // arr은 인덱스 0부터 시작하고 inSum은 1부터 시작하므로 arr 접근 시 -1 해주어야 함
            inSum[i] = inSum[i-1] + Integer.parseInt(st.nextToken());
        }

        // 반복문을 돌려서 m만큼 구간 값 입력받고 결과값 배열에 저장 (한번에 출력)

        int[] result = new int[m];
        for (int i=0; i<m; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            result[i] = inSum[b] - inSum[a-1];
        }

        for (int val : result) {
            System.out.println(val);
        }
    }
}
