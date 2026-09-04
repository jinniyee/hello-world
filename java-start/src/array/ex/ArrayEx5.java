package array.ex;

import java.util.Scanner;

public class ArrayEx5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("입력받을 숫자의 개수를 입력하세요:");
        int num= input.nextInt();
        int[] score = new int[num];

        System.out.println(num + "개의 정수를 입력하세요:");
        for (int i = 0; i < num; i++){
            int s = input.nextInt();
            score[i] = s;
        }

        int sum = 0;
        for (int i = 0; i < num; i++) {
            sum += score[i];
        }
        double average = (double)sum/num;

        System.out.println("입력한 정수의 합계: " + sum);
        System.out.println("입력한 정수의 평균: " + average);
    }
}
