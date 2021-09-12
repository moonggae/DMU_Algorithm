package lecture01;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Greedy {
    public Greedy(){
        Scanner sc = new Scanner(System.in);
        int coinCount = sc.nextInt();
        int cost = sc.nextInt();
        int answerCount = 0;

        Integer[] coinTypes = new Integer[coinCount];
        for (int i = 0; i < coinTypes.length; i++) {
            coinTypes[i] = sc.nextInt();
        }
        
        Arrays.sort(coinTypes, Collections.reverseOrder());
        for (int i = 0; i < coinTypes.length; i++) {
            answerCount += cost / coinTypes[i];
            cost %= coinTypes[i];
        }

        System.out.println(answerCount);
    }
}
