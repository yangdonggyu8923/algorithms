package baekjoon;

import java.util.Scanner;

public class StringExchange1522 {
    //a와 b로만 이루어진 문자열이 주어질 때,
    //a를 모두 연속으로 만들기 위해서 필요한 교환의 회수를 최소로 하는 프로그램을 작성하시오.
    //이 문자열은 원형이기 때문에, 처음과 끝은 서로 인접해 있는 것이다.
    //예를 들어,  aabbaaabaaba이 주어졌을 때, 2번의 교환이면 a를 모두 연속으로 만들 수 있다.
    //첫째 줄에 문자열이 주어진다. 문자열의 길이는 최대 1,000이다.
    //첫째 줄에 필요한 교환의 회수의 최솟값을 출력한다.

    //abababababababa / 3
    //ba / 0
    //aaaabbbbba / 0
    //abab / 1
    //aabbaaabaaba / 2
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int len = str.length();
        int aCount = 0;
        for(int i=0; i< len; i++){
            if(str.charAt(i)=='a'){
                aCount += 1;
            }
        }
        int min = len;
        int bCount = 0;
        for(int i=0; i<len;i++){
            for(int j=i; j<aCount+i; j++){
                if(str.charAt(j%str.length())=='b'){
                    bCount += 1;
                }
            }
            min = Math.min(min, bCount);
        }
        System.out.println(min);
    }
}
