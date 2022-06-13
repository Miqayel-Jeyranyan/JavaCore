package homework.lesson12chapter7;

import java.io.FilterOutputStream;

public class AccessTest5 {
    public static void main(String[] args) {
        Test5 ob =new Test5();
        ob.a=10;
        ob.b=20;
        ob.setc(100);
        System.out.println("a, b, c ; "+ob.a+" "+ob.b+" "+ob.getc());
    }
}
