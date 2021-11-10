package lecture10;

public class ToggleCase {
    public ToggleCase(){
        String str = "cHerRy";
        System.out.println("toggled : " + getToggleCase(str.toCharArray()));
        System.out.println("original : " + str);
    }

    private String getToggleCase(char[] chrs){
        for (int i = 0; i < chrs.length; i++) {
            chrs[i] ^= 32;
        }
        return new String(chrs);
    }
}
