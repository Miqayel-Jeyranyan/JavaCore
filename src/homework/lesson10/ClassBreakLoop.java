package homework.lesson10;

public class ClassBreakLoop {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            if (i == 16)
                break;
            System.out.println("i: " + i);

        }
        System.out.println("Цикл завершен.");
    }
}
