package ExOne;
public class Bai1 {

    // Phương thức Generic
    public static <E> void printArray(E[] array) {
        for (E element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        Integer[] intArray = {1, 2, 3, 4, 5};
        String[] stringArray = {"Java", "Python", "C++"};

        System.out.println("Integer Array:");
        printArray(intArray);

        System.out.println("String Array:");
        printArray(stringArray);
    }
}

