import java.util.ArrayList;
import java.util.Scanner;

public class RandomDice {
// 주사위 2개 던져서 합 5 만들기 : (1,4), (4,1), (2,3), (3,2) => {{}, {}, {}, {}}
    Scanner sc = new Scanner(System.in);
    public void solve04() {
        int[][] result;
        int count = 0;
        System.out.print("주사위를 몇번 돌릴 것인가?");
        int countDice = sc.nextInt();
        result = new int[countDice][2];

        while(!isPrime(result)) {
            int dice1 = this.getRandomDice();
            int dice2 = this.getRandomDice();
            if((dice1 + dice2) == 5 && count < countDice) {
                result[count][0] = dice1;
                result[count][1] = dice2;
                count++;
            }
        }
        for(int i = 0; i < result.length; i++) {
            System.out.println(result[i][0] + " " + result[i][1]);
        }
    }

    public int getRandomDice() {

        return (int)(Math.random() * 5) + 1;
    }

    public boolean isPrime(int[][] prime) {
        for ( int i = 0; i < prime.length; i++ ) {
            for ( int j = 0; j < prime[i].length; j++ ) {
                if ( prime[i][j] == 0 ) {
                    return false;
                }
            }
        }
        return true;
    }
}
