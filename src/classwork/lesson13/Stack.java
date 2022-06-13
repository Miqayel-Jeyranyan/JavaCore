package classwork.lesson13;

public class Stack {
    private int[] array = new int[10];
    private int index;

    Stack() {
        index = -1;
    }

    public void push(int x) {
        if (index == 9) {
            System.out.println("stack is fuul");
        } else {
            array[++index] = x;

        }
    }

    int pop() {
        if (index < 0) {
            System.out.println("stack is empty");
            return 0;
        } else {
            return array[index--];
        }
    }

    public boolean isEmpty() {
        return index == -1;
    }
}
