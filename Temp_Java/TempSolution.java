public class TempSolution {

    public static void main(String[] args) {

        // String[] namesArr = {};

        // String[] namesArr = { "Peter" };

        // String[] namesArr = { "Jacob", "Alex" };
        // String[] namesArr = { "Max", "John", "Mark" };
        // String[] namesArr = { "Alex", "Jacob", "Mark", "Max" };
        String[] namesArr = { "Alex", "Jacob", "Mark", "Max", "Ashley" };

        TempSolution tempSolution = new TempSolution();
        tempSolution.printString(namesArr);

    }

    private void printString(String... namesStrings) {

        StringBuffer outString = new StringBuffer();

        if (namesStrings != null && namesStrings.length > 0) {
            if (namesStrings.length == 1) {
                outString.append(namesStrings[0]);

            } else if (namesStrings.length == 2) {
                outString.append(namesStrings[0] + " and " + namesStrings[1]);
            } else if (namesStrings.length == 3) {
                outString.append(namesStrings[0] + ", " + namesStrings[1] + " and " + namesStrings[2]);
            } else {
                outString.append(
                        namesStrings[0] + ", " + namesStrings[1] + " and " + (namesStrings.length - 2) + " others");
            }

        } else {
            outString.append("no one");
        }

        outString.append(" likes this");
        System.out.println(outString);
    }

}
