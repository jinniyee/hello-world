package scanner.ex;

import java.util.Scanner;

public class ScannerWhileEx3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("숫자를 입력하세요. 입력을 중단하려면 -1을 입력하세요:");

        int sum = 0; int count = 0;
        while(true) {
            int num = scanner.nextInt();
            // 버퍼 엔터 남을수도 확인!!!

            if (num == -1) {
                //결과값 출력
                System.out.println("입력한 숫자들의 합계: " + sum);
                System.out.println("입력한 숫자들의 평균: " + (double)sum/(double)count);
                break;
            }

            sum += num;
            count++;
        }

    }
}
