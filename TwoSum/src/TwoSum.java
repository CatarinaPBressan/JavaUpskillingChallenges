public class TwoSum {
    public int[] twoSum(int[] numbers, int target) {
        for(int i = 0; i < numbers.length - 1; i++) {
            int iElement = numbers[i];
            if (iElement >= target) {
                break;
            }

            for(int j = i+1; j < numbers.length; j++) {
                int jElement = numbers[j];
                if (jElement >= target) {
                    break;
                }

                if ((iElement + jElement) == target) {
                    return new int[] {i, j};
                }
            }
        }
        return new int[] {};
    }
}
