import java.util.Scanner;

public class MultiDimension {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("다음 시험에서 2개 반의 평균 점수를 구하십시오.");

        System.out.println("1반에서 시험에 응시한 학생 수는 몇 명입니까?.");
        int numberOfStudent1 = sc.nextInt();

        System.out.println("2반에서 시험에 응시한 학생 수는 몇 명입니까?.");
        int numberOfStudent2 = sc.nextInt();

        int[] scores = new int[numberOfStudent1];
        int[] scores2 = new int[numberOfStudent2];

        System.out.println("1반의 평균과 1등의 점수를 구하시오.");
        int max = 0;
        int avg = 0;
        for (int i = 0; i < scores.length; i++) {
            scores[i] = (int) (Math.random() * 100);
            System.out.println(scores[i]);
            avg += scores[i];
            if (max < scores[i]) {
                max = scores[i];
            }
        }

        System.out.println("2반의 평균과 1등의 점수를 구하시오.");
        int max2 = 0;
        int avg2 = 0;
        for (int i = 0; i < scores2.length; i++) {
            scores2[i] = (int) (Math.random() * 100);
            System.out.println(scores2[i]);
            avg2 += scores2[i];
            if (max2 < scores2[i]) {
                max2 = scores2[i];
            }
        }

        System.out.println("1반의 평균 점수는 " + avg / scores.length + "이고 1등의 점수는 " + max + "이다.");
        System.out.println("2반의 평균 점수는 " + avg2 / scores2.length + "이고 1등의 점수는 " + max2 + "이다.");

    }

}

