package homework.lesson12chapter7;

public class ClassPassOb {
    public static void main(String[] args) {
        Test1 ob1 = new Test1(100, 22);
        Test1 ob2 = new Test1(10, 22);
        Test1 ob3 = new Test1(100, 22);
        System.out.println("ob1 == ob2 " + ob1.equalTo(ob2));
        System.out.println("ob1 == ob3 " + ob1.equalTo(ob3));

    }
}
