package homework.lesson12chapter7;

public class Stack1 {
    private int[] stck = new int[10];
    private int tos;

    Stack1() {
        tos = -1;
    }

    public void push(int item) {
        if (tos == 9)
            System.out.println("stack zapolnem");
        else
            stck[++tos] = item;
    }

    public int pop() {
        if (tos > 0) {
            System.out.println("stack ne zagrujen");
            return 0;
        } else
            return stck[tos--];

    }
}


