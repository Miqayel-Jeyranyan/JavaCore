package homework.arrayutil;

public class ArrayUtil {
    public static void main(String[] args) {

        int[] array = {45, 461, 155, -64, 160, 108, 907, -15, 54, 501, 2};
        //Տպել մասիվի բոլոր էլեմենտները։
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        //  Տպել մասիվի ամենամեծ թիվը։
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("max =" + max);

        // Տպեl մասիվի ամենափոքրը թիվը:
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("min =" + min);
        //Տպել մասիվիբոլոր զույգ էլեմենտները ։
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                System.out.print(array[i] + " ");
            }
        }
        System.out.println();
        //Տպել մասիվի բոլոր կենտ էլեմենտները։
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                System.out.print(array[i] + " ");
            }
        }
        System.out.println();
        //Տպել զույգերի քանակը:
        int countofEvens = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                countofEvens++;
            }
        }
        System.out.println("զույգերի քանակը - " + countofEvens++);

        //Տպել կենտերի քանակը։
        int countofOdss = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                countofOdss++;
            }
        }
        System.out.println("կենտերի քանակը - " + countofOdss);

        //Տպել մասիվի էլեմենտների գումարը։
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        System.out.println("sum = " + sum);
        //Տպել մասիվի բոլոր թվերի միջին թվաբանականը:
        double avg = 0;
        for (int i = 0; i < array.length; i++) {
            avg += array[i];

        }
        System.out.println("միջին թվաբանականը = " + avg / array.length);

    }
}
