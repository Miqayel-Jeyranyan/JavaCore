package homework.lesson12chapter7;

public class Box {

    double witdh;
    double height;
    double depth;

    Box(double w, double h, double d) {
        witdh = w;
        height = h;
        depth = d;
    }

    Box() {
        witdh = -1;
        height = -1;
        depth = -1;
    }

    Box(double len) {
        witdh = height = depth = len;
    }

    double volume() {
        return witdh * height * depth;
    }
}
