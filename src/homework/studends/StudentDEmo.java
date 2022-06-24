package homework.studends;

import java.util.Scanner;

public class StudentDEmo {

    private static Scanner scanner = new Scanner(System.in);
    private static StudentStorige studentStorige = new StudentStorige();

    public static void main(String[] args) {
        boolean run = true;
        while (run) {
            System.out.println("please input 0 for exit");
            System.out.println("please input 1 for add student");
            System.out.println("please input 2 for print all student");
            System.out.println("please input 3 for print students count ");
            System.out.println("please input 4 for delete student by index");
            System.out.println("please input 5 for print  students by lesson");
            System.out.println("please choose 6 for change students lesson ");
            System.out.println("please choose 7 fore chenge students city");
            int command = Integer.parseInt(scanner.nextLine());
            switch (command) {
                case 0:
                    run = false;
                    break;
                case 1:
                    addStudent();
                    break;
                case 2:
                    studentStorige.print();
                    break;
                case 3:
                    System.out.println(studentStorige.getSize());
                    break;
                case 4:
                    studentStorige.print();
                    System.out.println("Please choose student index");
                    int index = Integer.parseInt(scanner.nextLine());
                    studentStorige.delete(index);

                    break;
                case 5:
                    System.out.println("please input lesson name");
                    String lessonName = scanner.nextLine();
                    studentStorige.printStudentsByLesson(lessonName);
                    break;
                case 6:
                   changeLesson();
                   break;
                case 7:
                    changeCity();
                    break;

                default:
                    System.err.println("Invalid command ,please try again");
            }

        }


    }

    private static void changeCity() {
        System.out.println("please inpud studend index");

        int index=Integer.parseInt(scanner.nextLine());
        System.out.println("please inpud new city");
        String cityChange=scanner.nextLine();
        studentStorige.cityChange(index,cityChange);
    }

    private static void changeLesson() {
        System.out.println("please inpud studend index");

         int index=Integer.parseInt(scanner.nextLine());
        System.out.println("please inpud new lesson");
        String lessoncChanje=scanner.nextLine();
        studentStorige.chanjLesson(index,lessoncChanje);
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
        studentStorige.add(student);
        System.out.println("Thank you, Studend added ");


    }
}
