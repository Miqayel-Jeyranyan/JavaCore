package homework.lesson12chapter7;

//veradarcnox obyekt
public class ClassRetOb {

    public static void main(String[] args) {
        Test4 ob1 = new Test4(2);
        Test4 ob2;
        ob2 = ob1.incrByTen();
        System.out.println("oЬ1.a: " + ob1.a);
        System.out.println("oЬ2.a: " + ob2.a);
        ob2 = ob2.incrByTen();
        System.out.println("оЬ2.а после второго увеличения значения:" + ob2.a);
//        ob2=ob2.incrByTen();
//       System.out.println(ob2.a *5);
    }
}
