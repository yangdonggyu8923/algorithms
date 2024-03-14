package baekjoon.test;

import java.util.Scanner;
    //타로는 자주 JOI잡화점에서 물건을 산다.
    // JOI잡화점에는 잔돈으로 500엔, 100엔, 50엔, 10엔, 5엔, 1엔이 충분히 있고,
    // 언제나 거스름돈 개수가 가장 적게 잔돈을 준다.
    // 타로가 JOI잡화점에서 물건을 사고 카운터에서 1000엔 지폐를 한장 냈을 때,
    // 받을 잔돈에 포함된 잔돈의 개수를 구하는 프로그램을 작성하시오.
    public class Change5585 {
        // 입력 380 or 1
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("물건 가격을 입력하세요");
            int price = sc.nextInt();
            int[] changes = {500, 100, 50, 10, 5, 1};
            int jandon = 1000 - price;
            int count = 0;

            for(int i=0; i<changes.length; i++) {
                count += jandon/changes[i];
                jandon = jandon%changes[i];
                System.out.println(i+1+"회 잔돈: "  + jandon);
                System.out.println("거스른 동전 개수 : " + count);
            }
            System.out.println("거스름돈 총 개수 : " + count);
        }
    }
