package array.ex;

import java.util.Scanner;

public class ArrayEx3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] array = new int[5];
        System.out.println("5개의 정수를 입력하세요:");

        for(int i = 0; i < 5; i ++) {
            int num = input.nextInt();
            array[i] = num;
        }

        System.out.println("입력한 정수를 역순으로 출력:");
        for(int i = 0; i < 5; i++) {
            System.out.print(array[4 - i]);
            if (i == 4) break;
            System.out.print(", ");
        }
    }
}
