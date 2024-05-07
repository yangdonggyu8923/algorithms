package baekjoon.bronze;

import java.util.Scanner;

public class String9086 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0; i<t; i++){
            String a = sc.next();
            System.out.println(a.charAt(0)+a.substring(a.length()-1 ,a.length()));
        }
    }
}


//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int t = sc.nextInt();
//        for(int i=0; i<t; i++){
//            String a = sc.next();
//            System.out.println(a.charAt(0)+a.substring(a.length()-1 ,a.length()));
//        }
//    }
//}
