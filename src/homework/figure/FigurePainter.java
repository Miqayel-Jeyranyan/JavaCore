package homework.figure;

public class FigurePainter {
    char c='$';

    //        *
//            * *
//            * * *
//            * * * *
//            * * * * *

    void figure1(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i + 1; j++) {

                System.out.print(c+" ");
            }
            System.out.println();
        }

    }

    //         * * * * *
//             * * * *
//             * * *
//             * *
//             *
    void figure2() {
        for (int i = 0; i < 5; i++) {
            for (int j = i; j < 5; j++) {
                System.out.print(" "+c);
            }
            System.out.println();
        }
    }

    //           *
//               * *
//               * * *
//               * * * *
//               * * * * *
    void figure3() {
        for (int i = 0; i < 5; i++) {
            for (int k = 4; k > i; k--) {
                System.out.print("  ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print(c+" ");
            }
            System.out.println();
        }
    }
}