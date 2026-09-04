package array.ex;

import java.util.Scanner;

public class ArrayEx8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("학생 수를 입력하세요:");
        int count = input.nextInt();

        int[][] score = new int[count][3];
        String[] subject = {"국어", "영어", "수학"};

        for(int i = 0; i < count; i++) {
            System.out.println((i + 1) + "번 학생의 성적을 입력하세요:");
            for(int j = 0; j < 3; j++) {
                System.out.print(subject[j] + " 점수:");
                int s = input.nextInt();
                score[i][j] = s;
            }
        }

        for(int i = 0; i < count; i++) {
            int sum = 0;
            for(int j = 0; j < 3; j++) {
                sum += score[i][j];
            }
            double average = sum / 3.0;
            System.out.println((i + 1) + "번 학생의 총점: " + sum + " 평균: " + average);
        }
    }
}
