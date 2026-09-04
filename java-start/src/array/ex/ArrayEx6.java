package array.ex;

import java.util.Scanner;

public class ArrayEx6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("입력받을 숫자의 개수를 입력하세요:");
        int num = input.nextInt();
        int[] array = new int[num];

        System.out.println(num + "개의 정수를 입력하세요:");
        for (int i = 0; i < num; i++) {
            int n = input.nextInt();
            array[i] = n;
        }

        int min = array[0]; int max = array[0];
        for (int i = 1; i < num; i++) {
            if (array[i] > max) max = array[i];
            if (array[i] < min) min = array[i];

        }
        System.out.println("가장 작은 정수: " + min);
        System.out.println("가장 큰 정수: " + max);
    }
}
