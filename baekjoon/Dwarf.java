package baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class Dwarf {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 20 7 23 19 10 15 25 8 13
        //int[] dwarf = new int[9];
        int dwarf[] = {20, 7, 23, 19, 10, 15, 25, 8, 13};
        int sum = 0;

        System.out.println("");
        System.out.println("===========================");
        System.out.println("난쟁이의 키를 입력하세요.");
        for (int i = 0; i < dwarf.length; i++) {
            System.out.print("\n" + i + " 번째 난쟁이의 키 : ");
            //dwarf[i] = sc.nextInt();
            sum += dwarf[i];
        }
        System.out.println("");
        System.out.println("===========================");
        System.out.println("");

        Arrays.sort(dwarf); //오름차순

        int fake1 = 0, fake2 = 0;

        for (int a = 0; a < dwarf.length - 1; a++) {
            for (int b = a + 1; b < dwarf.length; b++) {
                if (sum - dwarf[a] - dwarf[b] == 100) {
                    fake1 = a;
                    fake2 = b;
                    break;
                }
            }
        }

        for (int j = 0; j < dwarf.length; j++) {
            if (j != fake1 && j != fake2) { //fake1, fake2 모두가 아닌 dwarf[j]는 난쟁이가 맞음
                System.out.println(j + 1 + " 번째 난쟁이는 **진짜** 난쟁이이고, 그의 키는 : " + dwarf[j] + " 입니다.");
            } else {
                System.out.println(j + 1 + " 번째 난쟁이는 ##가짜## 난쟁이이고, 그의 키는 : " + dwarf[j] + " 입니다.");
            }
        }
        //가짜난쟁이 찾기
        for (int j = 0; j < dwarf.length; j++) {
            if (j == fake1 || j == fake2) {
                System.out.print(dwarf[j] + " ");
            }

        }
        System.out.println();
        //진짜난쟁이 찾기
        for (int j = 0; j < dwarf.length; j++) {
            if (j != fake1 && j != fake2) {
                System.out.print(dwarf[j] + " ");
            }
        }
    }
}









