package homework.lesson10;

public class ClassForVar {
    public static void main(String[] args) {
        int i;
        boolean done = false;
        i = 0;
        for (; !done; ) {
            System.out.println("i rovno  " + i);
            if (i == 10) done = true;
            i++;
        }
    }
}
