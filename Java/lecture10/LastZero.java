package lecture10;

public class LastZero {
    public LastZero() {
        int n = 11;
        System.out.println(setRightMostUnsetBit(n) + "");
    }

    static int log2(int x) {
        return (int) (Math.log(x) / Math.log(2));
    }

    private int getPosOfRightMostSetBit(int n) {
        return (int) (log2(~n & (n + 1)) + 1);
    }

    private int setRightMostUnsetBit(int n) {
        if (n == 0)
            return 1;
        if ((n & (n + 1)) == 0)
            return n;
        int pos = getPosOfRightMostSetBit(n);
        return ((1 << (pos - 1)) | n);
    }

}