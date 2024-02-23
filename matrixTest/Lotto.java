package matrixTest;


import java.util.Random;

public class Lotto {
    public static void main(String[] args) {
        int[] lotto = new int[6];
        for (int i = 0; i < 6; i++) {
            int num = (int) (Math.random() * 44) + 1;
            System.out.println(i+1 + "번째 번호 추첨");
            lotto[i] = num;
            for (int j = 0; j < i; j++) {
                if (lotto[i] == lotto[j]) { 
                    System.out.println("중복으로 재추첨");
                    i--;
                } // 중복일 때 i가 1감소되어 for문 처음으로 돌아가 다시 실행
            } // 중복값이 아니면 i가 1증가하여 다음 번호 추첨
        }
        for(int i = lotto.length-1;i>0;i--)
            for(int j = 0; j<i;j++)
                if(lotto[j]>lotto[j+1]){
                    int temp = lotto[j];
                    lotto[j] = lotto[j+1];
                    lotto[j+1]=temp;
                }
        for (int i = 0; i < 6; i++) {
                System.out.print(lotto[i]+" ");

        }
    }


}