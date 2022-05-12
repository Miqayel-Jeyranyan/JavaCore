package classwork.lesson4;

public class Figure1 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int k = 4; k > i; k--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();

            for (i = 4; i > 0; i--) {
                for (int j = 0; j < i; j++) {
                    System.out.print(" *");

                }
                System.out.println();
                for (int j = 1; j < i; j++) {
                    System.out.print("1");


                }

            }
        }
    }
}