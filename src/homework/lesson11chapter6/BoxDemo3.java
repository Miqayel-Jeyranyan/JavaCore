package homework.lesson11chapter6;

public class BoxDemo3 {
    public static void main(String[] args) {
        Box myboxs1=new Box();
        Box myboxs2=new Box();
        myboxs1.width=10;
        myboxs1.height=20;
        myboxs1.depth=15;
        myboxs2.width=3;
        myboxs2.height=6;
        myboxs2.depth=9;
        myboxs1.volume();
        myboxs2.volume();
    }
}
