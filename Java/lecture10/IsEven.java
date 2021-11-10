package lecture10;

public class IsEven {
    public void q1() {
        int n = 17;
        if (isEvenByXOR(n))
            System.out.println("Even");
        else
            System.out.println("Odd");
    }

    private boolean isEvenByXOR(int n) {
        if ((n ^ 1) == (n + 1))
            return true;
        else
            return false;
    }

    public void q2() {
        int n = 16;
        if (isEvenByAnd(n))
            System.out.println("Even");
        else
            System.out.println("Odd");

    }

    private boolean isEvenByAnd(int n) {
        if ((n & 1) == 1)
            return false;
        else
            return true;
    }
}
