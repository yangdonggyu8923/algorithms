import java.util.Scanner;
import java.util.SortedMap;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

        Scanner scanner = new Scanner(System.in);
        System.out.println("ID");
        String Id = scanner.next();
        System.out.println("비밀번호");
        String Password = scanner.next();
        System.out.println("비밀번호 확인");
        String CheckPassword = scanner.next();
        System.out.println("이름");
        String Name = scanner.next();
        System.out.println("주민번호");
        String ResidentRegistrationNumber = scanner.next();
        System.out.println("전화번호");
        String PhoneNumber = scanner.next();
        System.out.println("주소");
        String Address = scanner.next();
        System.out.println("직업");
        String Job = scanner.next();

        System.out.println("ID : " + Id);
        System.out.println("비밀번호 : " + Password);
        System.out.println("비밀번호 확인 : " + CheckPassword);
        System.out.println("이름 : " + Name);
        System.out.println("주민번호 : " + ResidentRegistrationNumber);
        System.out.println("전화번호 : " + PhoneNumber);
        System.out.println("주소 : " + Address);
        System.out.println("직업 : " + Job);


    }
}