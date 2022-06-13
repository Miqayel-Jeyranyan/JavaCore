package homework.lesson13chapter7;
// Использовать массив для передачи методу переменного
// количества аргументов. Это старый подход к обработке
//аргументов переменной длины
public class PassArray {
    static void vaTest(int v[]) {
        System.out.print("Koличecтвo аргументов:" + v.length + " Содержимое:");
        for (int x : v) {
            System.out.print(x + "  ");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        {
// Обратите внимание на порядок создания массива
// для хранения аргументов
            int[] n1 = {10};              //1 argument
            int[] n2 = {1, 2, 3};         //3 argument
            int[] n3 = {};                //argument chka
            vaTest(n1);
            vaTest(n2);
            vaTest(n3);
        }
    }
}