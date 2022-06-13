package homework.lesson13chapter7;
//Продемонстрировать некоторые методы из класса String
public class StringDemo2 {
    public static void main(String[] args) {
        String strob1="Первая строка";
        String strob2="Вторая строка";
        String strob3=strob1;
        System.out.println("Длина строки strOb1:"+strob1.length());
        System.out.println("simvol po indeksu 3 v stroke strob1 :"+strob1.charAt(3));
        if (strob1.equals(strob2))
            System.out.println("strob1 == strob2");
      else
            System.out.println("strob1 != strob2");
      if (strob1.equals(strob3))
          System.out.println("strob1 == strob3");
      else
          System.out.println("strob1 != strob3");
    }
}
