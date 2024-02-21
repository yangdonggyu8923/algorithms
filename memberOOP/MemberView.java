package memberOOP;

import java.util.Scanner;

public class MemberView {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ID, 비밀번호, 비밀번호 확인, 이름, 주민번호, 전화번호, 주소, 직업을 입력하세요.");
        Person person = new Person(scanner.next(),scanner.next(),scanner.next(),
                scanner.next(),scanner.nextInt(),scanner.nextInt(),scanner.next(),scanner.next());
        System.out.println(person.toString());






    }
}