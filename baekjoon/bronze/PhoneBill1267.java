package baekjoon.bronze;

import java.util.Scanner;

public class PhoneBill1267 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
         int[] arr = new int[n];
         for (int i=0; i<n; i++){
             arr[i] = sc.nextInt();
         }
         int y = 0;
         int m = 0;
         for (int i=0; i<n; i++){
             y += (arr[i]/30+1)*10;
             m += (arr[i]/60+1)*15;
         }
         if (y<m){
             System.out.println("Y "+y);
         } else if (y>m){
             System.out.println("M "+m);
         } else {
             System.out.println("Y M "+y);
         }
    }
}
