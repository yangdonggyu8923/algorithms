package baekjoon.bronze;

import java.util.Scanner;

//N으로 나누었을 때 나머지와 몫이 같은 모든 자연수의 합을 구하는 프로그램을 작성하시오.
// 예를 들어 N=3일 때,
// 나머지와 몫이 모두 같은 자연수는 4와 8 두 개가 있으므로,
// 그 합은 12이다.
public class RemainNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextInt();
        long a = 0;

        for (int i = 0; i < n; i++) {
            a += (n + 1) * i;
        }
        System.out.println(a);
    }
}
