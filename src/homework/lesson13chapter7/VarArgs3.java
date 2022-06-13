package homework.lesson13chapter7;

//Аргументы переменной длины и перегрузка
public class VarArgs3 {
    static void vaTest(int... v) {
        System.out.print("kalichestvo argumentov " + v.length + "saderjimoe");
        for (int x : v)
            System.out.print(x + " ");
        System.out.println();
    }

    static void vaTest(boolean... v) {
        System.out.print("vaTest(boolean...) kalichestvo argumentov " + v.length + "saderjimoe  ");
        for (boolean x : v)
            System.out.print(x + " ");
        System.out.println();

    }

    static void vaTest(String msg, int... v) {
        System.out.print("vaTest (String ,int...):" + msg + v.length + "saderjimoe  ");
        for (int x : v)
            System.out.print(x + " ");
        System.out.println();

    }

    public static void main(String[] args) {
        vaTest(1, 2, 3);
        vaTest("Praverka :", 10, 20);
        vaTest(true, false, false);
    }
}


