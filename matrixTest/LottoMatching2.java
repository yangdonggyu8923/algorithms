package matrixTest;

import java.util.Scanner;

/**
 * 로또 발급은 같다.
 * 1등 6개
 * 2등 5개
 * 3등 4개
 * 4등 3개
 * 꽝 2개 이하
 */
public class LottoMatching2 {
    public static void main(String[] args) {
        BuyLotto buy = new BuyLotto2();
        DrawLotto draw = new DrawLotto2();
        MatchLotto match = new MatchLotto2();


        System.out.println("1 ~ 8사이의 숫자 6개를 중복없이 입력하세요. ");
        int[] myLotto = buy.buyLotto();
        draw.sortAscending(myLotto);
        System.out.println("내 번호");
        draw.printLotto(myLotto);
        System.out.println("\n당첨 번호");

        int[] lotto = new int[6];
        int[] winLotto = draw.createArrayWithoutDuplicate(lotto);
        draw.sortAscending(winLotto);
        draw.printLotto(winLotto);

        System.out.println("\n번호 비교");
        int num = match.compareNumber(myLotto, winLotto);
        System.out.println(num + "개 맞았습니다.");
        System.out.println(match.rank(num));


    }


}
interface BuyLotto{
    int[] buyLotto();
}
interface  DrawLotto{
    int[] createArrayWithoutDuplicate(int[] lotto);
    int[] sortAscending(int[] lotto);
    void printLotto(int[] lotto);
}
interface MatchLotto{
    int compareNumber(int[] lotto1, int[] lotto2);
    String rank(int num);
}
class BuyLotto2 implements BuyLotto{
    @Override
    public int[] buyLotto() {
        Scanner sc = new Scanner(System.in);
        // 로또 구입
        int[] lotto = new int[6];
        for(int i=0;i< lotto.length;i++){
            lotto[i] = sc.nextInt();}
        return lotto;
    }
}

class DrawLotto2 implements DrawLotto{

    @Override
    public int[] createArrayWithoutDuplicate(int[] lotto) {
        for (int i = 0; i < 6; i++) {
            int num = (int) (Math.random() * 7) + 1;
            lotto[i] = num;
            for (int j = 0; j < i; j++) {
                if (lotto[i] == lotto[j]) {
                    i--;
                }
            }
        }
        return lotto;
    }

    @Override
    public int[] sortAscending(int[] lotto) {
        for(int i = lotto.length-1;i>0;i--)
            for(int j = 0; j<i;j++)
                if(lotto[j]>lotto[j+1]){
                    int temp = lotto[j];
                    lotto[j] = lotto[j+1];
                    lotto[j+1]=temp;
                }
        return lotto;
    }

    @Override
    public void printLotto(int[] lotto) {
        for (int i = 0; i < 6; i++) {
            System.out.print(lotto[i]+" ");
        }
    }
}

class MatchLotto2 implements MatchLotto{
    @Override
    public int compareNumber(int[] lotto1, int[] lotto2) {
        int num = 0;
        for (int i=0;i< lotto1.length;i++){
            for(int j=0;j< lotto2.length;j++) {
                if (lotto1[i] == lotto2[j]) {
                    num+=1;
                }
            }
        }
        return num;
    }

    @Override
    public String rank(int num) {
        String rank = "";
        switch (num){
            case 6:
                rank = "1등";
                break;
            case 5:
                rank = "2등";
                break;
            case 4:
                rank = "3등";
                break;
            case 3:
                rank = "4등";
                break;
            case 2,1,0:
                rank = "꽝";
                break;
        }
        return rank;
    }
}