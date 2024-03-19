package baekjoon.bronze;

import java.util.Scanner;
// 김정인 버전의 블랙잭에서 각 카드에는 양의 정수가 쓰여 있다.
// 그 다음, 딜러는 N장의 카드를 모두 숫자가 보이도록 바닥에 놓는다.
// 그런 후에 딜러는 숫자 M을 크게 외친다.
//
// 이제 플레이어는 제한된 시간 안에 N장의 카드 중에서 3장의 카드를 골라야 한다.
// 블랙잭 변형 게임이기 때문에,
// 플레이어가 고른 카드의 합은 M을 넘지 않으면서 M과 최대한 가깝게 만들어야 한다.
//
// N장의 카드에 써져 있는 숫자가 주어졌을 때,
// M을 넘지 않으면서 M에 최대한 가까운 카드 3장의 합을 구해 출력하시오.

public class BlackJack2798 {
        public static void main(String args[]) {
            Scanner sc = new Scanner(System.in);
            int N = sc.nextInt(); // 카드의 개수
            int M = sc.nextInt(); // 딜러가 외친 숫자
            int [] card = new int [N];

            for(int i=0; i<N; i++) {
                card[i] = sc.nextInt();
            }
            int mini = 0;
            // 3중 for문으로 카드 3개 고르기
            for(int i=0; i<=N-3; i++) { // 첫 번째로 고르는 카드
                for(int j=i+1; j<=N-2; j++) { // 두 번째로 고르는 카드
                    for(int k=j+1; k<N; k++) { // 세 번째로 고르는 카드
                        int hap = card[i]+card[j]+card[k];
                        // 세 카드의 합과 M이 같다면 hap을 출력하고 바로 종료
                        if(hap == M) {
                            System.out.println(hap);
                            return;
                        }
                        // hap이 이전 합보다 크고 M보다 작다면 (M에 더 가까운것임)
                        // mini에 hap 저장
                        if(mini < hap && hap < M) {
                            mini = hap;
                        }
                    }
                }
            }
            System.out.println(mini);
        }
    }
