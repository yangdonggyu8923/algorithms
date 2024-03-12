
/**
 * 한 개의 회의실이 있는데 이를 사용하고자 하는 N개의
 * 회의에 대하여 회의실 사용표를 만들려고 한다.
 * 각 회의 I에 대해 시작시간과 끝나는 시간이 주어져 있고,
 * 각 회의가 겹치지 않게 하면서 회의실을 사용할 수 있는 회의의 최대 개수를 찾아보자.
 * 단, 회의는 한번 시작하면 중간에 중단될 수 없으며
 * 한 회의가 끝나는 것과 동시에 다음 회의가 시작될 수 있다.
 * 회의의 시작시간과 끝나는 시간이 같을 수도 있다.
 * 이 경우에는 시작하자마자 끝나는 것으로 생각하면 된다.
 */
package baekjoon;
/*
입력받은 회의수에 대해 각 회의의 진행 시간을 입력받는다,
이때 시간이 곂치않으며 회의를 사용할수있는 최대 개수를 출력하라
끝나는 시간과 동시에 회의가 시작가능하다.
 */


import java.util.Comparator;
import java.util.Arrays;
import java.util.Scanner;

public class MeetingRoom1931 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int meetingCount = sc.nextInt();  // 회의 갯수
        int [][] timeTable = new int[meetingCount][2]; // 시작시간, 끝나는 시간 2개이므로 2중배열

        for (int i = 0; i < meetingCount; i++) {
            timeTable[i][0] = sc.nextInt(); // 0 - 시작타임
            timeTable[i][1] = sc.nextInt(); // 1 - 종료타임
        }
        Arrays.sort(timeTable, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[1] == o2[1]){ //종료 시간이 같으면
                    return o1[0] - o2[0]; //시작시간이 빠른순으로
                }
                return o1[1] - o2[1]; //종료시간이 같지 않다면 종료시간 빠른순으로
            }
        });
        int count = 0;
        int beforeEndTime = 0;
        for (int i = 0; i < meetingCount; i++) {
            if (beforeEndTime <= timeTable[i][0]){
                beforeEndTime = timeTable[i][1];
                count++;
            }
        }
        // 단순히 종료시간이 빠른순으로 정렬한다면 시작시간이 더 빠르더라도 카운트되지 않는 예외가 발생할수있다.
        // 이를 방지하기위해 시작시간또한 오름차순으로 정렬시키는 반복문
        System.out.println(count);
    }
}

