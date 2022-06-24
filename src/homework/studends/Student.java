package homework.studends;

public class Student {
    private String name;
    private String surnem;
    private int age;
    private String phoneNumber;
    private String city;
    private String lesson;



    public Student(String name, String surnem, int age, String phoneNumber, String city,String lesson) {
        this.name = name;
        this.surnem = surnem;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.city = city;
        this.lesson=lesson;

    }




    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurnem() {
        return surnem;
    }

    public void setSurnem(String surnem) {
        this.surnem = surnem;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;

    }

    public String getLesson() {
        return lesson;
    }

    public void setLesson(String lesson) {
        this.lesson = lesson;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surnem='" + surnem + '\'' +
                ", age=" + age +
                ", phoneNumber='" + phoneNumber + '\'' +
                ",lesson='"+lesson+'\''+

                ", city='" + city + '\'' +
                '}';
    }
}

