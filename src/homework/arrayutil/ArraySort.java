package homework.arrayutil;

public class ArraySort {
    public static void main(String[] args) {
        //        գրենք կոդ, որը մասիվի էլեմենտները կդասավորի փոքրից մեծ ։

        int[] numbers = {43, 55, 5, -9, 0, 12, 5, 65};
        int a = 0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i; j < numbers.length; j++) {
                if (numbers[i] > numbers[j]) {
                    a = numbers[i];
                    numbers[i] = numbers[j];
                   numbers[j] = a;
                }
            }
            System.out.print(numbers[i]+" ");

        }
        System.out.println();
//        գրենք կոդ, որը մասիվի էլեմենտները կդասավորի մեծից փոքր։
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i; j < numbers.length; j++) {
                if (numbers[i] < numbers[j]) {
                    a = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = a;
                }
            }
            System.out.print(numbers[i]+" ");
        }
    }

}


