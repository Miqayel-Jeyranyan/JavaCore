package homework;

public class PracticeHomeworkDemo {
    public static void main(String[] args) {
        PracticeHomeworke homeworke =new PracticeHomeworke();
        //փոխակերպել տրված րոպեն վայրկյանի ու վերադարձնել
        System.out.println("seconds" + homeworke.convert(11));
        //ընդունել տարին, վերադարձնել օրերի քանակը։
        System.out.println( "days = "+ homeworke.calcAge(2));
        //վերադարձնել տրված թվի հաջորդ թիվը
        System.out.println("num = "+homeworke.nextNumber(15));
        //վերադարձնել true եթե տրված a և b թվերը իրար հավասար են, եթե ոչ՝ false
        System.out.println(homeworke.isSameNum(15,15));
        //վերադարձնել true-եթե թիվը փոքր կամ հավասար է 0-ին։
//մնացած դեպքերում վերադարձնել false
        System.out.println(homeworke.lessThanOrEqualToZero(0));
        //վերադարձնել ընդունող բուլյանի ժխտված արժեքը։
        System.out.println(homeworke.reversBool(false));
        //վերադարձնել երկու մասիվի ամենամեծ length-ը
        int[]array1=new int[26];
        int[]array2=new int[18];
        System.out.println(homeworke.maxLength(array1,array2));

    }
}
