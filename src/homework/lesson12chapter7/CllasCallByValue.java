package homework.lesson12chapter7;

public class CllasCallByValue {
//    parzunak tipi argumentner@ poxancvum en est arjeki
    public static void main(String[] args) {
        Test2 ob = new Test2();
        int a = 15, b = 20;
        System.out.println("a и Ь до вызова: " + a + " " + b);
        ob.meth(a,b);
        System.out.println("a и Ь после вызова: "+ a + " " + b);
    }
}
