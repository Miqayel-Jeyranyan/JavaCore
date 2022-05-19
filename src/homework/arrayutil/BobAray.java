package homework.arrayutil;

public class BobAray {
    public static void main(String[] args) {

        char[] bobarray = {'b', 'a', 'b', 'o', 'l', 'a'};
        boolean a = false;
        for (int i = 0; i < bobarray.length - 2; i++) {
            if (bobarray[i] == 'b' && bobarray[i + 2] == 'b') {

                a = true;
                break;

        }
        }
        System.out.println(a);
    }
}
