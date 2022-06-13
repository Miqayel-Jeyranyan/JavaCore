package homework.arrayutil;

public class ArreyUtilDEmo {
    public static void main(String[] args) {
        //Տպել մասիվի բոլոր էլեմենտները։
        ArrayUtil1 au = new ArrayUtil1();
        int[] array = {45, 461, 155, -64, 160, 108, 907, -15, 54, 501, 2};
        au.print(array);
        System.out.println();
        int max = au.max(array);
        System.out.println("max = "+max);



        int[] array2 = {45, 461, 155, -64, 160, 108, 907, -15, 54, 501, 2};
        ArrayUtil1 min = new ArrayUtil1();
        System.out.println("Min =" + min.min(array2));

        int[] array3 = {45, 461, 155, -64, 160, 108, 907, -15, 54, 501, 2};
        ArrayUtil1 sum = new ArrayUtil1();
        System.out.println("sum =" + sum.sum(array3));

        int[] array4 = {45, 461, 155, -64, 160, 108, 907, -15, 54, 501, 2};
        ArrayUtil1 avg = new ArrayUtil1();
        System.out.println("avg =" + avg.avg(array4));

        int[] array5 = {45, 461, 155, -64, 160, 108, 907, -15, 54, 501, 2};
        ArrayUtil1 countofOdss = new ArrayUtil1();
        System.out.println("kenteri qanak  =" + countofOdss.countofEvens(array5));


        int[] array11 = {45, 461, 155, -64, 160, 108, 907, -15, 54, 501, 2};
        ArrayUtil1 countofEvens=new ArrayUtil1();
        System.out.println("zuygri qanak " + countofEvens.countofOdss(array11));



        int[] array6 = {45, 461, 155, -64, 160, 108, 907, -15, 54, 501, 2};
        ArrayUtil1 evens = new ArrayUtil1();
        evens.evens(array6);


        int[] array7 = {45, 461, 155, -64, 160, 108, 907, -15, 54, 501, 2};
        ArrayUtil1 odd = new ArrayUtil1();
        odd.odd(array7);

        int[] array8 = {45, 461, 155, -64, 160, 108, 907, -15, 54, 501, 2};
        ArrayUtil1 sort = new ArrayUtil1();
        sort.sort(array8);

        System.out.println();

        int[] array9 = {45, 461, 155, -64, 160, 108, 907, -15, 54, 501, 2};
        ArrayUtil1 sort1 = new ArrayUtil1();
        sort1.sort1(array9);

        System.out.println();

        char[] array10 = {' ', 'c', 'a', 't', ' ', 'b', 'i', ' ', 'b', ' ', ' '};
        ArrayUtil1 test=new ArrayUtil1();
        test.text(array10);


    }
}
