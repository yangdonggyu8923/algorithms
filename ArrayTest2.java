import java.util.Scanner;

public class ArrayTest2 {
    /**
     * 최적화 문제 중 최대값 구하기
     * */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        System.out.println("입력된 수 중에서 큰 수를 구하시오.");
//        int[] arr = new int[3];
//
//        for (int i = 0; i < 3; i++) {
//            System.out.println("자연수 입력 : ");
//            String num = sc.next();
//            arr[i] = Integer.parseInt(num);
//        }
//
//        System.out.println("첫 번째 수 : " + arr[0]);
//        System.out.println("두 번째 수 : " + arr[1]);
//        System.out.println("세 번째 수 : " + arr[2]);
//
//        int max = 0;
//        for (int i = 0; i < 3; i++) {
//            if (arr[i] > max) {
//                max = arr[i];
//            }
//        }
//        System.out.println("입력된 값 중 최대값은 " + max + "이다.");

        System.out.println("다음 시험에서 1등 학생의 이름과 점수는 무엇입니까?.");
        System.out.println("시험에 응시한 학생 수는 몇 명입니까?.");
        int students = sc.nextInt();
        int[] score = new int[students];
        String[] names = new String[students];

        System.out.println("입력된 점수 중에서 1등 점수를 구하시오.");
        int max = 0;
        int maxCount = 0;
        for (int i = 0; i < score.length; i++) {
            System.out.println("점수 입력 : ");
            score[i] = Integer.parseInt(sc.next());
            if (score[i] > max) {
                max = score[i];
                maxCount = i;
            }
        }

        System.out.println("시험에 응시한 학생의 이름을 입력하세요.");
        for(int i = 0; i < names.length; i++) {
            System.out.println("학생 이름 : ");
            names[i] = sc.next();
        }

        System.out.println("입력된 점수 중 1등은 " + names[maxCount] + "이고 " + max + "점이다.");

//        for(int i=0; i<2; i++){
//            System.out.println("자연수를 입력하세요.");
//            String num = sc.next();
//            System.out.println(num);
//        }

    }
}
