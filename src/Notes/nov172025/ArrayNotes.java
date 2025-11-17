package Notes.nov172025;

public class ArrayNotes {
    public static void main(String[] args) {

        int[] nums = new int[3];
        // it has 3 spots auto set to 0, nums = {_,_,_}
        // nums.length -> 3

        nums[0] = 12;
        nums[1] = -7;
        nums[2] = 79;

        // prefill array values
        int[] nums2 = {7, 2, 2, 1, 9, 8, 5};
        int[] below = belowThreshold(nums, 9);

        print(nums2);
        print(below);
        print(nums2);
    }

    public static void print(int[] arr) {
        for(Integer i : arr) {
            System.out.println(i + " ");
        }
        System.out.println();
    }

    public static int[] belowThreshold(int[] arr, int thresh) {

        int[] below = new int[countBelow(arr, thresh)];
        int belowIndex = 0;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] < thresh) {
                below[belowIndex] = arr[i];
                belowIndex++;
            }
        }
        return below;
    }

    // returns num of elements below the threshold in an array
    public static int countBelow(int[] arr, int thresh) {

        int count = 0;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] < thresh){
                count++;
            }
        }
        return count;
    }
}