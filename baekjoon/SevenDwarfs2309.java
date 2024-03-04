package baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class SevenDwarfs2309 {
    //입력 20,7,23,19,10,15,25,8,13
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] heights = new int[9];
        int total = 0;
        for (int i = 0; i < 9; i++) {
            heights[i] = sc.nextInt();
            total += heights[i];
        }

        int fake1 = 0;
        int fake2 = 0;
        for (int i=0; i<heights.length-1; i++) {
            for (int j=i+1; j<heights.length; j++) {
                if (total - heights[i] - heights[j] == 100) {
                    fake1 = heights[i];
                    fake2 = heights[j];
                }
            }
        }
        Arrays.sort(heights);
        for (int i=0; i<heights.length; i++) {
            if (fake1 != heights[i] && fake2 != heights[i])
                System.out.println(heights[i]);
        }
    }
}
