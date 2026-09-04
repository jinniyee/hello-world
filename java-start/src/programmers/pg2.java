package programmers;

public class pg2 {
    public static void main(String[] args) {
        int numer1 = 1; int denom1=2; int numer2=3; int denom2 =4;
        int[] answer = {numer1 * denom2 + numer2 * denom1, denom1 * denom2};

        int max, min;
        if (denom1 > denom2) {
            max = denom1; min = denom2;
        }
        else {
            max = denom2; min = denom1;
        }

        for (int i = min - 1; i > 0; i--) {
            if (denom1 % i == 0 && denom2 % i == 0) {
                answer[0] /= i; answer[1] /= i;
                System.out.println(answer[0]);
                System.out.println(answer[1]);
            }
        }

        //int n = number1 * denom2 + number2 * denom1;
        //int d = denom1 * denom2;
        System.out.println(answer[0]);
        System.out.println(answer[1]);
    }
}
