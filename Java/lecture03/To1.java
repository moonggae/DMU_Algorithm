package lecture03;

import java.util.Scanner;

public class To1 {
    public To1(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int count = 0;

        while(n != 1){
            if(n % k == 0)
                n /= k;
            else
                n--;

            System.out.println("n : " + n);
            count++;
        }

        System.out.println(count);
    }
    
}
