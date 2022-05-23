package homework.lesson10;

public class ClassReturn {
    public static void main(String[] args) {
        boolean t = true;
        System.out.println("do vazvrata");
        if (t) return;
        System.out.println("Этот оператор выполняться не будет.");
    }
}
