package baekjoon.silver;

import java.util.Scanner;

public class Stick1094 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int size = 64;
        int count = 0;
        while (x > 0) {
            if (size > x) {
                size /= 2;
            } else {
                x -= size;
                count++;
            }
        }
        System.out.println(count);
    }
}
