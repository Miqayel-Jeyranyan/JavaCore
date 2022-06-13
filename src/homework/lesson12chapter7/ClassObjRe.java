package homework.lesson12chapter7;

//obyektner@ poxancvum en darraki hasceov
public class ClassObjRe {
    public static void main(String[] args) {
        Test3 ob = new Test3(15, 20);
        System.out.println("ob.a и оЬ.Ь до вызова:" + ob.a + " " + ob.b);
        ob.meth(ob);
        System.out.println("ob.a и оЬ.Ь после вызова: " + ob.a + " " + ob.b);

    }
}
