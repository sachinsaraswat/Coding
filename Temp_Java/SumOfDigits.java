public class SumOfDigits {

    public static void main(String[] args) {

        System.out.println(SumOfDigitsFn(493193));

    }

    public static int SumOfDigitsFn(int inputNumber) {

        int returnValue = 0;

        if (inputNumber < 0) {
            return 0;
        }

        if (inputNumber < 10) {
            returnValue = inputNumber;
            return returnValue;
        } else {

            returnValue = inputNumber % 10 + SumOfDigitsFn((int) inputNumber / 10);
        }

        returnValue = SumOfDigitsFn(returnValue);
        // while (returnValue > 9) {
        // returnValue = (returnValue % 10) + (returnValue / 10);
        // }
        return returnValue;
    }

}
