package homework.dynamicarray;

public class DinamicArray {
    private int[] array = new int[10];
    private int size = 0;

    public void add(int value) {
        if (size == array.length) {
            increaseArray();
//          int[]temp =new int[array.length+10];
//            for (int i = 0; i < size; i++) {
//                temp[i]=array[i];
//            }
//            array=temp;
        }
        array[size++] = value;

    }
//    int getByIndex(int index){
//        return array[index];
//    }

    private void increaseArray() {
        int[] temp = new int[array.length + 10];
        for (int i = 0; i < size; i++) {
            temp[i] = array[i];
        }
        array = temp;

    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");

        }
        System.out.println();
    }

    //    Գրել մեթոդ isEmpty անունով, որը կվերադարձնի true եթե
//    մեր dynamicArray-ի մեջ չունենանք ոչ մի էլեմենտ. Եթե ունենք՝ false

    public boolean isEmpty() {
        return size == 0;
    }

    //   Գրել մեթոդ getByIndex անունով, որը կընդունի ինդեքս,
//    և կվերադարձնի այդ ինդեքսի տակ ընկած թիվը, եթե չկա թող վերադարձնի 0;
    public int getByIndex(int index) {
        if (index >= 0 && index < size) {
            return array[index];
        }
        return 0;
    }


//    Գրել մեթոդ getFirstIndexByValue, որը կընդունի int value, և եթե մեր մասիվի մեջ ունենք այդ թվից,
//    կվերադարձնի իր ինդեքսը. եթե շատ ունենք, պետք է վերադարձնել առաջինի ինդեքսը

    public int getFirstIndexByValue(int value) {
        for (int i = 0; i < size; i++) {
            if (array[i] == value) {
                return i;
            }
        }
        return -1;
    }

    // Գրել մեթոդ set անունով, որը կընդունի int index, int value
//    և վալյուն կդնի տրված ինդեքսի տեղը(կփոխարինի էղած արժեքին).
    public void set(int index, int value) {
        if (index >= 0 && index < size) {
            array[index] = value;
        } else {
            System.out.println("invalid index");
        }
    }

    //    Գրել մեթոդ add(int index, int value) որը տրված վելյուն կդնի տրված ինդեքսի տեղը,
//    իսկ էղած թիվը ու կողքի բոլոր թվերը կտանի աջ, ոչ մի թիվ չի կորի
    public void add(int index, int value) {
        if (size == array.length) {
            increaseArray();
        }
        for (int i = size; i >= index; i--) {
            array[i] = array[i - 1];
        }
        array[index] = value;
        size++;
    }

    //    Գրել մեթոդ delete(int index) որ տանք ինդեքսը, այդ ինդեքսի տակ գտնվող թիվը հեռացնի մասիվից.
    public void delete(int index) {
        if (index >= 0 && index < size) {
            for (int i = index; i < size; i++) {
                array[i] = array[i + 1];
            }
            size--;

        }
    }
}