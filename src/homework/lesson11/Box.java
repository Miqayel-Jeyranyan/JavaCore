package homework.lesson11;

public class Box {
    double width;
    double height;
    double depth;


    Box() {
        System.out.println("Koнcтpyиpoвaниe объекта Вох");
        width = 10;
        height = 10;
        depth = 10;
    }

    double volume() {
        return width * height * depth;
    }


    void setDim(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    double volume1() {

        return width * height * depth;
    }
}
//boxDemo
//class Box{
//    double width;
//    double height;
//    double depth;
//}


//boxDemo3
//class Box {
//    double width;
//    double height;
//    double depth;
//    void volume(){
//        System.out.println("abyom roven");
//        System.out.println(width * height * depth);
//    }
//}


// boxDemo4
//class Box {
//    double width;
//    double height;
//    double depth;
//    double volume(){
//    return width * height * depth
//    }
//}


//boxDemo5
//class Box {
//    double width;
//    double height;
//    double depth;
//
//    double volume() {
//        return width * height * depth
//    }
//
//    void setDim(double w, double h, double d) {
//        width = w;
//        height = h;
//        depth = d;
//    }
//}


//boxDemo6
//class Box {
//    double width;
//    double height;
//    double depth;
//
//    Box() {
//        System.out.println("Koнcтpyиpoвaниe объекта Вох");
//        width = 10;
//        height = 10;
//        depth = 10;
//    }
//
//    double volume() {
//        return width * height * depth;
//    }
//}


//boxDemo7
//class Box {
//    double width;
//    double height;
//    double depth;
//    Box(double w, double h, double d) {
//        width = w;
//        height = h;
//        depth = d;
//    }
//    double volume1() {
//        return width * height * depth;
//    }
//}