package homework.lesson10;

public class ClassSearch {
    public static void main(String[] args) {
        int[] nums = {6, 8, 3, 7, 5, 6, 1, 4};
        int val = 5;
        boolean fount = false;
        for (int x : nums) {
            if (x == val) {
                fount = true;
                break;
            }
        }
        if (fount) {

        }
        System.out.println("Знaчeниe найдено!");
    }
}
