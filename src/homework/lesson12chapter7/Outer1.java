package homework.lesson12chapter7;
// Определить внутренний класс в цикле for
public class Outer1 {
    int outer1_x=100;
    void test(){
        for (int i = 0; i < 10; i++) {
            class Inner1{
                void display(){
                    System.out.println("outer1_ x = "+outer1_x);
                }
            }
            Inner1 inner1=new Inner1();
            inner1.display();
        }
    }
}
