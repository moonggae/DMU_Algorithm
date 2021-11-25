package lecture03;

import java.util.Scanner;

public class AddorMult {
    public AddorMult(){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        long result = str.charAt(0) - '0';
        for (int i = 1; i < str.length(); i++) {
            int num = str.charAt(i) -'0';
            if(result <= 1 || num <= 1)
                result += num;
            else
                result *= num;
        }

        System.out.println(result);
    }
}
