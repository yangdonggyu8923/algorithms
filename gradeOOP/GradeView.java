package gradeOOP;

import java.util.Scanner;

public class GradeView {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Person person = new Person();
        System.out.println("다음은 한 학생의 과목 점수이다. 이름을 입력하시오.");
        String name = sc.next();

        person.setName(name);
        person.createKorean();
        person.createEnglish();
        person.createMath();
        person.createAvg();

        System.out.println(" ============= 성적표 ==============");
        System.out.println("이름 : " + person.getName());
        System.out.println("국어점수 : " + person.getKorean());
        System.out.println("영어점수 : " + person.getEnglish());
        System.out.println("수학점수 : " + person.getMath());
        System.out.println("평균 점수 : " + person.getAvg());
    }
}

