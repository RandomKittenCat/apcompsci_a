package Notes.quizzes;

public class unit6 {
    public static void arrayMethod(int nums[]) {

        int j = 0;
        int k = nums.length - 1;

        while (j < k) {

            int x = nums[j];
            nums[j] = nums[k];
            nums[k] = x;
            j++;
            k--;
        }
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] nums = { 1, 2, 3, 4, 5 };
        arrayMethod(nums);
    }
}