package baekjoon;

import java.util.Scanner;

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
public class MeetingRoom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] startTime = new int[n];
        int[] useTime = new int[n];
        // 시작 시간 배열
        for(int i=0;i<startTime.length;i++){
            startTime[i] = sc.nextInt();
            System.out.print(startTime[i]+" ");}
        // 사용 시간 배열
        for(int i=0;i<useTime.length;i++){
            useTime[i] = sc.nextInt();
            System.out.print(useTime[i]+" ");}



        int num = 0;
        for (int i=0; i<startTime.length;i++){
            for(int j=0; j<useTime.length;j++){
                if (startTime[i]<useTime[j]){
                    num += 1;
                }
                else{
                }

            }
        }
        System.out.println(num);

    }

}

