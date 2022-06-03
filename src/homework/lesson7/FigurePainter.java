package homework.lesson7;

public class FigurePainter {
//mmmm *
//mmm * *
//mm * * *
//m * * * *
// * * * * *
//m * * * *
//mm * * *
//mmm * *
//mmmm *
//mmmmm
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int j = 4; j > i; j--) {
                System.out.print("m");
            }
            for (int j = 0; j <= i; j++) {

                System.out.print(" *");
            }
            System.out.println();
        }

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("m");
            }
            for (int j = 4; j > i; j--) {
                System.out.print(" *");
            }
            System.out.println();

        }
        System.out.println();
        // m * * * * *
        // m m * * * *
        // m m m * * *
        // m m m m * *
        // m m m m m *
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(" m");
            }
            for (int j = 4; j >= i; j--) {
                System.out.print(" *");}
            System.out.println();
        }
    }


}


