import java.util.Arrays;
import java.util.SortedSet;
import java.util.TreeSet;

public class HighAndLow {

    public static void main(String[] args) {
        String numbers = "8 3 -5 42 -1 0 0 -9 4 7 4 -4";
        String number2 = "2";

        System.out.println(getHighAndLow(numbers));
        System.out.println(getHighAndLow(number2));

    }

    public static String getHighAndLow(String numbers) {
        String[] numberArrStr = numbers.split(" ");

        SortedSet<Integer> sortedIntList = new TreeSet<>();

        sortedIntList.stream().

        for (String numStr : numberArrStr) {
            sortedIntList.add(Integer.valueOf(numStr));

        }

        return sortedIntList.last().toString() + " " + sortedIntList.first().toString();

    }

}
