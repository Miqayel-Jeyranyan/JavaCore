package homework.studends;

import java.util.Scanner;

public class StudentDEmo {

    private static Scanner scanner = new Scanner(System.in);
    private static StudentStorije studentStorije = new StudentStorije();

    public static void main(String[] args) {
        boolean run = true;
        while (run) {
            System.out.println("plise input 0 for exit");
            System.out.println("plise input 1 for add student");
            System.out.println("plise input 2 for print all student");
            System.out.println("plise input 3 for print students count ");
            System.out.println("plise input 4 for delete student by index");
            System.out.println("plise input 5 for print  studens by lesson");

            int command = Integer.parseInt(scanner.nextLine());
            switch (command) {
                case 0:
                    run = false;
                    break;
                case 1:
                    addStudent();
                    break;
                case 2:
                    studentStorije.print();
                    break;
                case 3:
                    System.out.println(studentStorije.getSize());
                    break;
                case 4:
                    studentStorije.print();
                    System.out.println("Please choose student index");
                    int index=Integer.parseInt(scanner.nextLine());
                    studentStorije.delete(index);

                    break;
                case 5:
                    System.out.println("please input lesson name");
                   String lessonName= scanner.nextLine();
                   studentStorije.printStudentsByLesson(lessonName);
                   break;

                default:
                    System.err.println("Invalid command ,please try again");
            }

        }


    }

    private static void addStudent() {
        System.out.println("Please input student name");
        String name = scanner.nextLine();
        System.out.println("Please input student surname");
        String surname = scanner.nextLine();
        System.out.println("Please input student age");
        String ageStr = scanner.nextLine();
        System.out.println("Please input student phoneNumber");
        String phoneNumber = scanner.nextLine();
        System.out.println("Please input student city");
        String city = scanner.nextLine();
        System.out.println("please input studend lesson");
        String lesson = scanner.nextLine();

        int age = Integer.parseInt(ageStr);
        Student student = new Student(name, surname, age, phoneNumber,city,lesson);
        studentStorije.add(student);
        System.out.println("Thank you, Studend added ");

    }
}
