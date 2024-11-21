package org.example.algorithm.array;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class boj_1546 {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws IOException {
        // 최대값 = M, 모든 과목 점수를 과목 점수/M*100로 변경

        int n = Integer.parseInt(br.readLine()); // 과목 개수
        String str = br.readLine(); // 각 과목의 시험 성적

        String[] strArr = str.split(" ");
        double[] scoreArr = new double[strArr.length];

        double max = 0L;
        for (int i = 0; i < strArr.length; i++) {
            scoreArr[i] = Double.parseDouble(strArr[i]);
            if (max < Double.parseDouble(strArr[i])) {
                max = Double.parseDouble(strArr[i]);
            }
        }

        double sum = 0.0;
        for (int i = 0; i < strArr.length; i++) {
            if (scoreArr[i] <= max) {
                scoreArr[i] = scoreArr[i] / max * 100L;
            }
            sum += scoreArr[i];
        }

        double avg = sum / (double) strArr.length;
        System.out.println(avg);
    }
}
