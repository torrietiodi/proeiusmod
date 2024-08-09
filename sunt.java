public class LotteryPrinter {
    public static void main(String[] args) {
        // Example array of winning lottery numbers
        int[] winLottoNumArr = {3, 7, 15, 22, 35, 42};

        // Loop through the array and print each number
        for (int i = 0; i < winLottoNumArr.length; i++) {
            System.out.printf(",%02d", winLottoNumArr[i]);
        }
    }
}
