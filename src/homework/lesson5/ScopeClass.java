package homework.lesson5;

public class ScopeClass {
    public static void main(String[] args) {
        int x;
        x = 10;
        if (x == 10) {
            int y = 20;
            System.out.println("x и у: " + x + " " + y);
            x = y * 2;
            System.out.println("x povno"+x);
        }
    }
}
