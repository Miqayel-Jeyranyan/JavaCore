package homework.arrayutil;

public class CharArrayExample {
    public static void main(String[] args) {
//         գրել լոգիկա, որը կհաշվի թե քանի հատ կա c-փոփոխականից մեր մասիվի մեջ, ու տպել այդ քանակը։
        char[] chars = {'j', 'a', 'v', 'a', 'l', 'o', 'v', 'e'};
        char c = 'o';
        int a = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == c) {
                a++;
            }
        }
        System.out.println(a);
    //    գրել կոդ, որը կտպի մեջտեղի 2 սինվոլները։
        char[] chars2 = {'j', 'a', 'v', 'a', 'l', 'o', 'v', 'e'};
        System.out.println("mejtexi erku simvolner  " + chars[chars.length / 2 - 1] + " " + chars[chars.length / 2]);
    //   պետք է տպենք true եթե մեր մասիվը վերջանում է ly-ով, եթե ոչ՝ false
        char[] chars3 = {'j', 'a', 'v', 'a', 'l', 'o', 'l', 'y'};
        if (chars3[chars3.length - 1] == 'y' && chars3[chars3.length - 2] == 'l') {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    //  Տպում ենք true եթե տեքստը պարունակում է bob բառը, բայց o-ի տեղը կարող է լինել ցանկացած սինվոլ։
        char[] bobarray = {'b', 'a', 'b', 'o', 'l', 'a'};
        boolean j = false;
        for (int i = 0; i < bobarray.length - 2; i++) {
            if (bobarray[i] == 'b' && bobarray[i + 2] == 'b') {

                j = true;
                break;
            }
        }
        System.out.println(j);
     //   տպել մասիվի այն սինվոլները որոնք պռաբել չեն

        char[] text = {' ', ' ', 'b', 'a', 'r', 'e', 'v', ' ', ' '};
        for (int i = 0; i < text.length; i++) {
            if (text[i] != ' ') {
                System.out.print(text[i]);

            }
        }
    }

}