package homework.lesson6.figure;

public class FigureExample1 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < i+1; j++) {

                System.out.print("*"+i);
            }
            System.out.println();
        }
    }

}