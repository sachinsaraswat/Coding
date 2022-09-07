public class BinarySearch {

    public static void main(String[] args) {
        int[] sortedArr = { 1, 2, 4, 5, 8, 10 };

        System.out.println("hello...");

        System.out.println(sortedArr.length);

        int retIndx = -1;

        for (int i = 0; i < sortedArr.length; i++) {
            if (sortedArr[i] == 2) {
                retIndx = i;
            }

        }

        System.out.println(retIndx);
    }

}
