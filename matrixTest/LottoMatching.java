package matrixTest;

/**
 * 로또 발급은 같다.
 * 1등 6개
 * 2등 5개
 * 3등 4개
 * 4등 3개
 * 꽝 2개 이하
 */
public class LottoMatching {
    public static void main(String[] args) {
        // 내 로또 번호 구하기
        int[] lotto = new int[6];
        lotto = createArrayWithoutDuplicate(lotto);
        // 버블정렬
        lotto = sortAscending(lotto);
        // 내 로또 번호 출력
        System.out.println("내 번호");
        printLotto(lotto);
        
        int[] winLotto = new int[6];
        winLotto = createArrayWithoutDuplicate(winLotto);
        winLotto = sortAscending(winLotto);
        System.out.println();
        System.out.println("당첨 번호");
        printLotto(winLotto);

        // 번호 비교
        int num = 0;
        for (int i=0;i< lotto.length;i++){
            for(int j=0;j< winLotto.length;j++) {
                if (lotto[i] == winLotto[j]) {
                    num+=1;
                }
                else{}
            }
        }
        System.out.println();
        switch (num){
            case 6:
            System.out.println("1등");
                break;
            case 5:
            System.out.println("2등");
                break;
            case 4:
            System.out.println("3등");
                break;
            case 3:
            System.out.println("4등");
                break;
            case 2,1,0:
            System.out.println("꽝");
                break;
        }

    }

    private static void printLotto(int[] lotto) {
        for (int i = 0; i < 6; i++) {
            System.out.print(lotto[i]+" ");
        }
    }

    private static int[] sortAscending(int[] lotto) {
        for(int i = lotto.length-1;i>0;i--)
            for(int j = 0; j<i;j++)
                if(lotto[j]>lotto[j+1]){
                    int temp = lotto[j];
                    lotto[j] = lotto[j+1];
                    lotto[j+1]=temp;
                }
        return lotto;
    }

    private static int[] createArrayWithoutDuplicate(int[] lotto) {
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
}
