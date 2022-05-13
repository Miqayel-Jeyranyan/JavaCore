package homework.lesson6.figure;
//ede k = enek 4 kstananak nuyn patker@ bayc kpac toxin
public class FigurePainter3 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++){
            for (int k =4; k > i; k--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++){
                System.out.print("* " );
            }
            System.out.println();
        }

    }
}
