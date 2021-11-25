package lecture02;

public class Coin {
    public Coin(){
        int n = 1260;
        int cnt = 0;

        int[] coinTypes = {500, 100, 50, 10};

        for(int i = 0 ; i < coinTypes.length ; i++){
            cnt += n / coinTypes[i];
            n %= coinTypes[i];
        }

        System.out.println(cnt);
    }
}
