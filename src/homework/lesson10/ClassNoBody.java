package homework.lesson10;

public class ClassNoBody {
    public static void main(String[] args) {
        int i, j;
        i = 100;
        j = 200;
        while (++i < --j) ;
        System.out.println("Cpeднee значение равно " + i);
    }
}
