package baekjoon.operation;

import java.util.Scanner;

public class Sum10953 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = "";
        for(int i=0; i<n; i++){
            s = sc.next();
            int a = Integer.parseInt(s.substring(0,1));
            int b = Integer.parseInt(s.substring(2,3));
            System.out.println(a+b);
        }
    }
}
