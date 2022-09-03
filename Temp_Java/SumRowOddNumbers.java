public class SumRowOddNumbers {

    public static void main(String[] args) {

        System.out.println("total : " + SumRowOddNumbersFn(2));
        System.out.println("total : " + SumRowOddNumbersFn(5));

    }

    public static int SumRowOddNumbersFn(int rowNum) {
        int startNum = ((rowNum - 1) * (rowNum - 1)) + rowNum;

        System.out.println("Start:" + startNum);

        int resultVal = startNum;

        for (int i = 1; i < rowNum; i++) {
            resultVal = resultVal + startNum + (i * 2);

        }

        return resultVal;
    }

}
