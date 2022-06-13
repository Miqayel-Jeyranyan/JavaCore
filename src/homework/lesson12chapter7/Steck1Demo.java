package homework.lesson12chapter7;
public class Steck1Demo {
    private boolean pop;

    public static void main(String[] args) {
        Steck1Demo mystack1=new Steck1Demo();
        Steck1Demo mystack2=new Steck1Demo();
        for (int i = 0; i < 10; i++)mystack1.push(i);
        for (int i = 10; i <20 ; i++)mystack2.push(i);
        System.out.println("steck mystack1:");
        for (int i = 0; i < 10; i++)
            System.out.println(mystack1.pop);
        System.out.println("stack mysteck2:");
        for (int i = 0; i < 10; i++)
            System.out.println(mystack2.pop);

        
    }

    private void push(int i) {
    }


}




