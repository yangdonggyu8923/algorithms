package baekjoon.bronze;

import java.util.ArrayList;
import java.util.Scanner;

public class Multiply2588 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        ArrayList<Integer> arrB = new ArrayList<Integer>(3);

        while (b > 0) {
            arrB.add(b%10);
            b/=10;
        }

        System.out.println(a*arrB.get(0));
        System.out.println(a*arrB.get(1));
        System.out.println(a*arrB.get(2));
        System.out.println(a*arrB.get(0) + a*arrB.get(1)*10 + a*arrB.get(2)*100);
    }
}
