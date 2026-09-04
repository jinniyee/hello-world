package array.ex;

import java.util.Scanner;

public class ArrayEx7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] score = new int[4][3];
        String[] subject = {"국어", "영어", "수학"};
        for (int i = 0; i < 4; i++) {
            System.out.println((i + 1) + "번 학생의 성적을 입력하세요: ");
            for (int j = 0; j < 3; j++) {
                System.out.print(subject[j] + "점수:");
                int s = input.nextInt();
                score[i][j] = s;
            }
            /*
            System.out.println((i + 1) + "번 학생의 성적을 입력하세요: ");
            System.out.print("국어 점수:");
            int lang = input.nextInt();
            score[i][0] = lang;

            System.out.print("영어 점수:");
            int eng = input.nextInt();
            score[i][1] = eng;

            System.out.print("수학 점수:");
            int math = input.nextInt();
            score[i][2] = math;
            */

        }

        for (int i = 0; i < 4; i++) {
            int sum = 0;
            for (int j = 0; j <3; j++) {
                sum += score[i][j];
            }
            double average = (double)sum/3;
            System.out.println((i + 1) + "번 학생의 총점: " + sum + ", 평균: " + average);
        }
    }
}
