package homework;

public class PracticeHomeworke {
//փոխակերպել տրված րոպեն վայրկյանի ու վերադարձնել
    long convert(int minuts) {
        return minuts * 60;

    }
    //ընդունել տարին, վերադարձնել օրերի քանակը։
    int calcAge(int years) {
        years = years * 365;
        return years;
//       return years * 365
    }
    //վերադարձնել տրված թվի հաջորդ թիվը
    int nextNumber(int numbers) {
        numbers = numbers + 1;
        return numbers;
//        return ++numbers;
    }
    //վերադարձնել true եթե տրված a և b թվերը իրար հավասար են, եթե ոչ՝ false
    boolean isSameNum(int a, int b) {
        if (a == b) {
            return true;
        } else
            return false;
//       return a==b;
    }
    //վերադարձնել true-եթե թիվը փոքր կամ հավասար է 0-ին։
//մնացած դեպքերում վերադարձնել false
    boolean lessThanOrEqualToZero(int numbers) {
        if (numbers <= 0) {
            return true;
        } else
            return false;
//        return number <=0;
    }
    //վերադարձնել ընդունող բուլյանի ժխտված արժեքը։
    boolean reversBool(boolean value) {
        if (value==true)
            return value;
        return value;
//return!value;
    }
//վերադարձնել երկու մասիվի ամենամեծ length-ը
    int maxLength(int[]array1,int[]array2){
        int max =array1.length;
        if (array1.length>array2.length){

        } else
            max=array2.length;
        return max;
//        return array1.length>array2.length?array1.length:array2.length;
    }


}