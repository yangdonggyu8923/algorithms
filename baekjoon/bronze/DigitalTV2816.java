package baekjoon.bronze;

import java.util.Scanner;

//2012년 12월 31일 새벽 4시부터 지상파 아날로그 TV방송이 종료되었다.
// TV를 자주보는 할머니를 위해서, 상근이네 집도 디지털 수신기를 구입했다.
//
//원래 상근이네 집에는 KBS1과 KBS2만 나왔다.
// 할머니는 두 방송만 시청한다.
// 이제 디지털 수신기와 함께 엄청난 양의 채널을 볼 수 있게 되었다.
// 하지만, 할머니는 오직 KBS1과 KBS2만 보려고 한다.
// 따라서, 상근이는 채널 리스트를 조절해 KBS1을 첫 번째로, KBS2를 두 번째로 만들려고 한다.
//
//티비를 켜면 디지털 수신기는 시청 가능한 채널 리스트를 보여준다.
// 모든 채널의 이름은 서로 다르고, 항상 KBS1과 KBS2를 포함하고 있다.
// 상근이는 이 리모콘을 이용해서 리스트의 순서를 바꾸는 법을 알아냈다.
// 리스트의 왼편에는 작은 화살표가 있고, 이 화살표는 현재 선택한 채널을 나타낸다.
// 가장 처음에 화살표는 제일 첫 번째 채널을 가리키고 있다.
//
//다음과 같은 네 가지 버튼을 이용해서 리스트의 순서를 바꿀 수 있다.
// 각각은 1번부터 4번까지 번호가 적혀져있는 버튼이다.
//
//화살표를 한 칸 아래로 내린다. (채널 i에서 i+1로)
//화살표를 위로 한 칸 올린다. (채널 i에서 i-1로)
//현재 선택한 채널을 한 칸 아래로 내린다. (채널 i와 i+1의 위치를 바꾼다. 화살표는 i+1을 가리키고 있는다)
//현재 선택한 채널을 위로 한 칸 올린다. (채널 i와 i-1의 위치를 바꾼다. 화살표는 i-1을 가리키고 있다)
//화살표가 채널 리스트의 범위를 넘어간다면, 그 명령은 무시한다.
//
//현재 채널 리스트의 순서가 주어졌을 때, KBS1를 첫 번째로, KBS2를 두 번째로 순서를 바꾸는 방법을 구하는 프로그램을 작성하시오.
// 방법의 길이는 500보다 작아야 한다. 두 채널을 제외한 나머지 채널의 순서는 상관없다.
public class DigitalTV2816 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.next();
        }

        // KBS1을 첫 번째 채널로 만들기
        for (int i = 0; i < n; i++) {
            // KBS1을 찾았다면 해당 i인덱스만큼 채널 끌어 올리기
            if (arr[i].equals("KBS1")) {
                String temp = "";
                for (int j = i; j > 0; j--) {
                    System.out.print(4);
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
                break;
            }
            // KBS1 찾기 전까지 화살표 내리기
            else
                System.out.print(1);
        }

        // KBS1을 첫 번째로 옮기고 난 후 두 번째 채널이 KBS2라면 종료
        if (arr[1].equals("KBS2"))
            System.exit(0);

        // KBS2을 두 번째 채널로 만들기
        for (int i = 0; i < n; i++) {
            /*
             * KBS2을 찾았다면 해당 i인덱스만큼 채널 끌어 올리기
             * 이때 첫 번째 채널은 KBS1인것 주의
             */
            if (arr[i].equals("KBS2")) {
                String temp = "";
                for (int j = i; j > 1; j--) {
                    System.out.print(4);
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
                break;
            }
            // KBS2 찾기 전까지 화살표 내리기
            else
                System.out.print(1);
        }
    }
}