package homework.lesson12chapter7;
// Продемонстрировать применение внутреннего класса
public class Outer {
    int outer_x=100;
    void test(){
        Inner inner=new Inner();
        inner.display();
   }
//    это внутренний класс
   class Inner {
        void display(){
            System.out.println("outer x = "+ outer_x);
        }
   }
}
