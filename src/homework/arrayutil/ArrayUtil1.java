package homework.arrayutil;

public class ArrayUtil1 {
    public boolean number;
    //Տպել մասիվի բոլոր էլեմենտները։
    void lengtl() {
        int[] array = {45, 461, 155, -64, 160, 108, 907, -15, 54, 501, 2};
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
    //  Տպել մասիվի ամենամեծ թիվը։
    int max(int[] array) {

        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];

            }
        }

        return max;
    }
    // Տպեl մասիվի ամենափոքրը թիվը:
    int min(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }
    //Տպել մասիվի էլեմենտների գումարը։
    int sum(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }
    //Տպել մասիվի բոլոր թվերի միջին թվաբանականը:
    double avg(int[] array) {
        double avg = 0;
        for (int i = 0; i < array.length; i++) {
            avg += array[i] / array.length;

        }
        return avg;
    }
    //Տպել կենտերի քանակը։
    int countofEvens(int[] array) {
        int countofEvens = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                countofEvens++;
            }
        }
        return countofEvens;
    }
    int countofOdss(int[]array) {
        int countofOdss = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                countofOdss++;
            }
        }
        return countofOdss;
    }

    //Տպել մասիվի բոլոր զույգ էլեմենտները ։
    void evens(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                System.out.println(array[i] + " ");
            }

        }

    }
    //Տպել մասիվի բոլոր կենտ էլեմենտները։
    void odd(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                System.out.println(array[i] + " ");

            }
        }
    }
    //        գրենք կոդ, որը մասիվի էլեմենտները կդասավորի փոքրից մեծ ։
    void sort(int[] numbers) {
        int a = 0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i; j < numbers.length; j++) {
                if (numbers[i] > numbers[j]) {
                    a = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = a;
                }

            }
            System.out.print(numbers[i] + " ");
        }

    }
    //        գրենք կոդ, որը մասիվի էլեմենտները կդասավորի մեծից փոքր։
    void sort1(int[] numbers) {
        int a = 0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i; j < numbers.length; j++) {
                if (numbers[i] < numbers[j]) {
                    a = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = a;
                }
            }
            System.out.print(numbers[i] + " ");

        }
    }
//    ստեղծել նոր՝ char[] result մասիվ, որտեղ չեն լինի spaceArray-ի սկզբի և վերջի բացատները։
    void text(char[] spaceArray){
        int startIndex = 0;
        int endIndex = spaceArray.length - 1;
        for (int i = 0; i < spaceArray.length; i++) {
            if (spaceArray[startIndex] == ' ') {
                startIndex++;
            } else {
                break;

            }
        }
        for (int i = endIndex; i > 0; i--) {
            if (spaceArray[endIndex] == ' ') {
                endIndex--;
            } else {
                break;
            }
        }
        int newLength=(endIndex-startIndex)+1;
        char[]rezult=new char[newLength];
        int j=0;
        for (int i = startIndex; i <=endIndex ; i++) {
            rezult[j++]=spaceArray[i];

        }
        for (char c : rezult) {
            System.out.print(c);

        }
    }
}