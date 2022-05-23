package homework.lesson10;

public class ClassBreakLoop2 {
    public static void main(String[] args) {
        int i = 100;
        while (i < 100) {
            if (i == 10) break;
            System.out.println(" i "+i);
            i++;
        }
        System.out.println("Цикл завершен.");
    }
}
