package homework.lesson13chapter7;
// Продемонстрировать применение массивов объектов типа String
// cucadrel masivneri mijocov string tipi obyektner@
public class StringDemo3 {
    public static void main(String[] args) {
        String []str={"odin ","dva","tri"};
        for (int i = 0; i < str.length; i++) {
            System.out.println("str ["+ i+"];"+str[i]);
        }
    }
}
