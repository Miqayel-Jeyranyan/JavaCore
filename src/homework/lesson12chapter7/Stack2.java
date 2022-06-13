package homework.lesson12chapter7;

// barelavvac stack class vorn ogtagorcum e masivi erkarutyan hatkutyun@
public class Stack2 {

    private int stck[];
    private int tos;

    Stack2(int size) {
         stck = new int[size];
        tos = -1;
    }


    void push(int item) {
        if (tos == stck.length - 1)
            System.out.println("stack zapolnen ");
        else
            stck[++tos] = item;
    }

      int pop() {
        if (tos < 0) {
            System.out.println("stack ne zagrujen");
            return 0;
        } else
            return stck[tos--];
    }
}

