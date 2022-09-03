import java.util.Arrays;
import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

public class CreateMaxNumber {

    public static void main(String[] args) {
        String numbers = "73473547";
        String number2 = "29";

        System.out.println(getHighAndLow(numbers));
        System.out.println(getHighAndLow(number2));

    }

    public static int getHighAndLow(String numbers) {
        String[] numberArrStr = numbers.split("(?<=\\G.{1})");

        Arrays.sort(numberArrStr);

        int resultVal = 0;

        for (int i = numberArrStr.length - 1; i >= 0; i--) {
            System.out.println(numberArrStr[i]);
            resultVal = resultVal * 10 + Integer.valueOf(numberArrStr[i]);
        }

        return resultVal;

    }

}
