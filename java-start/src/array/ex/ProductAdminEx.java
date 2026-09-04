package array.ex;

import java.util.Scanner;

public class ProductAdminEx  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] productNames = new String[10];
        int[] productPrices = new int[10];
        int productCount = 0;

        System.out.println("1. 상품등록 | 2. 상품 목록 | 3. 종료");
        while(true) {
            System.out.print("메뉴를 선택하세요:");
            int num = scanner.nextInt(); 
            scanner.nextLine();

            if (num == 1) {
                if (productCount >= 10) {
                    System.out.println("더 이상 상품을 등록할 수 없습니다.");
                    break;
                }
                System.out.print("상품 이름을 입력하세요:");
                String name = scanner.nextLine();
                productNames[productCount] = name;

                System.out.print("상품 가격을 입력하세요:");
                int price = scanner.nextInt();
                productPrices[productCount] = price;

                productCount++;
            }

            else if (num == 2) {
                if (productCount  == 0) {
                    System.out.println("등록된 상품이 없습니다.");
                    break;
                }
                for (int i = 0; i < productCount; i++) {
                    System.out.println(productNames[i] + ": " + productPrices[i] + "원");
                }
            }

            else if (num == 3){
                System.out.println("프로그램을 종료합니다.");
                break;
            }





        }

    }

}
