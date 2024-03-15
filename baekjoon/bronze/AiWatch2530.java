package baekjoon.bronze;
// KOI 전자에서는 건강에 좋고 맛있는 훈제오리구이 요리를 간편하게 만드는 인공지능 오븐을 개발하려고 한다.
// 인공지능 오븐을 사용하는 방법은 적당한 양의 오리 훈제 재료를 인공지능 오븐에 넣으면 된다.
// 그러면 인공지능 오븐은 오븐구이가 끝나는 시간을 초 단위로 자동적으로 계산한다.
// 또한, KOI 전자의 인공지능 오븐 앞면에는 사용자에게 훈제오리구이
// 요리가 끝나는 시각을 알려 주는 디지털 시계가 있다.
// 훈제오리구이를 시작하는 시각과 오븐구이를 하는 데 필요한 시간이 초 단위로 주어졌을 때,
// 오븐구이가 끝나는 시각을 계산하는 프로그램을 작성하시오.

import java.util.Scanner;

public class AiWatch2530 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int si = sc.nextInt() * 60 * 60;
        int bun = sc.nextInt() * 60;
        int cho = sc.nextInt();
        int ncho = sc.nextInt();

        int total = si + bun + cho + ncho;
        int total2 = total/3600;
        int total3 = total2/60;
        System.out.printf(String.valueOf(total2));
        System.out.printf(String.valueOf(total3));
    }
}
