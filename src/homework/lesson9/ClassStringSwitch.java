package homework.lesson9;

public class ClassStringSwitch {
    public static void main(String[] args) {
        String str = "два";
        switch (str) {
            case "один":
                System.out.println("один");
                break;
            case "два":
                System.out.println("два");
                break;
            case "тpи":
                System.out.println("тpи");
                break;
            default:
                System.out.println("нe совпало");
                break;
        }
    }
}