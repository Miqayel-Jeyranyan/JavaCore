package homework.lesson12chapter7;

public class ClassOverloadDemo {
    public static void main(String[] args) {
        ClassOverload ob = new ClassOverload();
//     double rezalt;
//     ob.test();
//     ob.test(10);
//     ob.test(10,20);
//        double result = ob.test(123.25);
//        System.out.println( "Результат вызова ob.test(123.25): " + result);
        int i = 88;
        ob.test();
        ob.test(10,20);
        ob.test(i);
        ob.test(123.2);
        ob.test(116);

    }
}
