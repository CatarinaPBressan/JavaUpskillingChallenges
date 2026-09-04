import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        TwoSum twoSum = new TwoSum();

        assert Arrays.equals(twoSum.twoSum(new int[] {1, 2, 3, 4, 5, 6}, 9), new int[]{2, 5});

        System.out.println("All tests passed");
    }
}