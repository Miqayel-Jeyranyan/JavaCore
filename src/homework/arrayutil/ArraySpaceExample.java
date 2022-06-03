package homework.arrayutil;

public class ArraySpaceExample {
//     ստեղծել նոր՝ char[] result մասիվ, որտեղ չեն լինի spaceArray-ի սկզբի և վերջի բացատները։
    public static void main(String[] args) {
        char[] spaceArray = {' ', 'c', 'a', 't', ' ', 'b', 'i', ' ', 'b', ' ', ' '};
        int startIndex = 0;
        int endIndex = spaceArray.length - 1;
        for (int i = 0; i < spaceArray.length; i++) {
            if (spaceArray[startIndex] == ' ') {
                startIndex++;
            } else {
                break;

            }
        }
        for (int i = endIndex; i > 0; i--) {
            if (spaceArray[endIndex] == ' ') {
                endIndex--;
            } else {
                break;
            }
        }
        int newLength=(endIndex-startIndex)+1;
        char[]rezult=new char[newLength];
        int j=0;
        for (int i = startIndex; i <=endIndex ; i++) {
            rezult[j++]=spaceArray[i];

        }
        for (char c : rezult) {
            System.out.print(c);

        }
//        int x = 0;
//        int y = 0;
//        for (int i = 0; i < spaceArray.length; i++) {
//            if (spaceArray[i] == ' ') {
//                x++;
//
//            } else {
//                break;
//            }
//        }
//        for (int i = spaceArray.length - 1; i > 0; i--) {
//            if (spaceArray[i] == ' ') {
//                y++;
//
//            } else {
//                break;
//
//            }
//        }
//        int k = x + y;
//
//        char[] vandams = new char[spaceArray.length - k];
//        for (int i = 0; i < vandams.length; i++) {
//            vandams[i] = spaceArray[i + x];
//            System.out.print(vandams[i]);
//        }
    }


}

