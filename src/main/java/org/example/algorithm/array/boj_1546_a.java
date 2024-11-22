package org.example.algorithm.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj_1546_a {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        // 굳이 각 과목별로 값을 저장하지 않고 같은 공식을 적용하는 문제는 총합을 구해서 공식 대입하면 간결함
        // sum * 100 / max / N 공식을 적용

        // 업무였으면 각 과목별 값을 저장하는 게 좀 더 데이터 관리 측면에서 나았을 것 같은데
        // 코딩테스트는 코드가 간결한 게 더 좋은가?

        int n = Integer.parseInt(br.readLine()); // 과목 개수
        String str = br.readLine(); // 각 과목의 시험 성적

        String[] strArr = str.split(" ");

        double max = 0L;
        double sum = 0.0;
        for (int i = 0; i < strArr.length; i++) {
            // 1. max 값 저장
            if (max < Double.parseDouble(strArr[i])) {
                max = Double.parseDouble(strArr[i]);
            }
            // 2. sum 값 저장
            sum += Integer.parseInt(strArr[i]);
        }

        double avg = sum * 100 / max / strArr.length;
        System.out.println(avg);
    }
}
