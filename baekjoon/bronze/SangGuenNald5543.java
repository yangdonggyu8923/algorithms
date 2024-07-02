package baekjoon.bronze;

import java.util.Arrays;
import java.util.Scanner;

public class SangGuenNald5543 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sb = sc.nextInt();
        int jb = sc.nextInt();
        int hb = sc.nextInt();
        int coke = sc.nextInt();
        int cider = sc.nextInt();
        int[] arr = {sb+coke, sb+cider, jb+coke, jb+cider, hb+coke, hb+cider};

        System.out.println(Arrays.stream(arr).min().getAsInt()-50);

    }
}
