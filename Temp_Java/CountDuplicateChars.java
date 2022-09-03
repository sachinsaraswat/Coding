import java.util.ArrayList;
import java.util.HashSet;

public class CountDuplicateChars {

    public static void main(String[] args) {

        String tmpString = "aabbcde";

        System.out.println(getCountOfDuplicateChars(tmpString));
    }

    public static int getCountOfDuplicateChars(String inputString) {

        HashSet<String> distinctChars = new HashSet<>();
        ArrayList<String> AllCharsList = new ArrayList<>();

        if (inputString == null || inputString.length() <= 1) {
            return 0;
        }

        for (int i = 0; i < inputString.length(); i++) {
            String tmpString = String.valueOf(inputString.charAt(i)).toLowerCase();

            if (AllCharsList.contains(tmpString)) {

                distinctChars.add(tmpString);

            } else {
                AllCharsList.add(tmpString);

            }
        }

        return distinctChars.size();

    }

}
