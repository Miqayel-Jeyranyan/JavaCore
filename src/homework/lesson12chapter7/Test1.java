package homework.lesson12chapter7;

public class Test1 {
//    class Test {
        int a, b;

        Test1(int i, int j) {
            a = i;
            b = j;
        }

        boolean equalTo(Test1 o) {
            if (o.a == a && o.b == b)
                return true;
            else return false;
        }
    }

